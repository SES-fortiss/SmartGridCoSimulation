package linprogMPC.components;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

import com.google.gson.Gson;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.BasicAnswer;
import akka.basicMessages.RequestContent;
import akka.systemActors.GlobalTime;
import behavior.BehaviorModel;
import linprogMPC.Simulation;
import linprogMPC.helper.MatrixBuildup;
import linprogMPC.helper.OptimizationProblem;
import linprogMPC.helper.OptimizationStarter;
import linprogMPC.helper.SolutionHandler;
import linprogMPC.messages.BuildingSpec;
import linprogMPC.messages.Consumption;
import linprogMPC.messages.OptimizationResult;
import linprogMPC.messages.ProducerSpec;
import linprogMPC.messages.StorageSpec;
import memap.external.M2MDisplay;

public class LinProgBehavior extends BehaviorModel {
	
	static double[][] fullXVector = new double[Simulation.NR_OF_ITERATIONS][Simulation.N_STEPS];
	
	static double[] buildingsTotalCosts = new double[Simulation.NR_OF_ITERATIONS];
	static double[] costsMEMAP = new double[Simulation.NR_OF_ITERATIONS];
	static int nrOfStorages = 0;
	static int nrOfProducers = 0;	 	
	

	public OptimizationResult ans = new OptimizationResult();
	public M2MDisplay display;
	public M2MDisplay display2;
	Gson gson = new Gson();
	
	public Calendar startTime;
	public final int n = Simulation.N_STEPS_MPC;
	
	public LinProgBehavior() {
		display = new M2MDisplay(8080); // add port in to display a json
		display.run();
		display2 = new M2MDisplay(8079); // add port in to display a json
		display2.run();
	}

