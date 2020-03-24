package memap.helper.milp;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import lpsolve.LpSolve;
import lpsolve.LpSolveException;
import memap.controller.TopologyController;
import memap.helper.DirectoryConfiguration;
import memap.helper.FileManager;
import memap.helper.MEMAPLogging;
import memap.helper.MetricsHandler;
import memap.helper.SolutionHandler;
import memap.messages.BuildingMessage;
import memap.messages.OptimizationResultMessage;

/**
 * This class creates the MILP Optimization Problem and solves it.
 * 
 * @author bytschkow
 *
 */
public class MILPSolverNoConnections extends MILPSolver {

	/** Parameters */
	private MILPProblemNoConnections mp;
	private BuildingMessage buildingMessage; // for problems without connections

	public MILPSolverNoConnections(TopologyController topologyController, int currentTimeStep,
			BuildingMessage buildingMessage, SolutionHandler milpSolHandler, double[] buildingStepCostsMILP,
			double[] buildingStepCO2MILP, double[][] buildingsSolutionPerTimeStepMILP2, String actorName,
			OptimizationResultMessage optResult) {

		super(topologyController, currentTimeStep, milpSolHandler, buildingStepCostsMILP, buildingStepCO2MILP,
				buildingsSolutionPerTimeStepMILP2, actorName, optResult);

		this.buildingMessage = buildingMessage;
	}

	/**
	 * DESIGN DECISIONS
	 * <p>
	 * <ul>
	 * <li>Controllable have booleans + linear value for production
	 * <li>Volatile have only linear values for production
	 * <li>Couplers have boolean + linear for production
	 * <li>Storages have two linear values for production
	 * <li>E-market is linear
	 * </ul>
	 * <p>
	 * Note, the difficulty is that all goes into one big matrix. Therefore, it
	 * needs to be carefully, to keep it modular.
	 */
	public LpSolve createModel() throws LpSolveException {
		// 0) find out the number of individual contributers.
		int numberControllableProducers = buildingMessage.getNrOfControllableProducers();
		int numberVolatileProducers = buildingMessage.getNrOfVolatileProducers();
		int numberCouplers = buildingMessage.getNrOfCouplers();
		int numberStorages = buildingMessage.getNrOfStorages();

		/* this represents the x vector (its size) */
		nCols = nStepsMPC * ((numberControllableProducers * 2) + +(numberVolatileProducers) + (numberCouplers * 2)
				+ (numberStorages * 2) + (2));

		/* clean up first */
		problem = LpSolve.makeLp(0, nCols);
		problem.deleteLp();

		/* Create an empty model */
		problem = LpSolve.makeLp(0, nCols);
		if (problem.getLp() == 0)
			return null; /* couldn't construct a new model... */

		// Build matrices
		mp = new MILPProblemNoConnections(topologyController, currentTimeStep, nStepsMPC, nCols);

		// 1) create model and include all names
		mp.createNames(problem, buildingMessage);

		if (topologyController.getLogging() == MEMAPLogging.ALL) {
			printNames();
		}

		// 2) add the demand constraints (equality constraints)
		mp.createDemandConstraints(problem, buildingMessage);

		if (topologyController.getLogging() == MEMAPLogging.ALL) {
			double[] demand = buildingMessage.getCombinedDemandVector();
			System.out.println(
					"Demand:  " + Arrays.toString(demand) + "   List size: " + buildingMessage.demandList.size());
		}

		String fs = File.separator;

		String addOnPath = DirectoryConfiguration.mainDir + fs + DirectoryConfiguration.resultDir + fs
				+ topologyController.getSimulationName() + fs + "MPC" + topologyConfig.getNrStepsMPC() + "_MILP" + fs
				+ "MILP_" + actorName;

		if (topologyController.getLogging() == MEMAPLogging.ALL
				|| topologyController.getLogging() == MEMAPLogging.FILES) {
			String filename = addOnPath + "_DEMAND.lp";
			FileManager.setUpDirectoryHierarchy(filename);
			System.out.println("Logging of demand into LP FILES under: " + filename);
			problem.writeLp(filename);
		}

		// 3) add the inequality constraints (component boundaries)
		problem = mp.createComponentBoundaries(problem, buildingMessage);
		if (topologyController.getLogging() == MEMAPLogging.ALL
				|| topologyController.getLogging() == MEMAPLogging.FILES) {
			String filename = addOnPath + "_Boundaries.lp";
			FileManager.setUpDirectoryHierarchy(filename);
			System.out.println("Logging boundaries into LP FILES under: " + filename);
			problem.writeLp(filename);
		}

		// 4) SOC inequality constraints.
		problem = mp.createSOCBoundaries(problem, buildingMessage);
		if (topologyController.getLogging() == MEMAPLogging.ALL
				|| topologyController.getLogging() == MEMAPLogging.FILES) {
			String filename = addOnPath + "_SOC_Boundaries.lp";
			FileManager.setUpDirectoryHierarchy(filename);
			System.out.println("Logging SOC boundaries into LP FILES under: " + filename);
			problem.writeLp(filename);
		}

		problem.setAddRowmode(false); /* row-mode should be turned off again when done building the model */

		// 5) Set objective function
		problem = mp.createObjectiveFunction(problem, buildingMessage);

		if (topologyController.getLogging() == MEMAPLogging.ALL
				|| topologyController.getLogging() == MEMAPLogging.FILES) {
			String filename = addOnPath + "_FINAL.lp";
			FileManager.setUpDirectoryHierarchy(filename);
			System.out.println("Logging objective function into LP FILES under: " + filename);
			problem.writeLp(filename);
		}

		return problem;
	}

	public void solveMILP() throws LpSolveException {

		double[] optSolution = new double[nCols];
		String[] names = new String[nCols];

		solveMILPinternal(optSolution, names);

		// Determination of costs
		double[] lambda = mp.getLambdaEUR();
		double[] lambdaCO2 = mp.getLambdaCO2();

		workWithResults(optSolution, names, lambda, lambdaCO2, buildingMessage);

		// METRICS FOR RESULTS OVERVIEW
		MetricsHandler mc = new MILPMetricsHandler(topologyController, buildingMessage, optResult, optSolution, problem,
				milpSolHandler, currentTimeStep, nStepsMPC);

		// filename to be created
		String filename = topologyController.getSimulationName() + "/MPC" + nStepsMPC + "_MILP/";
		filename += actorName + "_MPC" + nStepsMPC + "_MILP_Overview.csv";

		try {
			mc.calculateOverviewMetrics(filename);
		} catch (IOException e) {
			System.err.println("There was an error in the metrics calculation");
			e.printStackTrace();
		}

		// Clean up such that all used memory by lp-solve is freed
		if (problem.getLp() != 0)
			problem.deleteLp();
	}
}
