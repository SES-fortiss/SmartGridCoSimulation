package memap.helper.milp;

import java.util.Arrays;
import lpsolve.LpSolve;
import lpsolve.LpSolveException;
import memap.controller.TopologyController;
import memap.helper.configurationOptions.OptimizationCriteria;
import memap.helper.configurationOptions.ToolUsage;
import memap.messages.BuildingMessage;
import memap.messages.extension.NetworkType;
import memap.messages.planning.CouplerMessage;
import memap.messages.planning.DemandMessage;
import memap.messages.planning.ProducerMessage;
import memap.messages.planning.StorageMessage;
import memap.messages.planning.VolatileProducerMessage;

/**
 * This class is responsible to modify the problem of the MILP solver. It is
 * very similar to MILPProblemWithConnections. It would be good to merge these 2
 * classes, but this is left for later. Be careful, when modifying those two
 * classes.
 */
public class MILPProblemNoConnections extends MILPProblem {

	public MILPProblemNoConnections(TopologyController topologyController, int currentTimeStep, int nStepsMPC,
			int nCols) {
		super(topologyController, currentTimeStep, nStepsMPC, nCols);
	}

	public LpSolve createNames(LpSolve problem, BuildingMessage buildingMessage) throws LpSolveException {

		MILPIndexHelper mihelper = new MILPIndexHelper(nStepsMPC);

		for (ProducerMessage producerMessage : buildingMessage.controllableProducerList) {
			MILPHelper.addControllableToProblem(producerMessage, problem, mihelper);
			mihelper.controllableHandled++;
		}

		for (ProducerMessage producerMessage : buildingMessage.volatileProducerList) {
			MILPHelper.addVolatileToProblem(producerMessage, problem, mihelper);
			mihelper.volatileHandled++;
		}

		for (CouplerMessage couplerMessage : buildingMessage.couplerList) {
			MILPHelper.addCouplerToProblem(couplerMessage, problem, mihelper);
			mihelper.couplerHandled++;
		}

		for (StorageMessage storageMessage : buildingMessage.storageList) {
			MILPHelper.addStorageToProblem(storageMessage, problem, mihelper);
			mihelper.storageHandled++;
		}

		MILPHelper.addMarkets(problem, mihelper);

		updateLambdaEURbuilding(buildingMessage, 0);
		updateLambdaEURMarket();

		updateLambdaCO2building(buildingMessage, 0);
		updateLambdaCO2Market();

		return problem;
	}

