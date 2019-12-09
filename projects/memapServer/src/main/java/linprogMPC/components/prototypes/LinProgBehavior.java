package linprogMPC.components.prototypes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

import com.google.gson.Gson;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.BasicAnswer;
import akka.basicMessages.RequestContent;
import akka.systemActors.GlobalTime;
import behavior.BehaviorModel;
import linprogMPC.TopologyConfig;
import linprogMPC.helper.HelperConcat;
import linprogMPC.helper.MatrixBuildup;
import linprogMPC.helper.MyTimeUnit;
import linprogMPC.helper.OptimizationProblem;
import linprogMPC.helper.OptimizationStarter;
import linprogMPC.helper.SolutionHandler;
import linprogMPC.helperOPCua.OpcServerContextGenerator;
import linprogMPC.messages.BuildingMessage;
import linprogMPC.messages.OptimizationResultMessage;
import opcMEMAP.MemapOpcServerStarter;

public class LinProgBehavior extends BehaviorModel {

	private long sleepTime = 0L;

	double[][] fullXVector = new double[TopologyConfig.NR_OF_ITERATIONS][TopologyConfig.N_STEPS];

	double[] costForTimestepAllBuildings = new double[TopologyConfig.NR_OF_ITERATIONS];
	double[] costForTimestepMEMAP = new double[TopologyConfig.NR_OF_ITERATIONS];
	double[] CO2ForTimestepMEMAP = new double[TopologyConfig.NR_OF_ITERATIONS];
	double[][] memapSolutionPerTimeStep = new double[TopologyConfig.NR_OF_ITERATIONS][];

	public OptimizationResultMessage optResult = new OptimizationResultMessage();
	//public MemapOpcServerStarter mServer;
	protected Gson gson = new Gson();
	public int port;
	public BuildingMessage buildingMessage = new BuildingMessage();

	public Calendar startTime;
	public int nStepsMPC = TopologyConfig.N_STEPS_MPC;

	public SolutionHandler solHandler = new SolutionHandler();

	public LinProgBehavior(int thePort) {
		this.port = thePort;
	}

	@Override
	public void handleError(LinkedList<ErrorAnswerContent> errors) {
	}

	@Override
	public void handleRequest() {
	}

