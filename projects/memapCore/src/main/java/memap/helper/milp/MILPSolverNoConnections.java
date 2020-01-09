package memap.helper.milp;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.Locale;

import akka.systemActors.GlobalTime;
import lpsolve.LpSolve;
import lpsolve.LpSolveException;
import memap.helper.DirectoryConfiguration;
import memap.helper.HelperConcat;
import memap.helper.SolutionHandler;
import memap.main.ConfigurationMEMAP;
import memap.main.TopologyConfig;
import memap.main.ConfigurationMEMAP.MEMAPLogging;
import memap.messages.BuildingMessage;
import memap.messages.OptimizationResultMessage;

/**
 * This class creates the MILP Optimization Problem and solves it.
 * 
 * @author bytschkow
 *
 */
public class MILPSolverNoConnections {

	MILPProblemNoConnections mp;
	BuildingMessage buildingMessage;

	int nStepsMPC = 0;
	int nCols = 0;
	LpSolve problem = null;
	MEMAPLogging logging;

	SolutionHandler milpSolHandler;
	String actorName;
	OptimizationResultMessage optResult;

	// some long term values2
	double[] buildingStepCostsMILP;
	double[] buildingStepCO2MILP;
	double[][] buildingsSolutionPerTimeStepMILP;
	int timeStepIndex = 0;

	public MILPSolverNoConnections(BuildingMessage buildingMessage, int nStepsMPC) {
		this.buildingMessage = buildingMessage;
		this.nStepsMPC = nStepsMPC;
		this.logging = ConfigurationMEMAP.chosenMEMAPLogging;
	}

	public MILPSolverNoConnections(BuildingMessage buildingMessage2, int nStepsMPC2, SolutionHandler milpSolHandler,
			double[] buildingStepCostsMILP, double[] buildingStepCO2MILP, int actualTimeStep,
			double[][] buildingsSolutionPerTimeStepMILP2, String actorName, OptimizationResultMessage optResult) {
		this(buildingMessage2, nStepsMPC2);
		this.buildingStepCostsMILP = buildingStepCostsMILP;
		this.buildingStepCO2MILP = buildingStepCO2MILP;
		this.buildingsSolutionPerTimeStepMILP = buildingsSolutionPerTimeStepMILP2;
		this.timeStepIndex = actualTimeStep;
		this.milpSolHandler = milpSolHandler;
		this.actorName = actorName;
		this.optResult = optResult;
	}

