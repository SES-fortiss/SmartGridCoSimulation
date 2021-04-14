package memap.helper.milp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import lpsolve.LpSolve;
import lpsolve.LpSolveException;
import memap.controller.TopologyController;
import memap.helper.CO2profiles;
import memap.helper.MEMAPLogging;
import memap.helper.configurationOptions.OptimizationCriteria;
import memap.messages.BuildingMessage;
import memap.messages.extension.NetworkType;
import memap.messages.planning.ConnectionMessage;
import memap.messages.planning.CouplerMessage;
import memap.messages.planning.ProducerMessage;
import memap.messages.planning.StorageMessage;
import memap.messages.planning.VolatileProducerMessage;

/**
 * This class is responsible to modify the problem of the MILP solver.
 * It is very similar to MILPProblemNoConnections.
 * It would be good to merge these 2 classes, but this is left for later.
 * Be carefull, when modifying those two classes. 
 */
public class MILPProblemWithConnections extends MILPProblem {
	
	HashMap<BuildingMessage, Integer> mapBuildingMessageToIndex;
	HashMap<ConnectionMessage, Integer> mapConnectionToIndex;
	
	public MILPProblemWithConnections(TopologyController topologyController, int currentTimeStep, int nStepsMPC, int nCols) {
		super(topologyController, currentTimeStep, nStepsMPC, nCols);
		mapBuildingMessageToIndex = new HashMap<BuildingMessage, Integer>();
		mapConnectionToIndex = new HashMap<ConnectionMessage, Integer>();
	}
	
	public LpSolve createNames(LpSolve problem, ArrayList<BuildingMessage> buildingMessages) throws LpSolveException {		
		
		MILPIndexHelper mihelper = new MILPIndexHelper(nStepsMPC);        
        ArrayList<ConnectionMessage> connections = new ArrayList<>();
        
        for (BuildingMessage bm : buildingMessages) {
        	for(ProducerMessage producerMessage : bm.controllableProducerList) {
        		MILPHelper.addControllableToProblem(producerMessage, problem, mihelper);
    			mihelper.controllableHandled++;
    		}
    		
    		for(ProducerMessage producerMessage : bm.volatileProducerList) {
    			MILPHelper.addVolatileToProblem(producerMessage, problem, mihelper);
    			mihelper.volatileHandled++;
    		}
    		
    		for(CouplerMessage couplerMessage : bm.couplerList) {
    			MILPHelper.addCouplerToProblem(couplerMessage, problem, mihelper);
    			mihelper.couplerHandled++;
    		}
    		
    		for(StorageMessage storageMessage : bm.storageList) {
    			MILPHelper.addStorageToProblem(storageMessage, problem, mihelper);
    			mihelper.storageHandled++;
    		}
    		
    		for (ConnectionMessage c : bm.connectionList) {
    			connections.add(c);
    		}
		}
        
        for(ConnectionMessage connectionMessage : connections) {
        	MILPHelper.addConnectionToProblem(connectionMessage, problem, mihelper);
        	mihelper.connectionHandled++;
		}
        
        MILPHelper.addMarkets(problem, mihelper);
        
		return problem;
	}	
	
