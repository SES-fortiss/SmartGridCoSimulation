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
import linprogMPC.MPCDenisSimulation;
import linprogMPC.external.M2MDisplay;
import linprogMPC.helper.MatrixBuildup;
import linprogMPC.helper.OptimizationProblem;
import linprogMPC.helper.OptimizationStarter;
import linprogMPC.helper.SolutionHandler;
import linprogMPC.messages.BuildingMessage;
import linprogMPC.messages.ConsumptionMessage;
import linprogMPC.messages.OptimizationResult;
import linprogMPC.messages.ProducerMessage;
import linprogMPC.messages.StorageMessage;

public class LinProgBehavior extends BehaviorModel {
	
	private long sleepTime = 0L;
	
	static double[][] fullXVector = new double[MPCDenisSimulation.NR_OF_ITERATIONS][MPCDenisSimulation.N_STEPS];
	
	static double[] buildingsTotalCosts = new double[MPCDenisSimulation.NR_OF_ITERATIONS];
	static double[] costsMEMAP = new double[MPCDenisSimulation.NR_OF_ITERATIONS];
	static int nrOfStorages = 0;
	static int nrOfProducers = 0;	 	
	

	public OptimizationResult ans = new OptimizationResult();
	public M2MDisplay display;
	public M2MDisplay display2;
	Gson gson = new Gson();
	
	public Calendar startTime;
	public final int n = MPCDenisSimulation.N_STEPS_MPC;
	
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
		ArrayList<ConsumptionMessage> consumptionProfiles = new ArrayList<ConsumptionMessage>();
		ArrayList<ProducerMessage> producerSpecs = new ArrayList<ProducerMessage>();
		ArrayList<StorageMessage> storageSpecs = new ArrayList<StorageMessage>();
		ArrayList<BuildingMessage> buildingMessageList = new ArrayList<BuildingMessage>();
		
		for(BasicAnswer basicAnswer : answerListReceived) {
			
			AnswerContent answerContent = basicAnswer.answerContent;
			if(answerContent instanceof ConsumptionMessage) {
				consumptionProfiles.add((ConsumptionMessage) answerContent);
			}
			if(answerContent instanceof ProducerMessage) {
				producerSpecs.add((ProducerMessage) answerContent);
			}
			if(answerContent instanceof StorageMessage) {
				storageSpecs.add((StorageMessage) answerContent);
			}		
			if(answerContent instanceof BuildingMessage) {
				buildingMessageList.add((BuildingMessage) answerContent);
			}		
		}		
		
	
		if (GlobalTime.getCurrentTimeStep() == 0) {
		 
			// Calculate total Number of Storages & Producers
			nrOfStorages += storageSpecs.size();
			nrOfProducers += producerSpecs.size();
			
			for (BuildingMessage buildingMessage : buildingMessageList) {
				nrOfStorages += buildingMessage.getNrOfStorages();
				nrOfProducers += buildingMessage.getNrOfProducers();
			}
			
			// Output simulation details
			System.out.println(" << Optimization >> ");
			System.out.println("Simulation time: " + MPCDenisSimulation.stepLength(TimeUnit.HOURS)*MPCDenisSimulation.NR_OF_ITERATIONS + " hours (" + MPCDenisSimulation.NR_OF_ITERATIONS/MPCDenisSimulation.TIMESTEPS_PER_DAY + " days)");
			System.out.println("Timestep: " + MPCDenisSimulation.stepLength(TimeUnit.MINUTES) + " minutes (" + MPCDenisSimulation.NR_OF_ITERATIONS + " Steps)");
			System.out.println("MPC Horizon: " + MPCDenisSimulation.N_STEPS_MPC*MPCDenisSimulation.stepLength(TimeUnit.HOURS) + " hours (" + MPCDenisSimulation.N_STEPS_MPC + " Steps)");
			
			System.out.println(" ");
			
			System.out.println("Total Number of Storages: " + nrOfStorages);
			System.out.println("Total Number of Producers: " + nrOfProducers);
			System.out.println("****************************************************************");
		}
	    
		
		// ------------ BUILDING OPTIMIZATION ------------ 
		
