package linprogMPC.components;

import java.util.ArrayList;
import java.util.LinkedList;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.BasicAnswer;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;
import static linprogMPC.ConfigurationMEMAP.*;
import linprogMPC.MILPTopology;
import linprogMPC.helper.SolutionHandler;
import linprogMPC.helper.milp.MILPSolverNoConnections;
import linprogMPC.helper.milp.MILPSolverWithConnections;
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
import lpsolve.LpSolveException;

/**
 * This model optimizes over several buildings for the planning tool.
 * TODO - The request is send to each building. But it is not implemented yet that the buildings react on the requests, 
 * hence, the results are still not as they should be. The effect is that the SOCs are not correctly adapted --> results are not correct yet.
 * 
 * @author bytschkow
 *
 */
public class MEMAPCoordination extends BehaviorModel {
	
	// some long term values
	double[] buildingsTotalCostsMILP = new double[MILPTopology.NR_OF_ITERATIONS];
	double[] buildingsTotalCO2MILP = new double[MILPTopology.NR_OF_ITERATIONS];
	double[][] buildingsSolutionPerTimeStepMILP = new double[MILPTopology.NR_OF_ITERATIONS][];
	
	public int nStepsMPC = MILPTopology.N_STEPS_MPC;
	
	SolutionHandler milpSolHandler = new SolutionHandler();

	public OptimizationResultMessage optResult = new OptimizationResultMessage(); // optResult = selbst berechnet
	
	public SolutionHandler solHandler = new SolutionHandler();
	public BuildingMessage buildingMessage = new BuildingMessage();
	
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
		
		for(BasicAnswer basicAnswer : answerListReceived) {
			AnswerContent answerContent = basicAnswer.answerContent;						
			addToBuildingMessage(answerContent); // makes one large building message (easier to optimize at once)	
		}
		
		refactorDemandList();
		
		if (chosenOptimizationHierarchy == OptHierarchy.MEMAP) {
			if(chosenOptimizer == Optimizer.MILP){	
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
			
			if(chosenOptimizer == Optimizer.MILPwithConnections) {
				
				MILPSolverWithConnections milpWithConnections = new MILPSolverWithConnections(
						answerListReceived, nStepsMPC, milpSolHandler, 
						buildingsTotalCostsMILP, buildingsTotalCO2MILP, 
						getActualTimeStep(), buildingsSolutionPerTimeStepMILP, 
						actorName, optResult);
				
				try {
					milpWithConnections.createModel();
					milpWithConnections.solveMILP();
					
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
		
		
		
	}

	private void addToBuildingMessage(AnswerContent answerContent) {
		
		if(answerContent instanceof BuildingMessage) {
			
			BuildingMessage bm = (BuildingMessage) answerContent;
			
			for (DemandMessage dm : bm.demandList) {
				buildingMessage.demandList.add(dm);
			}

			for (ProducerMessage pm : bm.volatileProducerList) {
				if(pm instanceof VolatileProducerMessage) {
					buildingMessage.volatileProducerList.add((VolatileProducerMessage) pm);
				}
			}
			
			for (ProducerMessage pm : bm.controllableProducerList) {
				if(pm instanceof VolatileProducerMessage) {
					buildingMessage.volatileProducerList.add((VolatileProducerMessage) pm);
				} else {
					buildingMessage.controllableProducerList.add((ProducerMessage) pm);
				}
			}
			
			for (StorageMessage sm : bm.storageList) {
				buildingMessage.storageList.add(sm);
			}
			
			for (CouplerMessage cm : bm.couplerList) {
				buildingMessage.couplerList.add(cm);
			}
			
			for (ConnectionMessage cm : bm.connectionList) {
				buildingMessage.connectionList.add(cm);
			}			
		}
		
		
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

	/** CLONE FROM BUILDING **/
	private void refactorDemandList() {		
		BuildingMessage bm = this.buildingMessage;
		
		ArrayList<DemandMessage> newDemandList = new ArrayList<DemandMessage>(); 
		
		for (DemandMessage demandMessage : bm.demandList) {
			
			if (demandMessage.networkType == NetworkType.DEMANDWITHBOTH) {
				// Make two separate DemandMessages				
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
}