	/**
	 * Note, the difficulty is that all goes into one big matrix. Therefore, it
	 * needs to be carefully, to keep it modular.
	 */
	public LpSolve createModel() throws LpSolveException {
		// 0) find out the number of individual contributers.
		int numberControllableProducers = buildingMessage.getNrOfControllableProducers();
		int numberVolatileProducers = buildingMessage.getNrOfVolatileProducers();
		int numberCouplers = buildingMessage.getNrOfCouplers();
		int numberStorages = buildingMessage.getNrOfStorages();

		/*
		 * DESIGN DECISIONS <p><ul> <li> Controllable have booleans + linear value for
		 * production <li> Volatile have only linear values for production <li> Couplers
		 * have boolean + linear for production <li> Storages have two linear values for
		 * production <li> E-market is linear </ul><p>
		 */

		/* this represents the x vector */
		nCols = nStepsMPC * ((numberControllableProducers * 2) + +(numberVolatileProducers) + (numberCouplers * 2)
				+ (numberStorages * 2) + (2));

		/* Create an empty model */
		LpSolve problem = LpSolve.makeLp(0, nCols);
		if (problem.getLp() == 0)
			return null; /* couldn't construct a new model... */

		// Build matrices
		mp = new MILPProblemNoConnections(nStepsMPC, nCols);

		// 1) create model and include all names
		problem = mp.createNames(problem, buildingMessage);

		if (logging == ConfigurationMEMAP.MEMAPLogging.ALL) {

			String[] names = new String[nCols + 1];
			for (int i = 0; i < names.length; i++) {
				names[i] = problem.getColName(i);
			}

			System.out.println("*****************");
			System.out.println("***** MILP ******");
			System.out.println("*****************");
			System.out.println("nCols: " + nCols);
			System.out.println("Colnames: " + Arrays.toString(names));
		}

		// 2) add the demand constraints (equality constraints)
		problem = mp.createDemandConstraints(problem, buildingMessage);

		if (logging == ConfigurationMEMAP.MEMAPLogging.ALL) {
			double[] demand = buildingMessage.getCombinedDemandVector();
			System.out.println(
					"Demand:  " + Arrays.toString(demand) + "    List size: " + buildingMessage.demandList.size());
		}
		
		String addOnPath = DirectoryConfiguration.mainDir + "/" + DirectoryConfiguration.resultDir + "/";

		if (logging == ConfigurationMEMAP.MEMAPLogging.ALL || logging == ConfigurationMEMAP.MEMAPLogging.FILES)
			problem.writeLp(addOnPath + "MILP_MEMAP_DEMAND.lp");

		// 3) add the inequality constraints (component boundaries)
		problem = mp.createComponentBoundaries(problem, buildingMessage);
		if (logging == ConfigurationMEMAP.MEMAPLogging.ALL || logging == ConfigurationMEMAP.MEMAPLogging.FILES)
			problem.writeLp(addOnPath + "MILP_MEMAP_Boundaries.lp");

		// 4) SOC inequality constraints.
		problem = mp.createSOCBoundaries(problem, buildingMessage);
		if (logging == ConfigurationMEMAP.MEMAPLogging.ALL || logging == ConfigurationMEMAP.MEMAPLogging.FILES)
			problem.writeLp(addOnPath + "MILP_MEMAP_SOC_Boundaries.lp");

		problem.setAddRowmode(false); /* row-mode should be turned off again when done building the model */

		// 5) Set objective function
		problem = mp.createObjectiveFunction(problem, buildingMessage);

		if (logging == ConfigurationMEMAP.MEMAPLogging.ALL || logging == ConfigurationMEMAP.MEMAPLogging.FILES) {
			problem.writeLp(addOnPath + "MILP_MEMAP_FINAL.lp");
			System.out.println("MILP_MEMAP_FINAL.lp written");
		}

		this.problem = problem;
		return problem;
	}