	public LpSolve createDemandConstraints(LpSolve problem, ArrayList<BuildingMessage> buildingMessages) throws LpSolveException {		
		int numberOfBuildings = buildingMessages.size();
		
		double[] demandHEAT = new double[ nStepsMPC * numberOfBuildings];
		double[] demandELEC = new double[ nStepsMPC];
		
		ArrayList<ConnectionMessage> connections = new ArrayList<>();
		
		int totalCont = 0;
		int totalVol = 0;
		int totalCoup = 0;
		int totalStorage = 0;
		
		int b_counter = 0;	
		for (BuildingMessage bm : buildingMessages) {			
			double [] demand = bm.getCombinedDemandVector();						

			for (int i = 0; i < demand.length / 2; i++) {	
				demandHEAT[i + b_counter*nStepsMPC] = demand[i];
				demandELEC[i] += demand[i + nStepsMPC];
			}
			
			b_counter++;
			
			for (ConnectionMessage c : bm.connectionList) {
				connections.add(c);
			}
			
			totalCont += bm.getNrOfControllableProducers();
			totalVol += bm.getNrOfVolatileProducers();
			totalCoup += bm.getNrOfCouplers();
			totalStorage += bm.getNrOfStorages();
		}
		
        if (topologyController.getLogging() == MEMAPLogging.ALL) {        	
        	for (BuildingMessage bm : buildingMessages) {
        		double [] demand = bm.getCombinedDemandVector();
            	System.out.println("Demand of " + bm.name + ":  " + Arrays.toString(demand) + "    List size: " + bm.demandList.size());
			}        	
        	System.out.println("connections available: " + connections.size());
        }
		
		int c_counter = 0;
		for (ConnectionMessage connectionMessage : connections) {
			int index =  1 + nStepsMPC * ((totalCont * 2)  + totalVol + (totalCoup*2)+ (totalStorage*2) + (c_counter *2)  );			
			mapConnectionToIndex.put(connectionMessage, index);
			c_counter++;
		}
		
        
        /* first HEAT components */
		b_counter = 0;		
		
		int startIndex = 1;
		int startIndexTmp = startIndex;
		
    	for (BuildingMessage bm : buildingMessages) {
    		mapBuildingMessageToIndex.put(bm, startIndex);
    		
    		for (int i = 0; i < nStepsMPC; i++) {
    			
    			//System.out.println("Current Building: " + bm.name);
    			
    			int controllableHandled = 0;
                int volatileHandled = 0;
                int couplerHandled = 0;
                int storageHandled = 0;
    			
        		double[] rowHEAT = new double[nCols+1];
        		//System.out.println("HEAT contribution init --> rowHEAT: " + Arrays.toString(rowHEAT));
        		
        		for (ProducerMessage pm : bm.controllableProducerList) {        		
            		int index = startIndex + i + nStepsMPC * ((controllableHandled * 2)  + volatileHandled + (couplerHandled*2)+ (storageHandled*2));
        			if (pm.networkType == NetworkType.HEAT) rowHEAT[index] = -pm.efficiency;
            		controllableHandled++;
            		//System.out.println("HEAT contribution pm --> rowHEAT: " + Arrays.toString(rowHEAT));
    			}        		        	
        		
            	for (ProducerMessage pm : bm.volatileProducerList) {        		
            		int index = startIndex + i + nStepsMPC * ((controllableHandled * 2)  + volatileHandled + (couplerHandled*2)+ (storageHandled*2));    			
        			if (pm.networkType == NetworkType.HEAT) rowHEAT[index] = -1;
        			volatileHandled++;
        			//System.out.println("HEAT contribution vm --> rowHEAT: " + Arrays.toString(rowHEAT));
    			}
            	
            	
            	
            	for (CouplerMessage cm : bm.couplerList) {        		
            		int index = startIndex + i + nStepsMPC * ((controllableHandled * 2)  + volatileHandled + (couplerHandled*2)+ (storageHandled*2));
        			rowHEAT[index] = -cm.efficiencyHeat;
        			couplerHandled++;
        			//System.out.println("HEAT contribution cm --> rowHEAT: " + Arrays.toString(rowHEAT));
    			}
            	
            	
            	        	
            	for (StorageMessage sm : bm.storageList) {            		
            		int index = startIndex + i + nStepsMPC * ((controllableHandled * 2)  + volatileHandled + (couplerHandled*2)+ (storageHandled*2));        		
            		if (sm.networkType == NetworkType.HEAT) {
            			rowHEAT[index] = -1;
            			rowHEAT[index + nStepsMPC] = 1;
            		}
            		storageHandled++;
            		//System.out.println("HEAT contribution sm --> rowHEAT: " + Arrays.toString(rowHEAT));
    			}    	
            	
            	for (ConnectionMessage c : connections) {

            		if (bm.name.equals(c.connectedBuildingFrom)) {
            			int bla = mapConnectionToIndex.get(c)+i;            			
            			rowHEAT[bla] = 1;
            			rowHEAT[bla + nStepsMPC] = -c.efficiency;
            		}
            		
            		if (bm.name.equals(c.connectedBuildingTo)) {            			
            			int bla = mapConnectionToIndex.get(c)+i;            			            			
            			rowHEAT[bla] = -c.efficiency;
            			rowHEAT[bla + nStepsMPC] = 1;            			
            		}            		
            		//System.out.println("HEAT contribution conn --> rowHEAT: " + Arrays.toString(rowHEAT));            		
				}
            	
            	problem.addConstraint(rowHEAT, LpSolve.EQ, demandHEAT[i + b_counter*nStepsMPC]);
            	
            	if (topologyController.getLogging() == MEMAPLogging.ALL) {            	
            		System.out.println("Adding HEAT --> rowHEAT: " + Arrays.toString(rowHEAT) + " EQ: " + demandHEAT[i+b_counter*nStepsMPC]);
            	}
            	
            	startIndexTmp = startIndex + nStepsMPC * ((controllableHandled * 2)  + volatileHandled + (couplerHandled*2)+ (storageHandled*2));
			}
    		b_counter++;
    		startIndex = startIndexTmp;    		
		}
        
	 	/* second ELEC componentes, note they have no grid */
        for (int i = 0; i < demandELEC.length; i++) {         	
            double[] rowELEC = new double[nCols+1];
         	
            for (BuildingMessage bm : buildingMessages) {
            	
            	int controllableHandled = 0;
                int volatileHandled = 0;
                int couplerHandled = 0;        
                int storageHandled = 0; 
            	
            	int indexBuilding = mapBuildingMessageToIndex.get(bm);
	            
	         	for (ProducerMessage pm : bm.controllableProducerList) {        		
	         		int index = i + indexBuilding + nStepsMPC * ((controllableHandled * 2)  + volatileHandled + (couplerHandled*2)+ (storageHandled*2)  );
	     			if (pm.networkType == NetworkType.ELECTRICITY) rowELEC[index] = -pm.efficiency;
	         		controllableHandled++;
	 			}
	         	
	         	for (ProducerMessage pm : bm.volatileProducerList) {        		
	         		int index = i + indexBuilding + nStepsMPC * ((controllableHandled * 2)  + volatileHandled + (couplerHandled*2)+ (storageHandled*2)  );    			
	     			if (pm.networkType == NetworkType.ELECTRICITY) rowELEC[index] = -1;
	     			volatileHandled++;
	 			}
	         	
	         	for (CouplerMessage cm : bm.couplerList) {        		
	         		int index = i + indexBuilding + nStepsMPC * ((controllableHandled * 2)  + volatileHandled + (couplerHandled*2)+ (storageHandled*2)  );    			
	         		rowELEC[index] = -cm.efficiencyElec;
	     			couplerHandled++;
	 			}
	         	        	
	         	for (StorageMessage sm : bm.storageList) {         		
	         		int index = i + indexBuilding + nStepsMPC * ((controllableHandled * 2)  + volatileHandled + (couplerHandled*2)+ (storageHandled*2)  );        		
	        		if (sm.networkType == NetworkType.ELECTRICITY) {
	        			rowELEC[index] = -1;
	        			rowELEC[index + nStepsMPC] = 1;
	        		}
	         		storageHandled++;
	 			}
            }        	        	
        	// ADD Markets (at last position)        	
         	int index = rowELEC.length-2*nStepsMPC;        	
    	 	rowELEC[index+i] = -1;
        	rowELEC[index+i+nStepsMPC] = 1;
        	
        	problem.addConstraint(rowELEC, LpSolve.EQ, demandELEC[i]);
        	
        	if (topologyController.getLogging() == MEMAPLogging.ALL) {
        		System.out.println("Adding markets --> rowELEC: " + Arrays.toString(rowELEC) + " EQ: " + demandELEC[i]);
			}       	     	        	
		}
        
        for (BuildingMessage bm : buildingMessages) {			
            
			int indexBuilding = mapBuildingMessageToIndex.get(bm)-1;
			updateLambdaEURbuilding(bm, indexBuilding);
			updateLambdaCO2building(bm, indexBuilding);			
		}        
        updateLambdaEURMarket();
		updateLambdaCO2Market();
		
		return problem;
	}

