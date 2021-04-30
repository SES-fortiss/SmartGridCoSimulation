package memap.helper.milp;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

import lpsolve.LpSolve;
import lpsolve.LpSolveException;
import memap.controller.TopologyController;
import memap.helper.EnergyPrices;
import memap.helper.HelperConcat;
import memap.helper.MEMAPLogging;
import memap.helper.SolutionHandler;
import memap.main.SimulationProgress;
import memap.main.Status;
import memap.helper.configurationOptions.ToolUsage;
import memap.main.TopologyConfig;
import memap.media.Strings;
import memap.messages.BuildingMessage;
import memap.messages.BuildingMessageHandler;
import memap.messages.OptimizationResultMessage;
import memap.messages.planning.ConnectionDB;
import simulation.SimulationStarter;

public class MILPSolver {
	/** Reference to topologyController ancestor */
	protected TopologyController topologyController;
	/** Reference to topology configuration */
	protected TopologyConfig topologyConfig = TopologyConfig.getInstance();
	/** Reference to energy prices */
	protected EnergyPrices energyPrices = EnergyPrices.getInstance();
	/** Time step for which the solver is created */
	protected int currentTimeStep;

	protected LpSolve problem = null;

	protected int nStepsMPC;
	protected int nCols = 0;

	// to work with solutions
	protected SolutionHandler milpSolHandler;
	protected double[] buildingStepCostsMILP;
	protected double[] buildingStepCO2MILP;
	protected double[][] buildingsSolutionPerTimeStepMILP;

	protected String actorName;
	protected OptimizationResultMessage optResult;
	private BuildingMessage singleBuildingMessage;
	private ArrayList<BuildingMessage> multipleBuildingMessages = new ArrayList<>();

	public MILPSolver(TopologyController topologyController, int currentTimeStep, SolutionHandler milpSolHandler,
			double[] buildingsTotalCostsMILP, double[] buildingsTotalCO2MILP,
			double[][] buildingsSolutionPerTimeStepMILP, String actorName, OptimizationResultMessage optResult) {

		this.topologyController = topologyController;
		this.nStepsMPC = topologyConfig.getNrStepsMPC();
		this.buildingStepCostsMILP = buildingsTotalCostsMILP;
		this.buildingStepCO2MILP = buildingsTotalCO2MILP;
		this.buildingsSolutionPerTimeStepMILP = buildingsSolutionPerTimeStepMILP;
		this.currentTimeStep = currentTimeStep;
		this.milpSolHandler = milpSolHandler;
		this.actorName = actorName;
		this.optResult = optResult;

		setDLLLibrariesPath();
	}

