package memap.helper.milp;

import static memap.main.ConfigurationMEMAP.chosenMEMAPLogging;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

import akka.systemActors.GlobalTime;
import lpsolve.LpSolve;
import lpsolve.LpSolveException;
import memap.helper.HelperConcat;
import memap.helper.SolutionHandler;
import memap.main.TopologyConfig;
import memap.main.ConfigurationMEMAP.MEMAPLogging;
import memap.messages.BuildingMessage;
import memap.messages.BuildingMessageHandler;
import memap.messages.OptimizationResultMessage;

public class MILPSolver {
	
	
	protected LpSolve problem = null;
	
	protected int nStepsMPC = 0;
	protected int nCols = 0;

	// to work with solutions
	protected SolutionHandler milpSolHandler;
	protected double[] buildingStepCostsMILP;
	protected double[] buildingStepCO2MILP;
	protected double[][] buildingsSolutionPerTimeStepMILP;
	
	protected String actorName;
	protected OptimizationResultMessage optResult;
	protected int timeStepIndex = 0;
	
	private BuildingMessage localBuildingMessage;
	private ArrayList<BuildingMessage> localBuildingMessages = new ArrayList<>();
	
	public MILPSolver(int nStepsMPC, SolutionHandler milpSolHandler, double[] buildingsTotalCostsMILP,
			double[] buildingsTotalCO2MILP, int actualTimeStep, double[][] buildingsSolutionPerTimeStepMILP,
			String actorName, OptimizationResultMessage optResult) {
		
		this.nStepsMPC = nStepsMPC;
		this.buildingStepCostsMILP = buildingsTotalCostsMILP;
		this.buildingStepCO2MILP = buildingsTotalCO2MILP;
		this.buildingsSolutionPerTimeStepMILP = buildingsSolutionPerTimeStepMILP;
		this.timeStepIndex = actualTimeStep;
		this.milpSolHandler = milpSolHandler;
		this.actorName = actorName;
		this.optResult = optResult;
		
		setDLLLibrariesPath();		
	}