	public LpSolve createComponentBoundaries(LpSolve problem, ArrayList<BuildingMessage> buildingMessages) throws LpSolveException {
		
	     for (int i = 0; i < nStepsMPC; i++) {

	    	for (BuildingMessage bm : buildingMessages) {
	            int controllableHandled = 0;
	            int volatileHandled = 0;
	            int couplerHandled = 0;        
	            int storageHandled = 0;
	            
	            int indexBuilding = mapBuildingMessageToIndex.get(bm);
	
	        	for (ProducerMessage pm : bm.controllableProducerList) {        		
	        		int index = i + indexBuilding + nStepsMPC * ((controllableHandled * 2)  + volatileHandled + (couplerHandled*2)+ (storageHandled*2)  );
	        		
	            	// MAX Constraints, for both el. and heat
	            	double[] row = new double[nCols+1];
	        		row[index] = pm.efficiency;
	        		row[index + nStepsMPC] = pm.maxPower;        		
	        		problem.addConstraint(row, LpSolve.LE, pm.maxPower);
	            	//System.out.println("Adding max constraint CP --> row: " + Arrays.toString(row) + " <= " + pm.maxPower);
	            	
	            	// MIN Constraints, for both el. and heat
	            	double[] row2 = new double[nCols+1];
	        		row2[index] = -pm.efficiency;
	        		row2[index + nStepsMPC] = -pm.minPower;        		
	        		problem.addConstraint(row2, LpSolve.LE, -pm.minPower);
	            	//System.out.println("Adding min constraint CP --> row2: " + Arrays.toString(row2) + " <= -" + pm.minPower);
	            	
	            	controllableHandled++;
				}
	        	
	        	for (ProducerMessage pm : bm.volatileProducerList) {        		
	        		int index = i + indexBuilding + nStepsMPC * ((controllableHandled * 2)  + volatileHandled + (couplerHandled*2)+ (storageHandled*2)  );
	        		
	        		VolatileProducerMessage vpm = (VolatileProducerMessage) pm;
	        		
	            	// MAX Constraints, for both el. and heat
	            	double[] row = new double[nCols+1];
	        		row[index] = 1;        		
	        		problem.addConstraint(row, LpSolve.LE, vpm.forecast[i]);
	            	//System.out.println("Adding max constraint VP --> row: " + Arrays.toString(row) + " <= " + vpm.forecast[i]);
	
	            	volatileHandled++;
				}
	        	
	        	
	        	for (CouplerMessage cm : bm.couplerList) {        		
	        		int index = i + indexBuilding + nStepsMPC * ((controllableHandled * 2)  + volatileHandled + (couplerHandled*2)+ (storageHandled*2)  );
	        		
	            	// MAX Constraints for heat
	            	double[] row = new double[nCols+1];
	        		row[index] = cm.efficiencyHeat;
	        		row[index + nStepsMPC] = cm.maxPower;        	
	        		problem.addConstraint(row, LpSolve.LE, cm.maxPower);
	            	//System.out.println("Adding max constraint coupler --> row: " + Arrays.toString(row) + " <= " + cm.installedPower);            	
	            	
	            	// MIN Constraints for heat
	            	double[] row2 = new double[nCols+1];
	        		row2[index] = -cm.efficiencyHeat;
	        		row2[index + nStepsMPC] = -cm.minPower;        		
	        		problem.addConstraint(row2, LpSolve.LE, -cm.minPower);
	            	//System.out.println("Adding min constraint coupler --> row3: " + Arrays.toString(row2) + " <= -" + cm.minPower);
	            	
	            	couplerHandled++;
				}
	        	
	        	for (StorageMessage sm : bm.storageList) {
	        		int index = i + indexBuilding + nStepsMPC * ((controllableHandled * 2)  + volatileHandled + (couplerHandled*2)+ (storageHandled*2)  );        		
	        		
	            	// MAX Constraints, for both el. and heat
	            	double[] row = new double[nCols+1];
	        		row[index] = 1;        		
	        		problem.addConstraint(row, LpSolve.LE, sm.maxDischarge);
	            	//System.out.println("Adding max discharging ST --> row: " + Arrays.toString(row) + " <= " + sm.maxDischarge);
	            	
	            	// MIN Constraints, for both el. and heat
	            	double[] row2 = new double[nCols+1];
	        		row2[index+nStepsMPC] = 1;
	        		problem.addConstraint(row2, LpSolve.LE, sm.maxLoad);
	            	//System.out.println("Adding max charging --> row2: " + Arrays.toString(row2) + " <= " + sm.maxLoad);
	        		        		
	         		storageHandled++;
	 			}
	    	}
		}
		return problem;
	}

