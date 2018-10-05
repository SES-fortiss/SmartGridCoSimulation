package linprogMPC.components;

import java.util.ArrayList;
import java.util.Arrays;
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
import linprogMPC.ThesisTopologySimple;
import linprogMPC.external.M2MDisplay;
import linprogMPC.helper.HelperConcat;
import linprogMPC.helper.MatrixBuildup;
import linprogMPC.helper.MyTimeUnit;
import linprogMPC.helper.OptimizationProblem;
import linprogMPC.helper.OptimizationStarter;
import linprogMPC.helper.SolutionHandler;
import linprogMPC.messages.BuildingMessage;
import linprogMPC.messages.ConsumptionMessage;
import linprogMPC.messages.CouplerMessage;
import linprogMPC.messages.OptimizationResult;
import linprogMPC.messages.ProducerMessage;
import linprogMPC.messages.StorageMessage;

public class LinProgBehavior extends BehaviorModel {
	
	private long sleepTime = 0L;
	
	double[][] fullXVector = new double[ThesisTopologySimple.NR_OF_ITERATIONS][ThesisTopologySimple.N_STEPS];
	
	double[] costForTimestepAllBuildings = new double[ThesisTopologySimple.NR_OF_ITERATIONS];
	double[] costForTimestepMEMAP = new double[ThesisTopologySimple.NR_OF_ITERATIONS];
	double[][] memapSolutionPerTimeStep = new double[ThesisTopologySimple.NR_OF_ITERATIONS][];		

	public OptimizationResult optResult = new OptimizationResult();
	public M2MDisplay display;
	public M2MDisplay display2;
	Gson gson = new Gson();
	
	public Calendar startTime;
	public final int nStepsMPC = ThesisTopologySimple.N_STEPS_MPC;
	
	public LinProgBehavior() {
		display = new M2MDisplay(8080); // add port in to display a json
		display.run();
		display2 = new M2MDisplay(8079); // add port in to display a json
		display2.run();
	}

	@Override
	public void handleError(LinkedList<ErrorAnswerContent> errors) {}

	@Override
	public void handleRequest() {}
	