	@Override
	public void makeDecision() {
		/*
		 * Sort the received answers in 'Buildings' and/or 'free
		 * consumer/Storage/Producers'
		 */
		ArrayList<BuildingMessage> buildingMessageList = new ArrayList<BuildingMessage>();

		for (BasicAnswer basicAnswer : answerListReceived) {

			AnswerContent answerContent = basicAnswer.answerContent;
			if (answerContent instanceof BuildingMessage) {
				BuildingMessage bm = (BuildingMessage) answerContent;
				buildingMessageList.add(bm);
			}
		}

		if (TopologyConfig.MEMAP_ON) {
			int nrOfConsumers = 0;
			int nrOfStorages = 0;
			int nrOfProducers = 0;
			int nrOfCouplers = 0;

			if (GlobalTime.getCurrentTimeStep() == 0) {
				for (BuildingMessage buildingMessage : buildingMessageList) {
					nrOfConsumers += buildingMessage.getNrOfConsumers() / 2; // Because there is one demand message for
																				// heat and one for electricity
					nrOfStorages += buildingMessage.getNrOfStorages();
					nrOfProducers += buildingMessage.getNrOfProducers();
					nrOfCouplers += buildingMessage.getNrOfCouplers();
				}

				// Output simulation details
				System.out.println(" << makeDecision LinProg --- Optimization >> ");
				System.out.println("Simulation time: "
						+ MyTimeUnit.stepLength(TimeUnit.HOURS) * TopologyConfig.NR_OF_ITERATIONS + " hours ("
						+ TopologyConfig.NR_OF_ITERATIONS / TopologyConfig.TIMESTEPS_PER_DAY + " days)");
				System.out.println("Timestep: " + MyTimeUnit.stepLength(TimeUnit.MINUTES) + " minutes ("
						+ TopologyConfig.NR_OF_ITERATIONS + " Steps)");
				System.out.println("MPC Horizon: " + TopologyConfig.N_STEPS_MPC * MyTimeUnit.stepLength(TimeUnit.HOURS)
						+ " hours (" + TopologyConfig.N_STEPS_MPC + " Steps)");

				System.out.println(" ");
				System.out.println("Total Number of Consumers: " + nrOfConsumers);
				System.out.println("Total Number of Storages: " + nrOfStorages);
				System.out.println("Total Number of Producers: " + nrOfProducers);
				System.out.println("Total Number of Couplers: " + nrOfCouplers);
				System.out.println("----------------------------------------------------------------");
			}

			// ------------ MEMAP - OPTIMIZATION ------------

			MatrixBuildup mb = new MatrixBuildup();
			OptimizationProblem problem = mb.multipleBuildings(buildingMessageList, TopologyConfig.MEMAP_LDHeating);

			OptimizationStarter os = new OptimizationStarter();
			double[] sol = os.runLinProg(problem);

			// Handling the result
			double[] memapCostPerTimestep = solHandler.calculateTimeStepCosts(sol, problem.lambda);
			double[] memapCO2PerTimestep = solHandler.calculateTimeStepCosts(sol, problem.lambdaCO2);
			System.out.println();

			costForTimestepMEMAP[GlobalTime.getCurrentTimeStep()] = memapCostPerTimestep[0];
			CO2ForTimestepMEMAP[GlobalTime.getCurrentTimeStep()] = memapCO2PerTimestep[0];

			// Creation of the result vector
			double[] currentStep = { getActualTimeStep() };
			double[] currentOptVector = solHandler.getSolutionForThisTimeStep(sol, nStepsMPC);
			double[] currentDemand = solHandler.getDemandForThisTimestep(problem, nStepsMPC);
			double[] currentSOC = solHandler.getCurrentSOCs(buildingMessageList);
			double[] currentCost = { memapCostPerTimestep[0] };
			double[] currentCO2 = { memapCO2PerTimestep[0] };

			double[] currentPosDemand = solHandler.getPositiveDemandForThisTimestep(problem, nStepsMPC);
			double[] currentEffOptVector = solHandler.getEffSolutionForThisTimeStep(sol, problem, nStepsMPC);

			double[] vectorAll = HelperConcat.concatAlldoubles(currentStep, currentDemand, currentOptVector, currentSOC,
					currentCost, currentCO2, currentPosDemand, currentEffOptVector);

			String[] timeStep = { "Time step" };
			String[] currentNamesPartly = solHandler.getNamesForThisTimeStep(problem, nStepsMPC);
			String[] currentEffNames = solHandler.getEffNamesForThisTimeStep(problem, nStepsMPC);
			String[] posDemandStrings = solHandler.getNamesForPositiveDemand(buildingMessageList);
			String[] demandStrings = solHandler.getNamesForDemand(buildingMessageList, nStepsMPC);
			String[] storageNames = solHandler.getNamesForSOCs(buildingMessageList);
			String[] costName = { "Cost" };
			String[] CO2Name = { "CO2" };

			String[] namesAll = HelperConcat.concatAllObjects(timeStep, demandStrings, currentNamesPartly, storageNames,
					costName, CO2Name, posDemandStrings, currentEffNames);

			// Save
			memapSolutionPerTimeStep[this.getActualTimeStep()] = vectorAll;

			if (GlobalTime.getCurrentTimeStep() == (TopologyConfig.NR_OF_ITERATIONS - 1)) {
				String saveString = TopologyConfig.simulationName + "MPC" + TopologyConfig.N_STEPS_MPC + "/";
				saveString += this.actorName + "MPC" + nStepsMPC + ".csv";
				solHandler.exportMatrix(memapSolutionPerTimeStep, saveString, namesAll);

				double[][] CorrectedResultMatrix = null;
				try {
					CorrectedResultMatrix = solHandler.getCorrectedSolutionVector(problem.a_eq, sol, nrOfStorages);
				} catch (IOException e) {
					e.printStackTrace();
				}
				solHandler.exportMatrix(CorrectedResultMatrix, "CorrectedSolutionMatrix.csv", null);

			}

			// Handling the result
			if (GlobalTime.getCurrentTimeStep() == (TopologyConfig.NR_OF_ITERATIONS - 1)) {
				double totalCostsMEMAP = 0;
				double totalCO2MEMAP = 0;
				for (int j = 0; j < TopologyConfig.NR_OF_ITERATIONS; j++) {
					totalCostsMEMAP += costForTimestepMEMAP[j];
					totalCO2MEMAP += CO2ForTimestepMEMAP[j];
				}

				System.out.println(" << Optimization Result (MPC) >> ");
				System.out.println("COSTS with MEMAP: " + String.format("%.02f", totalCostsMEMAP));
				System.out.println("----------------------------------------------------------------");

				System.out.println("CO2 with MEMAP : " + String.format("%.02f", totalCO2MEMAP));
				System.out.println("----------------------------------------------------------------");
			}

			// ================= AnswerContentToSend ==================
			for (int i = 0; i < sol.length/nStepsMPC; i++) {
				double[] result = new double[nStepsMPC];
				
				for (int j = 0; j < result.length; j++) {
					result[j] = sol[i*nStepsMPC + j];
				}
				
				String str = problem.namesUB[i*nStepsMPC];
				optResult.resultMap.put(str, result);
			}

			try {
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public AnswerContent returnAnswerContentToSend() {
		if (this.getActualTimeStep() == 0) {
			if (port != 0) {
				//this.mServer = new MemapOpcServerStarter(false, gson.toJson(optResult), port);
				try {
					//this.mServer.start();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			OpcServerContextGenerator.generateJson2(this.actorName, optResult);
		}

		if (port != 0) {
			try {
				//mServer.update(gson.toJson(optResult));
				//Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		buildingMessage.currentOptimizationResults = optResult;
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