	public LpSolve createDemandConstraints(LpSolve problem, BuildingMessage buildingMessage) throws LpSolveException {
		double[] demand = buildingMessage.getCombinedDemandVector();

		/* first HEAT components */
		for (int i = 0; i < demand.length / 2; i++) {

			int controllableHandled = 0;
			int volatileHandled = 0;
			int couplerHandled = 0;
			int storageHandled = 0;

			double[] rowHEAT = new double[nCols + 1];

			for (ProducerMessage pm : buildingMessage.controllableProducerList) {
				int index = i + 1 + nStepsMPC
						* ((controllableHandled * 2) + volatileHandled + (couplerHandled * 2) + (storageHandled * 2));
				if (pm.networkType == NetworkType.HEAT)
					rowHEAT[index] = -pm.efficiency;
				controllableHandled++;
			}

			for (ProducerMessage pm : buildingMessage.volatileProducerList) {
				int index = i + 1 + nStepsMPC
						* ((controllableHandled * 2) + volatileHandled + (couplerHandled * 2) + (storageHandled * 2));
				if (pm.networkType == NetworkType.HEAT)
					rowHEAT[index] = -1;
				volatileHandled++;
			}

			for (CouplerMessage cm : buildingMessage.couplerList) {
				int index = i + 1 + nStepsMPC
						* ((controllableHandled * 2) + volatileHandled + (couplerHandled * 2) + (storageHandled * 2));
				rowHEAT[index] = -cm.efficiencyHeat;
				couplerHandled++;
			}

			for (StorageMessage sm : buildingMessage.storageList) {

				int index = i + 1 + nStepsMPC
						* ((controllableHandled * 2) + volatileHandled + (couplerHandled * 2) + (storageHandled * 2));
				if (sm.networkType == NetworkType.HEAT) {
					rowHEAT[index] = -1;
					rowHEAT[index + nStepsMPC] = 1;
				}
				storageHandled++;
			}

			problem.addConstraint(rowHEAT, LpSolve.EQ, demand[i]);
		}

		/* second ELEC componentes */
		int countTimeStep = 0;
		for (int i = demand.length / 2; i < demand.length; i++) {
			int controllableHandled = 0;
			int volatileHandled = 0;
			int couplerHandled = 0;
			int storageHandled = 0;

			double[] rowELEC = new double[nCols + 1];

			for (ProducerMessage pm : buildingMessage.controllableProducerList) {
				int index = countTimeStep + 1 + nStepsMPC
						* ((controllableHandled * 2) + volatileHandled + (couplerHandled * 2) + (storageHandled * 2));
				if (pm.networkType == NetworkType.ELECTRICITY)
					rowELEC[index] = -pm.efficiency;
				controllableHandled++;
			}

			for (ProducerMessage pm : buildingMessage.volatileProducerList) {
				int index = countTimeStep + 1 + nStepsMPC
						* ((controllableHandled * 2) + volatileHandled + (couplerHandled * 2) + (storageHandled * 2));
				if (pm.networkType == NetworkType.ELECTRICITY)
					rowELEC[index] = -1;
				volatileHandled++;
			}

			for (CouplerMessage cm : buildingMessage.couplerList) {
				int index = countTimeStep + 1 + nStepsMPC
						* ((controllableHandled * 2) + volatileHandled + (couplerHandled * 2) + (storageHandled * 2));
				rowELEC[index] = -cm.efficiencyElec;
				couplerHandled++;
			}

			for (StorageMessage sm : buildingMessage.storageList) {

				int index = countTimeStep + 1 + nStepsMPC
						* ((controllableHandled * 2) + volatileHandled + (couplerHandled * 2) + (storageHandled * 2));
				if (sm.networkType == NetworkType.ELECTRICITY) {
					rowELEC[index] = -1;
					rowELEC[index + nStepsMPC] = 1;
				}
				storageHandled++;
			}

			// ADD Markets (at last position)

			int index = countTimeStep + 1 + nStepsMPC
					* ((controllableHandled * 2) + volatileHandled + (couplerHandled * 2) + (storageHandled * 2));

			rowELEC[index] = -1;
			rowELEC[index + nStepsMPC] = 1;

			problem.addConstraint(rowELEC, LpSolve.EQ, demand[i]);

			// System.out.println("Adding markets --> rowELEC: " + Arrays.toString(rowELEC)
			// + " EQ: " + demand[i]);
			countTimeStep++;
		}

		return problem;
	}

