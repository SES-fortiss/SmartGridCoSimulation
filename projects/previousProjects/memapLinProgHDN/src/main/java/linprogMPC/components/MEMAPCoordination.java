package linprogMPC.components;

import static linprogMPC.ConfigurationMEMAP.chosenOptimizationHierarchy;
import static linprogMPC.ConfigurationMEMAP.chosenOptimizer;

import java.util.ArrayList;

import akka.basicMessages.AnswerContent;
import akka.basicMessages.BasicAnswer;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;
import linprogMPC.ConfigurationMEMAP.OptHierarchy;
import linprogMPC.ConfigurationMEMAP.Optimizer;
import linprogMPC.MILPTopology;
import linprogMPC.helper.SolutionHandler;
import linprogMPC.helper.lp.LPSolver;
import linprogMPC.helper.milp.MILPSolverNoConnections;
import linprogMPC.helper.milp.MILPSolverWithConnections;
import linprogMPC.messages.BuildingMessage;
import linprogMPC.messages.BuildingMessageHandler;
import linprogMPC.messages.OptimizationResultMessage;
import linprogMPC.messages.extension.ChildSpecification;
import lpsolve.LpSolveException;

/**
 * This model optimizes over several buildings for the planning tool.
 * @author bytschkow
 */
public class MEMAPCoordination extends BehaviorModel {
	
	// some long term values
	double[] totalEURVector = new double[MILPTopology.NR_OF_ITERATIONS];
	double[] totalCO2Vector = new double[MILPTopology.NR_OF_ITERATIONS];
	double[][] solutionPerTimeStep = new double[MILPTopology.NR_OF_ITERATIONS][];
	
	public int nStepsMPC = MILPTopology.N_STEPS_MPC;
	
	SolutionHandler lpSolHandler = new SolutionHandler();
	SolutionHandler milpSolHandler = new SolutionHandler();

	public OptimizationResultMessage optResult = new OptimizationResultMessage(); // optResult = selbst berechnet
	
	public SolutionHandler solHandler = new SolutionHandler();
	public BuildingMessage buildingMessage = new BuildingMessage();
	private BuildingMessageHandler buildingMessageHandler = new BuildingMessageHandler();
	
	public MEMAPCoordination() {}

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
				solveMilpNoConnections();
			}
			
			if(chosenOptimizer == Optimizer.MILPwithConnections) {				
				solveMilpWithConnections();
			}
			
			if(chosenOptimizer == Optimizer.LP) {
				buildingMessage.connectionList.clear();
				solveLP();
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
				solveLP(buildingMessageList);
			}
			
			double costTotal = 0;
			double CO2Total = 0;
			
			for (int i = 0; i < totalEURVector.length; i++) {
				costTotal += totalEURVector[i];
				CO2Total += totalCO2Vector[i];
			}
			
			System.out.println(chosenOptimizer+": " + this.actorName+" cost = " + String.format("%.03f", costTotal) + " € ; CO2: " + String.format("%.03f", CO2Total) + " kg");			
		}
	}

	private void solveLP(ArrayList<BuildingMessage> buildingMessageList) {
		LPSolver lpsolver = new LPSolver(
				buildingMessage, nStepsMPC, lpSolHandler, 
				totalEURVector, totalCO2Vector, 
				this.actor.getCurrentTimeStep(), solutionPerTimeStep,
				this.actorName, optResult);		
		lpsolver.setBuildingMessageList(buildingMessageList);		
		lpsolver.solveLPOptProblem();
	}

	private void solveLP() {
		LPSolver lpsolver = new LPSolver(
					buildingMessage, nStepsMPC, lpSolHandler, 
					totalEURVector, totalCO2Vector, 
					this.actor.getCurrentTimeStep(), solutionPerTimeStep,
					this.actorName, optResult);
		lpsolver.solveLPOptProblem();		
	}

	private void solveMilpNoConnections() {
		MILPSolverNoConnections milpSolver = new MILPSolverNoConnections(
				buildingMessage, nStepsMPC, milpSolHandler,
				totalEURVector, totalCO2Vector, 
				this.actor.getCurrentTimeStep(), solutionPerTimeStep,
				this.actorName, optResult);
		try {
			milpSolver.createModel();				
			milpSolver.solveMILP(); // and work through results			
		} catch (LpSolveException e) {			
			e.printStackTrace();
		}		
	}
	
	private void solveMilpWithConnections() {
		MILPSolverWithConnections milpWithConnections = new MILPSolverWithConnections(
				answerListReceived, nStepsMPC, milpSolHandler, 
				totalEURVector, totalCO2Vector, 
				this.actor.getCurrentTimeStep(), solutionPerTimeStep, 
				actorName, optResult);				
		try {
			milpWithConnections.createModel();
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

