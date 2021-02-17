package linprogMPC.helper.milp;

import static linprogMPC.ConfigurationMEMAP.chosenGoal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import linprogMPC.ConfigurationMEMAP;
import linprogMPC.ConfigurationMEMAP.OptimizationGoal;
import linprogMPC.MILPTopology;
import linprogMPC.helper.CO2profiles;
import linprogMPC.helper.EnergyPrices;
import linprogMPC.messages.BuildingMessage;
import linprogMPC.messages.extension.NetworkType;
import linprogMPC.messages.planning.ConnectionMessage;
import linprogMPC.messages.planning.CouplerMessage;
import linprogMPC.messages.planning.ProducerMessage;
import linprogMPC.messages.planning.StorageMessage;
import linprogMPC.messages.planning.VolatileProducerMessage;
import lpsolve.LpSolve;
import lpsolve.LpSolveException;

public class MILPProblemWithConnections {
			
	int nStepsMPC;
	int nCols;
	
	HashMap<BuildingMessage, Integer> mapBuildingMessageToIndex = new HashMap<>();
	HashMap<ConnectionMessage, Integer> mapConnectionToIndex = new HashMap<>();
	
	public MILPProblemWithConnections(int nStepsMPC, int nCols) {
		this.nStepsMPC = nStepsMPC;
		this.nCols = nCols;
	}
	
	public LpSolve createNames(LpSolve problem, ArrayList<BuildingMessage> buildingMessages) throws LpSolveException {		
		
        int controllableHandled = 0;
        int volatileHandled = 0;
        int couplerHandled = 0;
        int storageHandled = 0;
        int connectionHandled = 0;
        
        ArrayList<ConnectionMessage> connections = new ArrayList<>();
        
        for (BuildingMessage bm : buildingMessages) {
        	for(ProducerMessage producerMessage : bm.controllableProducerList) {
    			addControllableToProblem(producerMessage, problem, controllableHandled, volatileHandled, couplerHandled, storageHandled, connectionHandled);
    			controllableHandled++;
    		}
    		
    		for(ProducerMessage producerMessage : bm.volatileProducerList) {
    			addVolatileToProblem(producerMessage, problem, controllableHandled, volatileHandled, couplerHandled, storageHandled, connectionHandled);
    			volatileHandled++;
    		}
    		
    		for(CouplerMessage couplerMessage : bm.couplerList) {
    			addCouplerToProblem(couplerMessage, problem, controllableHandled, volatileHandled, couplerHandled, storageHandled, connectionHandled);
    			couplerHandled++;
    		}
    		
    		for(StorageMessage storageMessage : bm.storageList) {
    			addStorageToProblem(storageMessage, problem, controllableHandled, volatileHandled, couplerHandled, storageHandled, connectionHandled);
    			storageHandled++;
    		}
    		
    		for (ConnectionMessage c : bm.connectionList) {
    			connections.add(c);
    		}
		}        
        
        for(ConnectionMessage connectionMessage : connections) {
			addConnectionToProblem(connectionMessage, problem, controllableHandled, volatileHandled, couplerHandled, storageHandled, connectionHandled);
			connectionHandled++;
		}
        
		addMarkets(problem, controllableHandled, volatileHandled, couplerHandled, storageHandled, connectionHandled);                
		return problem;
	}	

	private void addControllableToProblem(ProducerMessage producerMessage,LpSolve optProblem,int controllableHandled, int volatileHandled, int couplerHandled, int storageHandled, int connectionHandled) throws LpSolveException {		
		for (int i = 0; i < nStepsMPC; i++) {			
			int index = i + 1 + nStepsMPC * ((controllableHandled * 2)  + volatileHandled + (couplerHandled*2)+ (storageHandled * 2) + (connectionHandled * 2)  );
			String string1 = producerMessage.name + "_T" + i;
			String string2 = producerMessage.name + "_OFF_T" + i;
			optProblem.setColName(index, string1);
			optProblem.setColName(index + nStepsMPC, string2);
			optProblem.setBinary(index + nStepsMPC, true);
		}
	}
		
	private void addVolatileToProblem(ProducerMessage producerMessage, LpSolve problem, 
			int controllableHandled,int volatileHandled, int couplerHandled, int storageHandled, int connectionHandled) throws LpSolveException {
		
		for (int i = 0; i < nStepsMPC; i++) {			
			int index = i + 1 + nStepsMPC * ((controllableHandled * 2)  + volatileHandled + (couplerHandled*2)+ (storageHandled * 2) + (connectionHandled * 2)  );
			String string1 = producerMessage.name + "_T" + i;
			problem.setColName(index, string1);
		}		
	}	
	
