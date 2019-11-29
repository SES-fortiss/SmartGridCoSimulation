package linprogMPC.components;

import java.util.ArrayList;
import java.util.LinkedList;

import com.google.gson.Gson;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.BasicAnswer;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;
import linprogMPC.ConfigurationMEMAP;
import linprogMPC.MILPTopology;
import linprogMPC.helper.SolutionHandler;
import linprogMPC.helper.lp.LPSolver;
import linprogMPC.helper.milp.MILPSolverNoConnections;
import linprogMPC.helperOPCua.OpcServerContextGenerator;
import linprogMPC.messages.BuildingMessage;
import linprogMPC.messages.OptimizationResultMessage;
import linprogMPC.messages.extension.ChildSpecification;
import linprogMPC.messages.extension.NetworkType;
import linprogMPC.messages.planning.ConnectionMessage;
import linprogMPC.messages.planning.CouplerMessage;
import linprogMPC.messages.planning.DemandMessage;
import linprogMPC.messages.planning.ProducerMessage;
import linprogMPC.messages.planning.StorageMessage;
import linprogMPC.messages.planning.VolatileProducerMessage;
import linprogMPC.messages.realTime.CurrentMeterValues;
import lpsolve.LpSolveException;
import opcMEMAP.MemapOpcServerStarter;

public class Building extends BehaviorModel {	
	
	protected Gson gson = new Gson();
	private MemapOpcServerStarter mServer;
	public int port;
	
	// some long term values
	double[] buildingsTotalCosts = new double[MILPTopology.NR_OF_ITERATIONS];
	double[] buildingsTotalCO2 = new double[MILPTopology.NR_OF_ITERATIONS];
	double[][] buildingsSolutionPerTimeStep = new double[MILPTopology.NR_OF_ITERATIONS][];

	// some long term values2
	double[] buildingsTotalCostsMILP = new double[MILPTopology.NR_OF_ITERATIONS];
	double[] buildingsTotalCO2MILP = new double[MILPTopology.NR_OF_ITERATIONS];
	double[][] buildingsSolutionPerTimeStepMILP = new double[MILPTopology.NR_OF_ITERATIONS][];
	
	public int nStepsMPC = MILPTopology.N_STEPS_MPC;
	
	SolutionHandler lpSolHandler = new SolutionHandler();
	SolutionHandler milpSolHandler = new SolutionHandler();
	
	// ================================
	
	public BuildingMessage buildingMessage = new BuildingMessage();
	public OptimizationResultMessage optResult = new OptimizationResultMessage(); // optResult = selbst berechnet
	public OptimizationResultMessage requestContentToSend = new OptimizationResultMessage();

	public Building(int port) {
		this.port = port;
	}
	
	@Override
	public void makeDecision() {	
		
		//	=======================  RECEIVING =======================				
		buildingMessage = new BuildingMessage();
		buildingMessage.id = this.fullActorPath;
		buildingMessage.name = this.actorName;
		
		this.actor.getContext().getChildren().forEach(child ->
			buildingMessage.childrenList.add(new ChildSpecification(this.fullActorPath + "/" + child.path().name())));		
		
		for(BasicAnswer basicAnswer : answerListReceived) {
			AnswerContent answerContent = basicAnswer.answerContent;
			if(answerContent instanceof DemandMessage) {
				DemandMessage dm = (DemandMessage) answerContent;
				buildingMessage.demandList.add( (DemandMessage) dm);
			}
			
			if(answerContent instanceof ProducerMessage) {				
				if(answerContent instanceof VolatileProducerMessage) {
					buildingMessage.volatileProducerList.add((VolatileProducerMessage) answerContent);
				} else {
					buildingMessage.controllableProducerList.add((ProducerMessage) answerContent);
				}				
			}
			
			if(answerContent instanceof StorageMessage) {
				buildingMessage.storageList.add((StorageMessage) answerContent);
			}		
			
			if(answerContent instanceof CouplerMessage) {
				buildingMessage.couplerList.add((CouplerMessage) answerContent);
			}
			
			if(answerContent instanceof ConnectionMessage) {
				buildingMessage.connectionList.add((ConnectionMessage) answerContent);
			}
		}
		
		harmonizeDemandList();		
				
		if (ConfigurationMEMAP.chosenOptimizationHierarchy == ConfigurationMEMAP.OptHierarchy.BUILDING) {
			optimizeBuilding();
		}		
		
		buildingMessage = addMetering(buildingMessage);
	}
	
