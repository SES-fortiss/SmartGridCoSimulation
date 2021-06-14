package linprogMPC.helper.milp;

import static linprogMPC.ConfigurationMEMAP.chosenMEMAPLogging;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

import akka.basicMessages.AnswerContent;
import akka.basicMessages.BasicAnswer;
import linprogMPC.ConfigurationMEMAP.MEMAPLogging;
import linprogMPC.MILPTopology;
import linprogMPC.helper.CO2profiles;
import linprogMPC.helper.EnergyPrices;
import linprogMPC.helper.HelperConcat;
import linprogMPC.helper.SolutionHandler;
import linprogMPC.messages.BuildingMessage;
import linprogMPC.messages.BuildingMessageHandler;
import linprogMPC.messages.OptimizationResultMessage;
import lpsolve.LpSolve;
import lpsolve.LpSolveException;

/**
 * Note, this class might have many clones from MILP with no connections
 * @author bytschkow
 *
 */
public class MILPSolverWithConnections {

	public MILPSolverWithConnections(ArrayList<BasicAnswer> answerListReceived, int nStepsMPC,
			SolutionHandler milpSolHandler, double[] buildingsTotalCostsMILP, double[] buildingsTotalCO2MILP,
			int actualTimeStep, double[][] buildingsSolutionPerTimeStepMILP, String actorName,
			OptimizationResultMessage optResult) {
		
		this(answerListReceived,nStepsMPC);
		this.buildingStepCostsMILP = buildingsTotalCostsMILP;
		this.buildingStepCO2MILP = buildingsTotalCO2MILP;
		this.buildingsSolutionPerTimeStepMILP = buildingsSolutionPerTimeStepMILP;
		this.currentTimeStep = actualTimeStep;
		this.milpSolHandler = milpSolHandler;
		this.actorName = actorName; 
		this.optResult = optResult;
	}	

	MILPProblemWithConnections mp;	
	ArrayList<BuildingMessage> buildingMessages = new ArrayList<>();
	BuildingMessageHandler buildingMessageHandler = new BuildingMessageHandler();
	
	int nStepsMPC = 0;
	int nCols = 0;
	LpSolve problem = null;

	SolutionHandler milpSolHandler;
	String actorName;
	OptimizationResultMessage optResult;
	
	// some long term values
	double[] buildingStepCostsMILP;
	double[] buildingStepCO2MILP;
	double[][] buildingsSolutionPerTimeStepMILP;
	int currentTimeStep = 0;	

	public MILPSolverWithConnections(ArrayList<BasicAnswer> answerListReceived, int nStepsMPC)  {
		this.nStepsMPC = nStepsMPC;		
		
		for (BasicAnswer basicAnswer : answerListReceived) {
			AnswerContent answerContent = basicAnswer.answerContent;
			if(answerContent instanceof BuildingMessage) {
				BuildingMessage bm = (BuildingMessage) answerContent;
				this.buildingMessages.add(bm);
			}
		}		
	}

