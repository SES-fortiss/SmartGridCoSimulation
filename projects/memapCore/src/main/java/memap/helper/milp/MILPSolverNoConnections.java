package memap.helper.milp;

import static memap.main.ConfigurationMEMAP.chosenMEMAPLogging;

import java.io.File;
import java.util.Arrays;

import lpsolve.LpSolve;
import lpsolve.LpSolveException;
import memap.helper.DirectoryConfiguration;
import memap.helper.SolutionHandler;
import memap.main.ConfigurationMEMAP.MEMAPLogging;
import memap.main.TopologyConfig;
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
	private BuildingMessage buildingMessage;  // for problems without connections

	public MILPSolverNoConnections(BuildingMessage buildingMessage, int nStepsMPC, SolutionHandler milpSolHandler,
			double[] buildingStepCostsMILP, double[] buildingStepCO2MILP, int actualTimeStep,
			double[][] buildingsSolutionPerTimeStepMILP2, String actorName, OptimizationResultMessage optResult) {
				
		super(nStepsMPC, milpSolHandler, buildingStepCostsMILP, buildingStepCO2MILP, 
				actualTimeStep, buildingsSolutionPerTimeStepMILP2, actorName, optResult);
		
		this.buildingMessage = buildingMessage;
	}

	/**
	 * DESIGN DECISIONS <p><ul> 
	 * <li> Controllable have booleans + linear value for production 
	 * <li> Volatile have only linear values for production 
	 * <li> Couplers have boolean + linear for production 
	 * <li> Storages have two linear values for production 
	 * <li> E-market is linear </ul><p>
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
		mp = new MILPProblemNoConnections(nStepsMPC, nCols);

		// 1) create model and include all names
		mp.createNames(problem, buildingMessage);
		
		if (chosenMEMAPLogging == MEMAPLogging.ALL) {
			printNames();
		}
		

		// 2) add the demand constraints (equality constraints)
		mp.createDemandConstraints(problem, buildingMessage);

		if (chosenMEMAPLogging == MEMAPLogging.ALL) {
			double[] demand = buildingMessage.getCombinedDemandVector();
			System.out.println(
					"Demand:  " + Arrays.toString(demand) + "   List size: " + buildingMessage.demandList.size());
		}
		
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
		problem = mp.createComponentBoundaries(problem, buildingMessage);
		if (chosenMEMAPLogging == MEMAPLogging.ALL || chosenMEMAPLogging == MEMAPLogging.FILES) {
			problem.writeLp(addOnPath + "_Boundaries.lp");
		}

		// 4) SOC inequality constraints.
		problem = mp.createSOCBoundaries(problem, buildingMessage);
		if (chosenMEMAPLogging == MEMAPLogging.ALL || chosenMEMAPLogging == MEMAPLogging.FILES)
			problem.writeLp(addOnPath + "_SOC_Boundaries.lp");

		problem.setAddRowmode(false); /* row-mode should be turned off again when done building the model */

		// 5) Set objective function
		problem = mp.createObjectiveFunction(problem, buildingMessage);

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
		
		workWithResults(optSolution, names, lambda,lambdaCO2,buildingMessage);
	}	
}