	private void addCouplerToProblem(CouplerMessage couplerMessage, LpSolve problem, int controllableHandled, int volatileHandled, int couplerHandled, int storageHandled, int connectionHandled) throws LpSolveException {
		
		for (int i = 0; i < nStepsMPC; i++) {			
			int index = i + 1 + nStepsMPC * ((controllableHandled * 2)  + volatileHandled + (couplerHandled*2)+ (storageHandled * 2) + (connectionHandled * 2)  );
			String string1 = couplerMessage.name + "_T" + i;
			String string2 = couplerMessage.name + "_OFF_T" + i;
			problem.setColName(index, string1);
			problem.setColName(index + nStepsMPC, string2);
			problem.setBinary(index + nStepsMPC, true);
		}
		
	}
	
	private void addStorageToProblem(StorageMessage storageMessage, LpSolve problem, int controllableHandled,
			int volatileHandled, int couplerHandled, int storageHandled, int connectionHandled) throws LpSolveException {
				
		for (int i = 0; i < nStepsMPC; i++) {			
			int index = i + 1 + nStepsMPC * ((controllableHandled * 2)  + volatileHandled + (couplerHandled*2)+ (storageHandled * 2) + (connectionHandled * 2)  );
			String string1 = storageMessage.name+"Discharge_T" + i;
			String string2 = storageMessage.name+"Charge_T" + i;
			problem.setColName(index, string1);
			problem.setColName(index + nStepsMPC, string2);
		}
	}
	
	private void addConnectionToProblem(ConnectionMessage connectionMessage, LpSolve problem, int controllableHandled,
			int volatileHandled, int couplerHandled, int storageHandled, int connectionHandled) throws LpSolveException {
		
			for (int i = 0; i < nStepsMPC; i++) {			
				int index = i + 1 + nStepsMPC * ((controllableHandled * 2)  + volatileHandled + (couplerHandled*2)+ (storageHandled * 2) + (connectionHandled * 2)  );
				String string1 = connectionMessage.name+"_From"+connectionMessage.connectedBuildingFrom+"_To" + connectionMessage.connectedBuildingTo + "_T" + i;
				String string2 = connectionMessage.name+"_From"+connectionMessage.connectedBuildingTo+"_To" + connectionMessage.connectedBuildingFrom + "_T" + i;
				problem.setColName(index, string1);
				problem.setColName(index + nStepsMPC, string2);
			}		
	}
	
	private void addMarkets(LpSolve problem, int controllableHandled, int volatileHandled, int couplerHandled,
			int storageHandled, int connectionHandled) throws LpSolveException {
				
		for (int i = 0; i < nStepsMPC; i++) {			
			int index = i + 1 + nStepsMPC * ((controllableHandled * 2)  + volatileHandled + (couplerHandled*2)+ (storageHandled * 2) + (connectionHandled * 2) );
			String string1 = "ElecBuy_T" + i;
			String string2 = "ElecSell_T" + i;
			problem.setColName(index, string1);
			problem.setColName(index + nStepsMPC, string2);
		}	
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
				demandELEC[i] = demand[i + nStepsMPC];
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
		
        if (ConfigurationMEMAP.chosenMEMAPLogging == ConfigurationMEMAP.MEMAPLogging.ALL) {        	
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
            	
            	if (ConfigurationMEMAP.chosenMEMAPLogging == ConfigurationMEMAP.MEMAPLogging.ALL) {            	
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
        	
        	if (ConfigurationMEMAP.chosenMEMAPLogging == ConfigurationMEMAP.MEMAPLogging.ALL) {
        		System.out.println("Adding markets --> rowELEC: " + Arrays.toString(rowELEC) + " EQ: " + demandELEC[i]);
			}       	     	        	
		}
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
	        		row[index + nStepsMPC] = cm.installedPower;        	
	        		problem.addConstraint(row, LpSolve.LE, cm.installedPower);
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
			
			double factor = 24.0 / MILPTopology.TIMESTEPS_PER_DAY; // = 0.25 für 96 Schritte /Tag
			
	        for (StorageMessage sm : bm.storageList) {
	        	
	            double[] rowCHARGE = new double[nCols+1];
	            double[] rowDISCHARGE = new double[nCols+1];
	        	        	        	
				double maxDischargeCapacity = sm.stateOfCharge;
				if (maxDischargeCapacity >= sm.capacity) {
					maxDischargeCapacity = sm.capacity;
				}
				if (maxDischargeCapacity <= 0) {
					maxDischargeCapacity = 0.0001;
				}
				
				double maxChargeCapacity = sm.capacity - sm.stateOfCharge;
				if (maxChargeCapacity <= 0.0) {
					maxChargeCapacity = 0.0001;
				}
				if (maxChargeCapacity >= sm.capacity) {
					maxChargeCapacity = sm.capacity;
				}
				
		        for (int i = 0; i < nStepsMPC; i++) {
		        	int index = i + indexBuilding + nStepsMPC * ((controllableHandled * 2)  + volatileHandled + (couplerHandled*2)+ (storageHandled*2)  );  		        	
		        	rowDISCHARGE[index] = 1/sm.efficiencyDischarge*factor;
		        	rowCHARGE[index] = -1/sm.efficiencyDischarge*factor;
		        	
		        	rowCHARGE[index + nStepsMPC] = sm.efficiencyCharge*factor;
		        	rowDISCHARGE[index + nStepsMPC] = -sm.efficiencyCharge*factor;
		        	
		        	problem.addConstraint(rowDISCHARGE, LpSolve.LE, maxDischargeCapacity);
		        	problem.addConstraint(rowCHARGE, LpSolve.LE, maxChargeCapacity);
		        	
		        	//System.out.println("Adding SOC chargeing constraints --> rowCHARGE: " + Arrays.toString(rowCHARGE) + " <= " + maxChargeCapacity);
				}
		        storageHandled++;
	        }
			
		}       
		return problem;
	}

