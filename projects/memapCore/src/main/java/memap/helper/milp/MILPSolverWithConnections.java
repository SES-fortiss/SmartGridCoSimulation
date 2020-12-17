package memap.helper.milp;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import akka.basicMessages.AnswerContent;
import akka.basicMessages.BasicAnswer;
import lpsolve.LpSolve;
import lpsolve.LpSolveException;
import memap.controller.TopologyController;
import memap.helper.DirectoryConfiguration;
import memap.helper.MEMAPLogging;
import memap.helper.MetricsHandler;
import memap.helper.SolutionHandler;
import memap.media.Strings;
import memap.messages.BuildingMessage;
import memap.messages.OptimizationResultMessage;

/**
 * Note, this class might have many cloning from MILP with no connections, we
 * are trying to remove as many clones as possible, after finishing the correct
 * implementation of MILP.
 * 
 * @author bytschkow
 *
 */
public class MILPSolverWithConnections extends MILPSolver {

	MILPProblemWithConnections mp;
	ArrayList<BuildingMessage> buildingMessages = new ArrayList<>();

	public MILPSolverWithConnections(TopologyController topologyController, int currentTimeStep,
			ArrayList<BasicAnswer> answerListReceived, SolutionHandler milpSolHandler, double[] buildingsTotalCostsMILP,
			double[] buildingsTotalCO2MILP, double[][] buildingsSolutionPerTimeStepMILP, String actorName,
			OptimizationResultMessage optResult) {

		super(topologyController, currentTimeStep, milpSolHandler, buildingsTotalCostsMILP, buildingsTotalCO2MILP,
				buildingsSolutionPerTimeStepMILP, actorName, optResult);

		for (BasicAnswer basicAnswer : answerListReceived) {
			AnswerContent answerContent = basicAnswer.answerContent;
			if (answerContent instanceof BuildingMessage) {
				BuildingMessage bm = (BuildingMessage) answerContent;
				this.buildingMessages.add(bm);
			}
		}
	}

	/**
	 * Note, the difficulty is that all goes into one big matrix. Therefore, it
	 * needs to be carefully, to keep it modular.
	 */
	public LpSolve createModelWithConnections() throws LpSolveException {

		int numberControllableProducers = 0;
		int numberVolatileProducers = 0;
		int numberCouplers = 0;
		int numberStorages = 0;
		int nrOfConnections = 0;

		for (BuildingMessage bm : buildingMessages) {
			numberControllableProducers += bm.getNrOfControllableProducers();
			numberVolatileProducers += bm.getNrOfVolatileProducers();
			numberCouplers += bm.getNrOfCouplers();
			numberStorages += bm.getNrOfStorages();
			nrOfConnections += bm.getNrOfConnections();
		}

		nCols = nStepsMPC * ((numberControllableProducers * 2) + (numberVolatileProducers) + (numberCouplers * 2)
				+ (numberStorages * 2) + (nrOfConnections * 2) + (2));

		/* clean up first */
		problem = LpSolve.makeLp(0, nCols);
		problem.deleteLp();

		/* Create an empty model */
		problem = LpSolve.makeLp(0, nCols);
		if (problem.getLp() == 0)
			return null; /* couldn't construct a new model... */

		// Build matrices
		mp = new MILPProblemWithConnections(topologyController, currentTimeStep, nStepsMPC, nCols);

		// 1) create model and include all names
		mp.createNames(problem, buildingMessages);

		if (topologyController.getLogging() == MEMAPLogging.ALL) {

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
		problem = mp.createDemandConstraints(problem, buildingMessages);

		String fs = File.separator;

		String addOnPath = DirectoryConfiguration.mainDir + fs + DirectoryConfiguration.resultDir + fs
				+ topologyController.getSimulationName() + fs + "MPC" + topologyConfig.getNrStepsMPC() + "_MILP" + fs
				+ "MILP_" + actorName;

		if (topologyController.getLogging() == MEMAPLogging.ALL
				|| topologyController.getLogging() == MEMAPLogging.FILES) {
			problem.writeLp(addOnPath + "_DEMAND.lp");
			System.out.println("Logging of each addition into LP FILES under: " + addOnPath);
		}

		// 3) add the inequality constraints (component boundaries)
		problem = mp.createComponentBoundaries(problem, buildingMessages);

		if (topologyController.getLogging() == MEMAPLogging.ALL
				|| topologyController.getLogging() == MEMAPLogging.FILES) {
			problem.writeLp(addOnPath + "_Boundaries.lp");
		}

		// 4) SOC inequality constraints.
		problem = mp.createSOCBoundaries(problem, buildingMessages);

		if (topologyController.getLogging() == MEMAPLogging.ALL
				|| topologyController.getLogging() == MEMAPLogging.FILES) {
			problem.writeLp(addOnPath + "_SOC_Boundaries.lp");
		}

		problem.setAddRowmode(false); /* row-mode should be turned off again when done building the model */

		// 5) Set objective function
		problem = mp.createObjectiveFunction(problem, buildingMessages);

		if (topologyController.getLogging() == MEMAPLogging.ALL
				|| topologyController.getLogging() == MEMAPLogging.FILES) {
			problem.writeLp(addOnPath + "_FINAL.lp");
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

		workWithResults(optSolution, names, lambda, lambdaCO2, buildingMessages);

		// METRICS FOR RESULTS OVERVIEW
		MetricsHandler metricsHandler = new MILPMetricsHandler(topologyController, buildingMessages, optResult, optSolution, problem,
				milpSolHandler, currentTimeStep, nStepsMPC);

		// filename to be created
		String filename = topologyController.getSimulationName() + "/MPC" + nStepsMPC + "_MILP/";
		filename += actorName + "_MPC" + nStepsMPC + Strings.milpOverviewFileSuffix;

		try {
			metricsHandler.calculateOverviewMetrics(filename);
		} catch (IOException e) {
			System.err.println("There was an error in the metrics calculation");
			e.printStackTrace();
		}

		// Clean up such that all used memory by lp-solve is freed
		if (problem.getLp() != 0)
			problem.deleteLp();
	}

}
