package memap.components;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.LinkedList;

import com.google.gson.Gson;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.BasicAnswer;
import akka.basicMessages.RequestContent;
import akka.systemActors.GlobalTime;
import behavior.BehaviorModel;
import memap.MemapConfig;
import memap.MemapTopology;
import memap.helper.EnergyPrices;
import memap.helper.HelperConcat;
import memap.helper.MatrixBuildup;
import memap.helper.OptimizationProblem;
import memap.helper.OptimizationStarter;
import memap.helper.SolutionHandler;
import memap.helperOPCua.OpcServerContextGenerator;
import memap.messages.BuildingMessage;
import memap.messages.OptimizationResultMessage;
import memap.messages.extension.ChildSpecification;
import memap.messages.extension.NetworkType;
import memap.messages.planning.CouplerMessage;
import memap.messages.planning.DemandMessage;
import memap.messages.planning.ProducerMessage;
import memap.messages.planning.StorageMessage;
import memap.messages.planning.VolatileProducerMessage;
import memap.messages.realTime.CurrentMeterValues;
import opcMEMAP.MemapOpcServerStarter;

public class Building extends BehaviorModel {

	protected Gson gson = new Gson();
	private MemapOpcServerStarter mServer;

	public int port;

	// Long term values
	double[] buildingsTotalCosts = new double[MemapConfig.NR_OF_ITERATIONS];
	double[][] buildingsSolutionPerTimeStep = new double[MemapConfig.NR_OF_ITERATIONS][];

	public int nStepsMPC = MemapConfig.N_STEPS_MPC;

	// >> NEW(7.8.18 by JMr): Long-distance heating supply
	public boolean LDHeating;
	public int heatTransportLength;
	EnergyPrices energyPrices = new EnergyPrices();
	SolutionHandler solHandler = new SolutionHandler();
	// NEW(7.8.18 by JMr): Long-distance heating supply <<

	public BuildingMessage buildingMessage = new BuildingMessage();
	public OptimizationResultMessage optResult = new OptimizationResultMessage(); // optResult = selbst berechnet
	public OptimizationResultMessage requestContentToSend = new OptimizationResultMessage();

	public Building(int port, boolean LDHeating, int heatTransportLength) {
		this.port = port;
		this.LDHeating = LDHeating;
		this.heatTransportLength = heatTransportLength;
	}

