package linprogMPC.components.prototypes;

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
import linprogMPC.helper.DirectoryManager;
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
	double[][] memapSolutionPerTimeStep = new double[TopologyConfig.NR_OF_ITERATIONS][];

	public OptimizationResultMessage optResult = new OptimizationResultMessage();
	public MemapOpcServerStarter mServer;
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
		// Sort the received answers in 'Buildings' and/or 'free
		// consumer/Storage/Producers'
		ArrayList<BuildingMessage> buildingMessageList = new ArrayList<BuildingMessage>();

		for (BasicAnswer basicAnswer : answerListReceived) {

			AnswerContent answerContent = basicAnswer.answerContent;
			if (answerContent instanceof BuildingMessage) {
				BuildingMessage bm = (BuildingMessage) answerContent;
				buildingMessageList.add(bm);

			}
		}

		if (TopologyConfig.MEMAP_ON) {
			if (GlobalTime.getCurrentTimeStep() == 0) {

				int nrOfConsumers = 0;
				int nrOfStorages = 0;
				int nrOfProducers = 0;
				int nrOfCouplers = 0;

				for (BuildingMessage buildingMessage : buildingMessageList) {
					nrOfConsumers += buildingMessage.getNrOfConsumers();
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
			System.out.println();

			costForTimestepMEMAP[GlobalTime.getCurrentTimeStep()] = memapCostPerTimestep[0];

			// Creation of the result vector
			double[] currentOptVector = solHandler.getSolutionForThisTimeStep(sol, nStepsMPC);
			double[] currentDemand = solHandler.getDemandForThisTimestep(problem, nStepsMPC);
			double[] currentSOC = solHandler.getCurrentSOCs(buildingMessageList);
			double[] currentCost = { memapCostPerTimestep[0] };

			double[] vectorAll = HelperConcat.concatAlldoubles(currentDemand, currentOptVector, currentSOC,
					currentCost);

			String[] currentNamesPartly = solHandler.getNamesForThisTimeStep(problem, nStepsMPC);
			String[] demandStrings = solHandler.getNamesForDemand();
			String[] storageNames = solHandler.getNamesForSOCs(buildingMessageList);
			String[] costName = { "Cost" };

			String[] namesAll = HelperConcat.concatAllObjects(demandStrings, currentNamesPartly, storageNames,
					costName);

			// Save
			memapSolutionPerTimeStep[this.getActualTimeStep()] = vectorAll;

			if (GlobalTime.getCurrentTimeStep() == (TopologyConfig.NR_OF_ITERATIONS - 1)) {
				String saveString = TopologyConfig.simulationName + "MPC" + TopologyConfig.N_STEPS_MPC + "/";
				saveString += this.actorName + "MPC" + nStepsMPC + ".csv";
				solHandler.exportMatrix(memapSolutionPerTimeStep, saveString, namesAll);
			}

			// Handling the result
			if (GlobalTime.getCurrentTimeStep() == (TopologyConfig.NR_OF_ITERATIONS - 1)) {
				double totalCostsMEMAP = 0;
				for (int j = 0; j < TopologyConfig.NR_OF_ITERATIONS; j++) {
					totalCostsMEMAP += costForTimestepMEMAP[j];
				}

				System.out.println(" << Optimization Result (MPC) >> ");
				System.out.println("COSTS with MEMAP: " + String.format("%.02f", totalCostsMEMAP));
				System.out.println("----------------------------------------------------------------");
			}

			// ================= AnswerContentToSend ==================
			// Here the structure of the server results is specified

			// Caution!!! Building 1 does in the CSV example not contain any devices.
			// Hence, there is no folder for building one initialized.

			// A new folder for every building is added
			DirectoryManager dm = new DirectoryManager(optResult, buildingMessageList);
			dm.createDirectoryHierarchy();

			/*
			 * We assign all the devices and generalResult data-points to the respective
			 * folders. The first loop runs over the data-points and devices. The
			 * second loop runs over the respective nMpc Horizon points.
			 */
			for (int i = 0; i < sol.length / nStepsMPC - 4; i++) {
				double[] result = new double[nStepsMPC];
				for (int j = 0; j < result.length; j++) {
					result[j] = sol[i * nStepsMPC + j];
				}
				String str = problem.namesUB[i * nStepsMPC];
				String[] strSplit = str.split("\\.");
				dm.addBuildingResult(strSplit[0], strSplit[1], result);
			}

			// Putting values to the generalResultsMap. Loops same as above
			for (int i = sol.length / nStepsMPC - 4; i < sol.length / nStepsMPC; i++) {
				double[] result = new double[nStepsMPC];
				for (int j = 0; j < result.length; j++) {
					result[j] = sol[i * nStepsMPC + j];
				}
				String str = problem.namesUB[i * nStepsMPC];
				dm.addGeneralResult(str, result);
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
				this.mServer = new MemapOpcServerStarter(false, gson.toJson(optResult), port);
				try {
					this.mServer.start();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			OpcServerContextGenerator.generateJson2(this.actorName, optResult);
		}

		if (port != 0) {
			try {
				mServer.update(gson.toJson(optResult));
				Thread.sleep(1000);
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
