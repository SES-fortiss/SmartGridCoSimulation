package memap.components.prototypes;

import com.google.gson.Gson;

import akka.basicMessages.AnswerContent;
import akka.basicMessages.RequestContent;
import akka.timeManagement.CurrentTimeStepSubscriber;
import behavior.BehaviorModel;
import lpsolve.LpSolveException;
import memap.controller.TopologyController;
import memap.helper.MEMAPLogging;
import memap.helper.SolutionHandler;
import memap.helper.configurationOptions.OptHierarchy;
import memap.helper.configurationOptions.Optimizer;
import memap.helper.configurationOptions.ToolUsage;
import memap.helper.lp.LPSolver;
import memap.helper.milp.MILPSolverNoConnections;
import memap.helperOPCua.OpcServerContextGenerator;
import memap.main.TopologyConfig;
import memap.messages.BuildingMessage;
import memap.messages.BuildingMessageHandler;
import memap.messages.OptimizationResultMessage;
import memap.messages.extension.ChildSpecification;
import opcMEMAP.MemapOpcServerStarter;

public class Building extends BehaviorModel implements CurrentTimeStepSubscriber {

	/** Reference to the topology */
	private TopologyController topologyController;
	/** Reference to topology configuration */
	TopologyConfig topologyConfig = TopologyConfig.getInstance();
	protected Gson gson = new Gson();
	private MemapOpcServerStarter mServer;
	public int port;
	int currentTimeStep;

	private BuildingMessageHandler buildingMessageHandler = new BuildingMessageHandler();

	// some long term values
	double[] totalEURVector;
	double[] totalCO2Vector;
	double[][] solutionPerTimeStep;

	public int nStepsMPC;

	SolutionHandler lpSolHandler;
	SolutionHandler milpSolHandler;

	public BuildingMessage buildingMessage = new BuildingMessage();
	public OptimizationResultMessage optResult = new OptimizationResultMessage(); // optResult = selbst berechnet
	public OptimizationResultMessage requestContentToSend = new OptimizationResultMessage();

	public Building(TopologyController topologyController, int port) {
		this.topologyController = topologyController;
		topologyController.subscribeToCurrentTimeStep(this);
		this.port = port;
		// Initialization delayed until after topologyConfig initialization
		totalEURVector = new double[topologyConfig.getNrOfIterations()];
		totalCO2Vector = new double[topologyConfig.getNrOfIterations()];
		solutionPerTimeStep = new double[topologyConfig.getNrOfIterations()][];
		nStepsMPC = topologyConfig.getNrStepsMPC();
		lpSolHandler = new SolutionHandler(nStepsMPC, topologyConfig);
		milpSolHandler = new SolutionHandler(nStepsMPC, topologyConfig);
	}

	@Override
	public void makeDecision() {
		// Receiving
		buildingMessage = new BuildingMessage();
		buildingMessage.id = this.fullActorPath;
		buildingMessage.name = this.actorName;

		this.actor.getContext().getChildren().forEach(child -> buildingMessage.childrenList
				.add(new ChildSpecification(this.fullActorPath + "/" + child.path().name())));

		buildingMessage = buildingMessageHandler.aggregateBuildingMessages(buildingMessage, answerListReceived);
		buildingMessage = buildingMessageHandler.refactorDemandList(buildingMessage);

		if (topologyController.getOptimizationHierarchy() == OptHierarchy.BUILDING) {
			optimizeBuilding();
		}

		buildingMessage = buildingMessageHandler.addMetering(buildingMessage, this.fullActorPath);
	}

	private void optimizeBuilding() {

		if (topologyController.getOptimizer() == Optimizer.LP
				|| topologyController.getOptimizer() == Optimizer.LPwithConnections) {
			LPSolver lpsolver = new LPSolver(topologyController, buildingMessage, lpSolHandler,
					totalEURVector, totalCO2Vector, currentTimeStep, solutionPerTimeStep, this.actorName, optResult);
			lpsolver.solveLPOptProblem();
		}

		if (topologyController.getOptimizer() == Optimizer.MILP
				|| topologyController.getOptimizer() == Optimizer.MILPwithConnections) {
			MILPSolverNoConnections milpSolver = new MILPSolverNoConnections(topologyController, currentTimeStep,
					buildingMessage, milpSolHandler, totalEURVector, totalCO2Vector, solutionPerTimeStep,
					this.actorName, optResult);
			try {
				milpSolver.createModel();
				milpSolver.solveMILP(); // and work through results
			} catch (LpSolveException e) {
				e.printStackTrace();
			}
		}

		if (topologyController.getLogging() == MEMAPLogging.ALL || topologyController.getLogging() == MEMAPLogging.RESULTS_ONLY) {
			double costTotal = 0;
			double CO2Total = 0;
			for (int i = 0; i < totalEURVector.length; i++) {
				costTotal += totalEURVector[i];
				CO2Total += totalCO2Vector[i];
			}
			
			System.out.println(topologyController.getOptimizer() + ": " + this.actorName + " cost = "
					+ String.format("%.03f", costTotal) + " EUR ; CO2: " + String.format("%.03f", CO2Total) + " kg");			
		}		
	}

	@Override
	public AnswerContent returnAnswerContentToSend() {
		if (topologyController.getToolUsage() == ToolUsage.SERVER) {
			if (this.currentTimeStep == 0) {
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
//					mServer.update(gson.toJson(buildingMessage));
					mServer.update(gson.toJson(optResult));
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
		if (topologyController.getOptimizationHierarchy() == OptHierarchy.BUILDING) {
			requestContentToSend = optResult;
		}

		if (topologyController.getOptimizationHierarchy() == OptHierarchy.MEMAP) {
			requestContentToSend = (OptimizationResultMessage) requestContentReceived;
		}
	}

	@Override
	public RequestContent returnRequestContentToSend() {
		return requestContentToSend;
	}

	@Override
	public void stop() {
		if (topologyController.getToolUsage() == ToolUsage.SERVER) {
			if (port != 0) {
				mServer.stop();
			}
			super.stop();
		}
	}

	@Override
	public void update(int currentTimeStep) {
		this.currentTimeStep = currentTimeStep;
	}

}
