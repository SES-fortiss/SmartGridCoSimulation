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

	// FIXME - this method is doing two independent tasks, 
	private void workWithResults(double[] optSolution, String[] names, double[] lambda, double[] lambdaCO2) {
		
		System.out.println("LAMBDA last Entry = " + lambdaCO2[lambdaCO2.length-nStepsMPC-1]);
		/** TASK ONE - creation of optResult Map (the MPC set-points) */
		
		
		/* Buffers to calculate additional values with efficiencies */
		ArrayList<String> additionalEfficiencyNames_tmp = null;
		ArrayList<Double> additionalEfficiencyValues_tmp = null;
		
		if (singleBuildingMessage != null) {
			additionalEfficiencyNames_tmp = milpSolHandler.createNamesForCorrEfficiency(singleBuildingMessage, names);
			additionalEfficiencyValues_tmp = milpSolHandler.createValuesForCorrEfficiency(singleBuildingMessage, names, optSolution);
			
		} else if (multipleBuildingMessages != null) {
			additionalEfficiencyNames_tmp = milpSolHandler.createNamesForCorrEfficiency(multipleBuildingMessages, names);
			additionalEfficiencyValues_tmp = milpSolHandler.createValuesForCorrEfficiency(multipleBuildingMessages, names, optSolution);
		}
		
		//System.out.println(MILPSolver.class + "  additionalEFFNames: " + additionalEfficiencyNames_tmp.toString());
		//System.out.println(MILPSolver.class + "  additionalEFFValues: " + additionalEfficiencyValues_tmp.toString());
		
		/* cast the ArrayList<String> and ArrayList<Double> to conventional Java arrays-[] */ 
		String[] additionalEfficiencyNames = new String[additionalEfficiencyNames_tmp.size()];
		additionalEfficiencyNames = additionalEfficiencyNames_tmp.toArray(additionalEfficiencyNames);
		
		double[] additionalEfficiencyValues = new double[additionalEfficiencyValues_tmp.size()];				
		for (int i = 0; i < additionalEfficiencyValues.length; i++) {
			additionalEfficiencyValues[i] = additionalEfficiencyValues_tmp.get(i);
		} // casting done here
		
		double[] extendedSolutionVector = HelperConcat.concatAlldoubles(
					optSolution, 
					additionalEfficiencyValues
				);
		
		String[] extendedNames = HelperConcat.concatAllObjects(
					names, 
					additionalEfficiencyNames
				);
		
		for (int i = 0; i < extendedNames.length / nStepsMPC; i++) {
			double[] values = new double[nStepsMPC];

			for (int j = 0; j < values.length; j++) {
				values[j] = extendedSolutionVector[i * nStepsMPC + j];
			}

			String str = extendedNames[i * nStepsMPC].replace("_T0", "");

			optResult.resultMap.put(str, values);
		}

		// Memory is cleaned up in the child classes  
		
		
		/** TASK TWO - creation of result vectors for CURRENT TIME STEP for planning tool */

		double buildingCostPerTimestep = 0;
		double buildingCO2PerTimestep = 0;
		buildingCostPerTimestep = milpSolHandler.calculateTimeStepCosts(optSolution, lambda);
		buildingCO2PerTimestep = milpSolHandler.calculateTimeStepCosts(optSolution, lambdaCO2);
		
		buildingStepCostsMILP[currentTimeStep] = buildingCostPerTimestep;
		buildingStepCO2MILP[currentTimeStep] = buildingCO2PerTimestep;
		
		double costTotal = 0;
		double CO2Total = 0;

		for (int i = 0; i < buildingStepCostsMILP.length; i++) {
			costTotal += buildingStepCostsMILP[i];
			CO2Total += buildingStepCO2MILP[i];
		}

		/** Creation of the two result vectors, one with name, one with values **/
		String[] timeStep = { Strings.timeStep };
		double[] currentStep = { currentTimeStep };
		
		String[] energyPricesNames = { 
					Strings.elecBuyingPriceAndUnit, 
					Strings.elecSellingPriceAndUnit,
					Strings.heatBuyingPriceAndUnit 
				};
		
		double[] currentEnergyPrices = { 
					energyPrices.getElecBuyingPrice(currentTimeStep),
					energyPrices.getElecSellingPrice(currentTimeStep),
					energyPrices.getHeatBuyingPrice(currentTimeStep) 
				};
		
		String[] totalCosts = { Strings.totalCostAndUnit };
		double[] totalCostsEUR = { costTotal };
		
		String[] co2emissions = { Strings.co2EmissionsAndUnit };
		double[] totalCO2emissions = { CO2Total };
		
		String[] currentOptVectorNames = milpSolHandler.getVectorNamesForThisTimeStep(names, nStepsMPC);
		double[] currentOptVector = milpSolHandler.getSolutionForThisTimeStep(optSolution, nStepsMPC);
		
		System.out.println(MILPSolver.class + " additionalEfficiencyNames: " + Arrays.toString(additionalEfficiencyNames));
		System.out.println(MILPSolver.class + " additionalEfficiencyValues: " + Arrays.toString(additionalEfficiencyValues));
		
		// filter the right names
		int[] selectedIndices = milpSolHandler.getIndicesByTO(additionalEfficiencyNames, nStepsMPC); 
		String[] currentEfficiencyNames = new String[selectedIndices.length];
		double[] currentEfficiencyValues = new double[selectedIndices.length];
		
		for (int i = 0; i < selectedIndices.length; i++) {
			currentEfficiencyNames[i] = additionalEfficiencyNames[selectedIndices[i]].replace("_T0", "");
			currentEfficiencyValues[i] = additionalEfficiencyValues[selectedIndices[i]];
		}

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
			BuildingMessageHandler buildingMessageHandler = new BuildingMessageHandler();
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

		String[] namesResult_this_TimeStep = HelperConcat.concatAllObjects(
				timeStep, 
				currentDemandNames, 
				currentOptVectorNames, 				
				currentEfficiencyNames,				
				currentSOCNames, 
				currentStorageEnergyContentNames, 
				energyPricesNames, 
				totalCosts, 
				co2emissions);
		
		double[] vectorResult_this_TimeStep = HelperConcat.concatAlldoubles(
				currentStep, 
				currentDemand, 
				currentOptVector,				
				currentEfficiencyValues,				
				currentSOC,
				currentStorageEnergyContent, 
				currentEnergyPrices, 
				totalCostsEUR, 
				totalCO2emissions);

		// FIXME - check if the "ToolUsage.SERVER" part has to be adapted to the changes above as well.
		int nrOfBuildings = 1;
		if (singleBuildingMessage == null) {
			nrOfBuildings =  multipleBuildingMessages.size();
		}
		
		if (topologyController.getToolUsage() == ToolUsage.SERVER) {
			ConnectionDB.addResults(topologyController.getOptimizationHierarchy(), currentTimeStep, namesResult_this_TimeStep, vectorResult_this_TimeStep , nrOfBuildings);
		}		

		// Format results vector for printing
		String[] vectorResultStr = new String[vectorResult_this_TimeStep.length];
		DecimalFormat df = new DecimalFormat("0,00", new DecimalFormatSymbols(Locale.GERMAN));
		for (int i = 1; i < vectorResultStr.length; i++) {
			vectorResultStr[i] = df.format(vectorResult_this_TimeStep[i]);
		}
		
		// Save
		buildingsSolutionPerTimeStepMILP[currentTimeStep] = vectorResult_this_TimeStep;

		String saveString = topologyController.getSimulationName() + "/MPC" + topologyConfig.getNrStepsMPC() + "_MILP/";
		saveString += actorName + "_MPC" + nStepsMPC + Strings.milpSolutionFileSuffix;
		if (currentTimeStep == (topologyConfig.getNrOfIterations() - 1)) {
			milpSolHandler.exportMatrix(buildingsSolutionPerTimeStepMILP, saveString, namesResult_this_TimeStep);
		}

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