	public LpSolve createComponentBoundaries(LpSolve problem, BuildingMessage buildingMessage) throws LpSolveException {

		for (int i = 0; i < nStepsMPC; i++) {
			MILPIndexHelper ih = new MILPIndexHelper(nStepsMPC);

			for (ProducerMessage pm : buildingMessage.controllableProducerList) {
				int addon = nStepsMPC * ((ih.controllableHandled * 2) + ih.volatileHandled + (ih.couplerHandled * 2)
						+ (ih.storageHandled * 2));
				int index = i + 1 + addon;

				// MAX Constraints, for both el. and heat
				double[] row = new double[nCols + 1];
				row[index] = pm.efficiency;
				row[index + nStepsMPC] = pm.maxPower;
				problem.addConstraint(row, LpSolve.LE, pm.maxPower);
				// System.out.println("Adding max constraint CP --> row: " +
				// Arrays.toString(row) + " <= " + pm.maxPower);

				// MIN Constraints, for both el. and heat
				double[] row2 = new double[nCols + 1];
				row2[index] = -pm.efficiency;
				row2[index + nStepsMPC] = -pm.minPower;
				problem.addConstraint(row2, LpSolve.LE, -pm.minPower);
				// System.out.println("Adding min constraint CP --> row2: " +
				// Arrays.toString(row2) + " <= -" + pm.minPower);

				ih.controllableHandled++;
			}

			for (ProducerMessage pm : buildingMessage.volatileProducerList) {
				int index = i + 1 + nStepsMPC * ((ih.controllableHandled * 2) + ih.volatileHandled
						+ (ih.couplerHandled * 2) + (ih.storageHandled * 2));

				VolatileProducerMessage vpm = (VolatileProducerMessage) pm;

				// MAX Constraints, for both el. and heat
				double[] row = new double[nCols + 1];
				row[index] = 1;
				problem.addConstraint(row, LpSolve.LE, vpm.forecast[i]);
				// System.out.println("Adding max constraint VP --> row: " +
				// Arrays.toString(row) + " <= " + vpm.forecast[i]);

				ih.volatileHandled++;
			}

			for (CouplerMessage cm : buildingMessage.couplerList) {
				int index = i + 1 + nStepsMPC * ((ih.controllableHandled * 2) + ih.volatileHandled
						+ (ih.couplerHandled * 2) + (ih.storageHandled * 2));

				// MAX Constraints for heat
				double[] row = new double[nCols + 1];
				row[index] = cm.efficiencyHeat;
				row[index + nStepsMPC] = cm.maxPower;
				problem.addConstraint(row, LpSolve.LE, cm.maxPower);
				// System.out.println("Adding max constraint coupler --> row: " +
				// Arrays.toString(row) + " <= " + cm.installedPower);

				// MIN Constraints for heat
				double[] row2 = new double[nCols + 1];
				row2[index] = -cm.efficiencyHeat;
				row2[index + nStepsMPC] = -cm.minPower;
				problem.addConstraint(row2, LpSolve.LE, -cm.minPower);
				// System.out.println("Adding min constraint coupler --> row3: " +
				// Arrays.toString(row2) + " <= -" + cm.minPower);

				ih.couplerHandled++;
			}

			for (StorageMessage sm : buildingMessage.storageList) {
				int index = i + 1 + nStepsMPC * ((ih.controllableHandled * 2) + ih.volatileHandled
						+ (ih.couplerHandled * 2) + (ih.storageHandled * 2));

				// MAX Constraints, for both el. and heat
				double[] row = new double[nCols + 1];
				row[index] = 1;
				problem.addConstraint(row, LpSolve.LE, sm.maxDischarge);
				// System.out.println("Adding max discharging ST --> row: " +
				// Arrays.toString(row) + " <= " + sm.maxDischarge);

				// MIN Constraints, for both el. and heat
				double[] row2 = new double[nCols + 1];
				row2[index + nStepsMPC] = 1;
				problem.addConstraint(row2, LpSolve.LE, sm.maxLoad);
				// System.out.println("Adding max charging --> row2: " + Arrays.toString(row2) +
				// " <= " + sm.maxLoad);

				ih.storageHandled++;
			}

		}
		return problem;

	}

	public LpSolve createSOCBoundaries(LpSolve problem, BuildingMessage buildingMessage) throws LpSolveException {

		int controllableHandled = buildingMessage.getNrOfControllableProducers();
		int volatileHandled = buildingMessage.getNrOfVolatileProducers();
		int couplerHandled = buildingMessage.getNrOfCouplers();
		int storageHandled = 0;

		double delta_time_factor = 24.0 / topologyConfig.getTimeStepsPerDay(); // = 0.25 fuer 96 Schritte /Tag

		for (StorageMessage sm : buildingMessage.storageList) {

			double SOC_perc = sm.stateOfCharge;
			double standbyLosses = sm.storageLosses;
			
			// check and enforce that SOC is between 0 and 1, due to numerical issues.
			if (SOC_perc >= 1) {
				SOC_perc = 1;
			}
			if (SOC_perc <= 0) {
				SOC_perc = 0;
			}		
			
			// New for SOC within 0 and 1 and standby loss consideration:
			// helper parameters, only depend on time step length and storage parameters
			double alpha = 1 - standbyLosses * delta_time_factor; // Units [-] 
			double beta_to = delta_time_factor/sm.capacity * sm.efficiencyCharge; // Units [h/kWh]
			double beta_fm = delta_time_factor/(sm.capacity * sm.efficiencyDischarge); // Units [h/kWh]				

            // create new SOC constraints. They are not based on energy/capacity but solely on SOC, i.e. between 0 and 1
			int index = 1 + nStepsMPC * ((controllableHandled * 2)  + volatileHandled + (couplerHandled*2)+ (storageHandled*2)  );
            for (int i = 0; i < nStepsMPC; i++) {
            	            	            	
            	double[] rowCHARGE = new double[nCols+1];
    			double[] rowDISCHARGE = new double[nCols+1];
    			
    			for (int k = 0; k <= i; k++) {
    				// First add the factor for the discharge decision variable (x_fm)
    				rowCHARGE[index + k] = - beta_fm * Math.pow(alpha, i-k);
    				rowDISCHARGE[index + k] = beta_fm * Math.pow(alpha, i-k);
    	        	
    				// Now add the factor for the charging decision variable (x_to):
    				rowCHARGE[index + k + nStepsMPC] = beta_to * Math.pow(alpha, i-k);
    				rowDISCHARGE[index + k + nStepsMPC] = - beta_to * Math.pow(alpha, i-k);
    			}
                
    			// Add the factor vectors to the problem as constraint:
    			problem.addConstraint(rowDISCHARGE, LpSolve.LE, (SOC_perc * Math.pow(alpha, i+1)));
    			problem.addConstraint(rowCHARGE, LpSolve.LE, (1-(SOC_perc * Math.pow(alpha, i+1))));
            }
            
			storageHandled++;
		}
		return problem;
	}

