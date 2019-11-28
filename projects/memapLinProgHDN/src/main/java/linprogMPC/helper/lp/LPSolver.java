package linprogMPC.helper.lp;

import java.util.Arrays;

import akka.systemActors.GlobalTime;
import linprogMPC.MILPTopology;
import linprogMPC.helper.EnergyPrices;
import linprogMPC.helper.HelperConcat;
import linprogMPC.helper.SolutionHandler;
import linprogMPC.messages.BuildingMessage;
import linprogMPC.messages.OptimizationResultMessage;

public class LPSolver {
	
	static EnergyPrices energyPrices = new EnergyPrices(); // is only used once.
	
	BuildingMessage buildingMessage;
	int nStepsMPC = 0;
	SolutionHandler solHandler;
	double[] buildingsTotalCosts;
	double[] buildingsTotalCO2;
	int actualTimeStep;
	double[][] buildingsSolutionPerTimeStep;
	String actorName;
	OptimizationResultMessage optResult;
	
	public LPSolver(
			BuildingMessage buildingMessage, 
			int nStepsMPC, 
			SolutionHandler solHandler, 
			double[] buildingsTotalCosts, 
			double[] buildingsTotalCO2, 
			int actualTimeStep, 
			double[][] buildingsSolutionPerTimeStep, 
			String actorName, 
			OptimizationResultMessage optResult) {
		this.buildingMessage = buildingMessage;
		this.nStepsMPC = nStepsMPC;
		this.solHandler = solHandler;
		this.buildingsTotalCosts = buildingsTotalCosts;
		this.buildingsTotalCO2 = buildingsTotalCO2;
		this.actualTimeStep = actualTimeStep;
		this.buildingsSolutionPerTimeStep = buildingsSolutionPerTimeStep;
		this.actorName = actorName;
		this.optResult = optResult;
	}

	public void solveLPOptProblem() {
		
		LPOptimizationProblem problem = null;
		try {
			// ******* LP Optimierung ********************************
			LPMatrixBuildup mb = new LPMatrixBuildup();
			problem = mb.singleBuilding(buildingMessage);
			LPOptimizationStarter os = new LPOptimizationStarter();
			double[] optSolution = os.runLinProg(problem);
			
			// ******** Ermittlung der Kosten *********************
			double buildingCostPerTimestep = 0;
			double buildingCO2PerTimestep = 0;
			buildingCostPerTimestep = solHandler.calculateTimeStepCosts(optSolution, problem.lambda);
			buildingCO2PerTimestep = solHandler.calculateTimeStepCosts(optSolution, problem.lambdaCO2);
			buildingsTotalCosts[GlobalTime.getCurrentTimeStep()] = buildingCostPerTimestep;
			buildingsTotalCO2[GlobalTime.getCurrentTimeStep()] = buildingCO2PerTimestep;

			// ******** Erstellung des Ergebnisvektors *********************
			double[] currentStep = {actualTimeStep};
			double[] currentOptVector = solHandler.getSolutionForThisTimeStep(optSolution, nStepsMPC);
			double[] currentDemand = solHandler.getDemandForThisTimestep(problem.b_eq, nStepsMPC);
			double[] currentSOC = solHandler.getCurrentSOC(buildingMessage.storageList);
			double[] currentCost = {buildingCostPerTimestep};
			double[] currentCO2 = {buildingCO2PerTimestep};
			
			double[] currentPosDemand = solHandler.getPositiveDemandForThisTimestep(problem, nStepsMPC);
			double[] currentEffOptVector = solHandler.getEffSolutionForThisTimeStep(optSolution, problem.etas, nStepsMPC);
			
			double[] electricalPrice = {EnergyPrices.getElectricityPriceInEuro(actualTimeStep)};			
			//double[] vectorAll = HelperConcat.concatAlldoubles(currentStep, currentDemand, currentOptVector, currentSOC, currentCost, electricalPrice);
			double[] vectorAll = HelperConcat.concatAlldoubles(currentStep, currentDemand, currentOptVector, currentSOC, currentCost, currentCO2, electricalPrice, currentPosDemand, currentEffOptVector);
			
			String[] timeStep = {"timeStep"};
			String[] currentNamesPartly = solHandler.getNamesForThisTimeStep(problem.namesUB, nStepsMPC);
			String[] currentEffNames= solHandler.getEffNamesForThisTimeStep(problem.namesUB, nStepsMPC);
			String[] demandStrings = {"demandHeat", "demandElectricity"};
			String[] posDemandStrings = {"positiveDemandHeat", "positiveDemandHeatTotal", "positiveDemandElectricity"}; 
			String[] storageNames = solHandler.getNamesForSOC(buildingMessage.storageList);
			String[] costName = {"Cost"};
			String[] CO2Name = {"CO2"};
			String[] priceName = {"Price"};
			
			String[] namesAll = HelperConcat.concatAllObjects(timeStep, demandStrings, currentNamesPartly, storageNames, costName, CO2Name, priceName, posDemandStrings, currentEffNames);
						
			//System.out.println(this.actorName + " " + Arrays.toString(namesAll));
			//System.out.println(this.actorName + " " + Arrays.toString(vectorAll));
			
			System.out.println("LP: " + this.actorName + " " + Arrays.toString(currentNamesPartly));
			System.out.println("LP: " + this.actorName + " " + Arrays.toString(currentOptVector));
			
			//********* Speichern
			
			buildingsSolutionPerTimeStep[actualTimeStep] = vectorAll;
			
			String saveString = MILPTopology.simulationName + "MPC"+MILPTopology.N_STEPS_MPC+"/";
			saveString += actorName+"MPC"+nStepsMPC+"Solutions.csv";
			if (GlobalTime.getCurrentTimeStep() == (MILPTopology.NR_OF_ITERATIONS-1)) {					
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


}
