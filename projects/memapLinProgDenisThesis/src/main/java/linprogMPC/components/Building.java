package linprogMPC.components;

import java.util.Arrays;
import java.util.LinkedList;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.BasicAnswer;
import akka.basicMessages.RequestContent;
import akka.systemActors.GlobalTime;
import behavior.BehaviorModel;
import linprogMPC.ThesisTopologySimple;
import linprogMPC.helper.EnergyPrices;
import linprogMPC.helper.HelperConcat;
import linprogMPC.helper.MatrixBuildup;
import linprogMPC.helper.OptimizationProblem;
import linprogMPC.helper.OptimizationStarter;
import linprogMPC.helper.SolutionHandler;
import linprogMPC.helperOPCua.OpcServerContextGenerator;
import linprogMPC.messages.BuildingMessage;
import linprogMPC.messages.OptimizationResultMessage;
import linprogMPC.messages.ProducerMessage;
import linprogMPC.messages.individualParts.planning.CouplerMessage;
import linprogMPC.messages.individualParts.planning.DemandMessage;
import linprogMPC.messages.individualParts.planning.StorageMessage;

public class Building extends BehaviorModel {
	
	
	
	//protected Gson gson = new Gson();
	public int port;
	
	// some long term values
	double[] buildingsTotalCosts = new double[ThesisTopologySimple.NR_OF_ITERATIONS];
	double[][] buildingsSolutionPerTimeStep = new double[ThesisTopologySimple.NR_OF_ITERATIONS][];
	
	public int nStepsMPC = ThesisTopologySimple.N_STEPS_MPC;
	
	// NEW(7.8.18 by JMr): Long-distance heating supply
	public boolean LDHeating;
	public int heatTransportLength;
	EnergyPrices energyPrices = new EnergyPrices();
	SolutionHandler solHandler = new SolutionHandler();
	
	// ================================
	
	public OptimizationResultMessage optResult = new OptimizationResultMessage();
	
	public BuildingMessage buildingMessage = new BuildingMessage();
	public OptimizationResultMessage requestContentToSend = new OptimizationResultMessage();	

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
			if(answerContent instanceof DemandMessage) {
				DemandMessage cm = (DemandMessage) answerContent;
				buildingMessage.consumption.addConsumption(cm.getDemandVector());
			}
			
			if(answerContent instanceof ProducerMessage) {
				buildingMessage.volatileProducerList.add((ProducerMessage) answerContent);
			}
			
			if(answerContent instanceof StorageMessage) {
				buildingMessage.storageList.add((StorageMessage) answerContent);
			}			
			if(answerContent instanceof CouplerMessage) {
				buildingMessage.couplerList.add((CouplerMessage) answerContent);
			}
		}
		
		OptimizationProblem problem = null;
		if (!ThesisTopologySimple.MEMAP_ON) {
					
		try {
			// ******* Optimierung ********************************
			MatrixBuildup mb = new MatrixBuildup();			
			problem = mb.singleBuilding(buildingMessage);
			OptimizationStarter os = new OptimizationStarter();
			double[] optSolution = os.runLinProg(problem);
			
			// ******** Ermittlung der Kosten *********************
			double[] buildingCostPerTimestep = new double[nStepsMPC];
			buildingCostPerTimestep = solHandler.calculateTimeStepCosts(optSolution, problem.lambda);		
			buildingsTotalCosts[GlobalTime.getCurrentTimeStep()] += buildingCostPerTimestep[0];									
			

			// ******** Erstellung des Ergebnisvektors *********************
			double[] currentStep = {getActualTimeStep()};
			double[] currentOptVector = solHandler.getSolutionForThisTimeStep(optSolution, nStepsMPC);
			double[] currentDemand = solHandler.getDemandForThisTimestep(problem, nStepsMPC);
			double[] currentSOC = solHandler.getCurrentSOC(buildingMessage.storageList);
			double[] currentCost = {buildingCostPerTimestep[0]};
			double[] electricalPrice = {energyPrices.getElectricityPriceInEuro(this.getActualTimeStep())};			
			double[] vectorAll = HelperConcat.concatAlldoubles(currentStep, currentDemand, currentOptVector, currentSOC, currentCost, electricalPrice);
			
			String[] timeStep = {"timeStep"};
			String[] currentNamesPartly = solHandler.getNamesForThisTimeStep(problem, nStepsMPC);
			String[] demandStrings = {"demandHeat", "demandElectricity"};
			String[] storageNames = solHandler.getNamesForSOC(buildingMessage.storageList);
			String[] costName = {"Cost"};
			String[] priceName = {"Price"};
			
			String[] namesAll = HelperConcat.concatAllObjects(timeStep, demandStrings, currentNamesPartly, storageNames, costName, priceName);
						
			//System.out.println(this.actorName + " " + Arrays.toString(namesAll));
			//System.out.println(this.actorName + " " + Arrays.toString(vectorAll));									
			
			//********* Speichern
			
			buildingsSolutionPerTimeStep[this.getActualTimeStep()] = vectorAll;
			
			if (!ThesisTopologySimple.MEMAP_ON) {
				String saveString = ThesisTopologySimple.simulationName + "MPC"+ThesisTopologySimple.N_STEPS_MPC+"/";
				saveString += this.actorName+"MPC"+nStepsMPC+"Solutions.csv";
				if (GlobalTime.getCurrentTimeStep() == (ThesisTopologySimple.NR_OF_ITERATIONS-1)) {
					solHandler.exportMatrixWithHeader(buildingsSolutionPerTimeStep, saveString, namesAll);
				}
			}
			
			
			// ================= RequestContentToSend ==================					
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
			e.printStackTrace();
			System.err.println(this.actorName + " cannot solve the optimization");			
			System.out.println("names: " + Arrays.toString(problem.namesUB));
			System.out.println("b: " + Arrays.toString(problem.b_eq));
			System.out.println("ub: " + Arrays.toString(problem.x_ub));
			System.out.println("h: " + Arrays.toString(problem.h));
			
			
		}
		
		}
		
		if (!ThesisTopologySimple.MEMAP_ON) {
			double costTotal = 0;
			for (int i = 0; i < buildingsTotalCosts.length; i++) {
				costTotal += buildingsTotalCosts[i];
			}
			System.out.println(this.actorName+" cost = " + costTotal);
		}
	}

	
	@Override
	public AnswerContent returnAnswerContentToSend() {
		if (this.getActualTimeStep() == 0) {
			OpcServerContextGenerator.generateJson(this.actorName, buildingMessage);
		}
		return buildingMessage;
	}

	@Override	
	public void handleRequest() {		
		requestContentToSend = optResult;		
		if (ThesisTopologySimple.MEMAP_ON) {
			requestContentToSend = (OptimizationResultMessage) requestContentReceived;
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
