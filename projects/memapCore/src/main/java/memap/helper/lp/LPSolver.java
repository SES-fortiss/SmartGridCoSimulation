package memap.helper.lp;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

import memap.controller.TopologyController;
import memap.helper.EnergyPrices;
import memap.helper.HelperConcat;
import memap.helper.MetricsHandler;
import memap.helper.SolutionHandler;
import memap.helper.configurationOptions.Optimizer;
import memap.main.SimulationProgress;
import memap.main.Status;
import memap.main.TopologyConfig;
import memap.media.Strings;
import memap.messages.BuildingMessage;
import memap.messages.BuildingMessageHandler;
import memap.messages.OptimizationResultMessage;

public class LPSolver {

	/** Reference to topologyController ancestor */
	private TopologyController topologyController;
	/** Reference to topology configuration */
	TopologyConfig topologyConfig = TopologyConfig.getInstance();
	/** Time step for which the solver is created */
	private int currentTimeStep;

	BuildingMessage buildingMessage;
	private ArrayList<BuildingMessage> buildingMessageList;

	SolutionHandler solHandler;
	double[] buildingsTotalCosts;
	double[] buildingsTotalCO2;
	double[][] buildingsSolutionPerTimeStep;
	String actorName;
	OptimizationResultMessage optResult;

	public LPSolver(TopologyController topologyController, BuildingMessage buildingMessage, SolutionHandler solHandler,
			double[] totalEURVector, double[] totalCO2Vector, int currentTimeStep, double[][] solutionPerTimeStep,
			String actorName, OptimizationResultMessage optResult) {
		this.topologyController = topologyController;
		this.buildingMessage = buildingMessage;
		this.solHandler = solHandler;
		this.buildingsTotalCosts = totalEURVector;
		this.buildingsTotalCO2 = totalCO2Vector;
		this.currentTimeStep = currentTimeStep;
		this.buildingsSolutionPerTimeStep = solutionPerTimeStep;
		this.actorName = actorName;
		this.optResult = optResult;
	}

