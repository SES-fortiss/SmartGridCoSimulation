package linprogMPC.helper.lp;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

import linprogMPC.ConfigurationMEMAP;
import linprogMPC.MILPTopology;
import linprogMPC.helper.EnergyPrices;
import linprogMPC.helper.HelperConcat;
import linprogMPC.helper.SolutionHandler;
import linprogMPC.messages.BuildingMessage;
import linprogMPC.messages.OptimizationResultMessage;

public class LPSolver {
		
	BuildingMessage buildingMessage;
	private ArrayList<BuildingMessage> buildingMessageList;
	
	int nStepsMPC = 0;
	SolutionHandler solHandler;
	double[] buildingsTotalCosts;
	double[] buildingsTotalCO2;
	int currentTimeStep;
	double[][] buildingsSolutionPerTimeStep;
	String actorName;
	OptimizationResultMessage optResult;
	
	public LPSolver(
			BuildingMessage buildingMessage, 
			int nStepsMPC, 
			SolutionHandler solHandler, 
			double[] totalEURVector, 
			double[] totalCO2Vector, 
			int actualTimeStep, 
			double[][] solutionPerTimeStep, 
			String actorName, 
			OptimizationResultMessage optResult) {
		this.buildingMessage = buildingMessage;
		this.nStepsMPC = nStepsMPC;
		this.solHandler = solHandler;
		this.buildingsTotalCosts = totalEURVector;
		this.buildingsTotalCO2 = totalCO2Vector;
		this.currentTimeStep = actualTimeStep;
		this.buildingsSolutionPerTimeStep = solutionPerTimeStep;
		this.actorName = actorName;
		this.optResult = optResult;
	}

	public void solveLPOptProblem() {
		
		LPOptimizationProblem problem = null;
		try {
			// ******* LP Optimierung ********************************
			LPMatrixBuildup mb = new LPMatrixBuildup();
			
			if (ConfigurationMEMAP.chosenOptimizer == ConfigurationMEMAP.Optimizer.LP) {
				problem = mb.singleBuilding(buildingMessage, currentTimeStep);
			}
			
			if (ConfigurationMEMAP.chosenOptimizer == ConfigurationMEMAP.Optimizer.LPwithConnections) {				
				if(buildingMessageList != null) {
					problem = mb.multipleBuildings(getBuildingMessageList(), currentTimeStep);
				} else {
					System.err.println(this.getClass() + ": trying to solve LPwithConnections, but buildingMessageListIsEmpty, will do it  without Connections" );					
					problem = mb.singleBuilding(buildingMessage, currentTimeStep);					
				}
			}			
			
			LPOptimizationStarter os = new LPOptimizationStarter();
			double[] optSolution = os.runLinProg(problem);
			
			// ******** Ermittlung der Kosten *********************
			double buildingCostPerTimestep = 0;
			double buildingCO2PerTimestep = 0;
			buildingCostPerTimestep = solHandler.calculateTimeStepCosts(optSolution, problem.lambda);
			buildingCO2PerTimestep = solHandler.calculateTimeStepCosts(optSolution, problem.lambdaCO2);
			buildingsTotalCosts[currentTimeStep] = buildingCostPerTimestep;
			buildingsTotalCO2[currentTimeStep] = buildingCO2PerTimestep;

			// ******** Erstellung des Ergebnisvektors *********************
			double[] currentStep = {currentTimeStep};
			double[] currentOptVector = solHandler.getSolutionForThisTimeStep(optSolution, nStepsMPC);
			double[] currentDemand = solHandler.getDemandForThisTimestep(problem.b_eq, nStepsMPC);
			double[] currentSOC = solHandler.getCurrentSOC(buildingMessage.storageList);
			double[] currentCost = {buildingCostPerTimestep};
			double[] currentCO2 = {buildingCO2PerTimestep};			
			double[] currentPosDemand = solHandler.getPositiveDemandForThisTimestep(problem, nStepsMPC);
			double[] currentEffOptVector = solHandler.getEffSolutionForThisTimeStep(optSolution, problem.etas, nStepsMPC);			
			double[] electricalPrice = {EnergyPrices.getElectricityPriceInEuro(currentTimeStep)};			

			//double[] vectorAll = HelperConcat.concatAlldoubles(currentStep, currentDemand, currentOptVector, currentSOC, currentCost, electricalPrice);
			double[] vectorAll = HelperConcat.concatAlldoubles(currentStep, currentDemand, currentOptVector, currentSOC, currentCost, currentCO2, electricalPrice, currentPosDemand, currentEffOptVector);
			
			String[] timeStep = {"timeStep"};
			String[] currentNamesPartly = solHandler.getNamesForThisTimeStep(problem.namesUB, nStepsMPC);
			String[] currentEffNames= solHandler.getEffNamesForThisTimeStep(problem.namesUB, nStepsMPC);
			String[] demandStrings = {"demandHeat", "demandElectricity"};
			String[] posDemandStrings = {"positiveDemandHeat", "positiveDemandHeatTotal", "positiveDemandElectricity"}; 
			String[] storageNames = solHandler.getNamesForSOC(buildingMessage.storageList);
			String[] costEUR = {"costEUR"};
			String[] costCO2 = {"costCO2"};
			String[] marketPrice = {"marketPrice"};
			
			String[] namesAll = HelperConcat.concatAllObjects(timeStep, demandStrings, currentNamesPartly, storageNames, costEUR, costCO2, marketPrice, posDemandStrings, currentEffNames);
									

			String[] vectorResultStr = new String[vectorAll.length];		
			DecimalFormat df = new DecimalFormat("0.000", new DecimalFormatSymbols(Locale.ENGLISH));
			
			for (int i = 0; i < vectorResultStr.length; i++) {
				vectorResultStr[i] = df.format(vectorAll[i]);
			}
			
			System.out.println("LP: "+ this.actorName + " Names: " + Arrays.toString(currentNamesPartly));		
			System.out.println("LP: "+ this.actorName + " Result: " + Arrays.toString(vectorResultStr));
			
			
			//********* Speichern
			
			buildingsSolutionPerTimeStep[currentTimeStep] = vectorAll;
			
			String saveString = MILPTopology.simulationName + "MPC"+MILPTopology.N_STEPS_MPC+"/";
			saveString += actorName+"MPC"+nStepsMPC+"Solutions.csv";
			if (currentTimeStep == (MILPTopology.NR_OF_ITERATIONS-1)) {					
				solHandler.exportMatrixWithHeader(buildingsSolutionPerTimeStep, saveString, namesAll);
			}
			
			
			// ================= RequestContentToSend ==================					
			for (int i = 0; i < optSolution.length/nStepsMPC; i++) {
				double[] result = new double[nStepsMPC];
				
				for (int j = 0; j < result.length; j++) {
					result[j] = optSolution[i*nStepsMPC + j];
				}
				
				String str = problem.namesUB[i*nStepsMPC];
				optResult.resultMap.put(str, result);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(actorName + " cannot solve the optimization");			
			System.out.println("names: " + Arrays.toString(problem.namesUB));
			System.out.println("b: " + Arrays.toString(problem.b_eq));
			System.out.println("ub: " + Arrays.toString(problem.x_ub));
			System.out.println("h: " + Arrays.toString(problem.h));
		}		
		
	}

	public ArrayList<BuildingMessage> getBuildingMessageList() {
		return buildingMessageList;
	}

	public void setBuildingMessageList(ArrayList<BuildingMessage> buildingMessageList) {
		//this.buildingMessage = null;
		this.buildingMessageList = buildingMessageList;
	}
}