	@Override
	public void makeDecision() {
		
		// Sort the received answers in 'Buildings' and/or 'free consumer/Storage/Producers'
		ArrayList<ConsumptionMessage> consumptionProfiles = new ArrayList<ConsumptionMessage>();
		ArrayList<ProducerMessage> producerMessageList = new ArrayList<ProducerMessage>();
		ArrayList<StorageMessage> storageMessageList = new ArrayList<StorageMessage>();
		ArrayList<CouplerMessage> couplerMessageList = new ArrayList<CouplerMessage>();
		ArrayList<BuildingMessage> buildingMessageList = new ArrayList<BuildingMessage>();
				
		for(BasicAnswer basicAnswer : answerListReceived) {
			
			AnswerContent answerContent = basicAnswer.answerContent;
			if(answerContent instanceof ConsumptionMessage) {
				consumptionProfiles.add((ConsumptionMessage) answerContent);
			}
			if(answerContent instanceof ProducerMessage) {
				producerMessageList.add((ProducerMessage) answerContent);
			}
			if(answerContent instanceof StorageMessage) {
				storageMessageList.add((StorageMessage) answerContent);
			}		
			if(answerContent instanceof CouplerMessage) {
				couplerMessageList.add((CouplerMessage) answerContent);
			}			
			if(answerContent instanceof BuildingMessage) {				
				buildingMessageList.add((BuildingMessage) answerContent);
			}	
		}
		
	
		if (GlobalTime.getCurrentTimeStep() == 0) {
			
			int nrOfStorages = 0;
			int nrOfProducers = 0;
			int nrOfCouplers = 0;
			
			for (BuildingMessage buildingMessage : buildingMessageList) {
				nrOfStorages += buildingMessage.getNrOfStorages();
				nrOfProducers += buildingMessage.getNrOfProducers();
				nrOfCouplers += buildingMessage.getNrOfCouplers();
			}
			
			// Output simulation details
			System.out.println(" << makeDesicion LinProg --- Optimization >> ");
			System.out.println("Simulation time: " + MyTimeUnit.stepLength(TimeUnit.HOURS)*ThesisTopologySimple.NR_OF_ITERATIONS + " hours (" + ThesisTopologySimple.NR_OF_ITERATIONS/ThesisTopologySimple.TIMESTEPS_PER_DAY + " days)");
			System.out.println("Timestep: " + MyTimeUnit.stepLength(TimeUnit.MINUTES) + " minutes (" + ThesisTopologySimple.NR_OF_ITERATIONS + " Steps)");
			System.out.println("MPC Horizon: " + ThesisTopologySimple.N_STEPS_MPC*MyTimeUnit.stepLength(TimeUnit.HOURS) + " hours (" + ThesisTopologySimple.N_STEPS_MPC + " Steps)");
			
			System.out.println(" ");
			
			System.out.println("Total Number of Storages: " + nrOfStorages);
			System.out.println("Total Number of Producers: " + nrOfProducers);
			System.out.println("Total Number of Couplers: " + nrOfCouplers);
			System.out.println("----------------------------------------------------------------");
		}
	    
		
		// ------------ BUILDING OPTIMIZATION ------------ 
		
		int counterBuilding = 0;		
		double[][] buildingCostPerTimestep = new double[buildingMessageList.size()][nStepsMPC];
		
		for(BuildingMessage buildingMessage : buildingMessageList) {
		
			counterBuilding++;
			
			MatrixBuildup mb = new MatrixBuildup();			
			OptimizationProblem problem = mb.singleBuilding(buildingMessage);
			OptimizationStarter os = new OptimizationStarter();
			double[] optSolution = os.runLinProg(problem);
			
			buildingCostPerTimestep[counterBuilding-1] = SolutionHandler.calculateTimeStepCosts(optSolution, problem.lambda);
		}
	
		// TODO, wenn MEMAP eingeschaltet ist, kann man das so nicht machen, weil sich die einzelnen Kosten anders zusammenstellen.
		// Z.B Gebäude 1 wird seine Heizung gar nicht mehr nutzen. Stattdessen wird Gebäude 2 übernehmen.
		for (int i=0; i<buildingMessageList.size(); i++) {
			costForTimestepAllBuildings[GlobalTime.getCurrentTimeStep()] += buildingCostPerTimestep[i][0];
		}
	
		// ------------ MEMAP - OPTIMIZATION ------------ 

		OptimizationProblem problem = MatrixBuildup.multipleBuildings(
				buildingMessageList,ThesisTopologySimple.MEMAP_LDHeating);
		
		OptimizationStarter os = new OptimizationStarter();
		double[] sol = os.runLinProg(problem);
		double[] memapCostPerTimestep = SolutionHandler.calculateTimeStepCosts(sol, problem.lambda);
		
		costForTimestepMEMAP[GlobalTime.getCurrentTimeStep()] = memapCostPerTimestep[0];

		// Print consumption and calculate energy autarky
		// double autarkyMEMAP = SolutionHandler.calcAutarky(problem, sol);
			
		
		display2.update(gson.toJson(problem.b_eq));
		display.update(gson.toJson(sol));
	
		
		// ******** Erstellung des Ergebnisvektors *********************
		double[] currentOptVector = SolutionHandler.getSolutionForThisTimeStep(sol, nStepsMPC);
		double[] currentDemand = SolutionHandler.getDemandForThisTimestep(problem, nStepsMPC);
		double[] currentSOC = SolutionHandler.getCurrentSOCs(buildingMessageList);
		double[] currentCost = {memapCostPerTimestep[0]};
		
		double[] vectorAll = HelperConcat.concatAlldoubles(currentDemand, currentOptVector, currentSOC, currentCost);
		
		String[] currentNamesPartly = SolutionHandler.getNamesForThisTimeStep(problem, nStepsMPC);
		String[] demandStrings = {"demandHeat", "demandElectricity"};
		String[] storageNames = SolutionHandler.getNamesForSOCs(buildingMessageList);
		String[] costName = {"Cost"}; 
		
		String[] namesAll = HelperConcat.concatAllObjects(demandStrings, currentNamesPartly, storageNames, costName);
					
		System.out.println(this.actorName + " " + Arrays.toString(namesAll));
		System.out.println(this.actorName + " " + Arrays.toString(vectorAll));									
		
		//********* Speichern
		
		memapSolutionPerTimeStep[this.getActualTimeStep()] = vectorAll;
		if (GlobalTime.getCurrentTimeStep() == (ThesisTopologySimple.NR_OF_ITERATIONS-1)) {
			SolutionHandler.exportMatrixWithHeader(memapSolutionPerTimeStep, this.actorName+"Solutions.csv", namesAll);
		}
		
		// ================= Handling the result ================== 	
	
		if (GlobalTime.getCurrentTimeStep() == (ThesisTopologySimple.NR_OF_ITERATIONS-1)) {
			double totalCostsMEMAP = 0;
			double totalCostsBuildings = 0;
			for (int j=0; j < ThesisTopologySimple.NR_OF_ITERATIONS; j++) {
				totalCostsMEMAP += costForTimestepMEMAP[j];
				totalCostsBuildings += costForTimestepAllBuildings[j];
			}
			
			System.out.println(" << Optimization Result (MPC) >> ");	
			System.out.println("COSTS without MEMAP: " + String.format("%.02f", totalCostsBuildings));
			System.out.println("COSTS with MEMAP: " + String.format("%.02f", totalCostsMEMAP));
			System.out.println("----------------------------------------------------------------");
		}
 		
		// ================= AnswerContentToSend ==================		
		
		for (int i = 0; i < sol.length/nStepsMPC; i++) {
			double[] result = new double[nStepsMPC];
			
			for (int j = 0; j < result.length; j++) {
				result[j] = sol[i*nStepsMPC + j];
			}
			
			String str = problem.namesUB[i*nStepsMPC];
			optResult.resultMap.put(str, result);
			//System.out.println("result: " + str + Arrays.toString(result));
		}	
		
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
		return optResult;
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

