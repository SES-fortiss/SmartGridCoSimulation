package linprogMPC.helper.milp;

import java.util.Arrays;

import akka.systemActors.GlobalTime;
import linprogMPC.MILPTopology;
import linprogMPC.helper.EnergyPrices;
import linprogMPC.messages.BuildingMessage;
import linprogMPC.messages.extension.NetworkType;
import linprogMPC.messages.planning.CouplerMessage;
import linprogMPC.messages.planning.ProducerMessage;
import linprogMPC.messages.planning.StorageMessage;
import linprogMPC.messages.planning.VolatileProducerMessage;
import lpsolve.LpSolve;
import lpsolve.LpSolveException;

public class MILPProblem {
			
	int nStepsMPC;
	int nCols;
	
	public MILPProblem(int nStepsMPC, int nCols) {
		this.nStepsMPC = nStepsMPC;
		this.nCols = nCols;
	}
	
	public LpSolve createNames(LpSolve problem, BuildingMessage buildingMessage) throws LpSolveException {		
		
        int controllableHandled = 0;
        int volatileHandled = 0;
        int couplerHandled = 0;        
        int storageHandled = 0;
        
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
        
		addMarkets(problem, controllableHandled, volatileHandled, couplerHandled, storageHandled);
                
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
			String string2 = couplerMessage.name + "_OFF_T" + i;
			problem.setColName(index, string1);
			problem.setColName(index + nStepsMPC, string2);
			problem.setBinary(index + nStepsMPC, true);
		}
		
	}
	
	private void addStorageToProblem(StorageMessage storageMessage, LpSolve problem, int controllableHandled,
			int volatileHandled, int couplerHandled, int storageHandled) throws LpSolveException {
				
		for (int i = 0; i < nStepsMPC; i++) {			
			int index = i + 1 + nStepsMPC * ((controllableHandled * 2)  + volatileHandled + (couplerHandled*2)+ (storageHandled * 2)  );
			String string1 = storageMessage.name + "_DIS_T" + i;
			String string2 = storageMessage.name + "_CHA_T" + i;
			problem.setColName(index, string1);
			problem.setColName(index + nStepsMPC, string2);
		}		
	}
	
	private void addMarkets(LpSolve problem, int controllableHandled, int volatileHandled, int couplerHandled,
			int storageHandled) throws LpSolveException {
				
		for (int i = 0; i < nStepsMPC; i++) {			
			int index = i + 1 + nStepsMPC * ((controllableHandled * 2)  + volatileHandled + (couplerHandled*2)+ (storageHandled * 2)  );
			String string1 = "MA_BUY_T" + i;
			String string2 = "MA_SEL_T" + i;
			problem.setColName(index, string1);
			problem.setColName(index + nStepsMPC, string2);
		}	
		
	}

	public LpSolve createDemandConstraints(LpSolve problem, BuildingMessage buildingMessage) throws LpSolveException {

        double [] demand = buildingMessage.getCombinedDemandVector();        
        System.out.println("Demand:  " + Arrays.toString(demand) + "    List size: " + buildingMessage.demandList.size());

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
		
		double factor = 24.0 / MILPTopology.TIMESTEPS_PER_DAY; // = 0.25 f�r 96 Schritte /Tag
		
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
        
        EnergyPrices energyPrices = new EnergyPrices();	
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
            	row[counter++] = pm.operationalPriceEURO;
            	controllableHandled++;
    		}
        	
        	for (ProducerMessage pm : buildingMessage.volatileProducerList) {    
        		int index = i + 1 + nStepsMPC * ((controllableHandled * 2)  + volatileHandled + (couplerHandled*2)+ (storageHandled*2)  );  	
            	colno[counter] = index;
            	row[counter++] = pm.operationalPriceEURO;
            	volatileHandled++;
    		}
        	
        	for (CouplerMessage cm : buildingMessage.couplerList) {    
        		int index = i + 1 + nStepsMPC * ((controllableHandled * 2)  + volatileHandled + (couplerHandled*2)+ (storageHandled*2)  );  	
            	colno[counter] = index;
            	row[counter++] = cm.operationalCostEUR;
            	couplerHandled++;
    		}
        	
        	for (StorageMessage sm : buildingMessage.storageList) {    
        		int index = i + 1 + nStepsMPC * ((controllableHandled * 2)  + volatileHandled + (couplerHandled*2)+ (storageHandled*2)  );  	
            	colno[counter] = index;
            	row[counter++] = sm.operationalPriceEURO;
            	couplerHandled++;
    		}
        	
        	// buy
        	int index = i + 1 + nStepsMPC * ((controllableHandled * 2)  + volatileHandled + (couplerHandled*2)+ (storageHandled*2)  );
        	colno[counter] = index;
        	row[counter++] = energyPrices.getElectricityPriceInEuro(cts+i);
        	// sell
        	colno[counter] = index+nStepsMPC;
        	row[counter++] = -energyPrices.getElectricityPriceInEuro(cts+i)*0.5;
        }
        
        //System.out.println("Adding objective --> row: " + Arrays.toString(row));
        //System.out.println("Adding objective --> col: " + Arrays.toString(colno));
        
        /* set the objective in lpsolve */
        problem.setObjFnex(counter, row, colno);        
        
        /* set the object direction to minimize */
        problem.setMinim(); 
		return problem;
	}

}