	@Override
	public void makeDecision() {

		System.out.println(this.actorName + " " + MemapConfig.MEMAP_ON);

		// Receive data
		buildingMessage = new BuildingMessage();
		buildingMessage.id = this.fullActorPath;
		buildingMessage.name = this.actorName;
		buildingMessage.LDHeating = LDHeating;
		buildingMessage.heatTransportLength = heatTransportLength;

		this.actor.getContext().getChildren().forEach(child -> buildingMessage.childrenList
				.add(new ChildSpecification(this.fullActorPath + "/" + child.path().name())));

		for (BasicAnswer basicAnswer : answerListReceived) {
			AnswerContent answerContent = basicAnswer.answerContent;
			if (answerContent instanceof DemandMessage) {
				DemandMessage dm = (DemandMessage) answerContent;
				buildingMessage.demandList.add((DemandMessage) dm);
			}

			if (answerContent instanceof ProducerMessage) {
				if (answerContent instanceof VolatileProducerMessage) {
					buildingMessage.volatileProducerList.add((VolatileProducerMessage) answerContent);
				} else {
					buildingMessage.controllableProducerList.add((ProducerMessage) answerContent);
				}
			}

			if (answerContent instanceof StorageMessage) {
				buildingMessage.storageList.add((StorageMessage) answerContent);
			}
			if (answerContent instanceof CouplerMessage) {
				buildingMessage.couplerList.add((CouplerMessage) answerContent);
			}
		}
		refactorDemandList();

		if (!MemapConfig.MEMAP_ON) {
			solveOptProblem();

			double costTotal = 0;
			for (int i = 0; i < buildingsTotalCosts.length; i++) {
				costTotal += buildingsTotalCosts[i];
			}
			System.out.println(this.actorName + " cost = " + costTotal);
		}

		buildingMessage = addMetering(buildingMessage);
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

	private void solveOptProblem() {
		OptimizationProblem problem = null;
		try {

			// Optimize
			MatrixBuildup mb = new MatrixBuildup();
			problem = mb.singleBuilding(buildingMessage);
			OptimizationStarter os = new OptimizationStarter();
			double[] optSolution = os.runLinProg(problem);

			// Determine costs
			double[] buildingCostPerTimestep = new double[nStepsMPC];
			buildingCostPerTimestep = solHandler.calculateTimeStepCosts(optSolution, problem.lambda);
			buildingsTotalCosts[GlobalTime.getCurrentTimeStep()] += buildingCostPerTimestep[0];

			// Create of the result vector
			double[] currentStep = { getActualTimeStep() };
			double[] currentOptVector = solHandler.getSolutionForThisTimeStep(optSolution, nStepsMPC);
			double[] currentDemand = solHandler.getDemandForThisTimestep(problem, nStepsMPC, buildingMessage);
			double[] currentSOC = solHandler.getCurrentSOC(buildingMessage.storageList);
			double[] currentCost = { buildingCostPerTimestep[0] };
			double[] electricalPrice = { energyPrices.getElectricityPriceInEuro(this.getActualTimeStep()) };
			double[] vectorAll = HelperConcat.concatAlldoubles(currentStep, currentDemand, currentOptVector, currentSOC,
					currentCost, electricalPrice);

			String[] timeStep = { "Time step" };
			String[] currentNamesPartly = solHandler.getNamesForThisTimeStep(problem, nStepsMPC);
			 String[] demandStrings = solHandler.getNamesForDemand(buildingMessage);
			//String[] demandStrings = { buildingMessage.name + " (Heat demand)",
				//	buildingMessage.name + " (Electricity demand)" };
			String[] storageNames = solHandler.getNamesForSOC(buildingMessage.storageList);
			String[] costName = { "Cost" };
			String[] priceName = { "Price" };
			String[] namesAll = HelperConcat.concatAllObjects(timeStep, demandStrings, currentNamesPartly, storageNames,
					costName, priceName);

			// Verify number of members
//			System.out.println("currentStep " + currentStep.length);
//			System.out.println("timeStep " + timeStep.length);
//			System.out.println("currentOptVector " + currentOptVector.length);
//			System.out.println("currentNamesPartly " + currentNamesPartly.length);
			System.out.println("currentDemand " + currentDemand.length);
			System.out.println("demandStrings " + demandStrings.length);
//			System.out.println("currentSOC " + currentSOC.length);
//			System.out.println("storageNames " + storageNames.length);
//			System.out.println("currentCost " + currentCost.length);
//			System.out.println("costName " + costName.length);
//			System.out.println("electricalPrice " + electricalPrice.length);
//			System.out.println("priceName " + priceName.length);
//			System.out.println("vectorAll " + vectorAll.length);
//			System.out.println("namesAll " + namesAll.length);

			// Save data
			buildingsSolutionPerTimeStep[this.getActualTimeStep()] = vectorAll;

			if (!MemapConfig.MEMAP_ON) {
				String saveString = MemapTopology.simulationName + "MPC" + MemapConfig.N_STEPS_MPC + "/";
				saveString += this.actorName + "MPC" + nStepsMPC + "Solutions.csv";

				System.out.println(GlobalTime.getCurrentTimeStep() + "  " + (MemapConfig.NR_OF_ITERATIONS - 1));

				if (GlobalTime.getCurrentTimeStep() == (MemapConfig.NR_OF_ITERATIONS - 1)) {
					solHandler.exportMatrixWithHeader(buildingsSolutionPerTimeStep, saveString, namesAll);
				}
			}

			// Request content to send
			for (int i = 0; i < optSolution.length / nStepsMPC; i++) {
				double[] result = new double[nStepsMPC];

				for (int j = 0; j < result.length; j++) {
					result[j] = optSolution[i * nStepsMPC + j];
				}

				String str = problem.namesUB[i * nStepsMPC];
				optResult.resultMap.put(str, result);
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

	private void refactorDemandList() {
		BuildingMessage bm = this.buildingMessage;

		ArrayList<DemandMessage> newDemandList = new ArrayList<DemandMessage>();

		for (DemandMessage demandMessage : bm.demandList) {

			/*
			 * if (demandMessage.networkType == NetworkType.DEMANDWITHBOTH) { // Make two
			 * out of it
			 * 
			 * DemandMessage a = new DemandMessage(); DemandMessage b = new DemandMessage();
			 * 
			 * a.forecastType = demandMessage.forecastType; b.forecastType =
			 * demandMessage.forecastType;
			 * 
			 * a.id = demandMessage.id + "HEAT"; b.id = demandMessage.id + "ELECTRICITY";
			 * 
			 * a.name = "HEAT_" + demandMessage.name; b.name = "ELECTRICITY_" +
			 * demandMessage.name;
			 * 
			 * a.networkType = NetworkType.HEAT; b.networkType = NetworkType.ELECTRICITY;
			 * 
			 * a.optimizationCriteria = demandMessage.optimizationCriteria;
			 * b.optimizationCriteria = demandMessage.optimizationCriteria;
			 * 
			 * int length = demandMessage.getDemandVector().length / 2; double[] aInput =
			 * new double[length]; double[] bInput = new double[length];
			 * 
			 * for (int i = 0; i < length; i++) { aInput[i] =
			 * demandMessage.getDemandVector()[i]; bInput[i] =
			 * demandMessage.getDemandVector()[length + i]; }
			 * 
			 * a.setDemandVector(aInput); b.setDemandVector(bInput);
			 * 
			 * newDemandList.add(a); newDemandList.add(b); }
			 */

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

		if (port != 0) {
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
		if (MemapConfig.MEMAP_ON) {
			requestContentToSend = (OptimizationResultMessage) requestContentReceived;
		}
	}

	@Override
	public RequestContent returnRequestContentToSend() {
		return requestContentToSend;
	}

	@Override
	public void stop() {
		if (port != 0) {
			mServer.stop();
		}
		super.stop();
	}

	@Override
	public void handleError(LinkedList<ErrorAnswerContent> errors) {
	}
}