	public LpSolve createSOCBoundaries(LpSolve problem, ArrayList<BuildingMessage> buildingMessages) throws LpSolveException {
		for (BuildingMessage bm : buildingMessages) {
			
			int controllableHandled = bm.getNrOfControllableProducers();
	        int volatileHandled = bm.getNrOfVolatileProducers();
	        int couplerHandled = bm.getNrOfCouplers();        
	        int storageHandled = 0;
	        
	        int indexBuilding = mapBuildingMessageToIndex.get(bm);
			
			double delta_time_factor = 24.0 / topologyConfig.getTimeStepsPerDay(); // = 0.25 fuer 96 Schritte /Tag
			
	        for (StorageMessage sm : bm.storageList) {
	        	
	            double[] rowCHARGE = new double[nCols+1];
	            double[] rowDISCHARGE = new double[nCols+1];
	            
	            double SOC_perc = sm.stateOfCharge;
				double standbyLosses = sm.storageLosses;
				
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
				
		        for (int i = 0; i < nStepsMPC; i++) {
		        	int index = i + indexBuilding + nStepsMPC * ((controllableHandled * 2)  + volatileHandled + (couplerHandled*2)+ (storageHandled*2)  );		        			          

		        	rowCHARGE[index] = - beta_fm * Math.pow(alpha, nStepsMPC -1 - i);
	            	rowDISCHARGE[index] = beta_fm * Math.pow(alpha, nStepsMPC -1 - i);

	            	// Now add the factor for the charging decision variable x_to:
	            	rowCHARGE[index + nStepsMPC] = beta_to * Math.pow(alpha, nStepsMPC -1 - i);
	            	rowDISCHARGE[index + nStepsMPC] = - beta_to * Math.pow(alpha, nStepsMPC -1 - i);

	            	// Add the factor vectors to the problem as constraint:
	            	problem.addConstraint(rowDISCHARGE, LpSolve.LE, SOC_perc);
	            	problem.addConstraint(rowCHARGE, LpSolve.LE, (1-SOC_perc));
		        	
				}
		        
		        storageHandled++;
	        }
			
		}       
		return problem;
	}