	public void printNames() throws LpSolveException {
				
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
	
	protected void solveMILPinternal(double[] optSolution, String[] names) throws LpSolveException {
		problem.setVerbose(LpSolve.IMPORTANT); // only important messages
		int result = problem.solve();
		
		if (result == LpSolve.OPTIMAL) {
			result = 0;
			
			problem.getVariables(optSolution);
			for (int j = 0; j < nCols; j++)
				names[j] = problem.getColName(j + 1);

			// ONLY FOR LOGGING
			if (chosenMEMAPLogging == MEMAPLogging.ALL) {
				for (int j = 0; j < nCols; j++) {
					System.out.println(names[j] + ": " + optSolution[j]);
				}
			}			
		} else {
			result = 5;
			System.err.println("No solution found. Resuming execution, but wihtout a solution");
			System.exit(1);
			// TODO Add code to account for the other 14 solver status values
			// TODO maybe switch to linear solver instead?
		}
	}
	
	protected void workWithResults(double[] optSolution, String[] names, double[] lambda, double[] lambdaCO2, BuildingMessage buildingMessage) {
		this.localBuildingMessage = buildingMessage;
		this.localBuildingMessages = null;
		workWithResults(optSolution, names, lambda, lambdaCO2);
	}
	
	protected void workWithResults(double[] optSolution, String[] names, double[] lambda, double[] lambdaCO2, ArrayList<BuildingMessage> buildingMessages) {
		this.localBuildingMessage = null;
		this.localBuildingMessages = buildingMessages;
		workWithResults(optSolution, names, lambda, lambdaCO2);
	}
	
	private void workWithResults(double[] optSolution, String[] names, double[] lambda, double[] lambdaCO2) {
		
		BuildingMessageHandler buildingMessageHandler = new BuildingMessageHandler();	
		
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
		double[] currentOptVector = milpSolHandler.getSolutionForThisTimeStep(optSolution, nStepsMPC);		
		double[] currentEnergyPrice = { TopologyConfig.energyPrices.getElectricityPriceInEuro(timeStepIndex) };		
		double[] totalCostsEUR = { costTotal };
		double[] totalCO2emissions = { CO2Total };				

		String[] timeStep = { "Time step" };
		String[] currentOptVectorNames = milpSolHandler.getVectorNamesForThisTimeStep(names, nStepsMPC);		
		String[] energyPrice = { "Energy price [EUR]" };		
		String[] totalCosts = { "Total costs [EUR]" };
		String[] co2emissions = { "CO2 emissions [kg CO2/kWh]"};
		
		double[] currentDemand = null;
		double[] currentSOC = null; 
		String[] currentSOCNames = null;		
		String[] currentDemandNames = null;
		if (localBuildingMessage != null) {
			currentDemand = milpSolHandler.getDemandForThisTimestep(localBuildingMessage.getCombinedDemandVector(),nStepsMPC);
			currentSOC = milpSolHandler.getCurrentSOC(localBuildingMessage.storageList);
			currentSOCNames = milpSolHandler.getNamesForSOC(localBuildingMessage.storageList);
			currentDemandNames = milpSolHandler.getNamesForDemand();
		} else {
			
			double[] demandVector = buildingMessageHandler.getCombinedDemandVector(localBuildingMessages, nStepsMPC);
			currentDemand = milpSolHandler.getDemandForThisTimestep(demandVector, nStepsMPC);
			currentSOC = milpSolHandler.getCurrentSOCs(localBuildingMessages);
			
			currentDemandNames = milpSolHandler.getNamesForDemand(localBuildingMessages, nStepsMPC);
			currentSOCNames = milpSolHandler.getNamesForSOCs(localBuildingMessages);
		}
		

		String[] namesResult = HelperConcat.concatAllObjects(timeStep, currentDemandNames, currentOptVectorNames, currentSOCNames, energyPrice,
				totalCosts, co2emissions);
		double[] vectorResult = HelperConcat.concatAlldoubles(currentStep, currentDemand, currentOptVector, currentSOC, currentEnergyPrice,
				totalCostsEUR, totalCO2emissions);

		// Format results vector for printing
		String[] vectorResultStr = new String[vectorResult.length];
		DecimalFormat df = new DecimalFormat("0,00", new DecimalFormatSymbols(Locale.GERMAN));
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
			// as this might be required for controllable gens and couplers
			String str = names[i * nStepsMPC];
			String str2 = str.substring(0, str.indexOf("_"));

			optResult.resultMap.put(str2, values);
		}

		// Clean up such that all used memory by lp-solve is freed
		if (problem.getLp() != 0) problem.deleteLp();
		
	}
	
	/** The following is currently disabled, but should remain
	 *  for documentation if the *.dlls are necessary 
	 */
	protected void setDLLLibrariesPath() {
		/** NOTE this is a reflection hack to set the right path for executing the optimizer */
		/** Found online https://stackoverflow.com/questions/32638404/add-java-library-path-to-java-manifest */
		/** AND here: https://stackoverflow.com/questions/15961483/setting-djava-library-path-programmatically-or-alternatives */
		/** AND here: http://stackoverflow.com/a/24988095 */
		
		/** NOTE we deactivated this, since the *.dll are now directly shipped with the tool.
		 * Maybe we need this later, but for now this is ok as it is.
		 * 
		
		String location = System.getProperty("user.dir") + File.separator + "tmp";
		System.out.println("Setting java libraries to: " + location);	
		
		try {
			Field usrPathsField = ClassLoader.class.getDeclaredField("usr_paths");
		    usrPathsField.setAccessible(true);
	
		    String[] paths = (String[]) usrPathsField.get(null);
		    
		  	for (String path : paths)
		        if (path.equals(location))
		            return;
	
		    String[] newPaths = new String[paths.length + 1];
		    newPaths[0] = location;
		    for (int i = 1; i < newPaths.length; i++) {
				newPaths[i] = paths[i-1];
			}
		    
		    usrPathsField.set(null, newPaths);
		    paths = (String[]) usrPathsField.get(null);
		    
		    String tmp = "";
		    for (String string : paths) {
				tmp += string + ";\n";
			}
		    System.out.println("current paths " + tmp);
		    System.out.println("other way: " + System.getProperty("java.library.path"));
		    
		    System.setProperty( "java.library.path", location );
		    Field fieldSysPath = ClassLoader.class.getDeclaredField( "sys_paths" );
		    fieldSysPath.setAccessible( true );
		    fieldSysPath.set( null, null );
		    
		    System.out.println("other way after adaptation: " + System.getProperty("java.library.path"));
		    
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		*/	
	}
}