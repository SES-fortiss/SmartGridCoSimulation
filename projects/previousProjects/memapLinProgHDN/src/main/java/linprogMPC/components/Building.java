package linprogMPC.components;

import static linprogMPC.ConfigurationMEMAP.chosenOptimizationHierarchy;
import static linprogMPC.ConfigurationMEMAP.chosenOptimizer;
import static linprogMPC.ConfigurationMEMAP.chosenToolUsage;

import com.google.gson.Gson;

import akka.basicMessages.AnswerContent;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;
import linprogMPC.ConfigurationMEMAP.OptHierarchy;
import linprogMPC.ConfigurationMEMAP.Optimizer;
import linprogMPC.ConfigurationMEMAP.ToolUsage;
import linprogMPC.MILPTopology;
import linprogMPC.helper.SolutionHandler;
import linprogMPC.helper.lp.LPSolver;
import linprogMPC.helper.milp.MILPSolverNoConnections;
import linprogMPC.helperOPCua.OpcServerContextGenerator;
import linprogMPC.messages.BuildingMessage;
import linprogMPC.messages.BuildingMessageHandler;
import linprogMPC.messages.OptimizationResultMessage;
import linprogMPC.messages.extension.ChildSpecification;
import lpsolve.LpSolveException;
import opcMEMAP.MemapOpcServerStarter;

public class Building extends BehaviorModel {	
	
	protected Gson gson = new Gson();
	private MemapOpcServerStarter mServer;
	public int port;
	
	private BuildingMessageHandler buildingMessageHandler = new BuildingMessageHandler();
	
	// some long term values
	double[] toralEURVector = new double[MILPTopology.NR_OF_ITERATIONS];
	double[] totalCO2Vector = new double[MILPTopology.NR_OF_ITERATIONS];
	double[][] solutionPerTimeStep = new double[MILPTopology.NR_OF_ITERATIONS][];
	
	public int nStepsMPC = MILPTopology.N_STEPS_MPC;
	
	SolutionHandler lpSolHandler = new SolutionHandler();
	SolutionHandler milpSolHandler = new SolutionHandler();
	
	// ================================
	
	public BuildingMessage buildingMessage = new BuildingMessage();
	public OptimizationResultMessage optResult = new OptimizationResultMessage(); // optResult = selbst berechnet
	public OptimizationResultMessage requestContentToSend = new OptimizationResultMessage();

	public Building(int port) {		
		if (chosenToolUsage == ToolUsage.SERVER) {
			this.port = port;
		} else this.port = 0;
	}
	
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
				
		if (chosenOptimizationHierarchy == OptHierarchy.BUILDING) {
			optimizeBuilding();
		}
		
		buildingMessage = buildingMessageHandler.addMetering(buildingMessage, this.fullActorPath);
	}
	
	private void optimizeBuilding() {
		
		if(chosenOptimizer == Optimizer.LP || chosenOptimizer == Optimizer.LPwithConnections) {			
			LPSolver lpsolver = new LPSolver(
					buildingMessage, nStepsMPC, lpSolHandler, 
					toralEURVector, totalCO2Vector,
					this.actor.getCurrentTimeStep(), solutionPerTimeStep,
					this.actorName, optResult);
			lpsolver.solveLPOptProblem();		
		}			
		
		if(chosenOptimizer == Optimizer.MILP || chosenOptimizer == Optimizer.MILPwithConnections) {
			MILPSolverNoConnections milpSolver = new MILPSolverNoConnections(
					buildingMessage, nStepsMPC, milpSolHandler,
					toralEURVector, totalCO2Vector, 
					this.actor.getCurrentTimeStep(), solutionPerTimeStep, 
					this.actorName, optResult);			
			try {
				milpSolver.createModel();				
				milpSolver.solveMILP(); // and work through results
				
			} catch (LpSolveException e) {			
				e.printStackTrace();
			}
		}
		
		double costTotal = 0;
		double CO2Total = 0;
		for (int i = 0; i < toralEURVector.length; i++) {
			costTotal += toralEURVector[i];
			CO2Total += totalCO2Vector[i];
		}
		System.out.println(chosenOptimizer + ": "+ this.actorName+" cost = " + String.format("%.03f", costTotal) + " € ; CO2: " + String.format("%.03f", CO2Total) + " kg");	

	}

	@Override
	public AnswerContent returnAnswerContentToSend() {		
		if (chosenToolUsage == ToolUsage.SERVER) {			
			if (this.actor.getCurrentTimeStep() == 0) {
				if (port != 0) {
					this.mServer = new MemapOpcServerStarter(false, gson.toJson(buildingMessage), port);
					try {
						this.mServer.start();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}						
				OpcServerContextGenerator.generateJson(this.actorName, buildingMessage);
			}
			
			if(port != 0) {
				try {				
					mServer.update(gson.toJson(buildingMessage));
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return buildingMessage;
	}

	@Override	
	public void handleRequest() {		
		if (chosenOptimizationHierarchy == OptHierarchy.BUILDING) {
			requestContentToSend = optResult;
		}
		
		if (chosenOptimizationHierarchy == OptHierarchy.MEMAP) {
			requestContentToSend = (OptimizationResultMessage) requestContentReceived;
		}
	}


	@Override
	public RequestContent returnRequestContentToSend() {
		return requestContentToSend;
	}
	
	@Override
	public void stop() {		
		if (chosenToolUsage == ToolUsage.SERVER) {
			if(port != 0) {
				mServer.stop();
			}		
			super.stop();
		}
	}

}
