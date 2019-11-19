package linprogMPC.helper.milp;

import java.util.Arrays;

import linprogMPC.messages.BuildingMessage;
import lpsolve.LpSolve;
import lpsolve.LpSolveException;

/**
 * TODO This class shall be responsible to create the MILP Optimization Problem and solve it.
 * 
 * @author bytschkow
 *
 */
public class MILPSolver {
	
	BuildingMessage buildingMessage;
	int nStepsMPC = 0;
	int nCols = 0;
	LpSolve problem = null;

	public MILPSolver(BuildingMessage buildingMessage, int nStepsMPC) {
		this.buildingMessage = buildingMessage;
		this.nStepsMPC = nStepsMPC;
				
		try {
			this.problem = this.createModel();
		} catch (LpSolveException e) {
			System.out.println("ERROR");	
			e.printStackTrace();
		}
	}
	
	/**  
	 * note the difficulty is that all goes into one big matrix. Therefore, it needs to be carefully, to keep it modular.  
	 */
	public LpSolve createModel() throws LpSolveException {
		// 1) find out the number of individual contributers.
		
		int numberControllableProducers = buildingMessage.getNrOfControllableProducers();
		int numberVolatileProducers = buildingMessage.getNrOfVolatileProducers();
		int numberCouplers = buildingMessage.getNrOfCouplers();
		int numberStorages = buildingMessage.getNrOfStorages();
		
		// **** DESIGN DECISIONS ****
		// + Controllable have booleans + linear value for production
		// + Volatile have only linear values for production
		// + Couplers have boolean and + linear for production
		// + Storages have two linear values for production
		// + E-market are linear
		
		/* this represents the x vector*/
		nCols = nStepsMPC * ( (numberControllableProducers*2) + 
				+ (numberVolatileProducers) + (numberCouplers * 2) + (numberStorages*2) + (2) ); 							
	 	
	 	/* Create an empty model  */
	 	LpSolve problem = LpSolve.makeLp(0, nCols);
        if(problem.getLp() == 0) return null; /* couldn't construct a new model... */
                        
		/**********************************************
		 *              BUILD Matrices
		 **********************************************/
        
        MILPProblem mp = new MILPProblem(nStepsMPC, nCols);
        
        // 1) create model and include all names 
        problem = mp.createNames(problem, buildingMessage);
        
        String[] names = new String[nCols+1];
        for (int i = 0; i < names.length; i++) {
        	names[i] = problem.getColName(i);
		}
        
        System.out.println("*****************");
        System.out.println("******MILP*******");
        System.out.println("*****************");
        System.out.println("nCols: " + nCols);
        System.out.println("Colnames: " + Arrays.toString(names));
        
		// 2) add the demand constraints (equality constraints)
        problem = mp.createDemandConstraints(problem, buildingMessage); 
    	problem.writeLp("MILP_MEMAP_DEMAND.lp");
        
		// 3) add the inequality constraints (component boundaries)
    	problem = mp.createComponentBoundaries(problem, buildingMessage);
    	problem.writeLp("MILP_MEMAP_Boundaries.lp");    
		
		// 4) soc inequalitiy constraints.    	
    	problem = mp.createSOCBoundaries(problem, buildingMessage);
    	problem.writeLp("MILP_MEMAP_SOC_Boundaries.lp");

        problem.setAddRowmode(false); /* rowmode should be turned off again when done building the model */
        
		// 5) Set objective function    	
    	problem = mp.createObjectiveFunction(problem, buildingMessage);
    	problem.writeLp("MILP_MEMAP_FINAL.lp");
    	
    	return problem;
	}

	public int solveMILP() throws LpSolveException {
		
		int ret;
		
	 	double[] row = new double[nCols];
	 	String[] names = new String[nCols];
		
		/* I only want to see important messages on screen while solving */
        problem.setVerbose(LpSolve.IMPORTANT);
        
        
        /* Now let lpsolve calculate a solution */
        ret = problem.solve();
        if(ret == LpSolve.OPTIMAL)
          ret = 0;
        else
          ret = 5;
        
        if(ret == 0) {
            /* a solution is calculated, now lets get some results */

            /* objective value */
            System.out.println("Objective value: " + problem.getObjective());

            /* variable values */
            problem.getVariables(row);            
            for(int j = 0; j < nCols; j++) names[j] = problem.getColName(j + 1);

            for(int j = 0; j < nCols; j++) {
            	System.out.println(names[j] + ": " + row[j]);
            };
            
            /* we are done now */
        }
        
        /* clean up such that all used memory by lpsolve is freed */
        if(problem.getLp() != 0)
        	problem.deleteLp();
        
        System.out.println("Return :  " + ret);
        
		
		return 0;
	}	
	
}