	public void solveLPOptProblem() {

		int nStepsMPC = topologyConfig.getNrStepsMPC();
		EnergyPrices energyPrices = EnergyPrices.getInstance();
		LPOptimizationProblem problem = null;
		try {
			// LP Optimization
			LPMatrixBuildup mb = new LPMatrixBuildup(topologyController, currentTimeStep);

			if (topologyController.getOptimizer() == Optimizer.LP) {
				problem = mb.singleBuilding(buildingMessage);
			}

			if (topologyController.getOptimizer() == Optimizer.LPwithConnections) {
				if (buildingMessageList != null) {
					problem = mb.multipleBuildings(getBuildingMessageList());
				} else {
					problem = mb.singleBuilding(buildingMessage);
				}
			}

			LPOptimizationStarter os = new LPOptimizationStarter(topologyController);

			double[] optSolution = null;

			optSolution = os.runLinProg(problem);

			// Determination of costs
			double buildingCostPerTimestep = 0;
			double buildingCO2PerTimestep = 0;
			buildingCostPerTimestep = solHandler.calculateTimeStepCosts(optSolution, problem.lambda);
			buildingCO2PerTimestep = solHandler.calculateTimeStepCosts(optSolution, problem.lambdaCO2);
			buildingsTotalCosts[currentTimeStep] = buildingCostPerTimestep;
			buildingsTotalCO2[currentTimeStep] = buildingCO2PerTimestep;

			double costTotal = 0;
			double CO2Total = 0;

			for (int i = 0; i < buildingsTotalCosts.length; i++) {
				costTotal += buildingsTotalCosts[i];
				CO2Total += buildingsTotalCO2[i];
			}

			// Creation of the result vector
			double[] currentStep = { 0 + currentTimeStep };
			double[] currentOptVector = solHandler.getSolutionForThisTimeStep(optSolution, nStepsMPC);
			double[] currentSOC = solHandler.getCurrentSOC(buildingMessage.storageList);
			double[] totalCostsValue = { costTotal };
			double[] co2emissionsValue = { CO2Total };
			double[] currentEnergyPrices = { energyPrices.getElecBuyingPrice(currentTimeStep),
					energyPrices.getElecSellingPrice(currentTimeStep),
					energyPrices.getHeatBuyingPrice(currentTimeStep) };

			String[] timeStep = { Strings.timeStep };
			String[] currentOptVectorNames = solHandler.getVectorNamesForThisTimeStep(problem.namesUB, nStepsMPC);
			String[] currentSOCNames = solHandler.getNamesForSOC(buildingMessage.storageList);
			String[] energyPricesNames = { Strings.elecBuyingPriceAndUnit, Strings.elecSellingPriceAndUnit,
					Strings.heatBuyingPriceAndUnit };
			String[] totalCosts = { Strings.totalCostAndUnit };
			String[] co2emissions = { Strings.co2EmissionsAndUnit };

			double[] currentDemand = null;
			String[] currentDemandNames = null;

			if (buildingMessageList != null) {
				// With connections
				BuildingMessageHandler buildingMessageHandler = new BuildingMessageHandler();
				double[] demandVector = buildingMessageHandler.getCombinedDemandVector(buildingMessageList, nStepsMPC);
				currentDemand = solHandler.getDemandForThisTimestep(demandVector, nStepsMPC);
				currentDemandNames = solHandler.getNamesForDemand(buildingMessageList, nStepsMPC);

				// Small modification to calculate the aggregated demand of the buildings.
				double[] resultWithTotalHeatDemand = new double[currentDemand.length + 1];
				for (int i = 0; i < currentDemand.length - 1; i++) {
					resultWithTotalHeatDemand[0] += currentDemand[i];
					resultWithTotalHeatDemand[i + 1] = currentDemand[i];
				}
				resultWithTotalHeatDemand[currentDemand.length] = currentDemand[currentDemand.length - 1];
				currentDemand = resultWithTotalHeatDemand;
			} else {
				// Without connections
				currentDemand = solHandler.getDemandForThisTimestep(problem.b_eq, nStepsMPC);
				currentDemandNames = solHandler.getNamesForDemandSingleBuilding();
			}

			String[] namesResult = HelperConcat.concatAllObjects(timeStep, currentDemandNames, currentOptVectorNames,
					currentSOCNames, energyPricesNames, totalCosts, co2emissions);

			double[] vectorResult = HelperConcat.concatAlldoubles(currentStep, currentDemand, currentOptVector,
					currentSOC, currentEnergyPrices, totalCostsValue, co2emissionsValue);

			// Format results vector for printing
			String[] vectorResultStr = new String[vectorResult.length];
			DecimalFormat df = new DecimalFormat("0.000", new DecimalFormatSymbols(Locale.ENGLISH));
			for (int i = 1; i < vectorResultStr.length; i++) {
				vectorResultStr[i] = df.format(vectorResult[i]);
			}
			vectorResultStr[0] = ((Integer) currentTimeStep).toString();

			// System.out.println("LP: " + this.actorName + " Names: " +
			// Arrays.toString(namesResult));
			// System.out.println("LP: " + this.actorName + " Result: " +
			// Arrays.toString(vectorResultStr));

			// Save
			buildingsSolutionPerTimeStep[currentTimeStep] = vectorResult;

			String saveString = topologyController.getSimulationName() + "/MPC" + nStepsMPC + "_LP/";
			saveString += actorName + "_MPC" + nStepsMPC + Strings.lpSolutionFileSuffix;

			if (currentTimeStep == (topologyConfig.getNrOfIterations() - 1)) {
				solHandler.exportMatrix(buildingsSolutionPerTimeStep, saveString, namesResult);
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

			// METRICS FOR RESULTS OVERVIEW
			MetricsHandler mc = null;

			if (buildingMessageList != null) {
				mc = new LPMetricsHandler(buildingMessageList, optResult, optSolution, problem, currentTimeStep,
						nStepsMPC);

			} else {
				mc = new LPMetricsHandler(buildingMessage, optResult, optSolution, problem, currentTimeStep, nStepsMPC);
			}

			// filename to be created
			String filename = topologyController.getSimulationName() + "/MPC" + nStepsMPC + "_LP/";
			filename += actorName + "_MPC" + nStepsMPC + Strings.lpOverviewFileSuffix;

			mc.calculateOverviewMetrics(filename);

		} catch (Exception e) {
			e.printStackTrace();
			String error = getClass().getName() + ": " + actorName + " cannot solve the optimization";
			SimulationProgress.getInstance().setStatus(Status.ERROR, error);
			System.err.println(error);
			System.out.println("names: " + Arrays.toString(problem.namesUB));
			System.out.println("b: " + Arrays.toString(problem.b_eq));
			System.out.println("ub: " + Arrays.toString(problem.x_ub));
			System.out.println("h: " + Arrays.toString(problem.h));
		}

	}

	public ArrayList<BuildingMessage> getBuildingMessageList() {
		return buildingMessageList;
	}

	public void setBuildingMessageList(ArrayList<BuildingMessage> buildingMessageList) {
		this.buildingMessageList = buildingMessageList;
	}
}
