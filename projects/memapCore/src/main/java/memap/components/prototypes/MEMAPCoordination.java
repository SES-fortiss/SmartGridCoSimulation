package memap.components.prototypes;

import java.util.ArrayList;
import com.google.gson.Gson;

import akka.basicMessages.AnswerContent;
import akka.basicMessages.BasicAnswer;
import akka.basicMessages.RequestContent;
import akka.timeManagement.CurrentTimeStepSubscriber;
import behavior.BehaviorModel;
import lpsolve.LpSolveException;
import memap.controller.TopologyController;
import memap.helper.SolutionHandler;
import memap.helper.JsonExportHelper.JsonExportHelper;
import memap.helper.configurationOptions.OptHierarchy;
import memap.helper.configurationOptions.Optimizer;
import memap.helper.configurationOptions.ToolUsage;
import memap.helper.lp.LPSolver;
import memap.helper.milp.MILPSolverNoConnections;
import memap.helper.milp.MILPSolverWithConnections;
import memap.main.TopologyConfig;
import memap.messages.BuildingMessage;
import memap.messages.BuildingMessageHandler;
import memap.messages.OptimizationResultMessage;
import memap.messages.extension.ChildSpecification;
import opcMEMAP.MemapOpcServerStarter;
/**
 * This model optimizes over several buildings for the planning tool.
 * 
 * @author bytschkow
 */
public class MEMAPCoordination extends BehaviorModel implements CurrentTimeStepSubscriber {

	// Reference to topologyController ancestor
	private TopologyController topologyController;
	/** Reference to topology configuration */
	TopologyConfig topologyConfig = TopologyConfig.getInstance();
	private int currentTimeStep;
	protected Gson gson = new Gson();
	private MemapOpcServerStarter mServer;
	public int port = 7013;
	
	// some long term values
	double[] totalEURVector;
	double[] totalCO2Vector;
	double[][] solutionPerTimeStep;
	public int nStepsMPC;

	SolutionHandler lpSolHandler;
	SolutionHandler milpSolHandler;

	public OptimizationResultMessage optResult = new OptimizationResultMessage(); // optResult = selbst berechnet

	public BuildingMessage buildingMessage = new BuildingMessage();
	private BuildingMessageHandler buildingMessageHandler = new BuildingMessageHandler();

	public MEMAPCoordination(TopologyController topologyController) {
		this.topologyController = topologyController;
		topologyController.subscribeToCurrentTimeStep(this);
		// Initialization delayed until after topologyConfig initialization
		totalEURVector = new double[topologyConfig.getNrOfIterations()];
		totalCO2Vector = new double[topologyConfig.getNrOfIterations()];
		solutionPerTimeStep = new double[topologyConfig.getNrOfIterations()][];
		nStepsMPC = topologyConfig.getNrStepsMPC();
		lpSolHandler = new SolutionHandler(nStepsMPC, topologyConfig);
		milpSolHandler = new SolutionHandler(nStepsMPC, topologyConfig);
	}

	@Override
	public void handleRequest() {
	}
	
	@Override
	public void makeDecision() {

		// ======================= RECEIVING =======================
		buildingMessage = new BuildingMessage();
		buildingMessage.id = this.fullActorPath;
		buildingMessage.name = this.actorName;

		this.actor.getContext().getChildren().forEach(child -> buildingMessage.childrenList
				.add(new ChildSpecification(this.fullActorPath + "/" + child.path().name())));

		buildingMessage = buildingMessageHandler.aggregateBuildingMessages(buildingMessage, answerListReceived);
		buildingMessage = buildingMessageHandler.refactorDemandList(buildingMessage);

		if (topologyController.getOptimizationHierarchy() == OptHierarchy.MEMAP) {
			if (topologyController.getOptimizer() == Optimizer.MILP) {
				useMilpNoConnections();
			}

			if (topologyController.getOptimizer() == Optimizer.MILPwithConnections) {
				useMilpWithConnections();
			}

			if (topologyController.getOptimizer() == Optimizer.LP) {
				buildingMessage.connectionList.clear();
				useLP();
			}

			if (topologyController.getOptimizer() == Optimizer.LPwithConnections) {
				ArrayList<BuildingMessage> buildingMessageList = new ArrayList<BuildingMessage>();
				for (BasicAnswer basicAnswer : answerListReceived) {
					AnswerContent answerContent = basicAnswer.answerContent;
					if (answerContent instanceof BuildingMessage) {
						BuildingMessage bm = (BuildingMessage) answerContent;
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

			System.out.println(topologyController.getOptimizer() + ": " + this.actorName + " cost = "
					+ String.format("%.03f", costTotal) + " EUR ; CO2: " + String.format("%.03f", CO2Total) + " kg");
		}
	}

	private void useLP(ArrayList<BuildingMessage> buildingMessageList) {
		LPSolver lpsolver = new LPSolver(topologyController, buildingMessage, lpSolHandler, totalEURVector,
				totalCO2Vector, currentTimeStep, solutionPerTimeStep, this.actorName, optResult);
		lpsolver.setBuildingMessageList(buildingMessageList);
		lpsolver.solveLPOptProblem();
	}

	private void useLP() {
		LPSolver lpsolver = new LPSolver(topologyController, buildingMessage, lpSolHandler, totalEURVector,
				totalCO2Vector, currentTimeStep, solutionPerTimeStep, this.actorName, optResult);
		lpsolver.solveLPOptProblem();
	}

	private void useMilpNoConnections() {
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

	private void useMilpWithConnections() {
		MILPSolverWithConnections milpWithConnections = new MILPSolverWithConnections(topologyController,
				currentTimeStep, answerListReceived, milpSolHandler, totalEURVector, totalCO2Vector,
				solutionPerTimeStep, actorName, optResult);
		try {
			milpWithConnections.createModelWithConnections();
			milpWithConnections.solveMILP();
		} catch (LpSolveException e) {
			e.printStackTrace();
		}
	}

	@Override
	public AnswerContent returnAnswerContentToSend() {
		if (topologyController.getToolUsage() == ToolUsage.SERVER) {			
			if(port != 0 && optResult != null) {
				try {
//					this.mServer.update(gson.toJson(optResult));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
					
			if (currentTimeStep == 0) { 
				// Save topology as json for usage in planning tool:
				JsonExportHelper.exportMemapTopology(topologyController, answerListReceived);
			}	
		}	
		return buildingMessage;
	}

	@Override
	public RequestContent returnRequestContentToSend() {
		
		if (topologyController.getToolUsage() == ToolUsage.SERVER) {
			if (currentTimeStep == 0) {
				if (port != 0) {
					this.mServer = new MemapOpcServerStarter(false, gson.toJson(optResult), port);
					try {
						this.mServer.start();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}						
//				OpcServerContextGenerator.generateJson(this.actorName, buildingMessage);
			}
		}
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

	@Override
	public void update(int currentTimeStep) {
		this.currentTimeStep = currentTimeStep;
	}

}
