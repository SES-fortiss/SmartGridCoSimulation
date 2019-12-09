package linprogMPC.helper.milp;

import akka.systemActors.GlobalTime;
import linprogMPC.ConfigurationMEMAP;
import linprogMPC.TopologyConfig;
import linprogMPC.messages.BuildingMessage;
import linprogMPC.messages.extension.NetworkType;
import linprogMPC.messages.planning.ConnectionMessage;
import linprogMPC.messages.planning.CouplerMessage;
import linprogMPC.messages.planning.ProducerMessage;
import linprogMPC.messages.planning.StorageMessage;
import linprogMPC.messages.planning.VolatileProducerMessage;
import lpsolve.LpSolve;
import lpsolve.LpSolveException;

public class MILPProblemNoConnections {
			
	int nStepsMPC;
	int nCols;
	
	public MILPProblemNoConnections(int nStepsMPC, int nCols) {
		this.nStepsMPC = nStepsMPC;
		this.nCols = nCols;
	}
	
	// TODO, original form without connections...
	public LpSolve createNames(LpSolve problem, BuildingMessage buildingMessage) throws LpSolveException {		
		
        int controllableHandled = 0;
        int volatileHandled = 0;
        int couplerHandled = 0;
        int storageHandled = 0;
        int connectionHandled = 0;
        
		for(ProducerMessage producerMessage : buildingMessage.controllableProducerList) {
			addControllableToProblem(producerMessage, problem, controllableHandled);
			controllableHandled++;
		}
		
		for(ProducerMessage producerMessage : buildingMessage.volatileProducerList) {
			addVolatileToProblem(producerMessage, problem, controllableHandled, volatileHandled);
			volatileHandled++;
		}
		
		for(CouplerMessage couplerMessage : buildingMessage.couplerList) {
			addCouplerToProblem(couplerMessage, problem, controllableHandled, volatileHandled, couplerHandled);
			couplerHandled++;
		}
		
		for(StorageMessage storageMessage : buildingMessage.storageList) {
			addStorageToProblem(storageMessage, problem, controllableHandled, volatileHandled, couplerHandled, storageHandled);
			storageHandled++;
		}
				
		if (ConfigurationMEMAP.chosenOptimizationHierarchy == ConfigurationMEMAP.OptHierarchy.MEMAP && 
				ConfigurationMEMAP.chosenOptimizer == ConfigurationMEMAP.Optimizer.MILPwithConnections) {
			
			for(ConnectionMessage connectionMessage : buildingMessage.connectionList) {
				addConnectionToProblem(connectionMessage, problem, controllableHandled, volatileHandled, couplerHandled, storageHandled, connectionHandled);
				connectionHandled++;
			}
		}
        
		addMarkets(problem, controllableHandled, volatileHandled, couplerHandled, storageHandled, connectionHandled);
                
		return problem;
	}	

	private void addControllableToProblem(ProducerMessage producerMessage,LpSolve optProblem,int controllableHandled) throws LpSolveException {		
		for (int i = 0; i < nStepsMPC; i++) {			
			int index = i + 1 + nStepsMPC * (controllableHandled * 2);
			String string1 = producerMessage.name + "_T" + i;
			String string2 = producerMessage.name + "_OFF_T" + i;
			optProblem.setColName(index, string1);
			optProblem.setColName(index + nStepsMPC, string2);
			optProblem.setBinary(index + nStepsMPC, true);
		}
	}
		
	private void addVolatileToProblem(ProducerMessage producerMessage, LpSolve problem, 
			int controllableHandled,int volatileHandled) throws LpSolveException {
		
		for (int i = 0; i < nStepsMPC; i++) {			
			int index = i + 1 + nStepsMPC * ( (controllableHandled * 2) + volatileHandled);
			String string1 = producerMessage.name + "_T" + i;
			problem.setColName(index, string1);
		}		
	}	
	