	public void printNames() throws LpSolveException {

		int nCols2 = problem.getNorigColumns();
		String[] names = new String[nCols2 + 1];
		for (int i = 0; i < names.length; i++) {
			names[i] = problem.getOrigcolName(i);
		}
		
		int nRows = problem.getNorigRows();
		String[] rowNames = new String[nRows + 1];
		for (int j = 0; j < rowNames.length; j++) {
			rowNames[j] = problem.getOrigrowName(j);
		}
		

		System.out.println("*****************");
		System.out.println("***** MILP ******");
		System.out.println("*****************");
		System.out.println("nCols2: " + nCols2);
		System.out.println("Colnames: " + Arrays.toString(names));
		System.out.println("*****************");
		System.out.println("nRows: " + nRows);
		System.out.println("Rownames: " + Arrays.toString(rowNames));

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
			if (topologyController.getLogging() == MEMAPLogging.ALL) {
				for (int j = 0; j < nCols; j++) {
					System.out.println(names[j] + ": " + optSolution[j]);
				}
			}
		} else {
			result = 5;
			String error = getClass().getName() + ": No solution found. Resuming execution without a solution";
			if (topologyController.getToolUsage().equals(ToolUsage.SERVER)) {
				System.out.println(error);
				SimulationStarter.actorSystemRefStatic.terminate();
				System.exit(1);
			} else {
				SimulationProgress.getInstance().setStatus(Status.ERROR, error);
			}
			// TODO Add code to account for the other 14 solver status values. maybe switch
			// to linear solver instead?
			// TODO Add some UI warning. When this error takes place the results window does
			// not appear.
		}
	}

	protected void workWithResults(double[] optSolution, String[] names, double[] lambda, double[] lambdaCO2,
			BuildingMessage buildingMessage) {
		this.singleBuildingMessage = buildingMessage;
		this.multipleBuildingMessages = null;
		workWithResults(optSolution, names, lambda, lambdaCO2);
	}

	protected void workWithResults(double[] optSolution, String[] names, double[] lambda, double[] lambdaCO2,
			ArrayList<BuildingMessage> buildingMessages) {
		this.singleBuildingMessage = null;
		this.multipleBuildingMessages = buildingMessages;
		workWithResults(optSolution, names, lambda, lambdaCO2);
	}

	private void workWithResults(double[] optSolution, String[] names, double[] lambda, double[] lambdaCO2) {

		BuildingMessageHandler buildingMessageHandler = new BuildingMessageHandler();
		double buildingCostPerTimestep = 0;
		double buildingCO2PerTimestep = 0;
		buildingCostPerTimestep = milpSolHandler.calculateTimeStepCosts(optSolution, lambda);
		buildingCO2PerTimestep = milpSolHandler.calculateTimeStepCosts(optSolution, lambdaCO2);
		buildingStepCostsMILP[currentTimeStep] = buildingCostPerTimestep;
		buildingStepCO2MILP[currentTimeStep] = buildingCO2PerTimestep;

		// to calculate the total costs --> what does that say?
		
		// System.out.println("buildingCostPerTimestep: " + buildingCostPerTimestep);
		
		// is that the total costs of the planned schedule?
		// is that the cost
		
		double costTotal = 0;
		double CO2Total = 0;

		for (int i = 0; i < buildingStepCostsMILP.length; i++) {
			costTotal += buildingStepCostsMILP[i];
			CO2Total += buildingStepCO2MILP[i];
		}
		
		// System.out.println("costTotal: " + costTotal);

		// Creation of the result vector
		double[] currentStep = { currentTimeStep };
		
		// FIXME. Currently there is a bug, because singleBuildingMessage == null, if connections are present! This has to be considered.
		double[] currentOptVector = null;
		if (singleBuildingMessage != null) { // Jan's version 
			currentOptVector = milpSolHandler.getEffSolutionForThisTimeStep(singleBuildingMessage, names, optSolution, nStepsMPC);
		}
		
		if (singleBuildingMessage == null) { // previous solution
			currentOptVector = milpSolHandler.getSolutionForThisTimeStep(optSolution, nStepsMPC);
		}
		
		double[] currentEnergyPrices = { energyPrices.getElecBuyingPrice(currentTimeStep),
				energyPrices.getElecSellingPrice(currentTimeStep),
				energyPrices.getHeatBuyingPrice(currentTimeStep) };
		double[] totalCostsEUR = { costTotal };
		double[] totalCO2emissions = { CO2Total };

		String[] timeStep = { Strings.timeStep };
		String[] currentOptVectorNames = milpSolHandler.getVectorNamesForThisTimeStep(names, nStepsMPC);
		String[] energyPricesNames = { Strings.elecBuyingPriceAndUnit, Strings.elecSellingPriceAndUnit,
				Strings.heatBuyingPriceAndUnit };
		String[] totalCosts = { Strings.totalCostAndUnit };
		String[] co2emissions = { Strings.co2EmissionsAndUnit };

		String[] currentDemandNames = null;
		double[] currentDemand = null;
		
		String[] currentSOCNames = null;
		double[] currentSOC = null;
		
		String[] currentStorageEnergyContentNames = null;
		double[] currentStorageEnergyContent = null;

		if (singleBuildingMessage != null) {
			// Without connections
			currentDemand = milpSolHandler.getDemandForThisTimestep(singleBuildingMessage.getCombinedDemandVector(),
					nStepsMPC); 			
			currentSOC = milpSolHandler.getCurrentSOC(singleBuildingMessage.storageList);
			currentStorageEnergyContent = milpSolHandler.getCurrentSOCEnergy(singleBuildingMessage.storageList);
			
			currentDemandNames = milpSolHandler.getNamesForDemandSingleBuilding();
			currentSOCNames = milpSolHandler.getNamesForSOC(singleBuildingMessage.storageList);
			currentStorageEnergyContentNames = milpSolHandler.getNamesForSOCEnergy(singleBuildingMessage.storageList);
		} else {
			// With connections
			double[] demandVector = buildingMessageHandler.getCombinedDemandVector(multipleBuildingMessages, nStepsMPC);
			currentDemand = milpSolHandler.getDemandForThisTimestep(demandVector, nStepsMPC);			
			currentSOC = milpSolHandler.getCurrentSOCs(multipleBuildingMessages);
			currentStorageEnergyContent = milpSolHandler.getCurrentSOCEnergyMB(multipleBuildingMessages);
			
			currentDemandNames = milpSolHandler.getNamesForDemand(multipleBuildingMessages, nStepsMPC);
			currentSOCNames = milpSolHandler.getNamesForSOCs(multipleBuildingMessages);
			currentStorageEnergyContentNames = milpSolHandler.getNamesForSOCEnergyMB(multipleBuildingMessages);
			
			//Small modification to calculate the aggregated demand of the buildings.
			double[] resultWithTotalHeatDemand = new double[currentDemand.length+1];			
			for (int i = 0; i < currentDemand.length -1; i++) {
				resultWithTotalHeatDemand[0] += currentDemand[i];
				resultWithTotalHeatDemand[i+1] = currentDemand[i];
			}			
			resultWithTotalHeatDemand[currentDemand.length] = currentDemand[currentDemand.length-1];			
			currentDemand = resultWithTotalHeatDemand;
		}

		String[] namesResult = HelperConcat.concatAllObjects(timeStep, currentDemandNames, currentOptVectorNames,
				currentSOCNames, currentStorageEnergyContentNames, energyPricesNames, totalCosts, co2emissions);
		double[] vectorResult = HelperConcat.concatAlldoubles(currentStep, currentDemand, currentOptVector, currentSOC,
				currentStorageEnergyContent, currentEnergyPrices, totalCostsEUR, totalCO2emissions);

		
		int nrOfBuildings = 1;
		if (singleBuildingMessage == null) {
			nrOfBuildings =  multipleBuildingMessages.size();
		}
		
		if (topologyController.getToolUsage() == ToolUsage.SERVER) {
			ConnectionDB.addResults(topologyController.getOptimizationHierarchy(),currentTimeStep, namesResult, currentStep, currentDemand, currentOptVector, currentSOC,
				currentEnergyPrices, totalCostsEUR, totalCO2emissions, nrOfBuildings);
		}
		

		// Format results vector for printing
		String[] vectorResultStr = new String[vectorResult.length];
		DecimalFormat df = new DecimalFormat("0,00", new DecimalFormatSymbols(Locale.GERMAN));
		for (int i = 1; i < vectorResultStr.length; i++) {
			vectorResultStr[i] = df.format(vectorResult[i]);
		}

		//System.out.println("MILP: " + this.actorName + " Names: " + Arrays.toString(namesResult));
		//System.out.println("MILP: " + this.actorName + " Result: " + Arrays.toString(vectorResult));
		
		
		// Save
		buildingsSolutionPerTimeStepMILP[currentTimeStep] = vectorResult;

		String saveString = topologyController.getSimulationName() + "/MPC" + topologyConfig.getNrStepsMPC() + "_MILP/";
		saveString += actorName + "_MPC" + nStepsMPC + Strings.milpSolutionFileSuffix;
		if (currentTimeStep == (topologyConfig.getNrOfIterations() - 1)) {
			milpSolHandler.exportMatrix(buildingsSolutionPerTimeStepMILP, saveString, namesResult);
		}

		/* FIXME this is workaround due to merge of the branches from server team and planning tool team
		 * it would be good to get a harmonic solution, where the solution is corrected by efficiencies in both cases, 
		 * no matter if it is a solution of the problem with connections, or without. 
		 */
		double[] optSolutionEffcorrected = null;
		if (singleBuildingMessage != null) {
			optSolutionEffcorrected = milpSolHandler.getEffSolutionForThisTimeStep(singleBuildingMessage, names, optSolution, 1);
		}
		if (singleBuildingMessage == null) {
			optSolutionEffcorrected = optSolution;
		}
		
		
		
		// Request content to send
		for (int i = 0; i < names.length / nStepsMPC; i++) {
			double[] values = new double[nStepsMPC];

			for (int j = 0; j < values.length; j++) {
				values[j] = optSolutionEffcorrected[i * nStepsMPC + j];
			}

			// TODO : Improve this work around
			// as this might be required for controllable gens and couplers
			String str = names[i * nStepsMPC].replace("_T0", "");
//			String str2 = str.substring(0, str.indexOf("_"));

			optResult.resultMap.put(str, values);
		}

		// Memory is cleaned up in the child classes 

	}

	/**
	 * The following is currently disabled, but should remain for documentation if
	 * the *.dlls are necessary
	 */
	protected void setDLLLibrariesPath() {
		/**
		 * NOTE this is a reflection hack to set the right path for executing the
		 * optimizer
		 */
		/**
		 * Found online
		 * https://stackoverflow.com/questions/32638404/add-java-library-path-to-java-manifest
		 */
		/**
		 * AND here:
		 * https://stackoverflow.com/questions/15961483/setting-djava-library-path-programmatically-or-alternatives
		 */
		/** AND here: http://stackoverflow.com/a/24988095 */

		/**
		 * NOTE we deactivated this, since the *.dll are now directly shipped with the
		 * tool. Maybe we need this later, but for now this is ok as it is.
		 * 
		 * 
		 * 
		 * String location = System.getProperty("user.dir") + File.separator + "res";
		 * System.out.println("Setting java libraries to: " + location);
		 * 
		 * try { Field usrPathsField = ClassLoader.class.getDeclaredField("usr_paths");
		 * usrPathsField.setAccessible(true);
		 * 
		 * String[] paths = (String[]) usrPathsField.get(null);
		 * 
		 * for (String path : paths) if (path.equals(location)) return;
		 * 
		 * String[] newPaths = new String[paths.length + 1]; newPaths[0] = location; for
		 * (int i = 1; i < newPaths.length; i++) { newPaths[i] = paths[i-1]; }
		 * 
		 * usrPathsField.set(null, newPaths); paths = (String[])
		 * usrPathsField.get(null);
		 * 
		 * String tmp = ""; for (String string : paths) { tmp += string + ";\n"; }
		 * System.out.println("current paths " + tmp); System.out.println("other way: "
		 * + System.getProperty("java.library.path"));
		 * 
		 * 
		 * // second way System.setProperty( "java.library.path", location ); Field
		 * fieldSysPath = ClassLoader.class.getDeclaredField( "sys_paths" );
		 * fieldSysPath.setAccessible( true ); fieldSysPath.set( null, null );
		 * 
		 * System.out.println("other way after adaptation: " +
		 * System.getProperty("java.library.path"));
		 * 
		 * System.load("/usr/lib/liblpsolve55.so");
		 * 
		 * 
		 * } catch (Exception e) { e.printStackTrace(); }
		 * 
		 */
	}
}
