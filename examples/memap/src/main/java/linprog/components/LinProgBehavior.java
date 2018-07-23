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
import linprog.Simulation;
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
	public final int n = Simulation.TIMESTEPS_PER_ITERATION;
	
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
		
		System.out.println("Stepsize: " + Simulation.stepLength(TimeUnit.HOURS) + " hours.");
		System.out.println("Horizon: " + Simulation.N_DAYS*24 + " hours (" + Simulation.N_DAYS + " days)");
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
			double[] sol = OptimizationStarter.runLinProg(problem);
			
			costsPerBuilding[counter] = SolutionHandler.exportCosts(sol, problem.lambda, "CostGEB" + (counter+1) + ".csv");		
			System.out.println("COSTS: " + String.format("%.02f", costsPerBuilding[counter]));
			System.out.println("****************************************************************");	
			
			nrOfStorages += buildingSpec.getNrOfStorages();
			nrOfProducers += buildingSpec.getNrOfProducers();	
			counter++;		
			
			SolutionHandler.exportData(sol, "XvectorGEB" + (counter) + ".csv");	
			SolutionHandler.exportData(buildingSpec.consumption.getVector(), "ConsumptionGEB" + (counter) + ".csv");
			SolutionHandler.exportMatrix(problem.a_eq, "CouplingMatrixGEB" + (counter) + ".csv");
		}

		// ------------ MEMAP - OPTIMIZATION ------------ 

		System.out.println(" << MEMAP Optimization >> ");
		System.out.println("Total Storage: " + nrOfStorages);
		System.out.println("Total Producer: " + nrOfProducers);
		
		OptimizationProblem problem = MatrixBuildup.memapMatrices(nrOfProducers,nrOfStorages,buildingSpecs,consumptionProfiles,producerSpecs,storageSpecs);
		double[] sol = OptimizationStarter.runLinProg(problem);

		display.update(gson.toJson(sol));
		
	
		
// ================= Handling the result ================== 	

		
//		double[] productionExport = SolutionHandler.matrixMultiplication(problem.a_eq, sol);
//		SolutionHandler.exportData(productionExport, "PruductionMEMAP.csv");
		
		SolutionHandler.exportData(sol, "XvectorMEMAP.csv");
		
		SolutionHandler.exportMatrix(problem.a_eq, "CouplingMatrix.csv");
		SolutionHandler.exportData(problem.b_eq, "ConsumptionMEMAP.csv");

		
		double buildingsTotalCosts = 0;
		for (int i=0; i<buildingSpecs.size(); i++) {
			buildingsTotalCosts += costsPerBuilding[i];
		}
		double costsMEMAP = SolutionHandler.exportCosts(sol, problem.lambda, "CostVectorMEMAP.csv");
		
		System.out.println("****************************************************************");	
		System.out.println("COSTS without MEMAP: " + String.format("%.02f", buildingsTotalCosts));
		System.out.println("COSTS with MEMAP: " + String.format("%.02f", costsMEMAP));
		System.out.println("****************************************************************");	


 		
		int nrOfStorages2 = 0;
		int nrOfProducers2 = 0;
		int building = 0;
		int range1 = 0;
		int range2 = 0;
		int marketmatrices = 4; // selling/buying(2) of electricity/heat(2)
		
		System.out.println(" << New Costs (to grid) >>");
					
		for(BuildingSpec buildingSpec : buildingSpecs) {
			double newBuildingCosts = 0;
			double newBuildingTradeCosts = 0;
			nrOfProducers2 += buildingSpec.getNrOfProducers();
			nrOfStorages2 += buildingSpec.getNrOfStorages();	
			range2 = n*(nrOfProducers2+2*nrOfStorages2+marketmatrices);
			for (int j=range1; j<range2; j++) {
				newBuildingCosts += problem.lambda[j]*sol[j];
			}
			for (int j=range2-n*marketmatrices; j<range2; j++) {
				newBuildingTradeCosts += problem.lambda[j]*sol[j];
			}
			
			range1=range2;
			building++;
			

			System.out.println("Building " + building + ": " + String.format("%.02f", newBuildingCosts)+ "(" + String.format("%.02f", newBuildingTradeCosts) + ")");
		}
		
		
		
		System.out.println("****************************************************************");
//		System.out.println(" --- Reading result for Producer and Storages: --- ");
		int index = 0;
		
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
				for(int i = 0; i < n; i++) {
					storageResult_in[i] = sol[index++];
				}
//				System.out.println(buildingSpec.name+ ", " + storageSpec.name + " read.");
				
				ans.resultMap.put(buildingSpec.name + ": " + storageSpec.name + " Input", storageResult_in);
				for(int i = 0; i < n; i++) {
					storageResult_out[i] = sol[index++];
				}
				ans.resultMap.put(buildingSpec.name + ": " + storageSpec.name + " Output", storageResult_out);
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
			double[] storageResult = new double[2*n];
			for(int i = 0; i < n; i++) {
				storageResult[i] = sol[index++];
			}
			for(int i = n; i < 2*n; i++) {
				storageResult[i] = sol[index++];
			}
			ans.resultMap.put(storageSpec.name, storageResult);
		}
				
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