	public LpSolve createObjectiveFunction(LpSolve problem, BuildingMessage buildingMessage) throws LpSolveException {
		int[] colno = new int[nCols];
		double[] row = new double[nCols];

		int cts = currentTimeStep;
		int counter = 0;

		for (int i = 0; i < nStepsMPC; i++) {

			int controllableHandled = 0;
			int volatileHandled = 0;
			int couplerHandled = 0;
			int storageHandled = 0;

			for (ProducerMessage pm : buildingMessage.controllableProducerList) {
				int index = i + 1 + nStepsMPC
						* ((controllableHandled * 2) + volatileHandled + (couplerHandled * 2) + (storageHandled * 2));
				colno[counter] = index;
				
				if (topologyController.getOptimizationCriteria() == OptimizationCriteria.EUR) {
            		row[counter++] = pm.operationalCostEUR;
//            		System.out.println("CP-costs " + pm.operationalCostEUR + " written at counter " + (counter-1));
				}
            	
            	if (topologyController.getOptimizationCriteria() == OptimizationCriteria.CO2) {
            		row[counter++] = pm.operationalCostCO2;
            	}
            	
            	if (topologyController.getToolUsage() == ToolUsage.SERVER && pm.varOperationalCostEUR != null) {
            		
            		// This part overwrites the previous costs if above condition is given
            		counter--;
            		// TODO: solve better
            		
            		if (topologyController.getOptimizationCriteria() == OptimizationCriteria.EUR) {
                		row[counter++] = pm.varOperationalCostEUR[i];
//                		System.out.println("CP-costs " + pm.varOperationalCostEUR[i] + " overwritten at counter " + (counter-1));
    				}
                	
                	if (topologyController.getOptimizationCriteria() == OptimizationCriteria.CO2) {
                		row[counter++] = pm.varOperationalCostEUR[i];
                	}	
            	}

				controllableHandled++;
			}

			for (ProducerMessage pm : buildingMessage.volatileProducerList) {
				int index = i + 1 + nStepsMPC
						* ((controllableHandled * 2) + volatileHandled + (couplerHandled * 2) + (storageHandled * 2));
				colno[counter] = index;
				
				if (topologyController.getOptimizationCriteria() == OptimizationCriteria.EUR) {
            		row[counter++] = pm.operationalCostEUR;
				}
            	
            	if (topologyController.getOptimizationCriteria() == OptimizationCriteria.CO2) {
            		row[counter++] = pm.operationalCostCO2;
            	}
            	
				volatileHandled++;
			}

			for (CouplerMessage cm : buildingMessage.couplerList) {
				int index = i + 1 + nStepsMPC
						* ((controllableHandled * 2) + volatileHandled + (couplerHandled * 2) + (storageHandled * 2));
				colno[counter] = index;
				
				if (topologyController.getOptimizationCriteria() == OptimizationCriteria.EUR) {
            		row[counter++] = cm.operationalCostEUR;
				}
            	
            	if (topologyController.getOptimizationCriteria() == OptimizationCriteria.CO2) {
            		row[counter++] = cm.operationalCostCO2;
            	}
            	
            	if (topologyController.getToolUsage() == ToolUsage.SERVER && cm.varOperationalCostEUR != null) {
            		
            		// This part overwrites the previous costs if above condition is given
            		counter = counter -1;
            		// TODO: solve better
            		
            		if (topologyController.getOptimizationCriteria() == OptimizationCriteria.EUR) {
                		row[counter++] = cm.varOperationalCostEUR[i];
    				}
                	
                	if (topologyController.getOptimizationCriteria() == OptimizationCriteria.CO2) {
                		row[counter++] = cm.varOperationalCostEUR[i];
                	}	
            	}
            	
				couplerHandled++;
			}

			for (StorageMessage sm : buildingMessage.storageList) {
				
				double chargingCosts = 0;
				double dischargingCosts = 0;
				
				if (topologyController.getOptimizationCriteria() == OptimizationCriteria.EUR) {
					dischargingCosts = sm.operationalCostEUR;
					chargingCosts = sm.operationalCostEUR;
            		
				}
            	
            	if (topologyController.getOptimizationCriteria() == OptimizationCriteria.CO2) {
            		dischargingCosts = sm.operationalCostCO2;
            		chargingCosts = -0.0001;  // TODO hardcoded heuristic as discussed in Github
            	}

				int index = i + 1 + nStepsMPC
						* ((controllableHandled * 2) + volatileHandled + (couplerHandled * 2) + (storageHandled * 2));
				colno[counter] = index;
				row[counter++] = dischargingCosts; // x_fm
				colno[counter] = index + nStepsMPC;
				row[counter++] = chargingCosts; // x_to
				storageHandled++;
			}
			
			// Check which House has the lowest buy-price for electricity:
        	double[] bestBuyPrice = new double[nStepsMPC];
        	Arrays.fill(bestBuyPrice, 100.0); // fill with 100 €/kWh
        	double[] bestSellPrice = new double[nStepsMPC];
        	Arrays.fill(bestSellPrice, 0.0); // fill with 0 €/kWh
        	
        	for (DemandMessage dm : buildingMessage.demandList) {		
        		if (dm.networkType == NetworkType.ELECTRICITY) {
        			
        			if (dm.varNetworkBuyCostEUR != null && dm.varNetworkBuyCostEUR[0] < bestBuyPrice[0])
        			bestBuyPrice = dm.varNetworkBuyCostEUR;
        			
        			if (dm.varNetworkSellCostEUR != null && dm.varNetworkSellCostEUR[0] > bestSellPrice[0])
            		bestSellPrice = dm.varNetworkSellCostEUR;
        		} 
        	}

			// buy
			int index = i + 1 + nStepsMPC
					* ((controllableHandled * 2) + volatileHandled + (couplerHandled * 2) + (storageHandled * 2));
			
			if (topologyController.getOptimizationCriteria() == OptimizationCriteria.EUR) {
        		// buy
            	colno[counter] = index;
            	row[counter++] = energyPrices.getElecBuyingPrice(cts+i);
            	// sell
            	colno[counter] = index+nStepsMPC;
            	row[counter++] = -energyPrices.getElecSellingPrice(cts+i);
			}
        	
        	if (topologyController.getOptimizationCriteria() == OptimizationCriteria.CO2) {
        		// buy
            	colno[counter] = index;
            	row[counter++] = energyPrices.getCO2EmissionFactor(cts+i);
            	// sell, no compensation for selling
            	colno[counter] = index+nStepsMPC;
            	row[counter++] = 0;
        	}
        	    	
    		if (topologyController.getToolUsage() == ToolUsage.SERVER) {
    			// This part overwrites the previous costs if above condition is given

    			if (topologyController.getOptimizationCriteria() == OptimizationCriteria.EUR) {
	    			// TODO: Better solution for this to avoid double code for server / planning
    				counter = counter - 2;
    				// buy
	            	colno[counter] = index;
	            	row[counter++] = bestBuyPrice[i];
	            	// sell
	            	colno[counter] = index+nStepsMPC;
	            	row[counter++] = -bestSellPrice[i];	
    			}  
    		
	    		if (topologyController.getOptimizationCriteria() == OptimizationCriteria.CO2) {
	    			// buy
	            	colno[counter] = index;
	            	row[counter++] = energyPrices.getCO2EmissionFactor(cts+i);
	            	// sell, no compensation for selling
	            	colno[counter] = index+nStepsMPC;
	            	row[counter++] = 0;
	    		}      		
    		}			
        		
		}

		/* set the objective in lpsolve */
		problem.setObjFnex(counter, row, colno);

		/* set the object direction to minimize */
		problem.setMinim();
		return problem;
	}

}