	@Override
	public void handleError(LinkedList<ErrorAnswerContent> errors) {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleRequest() {
		// TODO Auto-generated method stub
		
	}
	

	@Override
	public void makeDecision() {
		
		// Sort the received answers in 'Buildings' and/or 'free consumer/Storage/Producers'
		ArrayList<Consumption> consumptionProfiles = new ArrayList<Consumption>();
		ArrayList<ProducerSpec> producerSpecs = new ArrayList<ProducerSpec>();
		ArrayList<StorageSpec> storageSpecs = new ArrayList<StorageSpec>();
		ArrayList<BuildingSpec> buildingSpecs = new ArrayList<BuildingSpec>();
		
		for(BasicAnswer basicAnswer : answerListReceived) {
			
			AnswerContent answerContent = basicAnswer.answerContent;
			if(answerContent instanceof Consumption) {
				consumptionProfiles.add((Consumption) answerContent);
			}
			if(answerContent instanceof ProducerSpec) {
				producerSpecs.add((ProducerSpec) answerContent);
			}
			if(answerContent instanceof StorageSpec) {
				storageSpecs.add((StorageSpec) answerContent);
			}		
			if(answerContent instanceof BuildingSpec) {
				buildingSpecs.add((BuildingSpec) answerContent);
			}		
		}		
		
	
		if (GlobalTime.getCurrentTimeStep() == 0) {
		 
			// Calculate total Number of Storages & Producers
			nrOfStorages += storageSpecs.size();
			nrOfProducers += producerSpecs.size();
			
			for (BuildingSpec buildingSpec : buildingSpecs) {
				nrOfStorages += buildingSpec.getNrOfStorages();
				nrOfProducers += buildingSpec.getNrOfProducers();
			}
			
			// Output simulation details
			System.out.println(" << Optimization >> ");
			System.out.println("Simulation time: " + Simulation.stepLength(TimeUnit.HOURS)*Simulation.NR_OF_ITERATIONS + " hours (" + Simulation.NR_OF_ITERATIONS/Simulation.TIMESTEPS_PER_DAY + " days)");
			System.out.println("Timestep: " + Simulation.stepLength(TimeUnit.MINUTES) + " minutes (" + Simulation.NR_OF_ITERATIONS + " Steps)");
			System.out.println("MPC Horizon: " + Simulation.N_STEPS_MPC*Simulation.stepLength(TimeUnit.HOURS) + " hours (" + Simulation.N_STEPS_MPC + " Steps)");
			
			System.out.println(" ");
			
			System.out.println("Total Number of Storages: " + nrOfStorages);
			System.out.println("Total Number of Producers: " + nrOfProducers);
			System.out.println("****************************************************************");
		}
	    
		
		// ------------ BUILDING OPTIMIZATION ------------ 
		
		int counter = 0; // counter variable
//		double[] costsPerBuilding = new double[buildingSpecs.size()];
		double[][] buildingCostPerTimestep = new double[buildingSpecs.size()][n];

		
		for(BuildingSpec buildingSpec : buildingSpecs) {
			
			OptimizationProblem problem = MatrixBuildup.SingleBuilding(buildingSpec);
			double[] sol = OptimizationStarter.runLinProg(problem);
			
			buildingCostPerTimestep[counter] = SolutionHandler.exportCosts(sol, problem.lambda, "CostGEB" + (counter+1) + ".csv");	
			
			
			SolutionHandler.exportMatrix(fullXVector, "XVecGEB" + (counter+1) + ".csv");
			SolutionHandler.exportData(problem.lambda, "LambdaGEB" + (counter+1) + ".csv");
			
			counter++;		
			
		}
	
		for (int i=0; i<buildingSpecs.size(); i++) {
			buildingsTotalCosts[GlobalTime.getCurrentTimeStep()] += buildingCostPerTimestep[i][0];
		}

		

		// ------------ MEMAP - OPTIMIZATION ------------ 

		OptimizationProblem problem = MatrixBuildup.memapMatrices(nrOfProducers,nrOfStorages,
				buildingSpecs,consumptionProfiles,producerSpecs,storageSpecs, Simulation.MEMAP_LDHeating);
		double[] sol = OptimizationStarter.runLinProg(problem);

		double[] memapCostPerTimestep = SolutionHandler.exportCosts(sol, problem.lambda, "CostVectorMEMAP.csv");
		costsMEMAP[GlobalTime.getCurrentTimeStep()] = memapCostPerTimestep[0];

		// Print consumption and calculate energy autarky
//		double autarkyMEMAP = SolutionHandler.calcAutarky(problem, sol);
			
		
		display2.update(gson.toJson(problem.b_eq));
		display.update(gson.toJson(sol));
	
		
// ================= Handling the result ================== 	

		
//		double[] productionExport = SolutionHandler.matrixMultiplication(problem.a_eq, sol);
//		SolutionHandler.exportData(productionExport, "PruductionMEMAP.csv");
		
		SolutionHandler.exportData(sol, "XvectorMEMAP.csv");
		SolutionHandler.exportData(problem.h, "HVecMEMAP.csv");
		
//		SolutionHandler.exportMatrix(problem.a_eq, "CouplingMatrix.csv");
//		SolutionHandler.exportData(problem.b_eq, "ConsumptionMEMAP.csv");


		
		if (GlobalTime.getCurrentTimeStep() == (Simulation.NR_OF_ITERATIONS-1)) {
			
			
			double totalCostsMEMAP = 0;
			double totalCostsBuildings = 0;
			for (int j=0; j < Simulation.NR_OF_ITERATIONS; j++) {
				totalCostsMEMAP += costsMEMAP[j];
				totalCostsBuildings += buildingsTotalCosts[j];
			}
			
			SolutionHandler.exportMatrix(problem.g, "GMatrixMEMAP.csv");
			SolutionHandler.exportData(costsMEMAP, "COSTS_MEMAP_MPC.csv");
			SolutionHandler.exportData(buildingsTotalCosts, "COSTS_EMS_MPC.csv");
			
			System.out.println(" << Optimization Result (MPC) >> ");	
			System.out.println("COSTS without MEMAP: " + String.format("%.02f", totalCostsBuildings));
			System.out.println("COSTS with MEMAP: " + String.format("%.02f", totalCostsMEMAP));
//			System.out.println("Energy autarky: " + String.format("%.02f", autarkyMEMAP) + " %");
			System.out.println("****************************************************************");	
	
	
//	 		SolutionHandler.calcNewCosts(problem, sol, buildingSpecs);
//			System.out.println("****************************************************************");
		}
		
 		
 		
 		
 		
 		
 		
// ================= AnswerContentToSend ================== 		
		

//		System.out.println(" --- Reading result for Producer and Storages: --- ");
		int index = 0;
		int indexGeb = 0;
		int indexStorage = 0;
		
		for(BuildingSpec buildingSpec : buildingSpecs) {
					
			ans.basicsMap.put(buildingSpec.name + " Costs", buildingCostPerTimestep[indexGeb]);
			indexGeb++;
			
			for(ProducerSpec producerSpec: buildingSpec.producers) {
				double[] producerResult = new double[n];
				for(int i = 0; i < n; i++) {
					producerResult[i] = sol[index++];
				}
//				System.out.println(buildingSpec.name+ ", " + producerSpec.name + " read.");
				ans.resultMap.put(buildingSpec.name + ": " + producerSpec.name, producerResult);
			}
			
			 
			for(StorageSpec storageSpec: buildingSpec.storages) {
				
				double[] storageResult_in = new double[n];
				double[] storageResult_out = new double[n];
				double[] newStateOfCharge = new double[n];
				
				for(int i = 0; i < n; i++) {
					storageResult_in[i] = sol[index++];
				}				
				ans.resultMap.put(buildingSpec.name + ": " + storageSpec.name + " Input", storageResult_in);
				for(int i = 0; i < n; i++) {
					storageResult_out[i] = sol[index++];
				}
				ans.resultMap.put(buildingSpec.name + ": " + storageSpec.name + " Output", storageResult_out);
				for(int i = 0; i < n; i++) {
					newStateOfCharge[i] = problem.h[(2*n*indexStorage)+i] + storageResult_in[i]-storageResult_out[i];
				}
				ans.resultMap.put(buildingSpec.name + ": " + storageSpec.name + " SOC", newStateOfCharge);

//				System.out.println(indexStorage + "- KAP (" + storageSpec.name + "): " + String.format("%.04f", problem.h[n*(2*indexStorage+1)]));
				
				System.out.println(buildingSpec.name+ ", " + storageSpec.name + ", in:" 
						+ String.format("%.02f", storageResult_in[0]) + ", out:" 
						+ String.format("%.02f", storageResult_out[0]));
				
				indexStorage++;
			}
		
		}
		
		for(ProducerSpec producerSpec: producerSpecs) {
			double[] producerResult = new double[n];
			for(int i = 0; i < n; i++) {
				producerResult[i] = sol[index++];
			}
			ans.resultMap.put(producerSpec.name, producerResult);
		}
		for(StorageSpec storageSpec: storageSpecs) {
			double[] storageResult_in = new double[n];
			double[] storageResult_out = new double[n];
			double[] newStateOfCharge = new double[n];
			for(int i = 0; i < n; i++) {
				storageResult_in[i] = sol[index++];
			}
			ans.resultMap.put(storageSpec.name + " Input", storageResult_in);
			for(int i = 0; i < n; i++) {
				storageResult_out[i] = sol[index++];
			}
			
			ans.resultMap.put(storageSpec.name + " Output", storageResult_out);
			for(int i = 0; i < n; i++) {
				newStateOfCharge[i] = problem.h[i] + storageResult_in[i]-storageResult_out[i];
			}
			ans.resultMap.put(storageSpec.name + " SOC", newStateOfCharge);
		}
	
		// Marktmatrizen auslesen
		double[] electricity_buy = new double[n];
		double[] electricity_sell = new double[n];
		double[] heat_buy = new double[n];
		double[] heat_sell = new double[n];
		
		for(int i = 0; i < n; i++) {
			electricity_buy[i] = sol[index++];
		}
		ans.marketMap.put("Electricity Buy", electricity_buy);
		for(int i = 0; i < n; i++) {
			electricity_sell[i] = sol[index++];
		}
		ans.marketMap.put("Electricity Sell", electricity_sell);
		for(int i = 0; i < n; i++) {
			heat_buy[i] = sol[index++];
		}
		ans.marketMap.put("Heat Buy", heat_buy);
		for(int i = 0; i < n; i++) {
			heat_sell[i] = sol[index++];
		}
		ans.marketMap.put("Heat Sell", heat_sell);
		
		
		// independent Keys
		double[] heat_consumption = new double[n];
		double[] electric_consumption = new double[n];
		for(int i = 0; i < n; i++) {
			heat_consumption[i] = problem.b_eq[i];
			electric_consumption[i] = problem.b_eq[n+i];
		}

		ans.basicsMap.put("Total Electric Consumption", electric_consumption);
		ans.basicsMap.put("Total Heat Consumption", heat_consumption);
		
		ans.basicsMap.put("MEMAP Costs", memapCostPerTimestep);
		
		System.out.println("Costs Timestep: " + memapCostPerTimestep);
		
		display.update(gson.toJson(ans));
		
	}
		
	
	@Override
	public AnswerContent returnAnswerContentToSend() {
		return null;
	}

	@Override
	public RequestContent returnRequestContentToSend() {
		return ans;
	}

}