	public LpSolve createObjectiveFunction(LpSolve problem, ArrayList<BuildingMessage> buildingMessages) throws LpSolveException {
		
        int[] colno  = new int[nCols];
        double[] row = new double[nCols];
        
		int cts = currentTimeStep;
        int counter = 0;
        
        for (int i = 0; i < nStepsMPC; i++) {        	
        	for (BuildingMessage bm : buildingMessages) {

	            int controllableHandled = 0;
	            int volatileHandled = 0;
	            int couplerHandled = 0;        
	            int storageHandled = 0;
	            
	            int indexBuilding = mapBuildingMessageToIndex.get(bm);
	        	
	        	for (ProducerMessage pm : bm.controllableProducerList) {    
	        		int index = i + indexBuilding + nStepsMPC * ((controllableHandled * 2)  + volatileHandled + (couplerHandled*2)+ (storageHandled*2)  );  	
	            	colno[counter] = index;
	            	
	            	if (topologyController.getOptimizationCriteria() == OptimizationCriteria.EUR) {
	            		row[counter++] = pm.operationalCostEUR;
					}
	            	
	            	if (topologyController.getOptimizationCriteria() == OptimizationCriteria.CO2) {
	            		row[counter++] = pm.operationalCostCO2;
	            	}
	            	
	            	controllableHandled++;
	    		}
	        	
	        	for (ProducerMessage pm : bm.volatileProducerList) {    
	        		int index = i + indexBuilding + nStepsMPC * ((controllableHandled * 2)  + volatileHandled + (couplerHandled*2)+ (storageHandled*2)  );  	
	            	colno[counter] = index;
	            	
	            	if (topologyController.getOptimizationCriteria() == OptimizationCriteria.EUR) {
	            		row[counter++] = pm.operationalCostEUR;
					}
	            	
	            	if (topologyController.getOptimizationCriteria() == OptimizationCriteria.CO2) {
	            		row[counter++] = pm.operationalCostCO2;
	            	}	            	
	            	
	            	volatileHandled++;
	    		}
	        	
	        	for (CouplerMessage cm : bm.couplerList) {    
	        		int index = i + indexBuilding + nStepsMPC * ((controllableHandled * 2)  + volatileHandled + (couplerHandled*2)+ (storageHandled*2)  );  	
	            	colno[counter] = index;
	            	
	            	if (topologyController.getOptimizationCriteria() == OptimizationCriteria.EUR) {
	            		row[counter++] = cm.operationalCostEUR;
					}
	            	
	            	if (topologyController.getOptimizationCriteria() == OptimizationCriteria.CO2) {
	            		row[counter++] = cm.operationalCostCO2;
	            	}
	            	
	            	couplerHandled++;
	    		}
	        	
	        	for (StorageMessage sm : bm.storageList) {
	        		
	        		double price = 0;
	        		
	            	if (topologyController.getOptimizationCriteria() == OptimizationCriteria.EUR) {
	            		price = sm.operationalCostEUR; 
					}
	            	
	            	if (topologyController.getOptimizationCriteria() == OptimizationCriteria.CO2) {
	            		price = sm.operationalCostCO2;
	            	}
	        		
	        		int index = i + indexBuilding + nStepsMPC * ((controllableHandled * 2)  + volatileHandled + (couplerHandled*2)+ (storageHandled*2)  );  	
	            	colno[counter] = index;
	            	row[counter++] = price;
	            	colno[counter] = index+nStepsMPC;
	            	row[counter++] = price;
	            	storageHandled++;
	    		}	        	
        	}        	
        	
        	int index = nCols + 1 - 2*nStepsMPC + i;
        	
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
            	row[counter++] = CO2profiles.getCO2emissions(cts+i);
            	// sell, no compensation for selling
            	colno[counter] = index+nStepsMPC;
            	row[counter++] = 0;
        	}
        	

        }        
        
        /* set the objective in lpsolve */
        problem.setObjFnex(counter, row, colno);        
        
        /* set the object direction to minimize */
        problem.setMinim(); 
		return problem;
	}
	
}