		int counterBuilding = 0;
//		double[] costsPerBuilding = new double[buildingSpecs.size()];
		
		double[][] buildingCostPerTimestep = new double[buildingMessageList.size()][n];
		for(BuildingMessage buildingMessage : buildingMessageList) {
		
			counterBuilding++;				
			
			OptimizationProblem problem = MatrixBuildup.SingleBuilding(buildingMessage);
			
			//System.out.println(problem);
			
			double[] sol = OptimizationStarter.runLinProg(problem);
			
			buildingCostPerTimestep[counterBuilding-1] = SolutionHandler.exportCosts(sol, problem.lambda, "CostGEB" + (counterBuilding) + ".csv");				
			
			SolutionHandler.exportMatrix(fullXVector, "XVecGEB" + (counterBuilding) + ".csv");
			SolutionHandler.exportData(problem.lambda, "LambdaGEB" + (counterBuilding) + ".csv");
			
								
		}
	
		for (int i=0; i<buildingMessageList.size(); i++) {
			buildingsTotalCosts[GlobalTime.getCurrentTimeStep()] += buildingCostPerTimestep[i][0];
		}

		

		// ------------ MEMAP - OPTIMIZATION ------------ 

		OptimizationProblem problem = MatrixBuildup.memapMatrices(nrOfProducers,nrOfStorages,
				buildingMessageList,consumptionProfiles,producerSpecs,storageSpecs, MPCDenisSimulation.MEMAP_LDHeating);
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
		
//		SolutionHandler.exportData(sol, "XvectorMEMAP.csv");
		
//		SolutionHandler.exportMatrix(problem.a_eq, "CouplingMatrix.csv");
//		SolutionHandler.exportData(problem.b_eq, "ConsumptionMEMAP.csv");


		
		if (GlobalTime.getCurrentTimeStep() == (MPCDenisSimulation.NR_OF_ITERATIONS-1)) {
			
			
			double totalCostsMEMAP = 0;
			double totalCostsBuildings = 0;
			for (int j=0; j < MPCDenisSimulation.NR_OF_ITERATIONS; j++) {
				totalCostsMEMAP += costsMEMAP[j];
				totalCostsBuildings += buildingsTotalCosts[j];
			}
			
//			SolutionHandler.exportMatrix(problem.g, "GMatrixMEMAP.csv");
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
		
		for(BuildingMessage buildingSpec : buildingMessageList) {
					
			ans.basicsMap.put(buildingSpec.name + " Costs", buildingCostPerTimestep[indexGeb]);
			indexGeb++;
			
			for(ProducerMessage producerSpec: buildingSpec.producers) {
				double[] producerResult = new double[n];
				for(int i = 0; i < n; i++) {
					producerResult[i] = sol[index++];
				}
//				System.out.println(buildingSpec.name+ ", " + producerSpec.name + " read.");
				ans.resultMap.put(buildingSpec.name + ": " + producerSpec.name, producerResult);
			}
			
			 
			for(StorageMessage storageSpec: buildingSpec.storages) {
				
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

				System.out.println(buildingSpec.name+ ", " + storageSpec.name + ", in:" 
						+ String.format("%.02f", storageResult_in[0]) + ", out:" 
						+ String.format("%.02f", storageResult_out[0]));
				
				indexStorage++;
			}
		
		}
		
		for(ProducerMessage producerSpec: producerSpecs) {
			double[] producerResult = new double[n];
			for(int i = 0; i < n; i++) {
				producerResult[i] = sol[index++];
			}
			ans.resultMap.put(producerSpec.name, producerResult);
		}
		for(StorageMessage storageSpec: storageSpecs) {
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
		
		display.update(gson.toJson(ans));
		
		try {
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
		
	
	@Override
	public AnswerContent returnAnswerContentToSend() {
		return null;
	}

	@Override
	public RequestContent returnRequestContentToSend() {
		return ans;
	}
	
	@Override
	public void stop() {
		try {
			display.server.stop();
			display2.server.stop();
		} catch (Exception e) {
			e.printStackTrace();
		}
		super.stop();
	}

}
