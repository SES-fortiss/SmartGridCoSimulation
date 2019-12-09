package linprogMPC.helper.lp;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

import akka.systemActors.GlobalTime;
import linprogMPC.ConfigurationMEMAP;
import linprogMPC.TopologyConfig;
import linprogMPC.helper.HelperConcat;
import linprogMPC.helper.SolutionHandler;
import linprogMPC.messages.BuildingMessage;
import linprogMPC.messages.OptimizationResultMessage;

public class LPSolver {

	BuildingMessage buildingMessage;
	private ArrayList<BuildingMessage> buildingMessageList;

	int nStepsMPC = 0;
	SolutionHandler solHandler;
	double[] buildingsTotalCosts;
	double[] buildingsTotalCO2;
	int actualTimeStep;
	double[][] buildingsSolutionPerTimeStep;
	String actorName;
	OptimizationResultMessage optResult;

	public LPSolver(BuildingMessage buildingMessage, int nStepsMPC, SolutionHandler solHandler, double[] totalEURVector,
			double[] totalCO2Vector, int actualTimeStep, double[][] solutionPerTimeStep, String actorName,
			OptimizationResultMessage optResult) {
		this.buildingMessage = buildingMessage;
		this.nStepsMPC = nStepsMPC;
		this.solHandler = solHandler;
		this.buildingsTotalCosts = totalEURVector;
		this.buildingsTotalCO2 = totalCO2Vector;
		this.actualTimeStep = actualTimeStep;
		this.buildingsSolutionPerTimeStep = solutionPerTimeStep;
		this.actorName = actorName;
		this.optResult = optResult;
	}

	public void solveLPOptProblem() {

		LPOptimizationProblem problem = null;
		try {
			// LP Optimization
			LPMatrixBuildup mb = new LPMatrixBuildup();

			if (ConfigurationMEMAP.chosenOptimizer == ConfigurationMEMAP.Optimizer.LP) {
				problem = mb.singleBuilding(buildingMessage);
			}

			if (ConfigurationMEMAP.chosenOptimizer == ConfigurationMEMAP.Optimizer.LPwithConnections) {
				if (buildingMessageList != null) {
					problem = mb.multipleBuildings(getBuildingMessageList());
				} else {
					System.err.println(this.getClass()
							+ ": trying to solve LPwithConnections, but buildingMessageListIsEmpty, will do it  without Connections");
					problem = mb.singleBuilding(buildingMessage);
				}
			}

			LPOptimizationStarter os = new LPOptimizationStarter();
			double[] optSolution = os.runLinProg(problem);

			// Determination of costs
			double buildingCostPerTimestep = 0;
			double buildingCO2PerTimestep = 0;
			buildingCostPerTimestep = solHandler.calculateTimeStepCosts(optSolution, problem.lambda);
			buildingCO2PerTimestep = solHandler.calculateTimeStepCosts(optSolution, problem.lambdaCO2);
			buildingsTotalCosts[GlobalTime.getCurrentTimeStep()] = buildingCostPerTimestep;
			buildingsTotalCO2[GlobalTime.getCurrentTimeStep()] = buildingCO2PerTimestep;

			// Creation of the result vector
			double[] currentStep = { actualTimeStep };
			double[] currentDemand = solHandler.getDemandForThisTimestep(problem.b_eq, nStepsMPC);
			double[] currentOptVector = solHandler.getSolutionForThisTimeStep(optSolution, nStepsMPC);
			double[] currentSOC = solHandler.getCurrentSOC(buildingMessage.storageList);
			double[] currentFinantialLoss = { buildingCostPerTimestep };
			double[] currentCO2Loss = { buildingCO2PerTimestep };
			double[] currentEnergyPrice = { TopologyConfig.energyPrices.getElectricityPriceInEuro(actualTimeStep) };
			double[] currentPosDemand = solHandler.getPositiveDemandForThisTimestep(problem, nStepsMPC);
			double[] currentEffOptVector = solHandler.getEffSolutionForThisTimeStep(optSolution, problem.etas,
					nStepsMPC);

			String[] timeStep = { "Time step" };
			String[] currentDemandNames = solHandler.getNamesForDemand();
			String[] currentOptVectorNames = solHandler.getNamesForThisTimeStep(problem.namesUB, nStepsMPC);
			String[] currentSOCNames = solHandler.getNamesForSOC(buildingMessage.storageList);
			String[] finantialLoss = { "Finantial loss [EUR]" };
			String[] co2Loss = { "CO2 loss [kg CO2/kWh]" };
			String[] energyPrice = { "Energy price [EUR]" };
			String[] posDemandStrings = { "Positive demandHeat", "positiveDemandHeatTotal",
					"positiveDemandElectricity" };
			String[] currentEffNames = solHandler.getEffNamesForThisTimeStep(problem.namesUB, nStepsMPC);

			String[] namesResult = HelperConcat.concatAllObjects(timeStep, currentDemandNames, currentOptVectorNames,
					currentSOCNames, finantialLoss, co2Loss, energyPrice, posDemandStrings, currentEffNames);
			double[] vectorResult = HelperConcat.concatAlldoubles(currentStep, currentDemand, currentOptVector,
					currentSOC, currentFinantialLoss, currentCO2Loss, currentEnergyPrice, currentPosDemand, currentEffOptVector);

			// Format results vector for printing
			String[] vectorResultStr = new String[vectorResult.length];
			DecimalFormat df = new DecimalFormat("0.000", new DecimalFormatSymbols(Locale.ENGLISH));
			for (int i = 1; i < vectorResultStr.length; i++) {
				vectorResultStr[i] = df.format(vectorResult[i]);
			}

			System.out.println("LP: " + this.actorName + " Names: " + Arrays.toString(namesResult));
			System.out.println("LP: " + this.actorName + " Result: " + Arrays.toString(vectorResultStr));

			// Save
			buildingsSolutionPerTimeStep[actualTimeStep] = vectorResult;

			String saveString = TopologyConfig.simulationName + "MPC" + TopologyConfig.N_STEPS_MPC + "/";
			saveString += actorName + "MPC" + nStepsMPC + "Solutions.csv";
			if (GlobalTime.getCurrentTimeStep() == (TopologyConfig.NR_OF_ITERATIONS - 1)) {
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

		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(actorName + " cannot solve the optimization");
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
