package memap.helper.milp;

import static memap.main.ConfigurationMEMAP.chosenMEMAPLogging;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

import akka.basicMessages.AnswerContent;
import akka.basicMessages.BasicAnswer;
import lpsolve.LpSolve;
import lpsolve.LpSolveException;
import memap.helper.DirectoryConfiguration;
import memap.helper.SolutionHandler;
import memap.main.TopologyConfig;
import memap.main.ConfigurationMEMAP.MEMAPLogging;
import memap.messages.BuildingMessage;
import memap.messages.OptimizationResultMessage;

/**
 * Note, this class might have many cloning from MILP with no connections, 
 * we are trying to remove as many clones as possible, after finishing the
 * correct implementation of MILP.
 * 
 * @author bytschkow
 *
 */
public class MILPSolverWithConnections extends MILPSolver {
	
	MILPProblemWithConnections mp;	
	ArrayList<BuildingMessage> buildingMessages = new ArrayList<>();	

	public MILPSolverWithConnections(ArrayList<BasicAnswer> answerListReceived, int nStepsMPC,
			SolutionHandler milpSolHandler, double[] buildingsTotalCostsMILP, double[] buildingsTotalCO2MILP,
			int actualTimeStep, double[][] buildingsSolutionPerTimeStepMILP, String actorName,
			OptimizationResultMessage optResult) {

		super(nStepsMPC, milpSolHandler, buildingsTotalCostsMILP, buildingsTotalCO2MILP,
				actualTimeStep, buildingsSolutionPerTimeStepMILP, actorName,
				optResult); 
		
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
		mp = new MILPProblemWithConnections(nStepsMPC, nCols);

		// 1) create model and include all names
		mp.createNames(problem, buildingMessages);

		if (chosenMEMAPLogging == MEMAPLogging.ALL) {

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
		//String fs = "/";
		
		String addOnPath = DirectoryConfiguration.mainDir + fs +
				DirectoryConfiguration.resultDir + fs +
				TopologyConfig.simulationName + fs +
				"MPC" + TopologyConfig.N_STEPS_MPC + "_MILP" +fs + 
				"MILP_"+actorName;

		if (chosenMEMAPLogging == MEMAPLogging.ALL || chosenMEMAPLogging == MEMAPLogging.FILES) {			
			problem.writeLp(addOnPath+"_DEMAND.lp");
			System.out.println("Logging of each addition into LP FILES under: " + addOnPath);
		}

		// 3) add the inequality constraints (component boundaries)
		problem = mp.createComponentBoundaries(problem, buildingMessages);

		if (chosenMEMAPLogging == MEMAPLogging.ALL || chosenMEMAPLogging == MEMAPLogging.FILES) {
			problem.writeLp(addOnPath + "_Boundaries.lp");
		}

		// 4) SOC inequality constraints.
		problem = mp.createSOCBoundaries(problem, buildingMessages);

		if (chosenMEMAPLogging == MEMAPLogging.ALL || chosenMEMAPLogging == MEMAPLogging.FILES) {
			problem.writeLp(addOnPath + "_SOC_Boundaries.lp");
		}

		problem.setAddRowmode(false); /* row-mode should be turned off again when done building the model */

		// 5) Set objective function
		problem = mp.createObjectiveFunction(problem, buildingMessages);

		if (chosenMEMAPLogging == MEMAPLogging.ALL || chosenMEMAPLogging == MEMAPLogging.FILES) {
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
		
	}

}
