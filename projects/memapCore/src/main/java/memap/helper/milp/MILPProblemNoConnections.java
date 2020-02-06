package memap.helper.milp;

import akka.systemActors.GlobalTime;
import lpsolve.LpSolve;
import lpsolve.LpSolveException;
import memap.main.TopologyConfig;
import memap.messages.BuildingMessage;
import memap.messages.extension.NetworkType;
import memap.messages.planning.CouplerMessage;
import memap.messages.planning.ProducerMessage;
import memap.messages.planning.StorageMessage;
import memap.messages.planning.VolatileProducerMessage;

/**
 * This class is responsible to modify the problem of the MILP solver.
 * It is very similar to MILPProblemWithConnections.
 * It would be good to merge these 2 classes, but this is left for later.
 * Be carefull, when modifying those two classes. 
 */
public class MILPProblemNoConnections extends MILPProblem {		
	
	public MILPProblemNoConnections(int nStepsMPC, int nCols) {
		super(nStepsMPC, nCols);		
		System.out.println("Works until here");
	}
	
	public LpSolve createNames(LpSolve problem, BuildingMessage buildingMessage) throws LpSolveException {
		
        MILPIndexHelper mihelper = new MILPIndexHelper(nStepsMPC);
        
		for(ProducerMessage producerMessage : buildingMessage.controllableProducerList) {
			MILPHelper.addControllableToProblem(producerMessage, problem, mihelper);
			mihelper.controllableHandled++;
		}
		
		for(ProducerMessage producerMessage : buildingMessage.volatileProducerList) {
			MILPHelper.addVolatileToProblem(producerMessage, problem, mihelper);
			mihelper.volatileHandled++;
		}
		
		for(CouplerMessage couplerMessage : buildingMessage.couplerList) {
			MILPHelper.addCouplerToProblem(couplerMessage, problem, mihelper);
			mihelper.couplerHandled++;
		}
		
		for(StorageMessage storageMessage : buildingMessage.storageList) {
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
            MILPIndexHelper ih = new MILPIndexHelper(nStepsMPC);

        	for (ProducerMessage pm : buildingMessage.controllableProducerList) {        		
        		int addon = nStepsMPC * ((ih.controllableHandled * 2)  + ih.volatileHandled + (ih.couplerHandled*2)+ (ih.storageHandled*2));        		
        		int index = i + 1 + addon;
        		
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
        		
            	ih.controllableHandled++;
			}
        	
        	for (ProducerMessage pm : buildingMessage.volatileProducerList) {        		
        		int index = i + 1 + nStepsMPC * ((ih.controllableHandled * 2)  + ih.volatileHandled + (ih.couplerHandled*2)+ (ih.storageHandled*2)  );
        		
        		VolatileProducerMessage vpm = (VolatileProducerMessage) pm;
        		
            	// MAX Constraints, for both el. and heat
            	double[] row = new double[nCols+1];
        		row[index] = 1;        		
        		problem.addConstraint(row, LpSolve.LE, vpm.forecast[i]);
            	//System.out.println("Adding max constraint VP --> row: " + Arrays.toString(row) + " <= " + vpm.forecast[i]);

            	ih.volatileHandled++;
			}
        	
        	
        	for (CouplerMessage cm : buildingMessage.couplerList) {        		
        		int index = i + 1 + nStepsMPC * ((ih.controllableHandled * 2)  + ih.volatileHandled + (ih.couplerHandled*2)+ (ih.storageHandled*2)  );
        		
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
            	
            	ih.couplerHandled++;
			}
        	
        	for (StorageMessage sm : buildingMessage.storageList) {
        		int index = i + 1 + nStepsMPC * ((ih.controllableHandled * 2)  + ih.volatileHandled + (ih.couplerHandled*2)+ (ih.storageHandled*2));        		
        		
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
	        	
	        	//System.out.println("Adding SOC charging constraints --> rowCHARGE: " + Arrays.toString(rowCHARGE) + " <= " + maxChargeCapacity);
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
	
}