	public int solveMILP() throws LpSolveException {

		int result;

		problem.setVerbose(LpSolve.IMPORTANT); // only important messages
		result = problem.solve();

		if (result == LpSolve.OPTIMAL) {
			result = 0;
		} else {
			result = 5;
			System.err.println("No solution found. Resuming execution");
			System.exit(1);
			// TODO Add code to account for the other 14 solver status values
		}

		double[] optSolution = new double[nCols];
		String[] names = new String[nCols];

		if (result == 0) {
			problem.getVariables(optSolution);
			for (int j = 0; j < nCols; j++)
				names[j] = problem.getColName(j + 1);

			// ONLY FOR LOGGING
			if (logging == ConfigurationMEMAP.MEMAPLogging.ALL) {
				for (int j = 0; j < nCols; j++) {
					System.out.println(names[j] + ": " + optSolution[j]);
				}
			}
		}

		// Determination of costs

		double[] lambda = mp.getLambdaEUR(buildingMessage);
		double[] lambdaCO2 = mp.getLambdaCO2(buildingMessage);

		double buildingCostPerTimestep = 0;
		double buildingCO2PerTimestep = 0;
		buildingCostPerTimestep = milpSolHandler.calculateTimeStepCosts(optSolution, lambda);
		buildingCO2PerTimestep = milpSolHandler.calculateTimeStepCosts(optSolution, lambdaCO2);
		buildingStepCostsMILP[timeStepIndex] = buildingCostPerTimestep;
		buildingStepCO2MILP[GlobalTime.getCurrentTimeStep()] = buildingCO2PerTimestep;

		
		// to calculate the total costs
		double costTotal = 0;
		double CO2Total = 0;
		
		for (int i = 0; i < buildingStepCostsMILP.length; i++) {
			costTotal += buildingStepCostsMILP[i];
			CO2Total += buildingStepCO2MILP[i];
		}
		
		// Creation of the result vector

		double[] currentStep = { timeStepIndex };
		double[] currentDemand = milpSolHandler.getDemandForThisTimestep(buildingMessage.getCombinedDemandVector(),
				nStepsMPC);
		double[] currentOptVector = milpSolHandler.getSolutionForThisTimeStep(optSolution, nStepsMPC);
		double[] currentSOC = milpSolHandler.getCurrentSOC(buildingMessage.storageList);
		double[] currentEnergyPrice = { TopologyConfig.energyPrices.getElectricityPriceInEuro(timeStepIndex) };
		
		double[] totalCostsEUR = { costTotal };
		double[] totalCO2emissions = { CO2Total };

		String[] timeStep = { "Time step" };
		String[] currentDemandNames = milpSolHandler.getNamesForDemand();
		String[] currentOptVectorNames = milpSolHandler.getNamesForThisTimeStep(names, nStepsMPC);
		String[] currentSOCNames = milpSolHandler.getNamesForSOC(buildingMessage.storageList);
		
		String[] energyPrice = { "Energy price [EUR]" };
		
		String[] totalCosts = { "Total costs [EUR]" };
		String[] co2emissions = { "CO2 emissions [kg CO2/kWh]"};

		String[] namesResult = HelperConcat.concatAllObjects(timeStep, currentDemandNames, currentOptVectorNames, currentSOCNames, energyPrice,
				totalCosts, co2emissions);
		double[] vectorResult = HelperConcat.concatAlldoubles(currentStep, currentDemand, currentOptVector, currentSOC, currentEnergyPrice,
				totalCostsEUR, totalCO2emissions);

		// Format results vector for printing
		String[] vectorResultStr = new String[vectorResult.length];
		DecimalFormat df = new DecimalFormat("0.000", new DecimalFormatSymbols(Locale.ENGLISH));
		for (int i = 1; i < vectorResultStr.length; i++) {
			vectorResultStr[i] = df.format(vectorResult[i]);
		}
		
		System.out.println("MILP: " + this.actorName + " Names: " + Arrays.toString(namesResult));
		System.out.println("MILP: " + this.actorName + " Result: " + Arrays.toString(vectorResult));

		// Save
		buildingsSolutionPerTimeStepMILP[timeStepIndex] = vectorResult;

		if (true) {
			String saveString = TopologyConfig.simulationName + "/MPC" + TopologyConfig.N_STEPS_MPC + "_MILP/";
			saveString += actorName + "_MPC" + nStepsMPC + "_MILP_Solutions.csv";
			if (GlobalTime.getCurrentTimeStep() == (TopologyConfig.NR_OF_ITERATIONS - 1)) {
				milpSolHandler.exportMatrix(buildingsSolutionPerTimeStepMILP, saveString, namesResult);
			}
		}

		// Request content to send
		for (int i = 0; i < names.length / nStepsMPC; i++) {
			double[] values = new double[nStepsMPC];

			for (int j = 0; j < values.length; j++) {
				values[j] = optSolution[i * nStepsMPC + j];
			}

			// TODO : Improve this work around
			String str = names[i * nStepsMPC];
			if (str.contains("_")) {
				String str2 = str.substring(0, str.indexOf("_"));
				optResult.resultMap.put(str2, values);
			}
		}

		// Clean up such that all used memory by lp-solve is freed
		if (problem.getLp() != 0)
			problem.deleteLp();

		return result;
	}

}