	public LpSolve createObjectiveFunction(LpSolve problem, ArrayList<BuildingMessage> buildingMessages, int currentTimeStep) throws LpSolveException {
		
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
	            	
	            	if (chosenGoal == OptimizationGoal.EUR) {
	            		row[counter++] = pm.operationalCostEUR;
					}
	            	
	            	if (chosenGoal == OptimizationGoal.CO2) {
	            		row[counter++] = pm.operationalCostCO2;
	            	}
	            	
	            	controllableHandled++;
	    		}
	        	
	        	for (ProducerMessage pm : bm.volatileProducerList) {    
	        		int index = i + indexBuilding + nStepsMPC * ((controllableHandled * 2)  + volatileHandled + (couplerHandled*2)+ (storageHandled*2)  );  	
	            	colno[counter] = index;
	            	
	            	if (chosenGoal == OptimizationGoal.EUR) {
	            		row[counter++] = pm.operationalCostEUR;
					}
	            	
	            	if (chosenGoal == OptimizationGoal.CO2) {
	            		row[counter++] = pm.operationalCostCO2;
	            	}	            	
	            	
	            	volatileHandled++;
	    		}
	        	
	        	for (CouplerMessage cm : bm.couplerList) {    
	        		int index = i + indexBuilding + nStepsMPC * ((controllableHandled * 2)  + volatileHandled + (couplerHandled*2)+ (storageHandled*2)  );  	
	            	colno[counter] = index;
	            	
	            	if (chosenGoal == OptimizationGoal.EUR) {
	            		row[counter++] = cm.operationalCostEUR;
					}
	            	
	            	if (chosenGoal == OptimizationGoal.CO2) {
	            		row[counter++] = cm.operationalCostCO2;
	            	}
	            	
	            	couplerHandled++;
	    		}
	        	
