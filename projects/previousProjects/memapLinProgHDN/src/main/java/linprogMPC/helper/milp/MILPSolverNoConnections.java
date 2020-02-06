package linprogMPC.helper.milp;

import java.util.Arrays;

import akka.systemActors.GlobalTime;
import linprogMPC.ConfigurationMEMAP;
import linprogMPC.ConfigurationMEMAP.MEMAPLogging;
import linprogMPC.MILPTopology;
import linprogMPC.helper.EnergyPrices;
import linprogMPC.helper.HelperConcat;
import linprogMPC.helper.SolutionHandler;
import linprogMPC.messages.BuildingMessage;
import linprogMPC.messages.OptimizationResultMessage;
import lpsolve.LpSolve;
import lpsolve.LpSolveException;

/**
 * This class creates the MILP Optimization Problem and solves it.
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

	public MILPSolverNoConnections(BuildingMessage buildingMessage, int nStepsMPC)  {
		this.buildingMessage = buildingMessage;
		this.nStepsMPC = nStepsMPC;		
		this.logging = ConfigurationMEMAP.chosenMEMAPLogging;
	}
	
	public MILPSolverNoConnections(BuildingMessage buildingMessage2, int nStepsMPC2, SolutionHandler milpSolHandler,
			double[] buildingStepCostsMILP, double[] buildingStepCO2MILP, int actualTimeStep,
			double[][] buildingsSolutionPerTimeStepMILP2, String actorName, OptimizationResultMessage optResult) {
		this(buildingMessage2,nStepsMPC2);
		this.buildingStepCostsMILP = buildingStepCostsMILP;
		this.buildingStepCO2MILP = buildingStepCO2MILP;
		this.buildingsSolutionPerTimeStepMILP = buildingsSolutionPerTimeStepMILP2;
		this.timeStepIndex = actualTimeStep;
		this.milpSolHandler = milpSolHandler;
		this.actorName = actorName; 
		this.optResult = optResult;
	}

	/**  
	 * Note, the difficulty is that all goes into one big matrix. Therefore, it needs to be carefully, to keep it modular. 
	 */
	public LpSolve createModel() throws LpSolveException {
		// 0) find out the number of individual contributers.		
		int numberControllableProducers = buildingMessage.getNrOfControllableProducers();
		int numberVolatileProducers = buildingMessage.getNrOfVolatileProducers();
		int numberCouplers = buildingMessage.getNrOfCouplers();
		int numberStorages = buildingMessage.getNrOfStorages();		
		
		// **** DESIGN DECISIONS ****
		// + Controllable have booleans + linear value for production
		// + Volatile have only linear values for production
		// + Couplers have boolean + linear for production
		// + Storages have two linear values for production
		// + E-market is linear
		
		/* this represents the x vector*/
		nCols = nStepsMPC * ( (numberControllableProducers*2) + 
				+ (numberVolatileProducers) + (numberCouplers * 2) + (numberStorages*2) + (2) ); 		
	 	
	 	/* Create an empty model  */
	 	LpSolve problem = LpSolve.makeLp(0, nCols);
        if(problem.getLp() == 0) return null; /* couldn't construct a new model... */
                        
		/**********************************************
		 *              BUILD Matrices
		 **********************************************/
        
        mp = new MILPProblemNoConnections(nStepsMPC, nCols);
        
        // 1) create model and include all names 
        problem = mp.createNames(problem, buildingMessage);
        
        if (logging == ConfigurationMEMAP.MEMAPLogging.ALL) {
        	
            String[] names = new String[nCols+1];
            for (int i = 0; i < names.length; i++) {
            	names[i] = problem.getColName(i);
    		}
        	
            System.out.println("*****************");
            System.out.println("******MILP*******");
            System.out.println("*****************");
            System.out.println("nCols: " + nCols);
            System.out.println("Colnames: " + Arrays.toString(names));
		}
        
		// 2) add the demand constraints (equality constraints)
        problem = mp.createDemandConstraints(problem, buildingMessage);
        
        if (logging == ConfigurationMEMAP.MEMAPLogging.ALL) {
        	double [] demand = buildingMessage.getCombinedDemandVector();
        	System.out.println("Demand:  " + Arrays.toString(demand) + "    List size: " + buildingMessage.demandList.size());
        }
        
        if (logging == ConfigurationMEMAP.MEMAPLogging.ALL || logging == ConfigurationMEMAP.MEMAPLogging.FILES) problem.writeLp("MILP_MEMAP_DEMAND.lp");
        
		// 3) add the inequality constraints (component boundaries)
    	problem = mp.createComponentBoundaries(problem, buildingMessage);
    	if (logging == ConfigurationMEMAP.MEMAPLogging.ALL || logging == ConfigurationMEMAP.MEMAPLogging.FILES) problem.writeLp("MILP_MEMAP_Boundaries.lp");    
		
		// 4) soc inequalitiy constraints.    	
    	problem = mp.createSOCBoundaries(problem, buildingMessage);
    	if (logging == ConfigurationMEMAP.MEMAPLogging.ALL || logging == ConfigurationMEMAP.MEMAPLogging.FILES) problem.writeLp("MILP_MEMAP_SOC_Boundaries.lp");

        problem.setAddRowmode(false); /* rowmode should be turned off again when done building the model */
        
		// 5) Set objective function    	
    	problem = mp.createObjectiveFunction(problem, buildingMessage);    	
    	
    	if (logging == ConfigurationMEMAP.MEMAPLogging.ALL || logging == ConfigurationMEMAP.MEMAPLogging.FILES) {
    		problem.writeLp("MILP_MEMAP_FINAL.lp");
    		System.out.println("MILP_MEMAP_FINAL.lp written");
    	}
    	
    	this.problem = problem;
    	return problem;
	}

	public int solveMILP() throws LpSolveException {
		
		int result;	
		
        problem.setVerbose(LpSolve.IMPORTANT); // only important messages                
        result = problem.solve();
        
        if(result == LpSolve.OPTIMAL) result = 0;
        else result = 5;
        
        
	 	double[] optSolution = new double[nCols];
	 	String[] names = new String[nCols];
        
	 	
	 	
        if(result == 0) {
            problem.getVariables(optSolution);
            for(int j = 0; j < nCols; j++) names[j] = problem.getColName(j + 1);

            // ONLY FOR LOGGING
            if (logging == ConfigurationMEMAP.MEMAPLogging.ALL) {
            	for(int j = 0; j < nCols; j++) {
                	System.out.println(names[j] + ": " + optSolution[j]);
                };
			}
            /* we are done now */
        }
        
		// ******** Ermittlung der Kosten *********************       
        
		double[] lambda = mp.getLambdaEUR(buildingMessage);
		double[] lambdaCO2 = mp.getLambdaCO2(buildingMessage);	
		
		double buildingCostPerTimestep = 0;
		double buildingCO2PerTimestep = 0;
		buildingCostPerTimestep = milpSolHandler.calculateTimeStepCosts(optSolution, lambda);
		buildingCO2PerTimestep = milpSolHandler.calculateTimeStepCosts(optSolution, lambdaCO2); 
		buildingStepCostsMILP[timeStepIndex] = buildingCostPerTimestep;
		buildingStepCO2MILP[GlobalTime.getCurrentTimeStep()] = buildingCO2PerTimestep;
		
		// ******** Erstellung des Ergebnisvektors *********************
		
		double[] currentStep = {timeStepIndex};
		double[] currentOptVector = milpSolHandler.getSolutionForThisTimeStep(optSolution, nStepsMPC);
		double[] currentDemand = milpSolHandler.getDemandForThisTimestep(buildingMessage.getCombinedDemandVector(), nStepsMPC);		
		double[] currentSOC = milpSolHandler.getCurrentSOC(buildingMessage.storageList);
		double[] currentCost = {buildingCostPerTimestep};
		double[] currentCO2 = {buildingCO2PerTimestep};
		double[] electricalPrice = {EnergyPrices.getElectricityPriceInEuro(timeStepIndex)};
		
		//double[] vectorAll = HelperConcat.concatAlldoubles(currentStep, currentDemand, currentOptVector, currentSOC, currentCost, currentCO2, electricalPrice, currentPosDemand, currentEffOptVector);
		
		String[] timeStep = {"timeStep"};
		String[] currentNamesPartly = milpSolHandler.getNamesForThisTimeStep(names, nStepsMPC);
		//String[] currentEffNames= milpSolHandler.getEffNamesForThisTimeStep(names, nStepsMPC);
		String[] demandStrings = {"demandHeat", "demandElectricity"};
		//String[] posDemandStrings = {"positiveDemandHeat", "positiveDemandHeatTotal", "positiveDemandElectricity"}; 
		String[] storageNames = milpSolHandler.getNamesForSOC(buildingMessage.storageList);
		String[] costName = {"Cost"};
		String[] CO2Name = {"CO2"};
		String[] priceName = {"EURPrice"};
		
		//String[] namesAll = HelperConcat.concatAllObjects(timeStep, demandStrings, currentNamesPartly, storageNames, costName, CO2Name, priceName, posDemandStrings, currentEffNames);
		String[] namesResult = HelperConcat.concatAllObjects(timeStep, demandStrings, currentNamesPartly, storageNames, costName, CO2Name, priceName);
		double[] vectorResult = HelperConcat.concatAlldoubles(currentStep, currentDemand, currentOptVector, currentSOC, currentCost, currentCO2, electricalPrice);						
		
		buildingsSolutionPerTimeStepMILP[timeStepIndex] = vectorResult;
		
		System.out.println("MILP: "+ this.actorName + " Names: " + Arrays.toString(namesResult));
		System.out.println("MILP: "+ this.actorName + " Result: " + Arrays.toString(vectorResult));
		
		
		
		if (true) {
			//if (!MILPTopology.MEMAP_ON) {
			String saveString = MILPTopology.simulationName + "MPC"+MILPTopology.N_STEPS_MPC+"/";
			saveString += actorName+"MPC_MILP"+nStepsMPC+"Solutions.csv";
			if (GlobalTime.getCurrentTimeStep() == (MILPTopology.NR_OF_ITERATIONS-1)) {					
				milpSolHandler.exportMatrixWithHeader(buildingsSolutionPerTimeStepMILP, saveString, namesResult);
			}
		}
		
		// ================= RequestContentToSend ==================					
		for (int i = 0; i < names.length/nStepsMPC; i++) {
			double[] values = new double[nStepsMPC];
			
			for (int j = 0; j < values.length; j++) {
				values[j] = optSolution[i*nStepsMPC + j];
			}
			
			String str = names[i*nStepsMPC];			
			String str2 = str.substring(0, str.indexOf("_"));
			
			optResult.resultMap.put(str2, values);
		}
		
		
		/* clean up such that all used memory by lpsolve is freed */
        if(problem.getLp() != 0) problem.deleteLp();       
		
		return result;
	}	
	
}