	private void addCouplerToProblem(CouplerMessage couplerMessage, LpSolve problem, int controllableHandled, int volatileHandled, int couplerHandled) throws LpSolveException {
		
		for (int i = 0; i < nStepsMPC; i++) {			
			int index = i + 1 + nStepsMPC * ( (controllableHandled * 2) + volatileHandled + (couplerHandled *2));
			String string1 = couplerMessage.name + "_T" + i;
			String string2 = couplerMessage.name + "OFF_T" + i;
			// TODO: Implement check for duplicated names
			problem.setColName(index, string1);
			problem.setColName(index + nStepsMPC, string2);
			problem.setBinary(index + nStepsMPC, true);
		}
		
	}
	
	private void addStorageToProblem(StorageMessage storageMessage, LpSolve problem, int controllableHandled,
			int volatileHandled, int couplerHandled, int storageHandled) throws LpSolveException {
				
		for (int i = 0; i < nStepsMPC; i++) {			
			int index = i + 1 + nStepsMPC * ((controllableHandled * 2)  + volatileHandled + (couplerHandled*2)+ (storageHandled * 2)  );
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
				String string2 = connectionMessage.name+"_Back_From"+connectionMessage.connectedBuildingFrom+"_To" + connectionMessage.connectedBuildingTo + "_T" + i;
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

	public LpSolve createDemandConstraints(LpSolve problem, BuildingMessage buildingMessage) throws LpSolveException {		
        double [] demand = buildingMessage.getCombinedDemandVector();
        
        /* first HEAT components */
        for (int i = 0; i < demand.length / 2; i++) {
        	
            int controllableHandled = 0;
            int volatileHandled = 0;
            int couplerHandled = 0;
            int storageHandled = 0;
        	
        	double[] rowHEAT = new double[nCols+1];
        	
        	for (ProducerMessage pm : buildingMessage.controllableProducerList) {        		
        		int index = i + 1 + nStepsMPC * ((controllableHandled * 2)  + volatileHandled + (couplerHandled*2)+ (storageHandled*2)  );
    			if (pm.networkType == NetworkType.HEAT) rowHEAT[index] = -pm.efficiency;
        		controllableHandled++;
			}
        	
        	for (ProducerMessage pm : buildingMessage.volatileProducerList) {        		
        		int index = i + 1 + nStepsMPC * ((controllableHandled * 2)  + volatileHandled + (couplerHandled*2)+ (storageHandled*2)  );    			
    			if (pm.networkType == NetworkType.HEAT) rowHEAT[index] = -1;
    			volatileHandled++;
			}
        	
        	for (CouplerMessage cm : buildingMessage.couplerList) {        		
        		int index = i + 1 + nStepsMPC * ((controllableHandled * 2)  + volatileHandled + (couplerHandled*2)+ (storageHandled*2)  );    			
    			rowHEAT[index] = -cm.efficiencyHeat;
    			couplerHandled++;
			}
        	        	
        	for (StorageMessage sm : buildingMessage.storageList) {        	
        		
        		int index = i + 1 + nStepsMPC * ((controllableHandled * 2)  + volatileHandled + (couplerHandled*2)+ (storageHandled*2)  );        		
        		if (sm.networkType == NetworkType.HEAT) {
        			rowHEAT[index] = -1;
        			rowHEAT[index + nStepsMPC] = 1;
        		}
        		storageHandled++;
			}
        	
        	problem.addConstraint(rowHEAT, LpSolve.EQ, demand[i]);
        	//System.out.println("Adding HEAT demand constraint with components --> rowHEAT: " + Arrays.toString(rowHEAT) + " EQ: " + demand[i]);
		}
        
	 	/* second ELEC componentes */ 
    	int countTimeStep = 0;
        for (int i = demand.length / 2; i < demand.length; i++) {
        	int controllableHandled = 0;
            int volatileHandled = 0;
            int couplerHandled = 0;        
            int storageHandled = 0;        	
         	
            double[] rowELEC = new double[nCols+1];
         	
         	for (ProducerMessage pm : buildingMessage.controllableProducerList) {        		
         		int index = countTimeStep + 1 + nStepsMPC * ((controllableHandled * 2)  + volatileHandled + (couplerHandled*2)+ (storageHandled*2)  );
     			if (pm.networkType == NetworkType.ELECTRICITY) rowELEC[index] = -pm.efficiency;
         		controllableHandled++;
 			}
         	
         	for (ProducerMessage pm : buildingMessage.volatileProducerList) {        		
         		int index = countTimeStep + 1 + nStepsMPC * ((controllableHandled * 2)  + volatileHandled + (couplerHandled*2)+ (storageHandled*2)  );    			
     			if (pm.networkType == NetworkType.ELECTRICITY) rowELEC[index] = -1;
     			volatileHandled++;
 			}
         	
         	for (CouplerMessage cm : buildingMessage.couplerList) {        		
         		int index = countTimeStep + 1 + nStepsMPC * ((controllableHandled * 2)  + volatileHandled + (couplerHandled*2)+ (storageHandled*2)  );    			
         		rowELEC[index] = -cm.efficiencyElec;
     			couplerHandled++;
 			}
         	        	
         	for (StorageMessage sm : buildingMessage.storageList) {
         		
         		int index = countTimeStep + 1 + nStepsMPC * ((controllableHandled * 2)  + volatileHandled + (couplerHandled*2)+ (storageHandled*2)  );        		
        		if (sm.networkType == NetworkType.ELECTRICITY) {
        			rowELEC[index] = -1;
        			rowELEC[index + nStepsMPC] = 1;
        		}
         		storageHandled++;
 			}
         	        	        	
        	// ADD Markets (at last position)
        	
         	int index = countTimeStep + 1 + nStepsMPC * ((controllableHandled * 2)  + volatileHandled + (couplerHandled*2)+ (storageHandled*2)  );   
        	
    	 	rowELEC[index] = -1;
        	rowELEC[index+nStepsMPC] = 1;
        	
        	problem.addConstraint(rowELEC, LpSolve.EQ, demand[i]);
        	
        	//System.out.println("Adding markets --> rowELEC: " + Arrays.toString(rowELEC) + " EQ: " + demand[i]);     	
        	countTimeStep++;
		}         

		return problem;
	}

	public LpSolve createComponentBoundaries(LpSolve problem, BuildingMessage buildingMessage) throws LpSolveException {
	     for (int i = 0; i < nStepsMPC; i++) {
	        	
            int controllableHandled = 0;
            int volatileHandled = 0;
            int couplerHandled = 0;        
            int storageHandled = 0;

        	for (ProducerMessage pm : buildingMessage.controllableProducerList) {
        		
        		int index = i + 1 + nStepsMPC * ((controllableHandled * 2)  + volatileHandled + (couplerHandled*2)+ (storageHandled*2)  );
        		
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
        	
        	for (ProducerMessage pm : buildingMessage.volatileProducerList) {        		
        		int index = i + 1 + nStepsMPC * ((controllableHandled * 2)  + volatileHandled + (couplerHandled*2)+ (storageHandled*2)  );
        		
        		VolatileProducerMessage vpm = (VolatileProducerMessage) pm;
        		
            	// MAX Constraints, for both el. and heat
            	double[] row = new double[nCols+1];
        		row[index] = 1;        		
        		problem.addConstraint(row, LpSolve.LE, vpm.forecast[i]);
            	//System.out.println("Adding max constraint VP --> row: " + Arrays.toString(row) + " <= " + vpm.forecast[i]);

            	volatileHandled++;
			}
        	
        	
        	for (CouplerMessage cm : buildingMessage.couplerList) {        		
        		int index = i + 1 + nStepsMPC * ((controllableHandled * 2)  + volatileHandled + (couplerHandled*2)+ (storageHandled*2)  );
        		
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
        	
        	for (StorageMessage sm : buildingMessage.storageList) {
        		int index = i + 1 + nStepsMPC * ((controllableHandled * 2)  + volatileHandled + (couplerHandled*2)+ (storageHandled*2)  );        		
        		
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
		return problem;
	}

	public LpSolve createSOCBoundaries(LpSolve problem, BuildingMessage buildingMessage) throws LpSolveException {		
        int controllableHandled = buildingMessage.getNrOfControllableProducers();
        int volatileHandled = buildingMessage.getNrOfVolatileProducers();
        int couplerHandled = buildingMessage.getNrOfCouplers();        
        int storageHandled = 0;
		
		double factor = 24.0 / TopologyConfig.TIMESTEPS_PER_DAY; // = 0.25 f�r 96 Schritte /Tag
		
        for (StorageMessage sm : buildingMessage.storageList) {
        	
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
	        	int index = i + 1 + nStepsMPC * ((controllableHandled * 2)  + volatileHandled + (couplerHandled*2)+ (storageHandled*2)  );  		        	
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
		return problem;
	}

	public LpSolve createObjectiveFunction(LpSolve problem, BuildingMessage buildingMessage) throws LpSolveException {
        int[] colno  = new int[nCols];
        double[] row = new double[nCols];
        
		int cts = GlobalTime.getCurrentTimeStep();
        
        
        int counter = 0;
        
        for (int i = 0; i < nStepsMPC; i++) {
        	        	
            int controllableHandled = 0;
            int volatileHandled = 0;
            int couplerHandled = 0;        
            int storageHandled = 0;
        	
        	for (ProducerMessage pm : buildingMessage.controllableProducerList) {    
        		int index = i + 1 + nStepsMPC * ((controllableHandled * 2)  + volatileHandled + (couplerHandled*2)+ (storageHandled*2)  );  	
            	colno[counter] = index;
            	row[counter++] = pm.operationalCostEUR;
            	controllableHandled++;
    		}
        	
        	for (ProducerMessage pm : buildingMessage.volatileProducerList) {    
        		int index = i + 1 + nStepsMPC * ((controllableHandled * 2)  + volatileHandled + (couplerHandled*2)+ (storageHandled*2)  );  	
            	colno[counter] = index;
            	row[counter++] = pm.operationalCostEUR;
            	volatileHandled++;
    		}
        	
        	for (CouplerMessage cm : buildingMessage.couplerList) {    
        		int index = i + 1 + nStepsMPC * ((controllableHandled * 2)  + volatileHandled + (couplerHandled*2)+ (storageHandled*2)  );  	
            	colno[counter] = index;
            	row[counter++] = cm.operationalCostEUR;
            	couplerHandled++;
    		}
        	
        	for (StorageMessage sm : buildingMessage.storageList) {
        		
        		double price = sm.operationalCostEUR;// + 0.0001 * i; // damit es sp�ter etwas teuerer wird.
        		
        		int index = i + 1 + nStepsMPC * ((controllableHandled * 2)  + volatileHandled + (couplerHandled*2)+ (storageHandled*2)  );  	
            	colno[counter] = index;
            	row[counter++] = price;
            	colno[counter] = index+nStepsMPC;
            	row[counter++] = price;
            	storageHandled++;
    		}
        	
        	// buy
        	int index = i + 1 + nStepsMPC * ((controllableHandled * 2)  + volatileHandled + (couplerHandled*2)+ (storageHandled*2)  );
        	colno[counter] = index;
        	row[counter++] = TopologyConfig.energyPrices.getElectricityPriceInEuro(cts+i);
        	// sell
        	colno[counter] = index+nStepsMPC;
        	row[counter++] = -TopologyConfig.energyPrices.getElectricityPriceInEuro(cts+i)*0.5;
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
	public double[] getLambdaEUR(BuildingMessage buildingMessage) {
		double[] result = new double[nCols];
		
        int controllableHandled = 0;
        int volatileHandled = 0;
        int couplerHandled = 0;        
        int storageHandled = 0;
        
		for(ProducerMessage producerMessage : buildingMessage.controllableProducerList) {					
			for (int i = 0; i < nStepsMPC; i++) {		
				int index = i + nStepsMPC * (controllableHandled * 2);
				result[index] = producerMessage.operationalCostEUR;
				result[index + nStepsMPC] = 0;
			}
			controllableHandled++;
		}
		
		for(ProducerMessage producerMessage : buildingMessage.volatileProducerList) {
			for (int i = 0; i < nStepsMPC; i++) {			
				int index = i + nStepsMPC * ( (controllableHandled * 2) + volatileHandled);
				result[index] = producerMessage.operationalCostEUR;
			}
			volatileHandled++;
		}
		
		for(CouplerMessage couplerMessage : buildingMessage.couplerList) {
			for (int i = 0; i < nStepsMPC; i++) {			
				int index = i + nStepsMPC * ( (controllableHandled * 2) + volatileHandled + (couplerHandled *2));
				result[index] = couplerMessage.operationalCostEUR;
				result[index + nStepsMPC] = 0;
			}
			couplerHandled++;
		}
		
		for(StorageMessage storageMessage : buildingMessage.storageList) {
			for (int i = 0; i < nStepsMPC; i++) {			
				int index = i + nStepsMPC * ((controllableHandled * 2)  + volatileHandled + (couplerHandled*2)+ (storageHandled * 2)  );
				result[index] = storageMessage.operationalCostEUR;
				result[index+ nStepsMPC] = storageMessage.operationalCostEUR;
			}
			storageHandled++;
		}
        
		/* Markets */
		int cts = GlobalTime.getCurrentTimeStep();		
		for (int i = 0; i < nStepsMPC; i++) {			
			int index = i + nStepsMPC * ((controllableHandled * 2)  + volatileHandled + (couplerHandled*2)+ (storageHandled * 2)  );
			result[index] = TopologyConfig.energyPrices.getElectricityPriceInEuro(cts+i);
			result[index+ nStepsMPC] = -TopologyConfig.energyPrices.getElectricityPriceInEuro(cts+i)*0.5;
		}		
		return result;
	}

	public double[] getLambdaCO2(BuildingMessage buildingMessage) {
		double[] result = new double[nCols];
		
        int controllableHandled = 0;
        int volatileHandled = 0;
        int couplerHandled = 0;        
        int storageHandled = 0;
        
		for(ProducerMessage producerMessage : buildingMessage.controllableProducerList) {					
			for (int i = 0; i < nStepsMPC; i++) {		
				int index = i + nStepsMPC * (controllableHandled * 2);
				result[index] = producerMessage.operationalCostCO2;
				result[index + nStepsMPC] = 0;
			}
			controllableHandled++;
		}
		
		for(ProducerMessage producerMessage : buildingMessage.volatileProducerList) {
			for (int i = 0; i < nStepsMPC; i++) {			
				int index = i + nStepsMPC * ( (controllableHandled * 2) + volatileHandled);
				result[index] = producerMessage.operationalCostCO2;
			}
			volatileHandled++;
		}
		
		for(CouplerMessage couplerMessage : buildingMessage.couplerList) {
			for (int i = 0; i < nStepsMPC; i++) {			
				int index = i + nStepsMPC * ( (controllableHandled * 2) + volatileHandled + (couplerHandled *2));
				result[index] = couplerMessage.operationalCostCO2;
				result[index + nStepsMPC] = 0;
			}
			couplerHandled++;
		}
		
		for(StorageMessage storageMessage : buildingMessage.storageList) {
			for (int i = 0; i < nStepsMPC; i++) {			
				int index = i + nStepsMPC * ((controllableHandled * 2)  + volatileHandled + (couplerHandled*2)+ (storageHandled * 2)  );
				result[index] = storageMessage.operationalCostCO2;
				result[index+ nStepsMPC] = storageMessage.operationalCostCO2;
			}
			storageHandled++;
		}
        
		/* Markets */	
		for (int i = 0; i < nStepsMPC; i++) {			
			int index = i + nStepsMPC * ((controllableHandled * 2)  + volatileHandled + (couplerHandled*2)+ (storageHandled * 2)  );
			result[index] = 0.474; // buying --> TODO improve maybe later
			result[index+ nStepsMPC] = 0; // selling (same as for LP)
		}		
		return result;
	}

}

