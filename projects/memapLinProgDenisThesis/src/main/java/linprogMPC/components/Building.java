package linprogMPC.components;

import java.util.Arrays;
import java.util.LinkedList;

import com.google.gson.Gson;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.BasicAnswer;
import akka.basicMessages.RequestContent;
import akka.systemActors.GlobalTime;
import behavior.BehaviorModel;
import linprogMPC.ThesisTopologySimple;
import linprogMPC.helper.HelperConcat;
import linprogMPC.helper.MatrixBuildup;
import linprogMPC.helper.OptimizationProblem;
import linprogMPC.helper.OptimizationStarter;
import linprogMPC.helper.SolutionHandler;
import linprogMPC.messages.BuildingMessage;
import linprogMPC.messages.ConsumptionMessage;
import linprogMPC.messages.CouplerMessage;
import linprogMPC.messages.OptimizationResult;
import linprogMPC.messages.ProducerMessage;
import linprogMPC.messages.StorageMessage;

public class Building extends BehaviorModel {
	
	
	
	protected Gson gson = new Gson();
	public int port;
	
	// some long term values
	double[] buildingsTotalCosts = new double[ThesisTopologySimple.NR_OF_ITERATIONS];
	double[][] buildingsSolutionPerTimeStep = new double[ThesisTopologySimple.NR_OF_ITERATIONS][];
	
	public final int nStepsMPC = ThesisTopologySimple.N_STEPS_MPC;
	
	// NEW(7.8.18 by JMr): Long-distance heating supply
	public boolean LDHeating;
	public int heatTransportLength;
	
	// ================================
	
	public OptimizationResult optResult = new OptimizationResult();
	
	public BuildingMessage buildingMessage = new BuildingMessage();
	public OptimizationResult requestContentToSend = new OptimizationResult();	

	public Building(int port, boolean LDHeating, int heatTransportLength) {		
		this.LDHeating = LDHeating;
		this.heatTransportLength = heatTransportLength;
	}


	
	
	@Override
	public void makeDecision() {	
	//	=======================  RECEIVING =======================	
				
		buildingMessage = new BuildingMessage();
		
		buildingMessage.name = this.actorName;
		buildingMessage.LDHeating = LDHeating;
		buildingMessage.heatTransportLength = heatTransportLength;
		
		for(BasicAnswer basicAnswer : answerListReceived) {			
			AnswerContent answerContent = basicAnswer.answerContent;
			if(answerContent instanceof ConsumptionMessage) {
				buildingMessage.consumption.addConsumption(((ConsumptionMessage) answerContent).getDemandVector()); 
			}
			
			if(answerContent instanceof ProducerMessage) {
				buildingMessage.producers.add((ProducerMessage) answerContent);
			}
			
			if(answerContent instanceof StorageMessage) {
				buildingMessage.storages.add((StorageMessage) answerContent);
			}			
			if(answerContent instanceof CouplerMessage) {
				buildingMessage.couplers.add((CouplerMessage) answerContent);
			}
		}
		
		OptimizationProblem problem = null;
		try {
			// ******* Optimierung ********************************
			MatrixBuildup mb = new MatrixBuildup();			
			problem = mb.singleBuilding(buildingMessage);
			OptimizationStarter os = new OptimizationStarter();
			double[] optSolution = os.runLinProg(problem);
			
			// ******** Ermittlung der Kosten *********************
			double[] buildingCostPerTimestep = new double[nStepsMPC];
			buildingCostPerTimestep = SolutionHandler.calculateTimeStepCosts(optSolution, problem.lambda);		
			buildingsTotalCosts[GlobalTime.getCurrentTimeStep()] += buildingCostPerTimestep[0];			
			
			/*
			double costTotal = 0;
			for (int i = 0; i < buildingsTotalCosts.length; i++) {
				costTotal += buildingsTotalCosts[i];
			}
			System.out.println(this.actorName+" cost = " + costTotal);
			*/

			// ******** Erstellung des Ergebnisvektors *********************
			double[] currentOptVector = SolutionHandler.getSolutionForThisTimeStep(optSolution, nStepsMPC);
			double[] currentDemand = SolutionHandler.getDemandForThisTimestep(problem, nStepsMPC);
			double[] currentSOC = SolutionHandler.getCurrentSOC(buildingMessage.storages);
			double[] currentCost = {buildingCostPerTimestep[0]};
			
			double[] vectorAll = HelperConcat.concatAlldoubles(currentDemand, currentOptVector, currentSOC, currentCost);
			
			String[] currentNamesPartly = SolutionHandler.getNamesForThisTimeStep(problem, nStepsMPC);
			String[] demandStrings = {"demandHeat", "demandElectricity"};
			String[] storageNames = SolutionHandler.getNamesForSOC(buildingMessage.storages);
			String[] costName = {"Cost"}; 
			
			String[] namesAll = HelperConcat.concatAllObjects(demandStrings, currentNamesPartly, storageNames, costName);
						
			//System.out.println(this.actorName + " " + Arrays.toString(namesAll));
			//System.out.println(this.actorName + " " + Arrays.toString(vectorAll));									
			
			//********* Speichern
			
			buildingsSolutionPerTimeStep[this.getActualTimeStep()] = vectorAll;
			if (GlobalTime.getCurrentTimeStep() == (ThesisTopologySimple.NR_OF_ITERATIONS-1)) {
				SolutionHandler.exportMatrixWithHeader(buildingsSolutionPerTimeStep, this.actorName+"Solutions.csv", namesAll);
			}
			
			
			// ================= AnswerContentToSend ==================					
			for (int i = 0; i < optSolution.length/nStepsMPC; i++) {
				double[] result = new double[nStepsMPC];
				
				for (int j = 0; j < result.length; j++) {
					result[j] = optSolution[i*nStepsMPC + j];
				}
				
				String str = problem.namesUB[i*nStepsMPC];
				optResult.resultMap.put(str, result);
				//System.out.println("result: " + str + Arrays.toString(result));
			}
			
		} catch (Exception e) {
			System.err.println(this.actorName + " cannot solve the optimization");
			
			System.out.println("names: " + Arrays.toString(problem.namesUB));
			System.out.println("b: " + Arrays.toString(problem.b_eq));
			System.out.println("ub: " + Arrays.toString(problem.x_ub));
			System.out.println("h: " + Arrays.toString(problem.h));
			
			e.printStackTrace();
		}				
	}

	
	@Override
	public AnswerContent returnAnswerContentToSend() {
		return buildingMessage;
	}

	@Override	
	public void handleRequest() {		
		requestContentToSend = optResult;
		
		if (ThesisTopologySimple.MEMAP_ON) {
			requestContentToSend = (OptimizationResult) requestContentReceived;
		}		
	}


	@Override
	public RequestContent returnRequestContentToSend() {
		return requestContentToSend;
	}
	
	@Override
	public void stop() {	
		super.stop();
	}




	@Override
	public void handleError(LinkedList<ErrorAnswerContent> errors) {}

}
