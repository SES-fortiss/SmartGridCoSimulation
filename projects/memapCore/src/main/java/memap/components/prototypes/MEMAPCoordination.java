package memap.components.prototypes;

import static memap.main.ConfigurationMEMAP.chosenOptimizationHierarchy;
import static memap.main.ConfigurationMEMAP.chosenOptimizer;

import java.util.ArrayList;
import java.util.LinkedList;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.BasicAnswer;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;
import lpsolve.LpSolveException;
import memap.helper.SolutionHandler;
import memap.helper.lp.LPSolver;
import memap.helper.milp.MILPSolverNoConnections;
import memap.helper.milp.MILPSolverWithConnections;
import memap.main.TopologyConfig;
import memap.main.ConfigurationMEMAP.OptHierarchy;
import memap.main.ConfigurationMEMAP.Optimizer;
import memap.messages.BuildingMessage;
import memap.messages.BuildingMessageHandler;
import memap.messages.OptimizationResultMessage;
import memap.messages.extension.ChildSpecification;

/**
 * This model optimizes over several buildings for the planning tool.
 * @author bytschkow
 */
public class MEMAPCoordination extends BehaviorModel {
	
	// some long term values
	double[] totalEURVector = new double[TopologyConfig.NR_OF_ITERATIONS];
	double[] totalCO2Vector = new double[TopologyConfig.NR_OF_ITERATIONS];
	double[][] solutionPerTimeStep = new double[TopologyConfig.NR_OF_ITERATIONS][];
	
	public int nStepsMPC = TopologyConfig.N_STEPS_MPC;
	
	SolutionHandler lpSolHandler = new SolutionHandler();
	SolutionHandler milpSolHandler = new SolutionHandler();

	public OptimizationResultMessage optResult = new OptimizationResultMessage(); // optResult = selbst berechnet
	
	//public SolutionHandler solHandler = new SolutionHandler();
	public BuildingMessage buildingMessage = new BuildingMessage();
	private BuildingMessageHandler buildingMessageHandler = new BuildingMessageHandler();
	
	public MEMAPCoordination() {}

	@Override
	public void handleError(LinkedList<ErrorAnswerContent> errors) {}

	@Override
	public void handleRequest() {}	

	@Override
	public void makeDecision() {
		
		//	=======================  RECEIVING =======================				
		buildingMessage = new BuildingMessage();
		buildingMessage.id = this.fullActorPath;
		buildingMessage.name = this.actorName;
		
		this.actor.getContext().getChildren().forEach(child ->
			buildingMessage.childrenList.add(new ChildSpecification(this.fullActorPath + "/" + child.path().name())));				

		buildingMessage = buildingMessageHandler.aggregateBuildingMessages(buildingMessage, answerListReceived);
		buildingMessage = buildingMessageHandler.refactorDemandList(buildingMessage);
		
		if (chosenOptimizationHierarchy == OptHierarchy.MEMAP) {
			if(chosenOptimizer == Optimizer.MILP){				
				useMilpNoConnections();
			}
			
			if(chosenOptimizer == Optimizer.MILPwithConnections) {				
				useMilpWithConnections();
			}
			
			if(chosenOptimizer == Optimizer.LP) {
				buildingMessage.connectionList.clear();
				useLP();
			}
			
			if(chosenOptimizer == Optimizer.LPwithConnections) {			
				ArrayList<BuildingMessage> buildingMessageList = new ArrayList<BuildingMessage>();				
				for(BasicAnswer basicAnswer : answerListReceived) {					
					AnswerContent answerContent = basicAnswer.answerContent;
					if(answerContent instanceof BuildingMessage) {
						BuildingMessage bm  = (BuildingMessage) answerContent;
						buildingMessageList.add(bm);
					}
				}
				useLP(buildingMessageList);
			}
			
			double costTotal = 0;
			double CO2Total = 0;
			
			for (int i = 0; i < totalEURVector.length; i++) {
				costTotal += totalEURVector[i];
				CO2Total += totalCO2Vector[i];
			}
			
			System.out.println(chosenOptimizer+": " + this.actorName+" cost = " + String.format("%.03f", costTotal) + " EUR ; CO2: " + String.format("%.03f", CO2Total) + " kg");			
		}
	}

	private void useLP(ArrayList<BuildingMessage> buildingMessageList) {
		LPSolver lpsolver = new LPSolver(
				buildingMessage, nStepsMPC, lpSolHandler, 
				totalEURVector, totalCO2Vector, 
				getActualTimeStep(), solutionPerTimeStep,
				this.actorName, optResult);		
		lpsolver.setBuildingMessageList(buildingMessageList);		
		lpsolver.solveLPOptProblem();
	}

	private void useLP() {
		LPSolver lpsolver = new LPSolver(
					buildingMessage, nStepsMPC, lpSolHandler, 
					totalEURVector, totalCO2Vector, 
					getActualTimeStep(), solutionPerTimeStep,
					this.actorName, optResult);
		lpsolver.solveLPOptProblem();		
	}

	private void useMilpNoConnections() {
		MILPSolverNoConnections milpSolver = new MILPSolverNoConnections(
				buildingMessage, nStepsMPC, milpSolHandler,
				totalEURVector, totalCO2Vector, 
				getActualTimeStep(), solutionPerTimeStep,
				this.actorName, optResult);
		try {
			milpSolver.createModel();				
			milpSolver.solveMILP(); // and work through results			
		} catch (LpSolveException e) {			
			e.printStackTrace();
		}		
	}
	
	private void useMilpWithConnections() {
		MILPSolverWithConnections milpWithConnections = new MILPSolverWithConnections(
				answerListReceived, nStepsMPC, milpSolHandler, 
				totalEURVector, totalCO2Vector, 
				getActualTimeStep(), solutionPerTimeStep, 
				actorName, optResult);				
		try {
			milpWithConnections.createModelWithConnections();
			milpWithConnections.solveMILP();
		} catch (LpSolveException e) {			
			e.printStackTrace();
		}
	}		
	
	@Override
	public AnswerContent returnAnswerContentToSend() {
		return buildingMessage;
	}

	@Override
	public RequestContent returnRequestContentToSend() {
		return optResult;
	}
	
	@Override
	public void stop() {
		try {
		} catch (Exception e) {
			e.printStackTrace();
		}
		super.stop();
	}

}