	        	for (StorageMessage sm : bm.storageList) {
	        		
	        		double price = 0;
	        		
	            	if (chosenGoal == OptimizationGoal.EUR) {
	            		price = sm.operationalCostEUR + 0.0001 * i; // damit es später etwas teuerer wird (besseres Ergebnis)
					}
	            	
	            	if (chosenGoal == OptimizationGoal.CO2) {
	            		price = sm.operationalCostCO2 + 0.0001 * i;
	            	}
	        		
	        		int index = i + indexBuilding + nStepsMPC * ((controllableHandled * 2)  + volatileHandled + (couplerHandled*2)+ (storageHandled*2)  );  	
	            	colno[counter] = index;
	            	row[counter++] = price;
	            	colno[counter] = index+nStepsMPC;
	            	row[counter++] = price;
	            	storageHandled++;
	    		}	        	
        	}
        	
        	// buy
        	//int index = i + 1 + nStepsMPC * ((controllableHandled * 2)  + volatileHandled + (couplerHandled*2)+ (storageHandled*2)  );
        	
        	int index = nCols + 1 - 2*nStepsMPC + i;
        	
        	if (chosenGoal == OptimizationGoal.EUR) {
        		// buy
            	colno[counter] = index;
            	row[counter++] = EnergyPrices.getElectricityPriceInEuro(cts+i);
            	// sell
            	colno[counter] = index+nStepsMPC;
            	row[counter++] = -EnergyPrices.getElectricityPriceInEuro(cts+i)*0.5;
			}
        	
        	if (chosenGoal == OptimizationGoal.CO2) {
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
	
	/**
	 * return the cost vector lambda in EUR, vector is according to names
	 * @param buildingMessage
	 * @return
	 */
	public double[] getLambdaEUR(ArrayList<BuildingMessage> buildingMessages, int currentTimeStep) {
		double[] result = new double[nCols];
		
		for (BuildingMessage bm : buildingMessages) {
			int controllableHandled = 0;
			int volatileHandled = 0;
			int couplerHandled = 0;        
			int storageHandled = 0;
			
			int indexBuilding = mapBuildingMessageToIndex.get(bm)-1;
        
			for(ProducerMessage producerMessage : bm.controllableProducerList) {					
				for (int i = 0; i < nStepsMPC; i++) {		
					int index = indexBuilding + i + nStepsMPC * (controllableHandled * 2);
					result[index] = producerMessage.operationalCostEUR;
					result[index + nStepsMPC] = 0;
				}
				controllableHandled++;
			}
			
			for(ProducerMessage producerMessage : bm.volatileProducerList) {
				for (int i = 0; i < nStepsMPC; i++) {			
					int index = indexBuilding+i + nStepsMPC * ( (controllableHandled * 2) + volatileHandled);
					result[index] = producerMessage.operationalCostEUR;
				}
				volatileHandled++;
			}
			
			for(CouplerMessage couplerMessage : bm.couplerList) {
				for (int i = 0; i < nStepsMPC; i++) {			
					int index = indexBuilding+i + nStepsMPC * ( (controllableHandled * 2) + volatileHandled + (couplerHandled *2));
					result[index] = couplerMessage.operationalCostEUR;
					result[index + nStepsMPC] = 0;
				}
				couplerHandled++;
			}
			
			for(StorageMessage storageMessage : bm.storageList) {
				for (int i = 0; i < nStepsMPC; i++) {			
					int index = indexBuilding+i + nStepsMPC * ((controllableHandled * 2)  + volatileHandled + (couplerHandled*2)+ (storageHandled * 2)  );
					result[index] = storageMessage.operationalCostEUR;
					result[index+ nStepsMPC] = storageMessage.operationalCostEUR;
				}
				storageHandled++;
			}
		}
        
		/* Markets */
		int cts = currentTimeStep;		
		for (int i = 0; i < nStepsMPC; i++) {
			int index = nCols - 2*nStepsMPC + i;
			result[index] = EnergyPrices.getElectricityPriceInEuro(cts+i);
			result[index + nStepsMPC] = -EnergyPrices.getElectricityPriceInEuro(cts+i)*0.5;
		}		
		return result;
	}

	public double[] getLambdaCO2(ArrayList<BuildingMessage> buildingMessages) {
		double[] result = new double[nCols];
		
		for (BuildingMessage bm : buildingMessages) {
			int controllableHandled = 0;
			int volatileHandled = 0;
			int couplerHandled = 0;        
			int storageHandled = 0;
			
			int indexBuilding = mapBuildingMessageToIndex.get(bm)-1;
        
			for(ProducerMessage producerMessage : bm.controllableProducerList) {					
				for (int i = 0; i < nStepsMPC; i++) {		
					int index = indexBuilding + i + nStepsMPC * (controllableHandled * 2);
					result[index] = producerMessage.operationalCostCO2;
					result[index + nStepsMPC] = 0;
				}
				controllableHandled++;
			}
			
			for(ProducerMessage producerMessage : bm.volatileProducerList) {
				for (int i = 0; i < nStepsMPC; i++) {			
					int index = indexBuilding+i + nStepsMPC * ( (controllableHandled * 2) + volatileHandled);
					result[index] = producerMessage.operationalCostCO2;
				}
				volatileHandled++;
			}
			
			for(CouplerMessage couplerMessage : bm.couplerList) {
				for (int i = 0; i < nStepsMPC; i++) {			
					int index = indexBuilding+i + nStepsMPC * ( (controllableHandled * 2) + volatileHandled + (couplerHandled *2));
					result[index] = couplerMessage.operationalCostCO2;
					result[index + nStepsMPC] = 0;
				}
				couplerHandled++;
			}
			
			for(StorageMessage storageMessage : bm.storageList) {
				for (int i = 0; i < nStepsMPC; i++) {			
					int index = indexBuilding+i + nStepsMPC * ((controllableHandled * 2)  + volatileHandled + (couplerHandled*2)+ (storageHandled * 2)  );
					result[index] = storageMessage.operationalCostCO2;
					result[index+ nStepsMPC] = storageMessage.operationalCostEUR;
				}
				storageHandled++;
			}
		}
        
		/* Markets */	
		for (int i = 0; i < nStepsMPC; i++) {			
			int index = nCols - 2*nStepsMPC + i;
			result[index] = 0.474; // buying --> TODO improve maybe later
			result[index+ nStepsMPC] = 0; // selling (same as for LP)
		}		
		return result;
	}

}

