package linprog.components;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

import com.google.gson.Gson;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.BasicAnswer;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;
import linprog.LinProgSimulation;
import linprog.helper.MatrixBuildup;
import linprog.helper.OptimizationProblem;
import linprog.helper.OptimizationStarter;
import linprog.helper.SolutionHandler;
import linprog.messages.BuildingSpec;
import linprog.messages.Consumption;
import linprog.messages.OptimizationResult;
import linprog.messages.ProducerSpec;
import linprog.messages.StorageSpec;
import memap.external.M2MDisplay;

public class LinProgBehavior extends BehaviorModel {

	public OptimizationResult ans = new OptimizationResult();
	public M2MDisplay display;
	Gson gson = new Gson();
	
	public Calendar startTime;
	public final int n = LinProgSimulation.TIMESTEPS_PER_ITERATION;
	
	public LinProgBehavior() {
		display = new M2MDisplay(8080); // add port in to display a json
		display.run();
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
		
		System.out.println("Stepsize: " + LinProgSimulation.stepLength(TimeUnit.HOURS) + " hours.");
		System.out.println("Horizon: " + LinProgSimulation.N_DAYS*24 + " hours (" + LinProgSimulation.N_DAYS + " days)");
		System.out.println("****************************************************************");
		
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

		int nrOfStorages = storageSpecs.size();
		int nrOfProducers = producerSpecs.size();
		//int nrOfConsumers = consumptionProfiles.size();
		
		
		// ------------ BUILDING OPTIMIZATION ------------ 
		
		int counter = 0; // counter variable
		double[] costsPerBuilding = new double[buildingSpecs.size()];
		
		for(BuildingSpec buildingSpec : buildingSpecs) {
			
			OptimizationProblem problem = MatrixBuildup.SingleBuilding(buildingSpec);
			
//			System.out.println("lambda.length double[]: " + problem.lambda.length);
//			System.out.println("h.length double[]: " + problem.h.length);
//			System.out.println("g.length double[]: " + problem.g.length);
//			System.out.println("b_eq.length double[]: " + problem.b_eq.length);
//			System.out.println("a_eq.length double[]: " + problem.a_eq.length);
//			System.out.println("x_lb.length double[]: " + problem.x_lb.length);
//			System.out.println("x_ub.length double[]: " + problem.x_ub.length);
			
			
			double[] sol = OptimizationStarter.runLinProg(problem);
			
			// Print consumption and calculate energy autarky
			double autarky = SolutionHandler.calcAutarky(problem, sol);
			
			costsPerBuilding[counter] = SolutionHandler.exportCosts(sol, problem.lambda, "CostGEB" + (counter+1) + ".csv");		
			System.out.println("COSTS: " + String.format("%.02f", costsPerBuilding[counter]));
			System.out.println("Energy autarky: " + String.format("%.02f", autarky) + " %");
			System.out.println("****************************************************************");	
			
			nrOfStorages += buildingSpec.getNrOfStorages();
			nrOfProducers += buildingSpec.getNrOfProducers();	
			counter++;		
			
			// CSV Export functions
			SolutionHandler.exportData(sol, "XvectorGEB" + (counter) + ".csv");	
			SolutionHandler.exportProduction(problem.a_eq, sol, "ProductionVecGEB" + (counter) + ".csv");
			SolutionHandler.exportData(buildingSpec.consumption.getVector(), "ConsumptionGEB" + (counter) + ".csv");
			SolutionHandler.exportMatrix(problem.a_eq, "CouplingMatrixGEB" + (counter) + ".csv");
			SolutionHandler.exportMatrix(problem.g, "CapacityMatrixGEB" + (counter) + ".csv");
		}
		
		

		// ------------ MEMAP - OPTIMIZATION ------------ 

		System.out.println(" << MEMAP Optimization >> ");
		System.out.println("Total Storage: " + nrOfStorages);
		System.out.println("Total Producer: " + nrOfProducers);
		
		OptimizationProblem problem = MatrixBuildup.memapMatrices(nrOfProducers,nrOfStorages,
				buildingSpecs,consumptionProfiles,producerSpecs,storageSpecs, LinProgSimulation.MEMAP_LDHeating);
		double[] sol = OptimizationStarter.runLinProg(problem);
		
		// Print consumption and calculate energy autarky
		double autarkyMEMAP = SolutionHandler.calcAutarky(problem, sol);

		
		// CSV Export functions
		SolutionHandler.exportData(sol, "XvectorMEMAP.csv");
		SolutionHandler.exportMatrix(problem.a_eq, "CouplingMatrix.csv");
		SolutionHandler.exportData(problem.b_eq, "ConsumptionMEMAP.csv");
//		double[] productionExport = SolutionHandler.matrixMultiplication(problem.a_eq, sol);
//		SolutionHandler.exportData(productionExport, "PruductionMEMAP.csv");
		
		double buildingsTotalCosts = 0;
		for (int i=0; i<buildingSpecs.size(); i++) {
			buildingsTotalCosts += costsPerBuilding[i];
		}
		
		double costsMEMAP = SolutionHandler.exportCosts(sol, problem.lambda, "CostVectorMEMAP.csv");
		
		System.out.println("****************************************************************");	
		System.out.println("COSTS without MEMAP: " + String.format("%.02f", buildingsTotalCosts));
		System.out.println("COSTS with MEMAP: " + String.format("%.02f", costsMEMAP));
		System.out.println("Energy autarky: " + String.format("%.02f", autarkyMEMAP) + " %");
		System.out.println("****************************************************************");	


		
		
		
		
		
// ================= AnswerContentToSend ================== 		
		

//		System.out.println(" --- Reading result for Producer and Storages: --- ");
		int index = 0;
		int indexStorage = 0;
		
		for(BuildingSpec buildingSpec : buildingSpecs) {
								
			
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
				
//				System.out.println(buildingSpec.name+ ", " + storageSpec.name + ", in:" 
//						+ String.format("%.02f", storageResult_in[0]) + ", out:" 
//						+ String.format("%.02f", storageResult_out[0]));
				
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
		
		display.update(gson.toJson(ans));
		

// ================================================================================
		
		// Wer hat wem wieviel Wärme / Strom geliefert
		
		
 		SolutionHandler.calcNewCosts(problem, sol, buildingSpecs);	
 		
// ================================================================================ 		
		
		
//
//		
//		System.out.println("****************************************************************");
////		System.out.println(" --- Reading result for Producer and Storages: --- ");
//		int index = 0;
//		
//		for(BuildingSpec buildingSpec : buildingSpecs) {
//			for(ProducerSpec producerSpec: buildingSpec.producers) {
//				double[] producerResult = new double[n];
//				for(int i = 0; i < n; i++) {
//					producerResult[i] = sol[index++];
//				}
////				System.out.println(buildingSpec.name+ ", " + producerSpec.name + " read.");
//				ans.resultMap.put(buildingSpec.name + ": " + producerSpec.name, producerResult);
//			}
//			for(StorageSpec storageSpec: buildingSpec.storages) {
//				double[] storageResult_in = new double[n];
//				double[] storageResult_out = new double[n];
//				for(int i = 0; i < n; i++) {
//					storageResult_in[i] = sol[index++];
//				}
////				System.out.println(buildingSpec.name+ ", " + storageSpec.name + " read.");
//				
//				ans.resultMap.put(buildingSpec.name + ": " + storageSpec.name + " Input", storageResult_in);
//				for(int i = 0; i < n; i++) {
//					storageResult_out[i] = sol[index++];
//				}
//				ans.resultMap.put(buildingSpec.name + ": " + storageSpec.name + " Output", storageResult_out);
//			}			
//		}
//		
//		for(ProducerSpec producerSpec: producerSpecs) {
//			double[] producerResult = new double[n];
//			for(int i = 0; i < n; i++) {
//				producerResult[i] = sol[index++];
//			}
//			ans.resultMap.put(producerSpec.name, producerResult);
//		}
//		for(StorageSpec storageSpec: storageSpecs) {
//			double[] storageResult = new double[2*n];
//			for(int i = 0; i < n; i++) {
//				storageResult[i] = sol[index++];
//			}
//			for(int i = n; i < 2*n; i++) {
//				storageResult[i] = sol[index++];
//			}
//			ans.resultMap.put(storageSpec.name, storageResult);
//		}
//		
		
		
	}
		

	@Override
	public AnswerContent returnAnswerContentToSend() {
		return ans;
	}

	@Override
	public RequestContent returnRequestContentToSend() {
		return null;
	}

}