	/**  
	 * Note, the difficulty is that all goes into one big matrix. Therefore, it needs to be carefully, to keep it modular. 
	 */
	public LpSolve createModel() throws LpSolveException {
		
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
		
		nCols = nStepsMPC * (
			(numberControllableProducers*2) + 
			(numberVolatileProducers) + 
			(numberCouplers * 2) + 
			(numberStorages*2) + 
			(nrOfConnections*2) + (2) );
	 	
	 	/* Create an empty model  */
	 	LpSolve problem = LpSolve.makeLp(0, nCols);
        if(problem.getLp() == 0) return null; /* couldn't construct a new model... */
                        
		/**********************************************
		 *              BUILD Matrices
		 **********************************************/
        
        mp = new MILPProblemWithConnections(nStepsMPC, nCols);
        
        // 1) create model and include all names 
        problem = mp.createNames(problem, buildingMessages);
        
        if (chosenMEMAPLogging == MEMAPLogging.ALL) {
        	
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
        problem = mp.createDemandConstraints(problem, buildingMessages);                
        
        if (chosenMEMAPLogging == MEMAPLogging.ALL || chosenMEMAPLogging == MEMAPLogging.FILES) {
        	problem.writeLp("MILP_MEMAP_DEMAND.lp");
        	System.out.println("MILP_MEMAP_DEMAND.lp - written");
        }
        
        
		// 3) add the inequality constraints (component boundaries)
    	problem = mp.createComponentBoundaries(problem, buildingMessages);
    	
    	if (chosenMEMAPLogging == MEMAPLogging.ALL || chosenMEMAPLogging == MEMAPLogging.FILES) {
    		problem.writeLp("MILP_MEMAP_Boundaries.lp");
    		System.out.println("MILP_MEMAP_Boundaries.lp - written");
    	}
		
    	
		// 4) soc inequalitiy constraints.    	
    	problem = mp.createSOCBoundaries(problem, buildingMessages);
    	
    	if (chosenMEMAPLogging == MEMAPLogging.ALL || chosenMEMAPLogging == MEMAPLogging.FILES) {
    		problem.writeLp("MILP_MEMAP_SOC_Boundaries.lp");
    		System.out.println("MILP_MEMAP_SOC_Boundaries.lp - written");
    	}

        problem.setAddRowmode(false); /* rowmode should be turned off again when done building the model */
        
        
		// 5) Set objective function    	
    	problem = mp.createObjectiveFunction(problem, buildingMessages, currentTimeStep);    	
    	
    	if (chosenMEMAPLogging == MEMAPLogging.ALL || chosenMEMAPLogging == MEMAPLogging.FILES) {
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
            if (chosenMEMAPLogging == MEMAPLogging.ALL) {
            	for(int j = 0; j < nCols; j++) {
                	System.out.println(names[j] + ": " + optSolution[j]);
                };
			}
            // we are done now
        }
        
		// clean up such that all used memory by lpsolve is freed
        if(problem.getLp() != 0) problem.deleteLp();      
        
		// ******** Ermittlung der Kosten *********************             
        
		double[] lambda = mp.getLambdaEUR(buildingMessages, currentTimeStep);		
		double[] lambdaCO2 = mp.getLambdaCO2(buildingMessages);	
		
		//System.out.println("****************MILP: *******************");
		
		double buildingCostPerTimestep = 0;
		double buildingCO2PerTimestep = 0;
		buildingCostPerTimestep = milpSolHandler.calculateTimeStepCosts(optSolution, lambda);
		buildingCO2PerTimestep = milpSolHandler.calculateTimeStepCosts(optSolution, lambdaCO2); 
		buildingStepCostsMILP[currentTimeStep] = buildingCostPerTimestep;
		buildingStepCO2MILP[currentTimeStep] = buildingCO2PerTimestep;
		
		// ******** Erstellung des Ergebnisvektors *********************
		
		double[] demandVector = buildingMessageHandler.getCombinedDemandVector(buildingMessages,nStepsMPC); 
		double[] socVector = buildingMessageHandler.getSOC(buildingMessages,nStepsMPC); 
		
		//System.out.println("demandVector: " + Arrays.toString(demandVector));

		double[] currentStep = {currentTimeStep};
		double[] optResultVector = milpSolHandler.getSolutionForThisTimeStep(optSolution, nStepsMPC);
		double[] currentDemand = milpSolHandler.getDemandForThisTimestep(demandVector, nStepsMPC);
		double[] currentSOC = socVector;
		double[] currentCost = {buildingCostPerTimestep};
		double[] currentCO2 = {buildingCO2PerTimestep};
		double[] electricalPrice = {EnergyPrices.getElectricityPriceInEuro(currentTimeStep)};
		double[] co2Price = {CO2profiles.getCO2emissions(currentTimeStep)};
		
		String[] timeStep = {"timeStep"};
		String[] optResultNames = milpSolHandler.getNamesForThisTimeStep(names, nStepsMPC);
		//String[] currentEffNames= milpSolHandler.getEffNamesForThisTimeStep(names, nStepsMPC);
		String[] demandStrings = buildingMessageHandler.getCombinedDemandNames(buildingMessages,nStepsMPC); 
		//String[] posDemandStrings = {"positiveDemandHeat", "positiveDemandHeatTotal", "positiveDemandElectricity"}; 
		String[] storageNames = buildingMessageHandler.getSOCNames(buildingMessages,nStepsMPC);
		String[] costEUR = {"costEUR"};
		String[] costCO2 = {"costCO2"};
		String[] marketEUR = {"marketPrice"};
		String[] marketCO2 = {"marketCO2"};
				
		String[] namesResult = HelperConcat.concatAllObjects(timeStep, demandStrings, optResultNames, storageNames, costEUR, costCO2, marketEUR, marketCO2);
		double[] vectorResult = HelperConcat.concatAlldoubles(currentStep, currentDemand, optResultVector, currentSOC, currentCost, currentCO2, electricalPrice, co2Price);
		
		//String[] namesResult = HelperConcat.concatAllObjects(currentNamesPartly);
		//double[] vectorResult = HelperConcat.concatAlldoubles(currentOptVector);
					
		buildingsSolutionPerTimeStepMILP[currentTimeStep] = vectorResult;
		String[] vectorResultStr = new String[vectorResult.length];		
		DecimalFormat df = new DecimalFormat("0.000", new DecimalFormatSymbols(Locale.ENGLISH));
		
		for (int i = 0; i < vectorResultStr.length; i++) {
			vectorResultStr[i] = df.format(vectorResult[i]);
		}
		
		System.out.println("MILP: "+ this.actorName + " Names: " + Arrays.toString(namesResult));		
		System.out.println("MILP: "+ this.actorName + " Result: " + Arrays.toString(vectorResultStr));

		/*************************
		 ****** Save results *****
		 *************************/
		
		String saveString = MILPTopology.simulationName + "MPC"+MILPTopology.N_STEPS_MPC+"/";
		saveString += actorName+"MPC_MILP"+nStepsMPC+"Solutions.csv";
		if (currentTimeStep == (MILPTopology.NR_OF_ITERATIONS-1)) {
			milpSolHandler.exportMatrixWithHeader(buildingsSolutionPerTimeStepMILP, saveString, namesResult);
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
		
		return result;
	}	
	


}