	private void optimizeBuilding() {
		
		if(ConfigurationMEMAP.chosenOptimizer == ConfigurationMEMAP.Optimizer.LP) {
			LPSolver lpsolver = new LPSolver(
					buildingMessage, nStepsMPC, lpSolHandler, 
					buildingsTotalCosts, buildingsTotalCO2, 
					getActualTimeStep(), buildingsSolutionPerTimeStep,
					this.actorName, optResult);
			lpsolver.solveLPOptProblem();
			double costTotal = 0;
			double CO2Total = 0;
			for (int i = 0; i < buildingsTotalCosts.length; i++) {
				costTotal += buildingsTotalCosts[i];
				CO2Total += buildingsTotalCO2[i];
			}
			System.out.println("LP: " + this.actorName+" cost = " + String.format("%.03f", costTotal) + " € ; CO2: " + String.format("%.03f", CO2Total) + " kg");			
		}
				
		
		if(ConfigurationMEMAP.chosenOptimizer == ConfigurationMEMAP.Optimizer.MILP) {
			MILPSolverNoConnections milpSolver = new MILPSolverNoConnections(
					buildingMessage, nStepsMPC, milpSolHandler,
					buildingsTotalCostsMILP, buildingsTotalCO2MILP, 
					getActualTimeStep(), buildingsSolutionPerTimeStepMILP, 
					this.actorName, optResult);			
			
			try {
				milpSolver.createModel();				
				milpSolver.solveMILP(); // and work through results
				
				double costTotal = 0;
				double CO2Total = 0;
				
				for (int i = 0; i < buildingsTotalCostsMILP.length; i++) {
					costTotal += buildingsTotalCostsMILP[i];
					CO2Total += buildingsTotalCO2MILP[i];
				}
				
				System.out.println("MILP: " + this.actorName+" cost = " + String.format("%.03f", costTotal) + " € ; CO2: " + String.format("%.03f", CO2Total) + " kg");
				
			} catch (LpSolveException e) {			
				e.printStackTrace();
			}
		}

	}

	private BuildingMessage addMetering(BuildingMessage bmIn) {
		
		BuildingMessage result = bmIn;
		
		for (DemandMessage demand : bmIn.demandList) {
			CurrentMeterValues cm = new CurrentMeterValues();			
			if (demand.networkType == NetworkType.HEAT) {
				cm.name = "HEATDemand";
				cm.id = this.fullActorPath + "/HEATDemand";
			}			
			if (demand.networkType == NetworkType.ELECTRICITY) {
				cm.name = "ELECTRICITYDemand";
				cm.id = this.fullActorPath + "/ELECTRICITYDemand";
			}									
			cm.networkType = demand.networkType;
			cm.powerInjection = demand.getDemandVector()[0];						
			result.currentMeterValueList.add(cm);
		}		
		return result;
	}

	private void harmonizeDemandList() {		
		BuildingMessage bm = this.buildingMessage;
		
		ArrayList<DemandMessage> newDemandList = new ArrayList<DemandMessage>(); 
		
		for (DemandMessage demandMessage : bm.demandList) {
			
			if (demandMessage.networkType == NetworkType.DEMANDWITHBOTH) {
				// Zwei draus machen
				
				DemandMessage heatDemand = new DemandMessage();
				DemandMessage elecDemand = new DemandMessage();
				
				heatDemand.forecastType = demandMessage.forecastType;
				elecDemand.forecastType = demandMessage.forecastType;
				
				heatDemand.id = demandMessage.id + "HEAT";
				elecDemand.id = demandMessage.id + "ELECTRICITY";
				
				heatDemand.name = "HEAT_" + demandMessage.name;
				elecDemand.name = "ELECTRICITY_" + demandMessage.name;
				
				heatDemand.networkType = NetworkType.HEAT;
				elecDemand.networkType = NetworkType.ELECTRICITY;
				
				heatDemand.optimizationCriteria = demandMessage.optimizationCriteria;
				elecDemand.optimizationCriteria = demandMessage.optimizationCriteria;
				
				int length = demandMessage.getDemandVector().length / 2;
				double[] aInput =  new double[length];
				double[] bInput =  new double[length];
				
				for (int i = 0; i < length; i++) {
					aInput[i] = demandMessage.getDemandVector()[i];
					bInput[i] = demandMessage.getDemandVector()[length+i];
				}
				
				heatDemand.setDemandVector(aInput);
				elecDemand.setDemandVector(bInput);
				
				newDemandList.add(heatDemand);
				newDemandList.add(elecDemand);
			}
			
			if (demandMessage.networkType == NetworkType.ELECTRICITY) {
				newDemandList.add(demandMessage);
			}
			
			if (demandMessage.networkType == NetworkType.HEAT) {
				newDemandList.add(demandMessage);
			}
		}
		
		buildingMessage.demandList = newDemandList;		
	}

	@Override
	public AnswerContent returnAnswerContentToSend() {		
		
		if (this.getActualTimeStep() == 0) {
			//String filePath = "src/main/java/Building1.json";
			
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
		
		return buildingMessage;
	}

	@Override	
	public void handleRequest() {		
		requestContentToSend = optResult;		
		if (MILPTopology.MEMAP_ON) {
			requestContentToSend = (OptimizationResultMessage) requestContentReceived;
		}		
	}


	@Override
	public RequestContent returnRequestContentToSend() {
		return requestContentToSend;
	}
	
	@Override
	public void stop() {
		if(port != 0) {
			mServer.stop();
		}		
		super.stop();
	}

	@Override
	public void handleError(LinkedList<ErrorAnswerContent> errors) {}

}
