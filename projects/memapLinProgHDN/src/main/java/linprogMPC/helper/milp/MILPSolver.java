package linprogMPC.helper.milp;

import java.util.Arrays;

import linprogMPC.helper.EnergyPrices;
import linprogMPC.messages.BuildingMessage;
import linprogMPC.messages.planning.ProducerMessage;
import linprogMPC.messages.planning.StorageMessage;
import lpsolve.LpSolve;
import lpsolve.LpSolveException;

/**
 * TODO This class shall be responsible to create the MILP Optimization Problem and solve it.
 * 
 * @author bytschkow
 *
 */
public class MILPSolver {
	
	static EnergyPrices energyPrices = new EnergyPrices(); // is only used once.
	
	BuildingMessage buildingMessage;
	int nStepsMPC = 0;

	public MILPSolver(BuildingMessage buildingMessage, int nStepsMPC) {
		this.buildingMessage = buildingMessage;
		this.nStepsMPC = nStepsMPC;
		
		System.out.println(nStepsMPC);
		System.out.println(buildingMessage);
		
				
		try {
			this.createModel();
		} catch (LpSolveException e) {
			e.printStackTrace();
		}
	}
	
	/**  
	 * note the difficulty is that all goes into one big matrix. Therefore, it needs to be carefully, to keep it modular.  
	 */
	public void createModel() throws LpSolveException {
		// 1) find out the number of individual contributers.
		
		int numberControllableProducers = buildingMessage.getNrOfControllableProducers();
		int numberVolatileProducers = buildingMessage.getNrOfVolatileProducers();
		int numberCouplers = buildingMessage.getNrOfCouplers();
		int numberStorages = buildingMessage.getNrOfStorages();
		
		// + Controllable have booleans + production
		// + Volotile Comp. have only production
		// + Couplers have booleand + production
		// + Storages have two production
		// + E-market
		
		/* this will be the x vector*/
		int nCols = nStepsMPC * ( (numberControllableProducers*2) + 
				+ (numberVolatileProducers) + (numberCouplers * 2) + (numberStorages*2) + (2) ); 					
		
		/* Create enough space for one row in matrix */ 
	 	double[] row = new double[nCols+1]; // be careful, the zero entry somehow is not counted... 
	 	
	 	/* Create an empty model  */
	 	LpSolve lp = LpSolve.makeLp(0, nCols);
        if(lp.getLp() == 0) return; /* couldn't construct a new model... */
        
        System.out.println("MILP preparation");
        System.out.println("nCols: " + nCols);
        
		// 2) check the demand (equality constraints)
        
        double [] demand = buildingMessage.getCombinedDemandVector();
        
        System.out.println("I'm here in MILP");
        System.out.println("Demand:  " + Arrays.toString(demand) + "    List size: " + buildingMessage.demandList.size());

        // Assumes that there are only heat producers
        /* first HEAT components */
        for (int i = 0; i < demand.length / 2; i++) {
        	
        	int counter = i+1;
        	double[] rowHEAT = new double[nCols+1];
        	
        	// here we have many shifts due to nStepsMPC, be careful
        	
        	for (ProducerMessage pm : buildingMessage.controllableProducerList) {
        		rowHEAT[counter] = -pm.efficiency;
        		lp.setBinary(counter+nStepsMPC, true);
			}
        	
        	counter = counter + nStepsMPC * 2;
        	for (StorageMessage sm : buildingMessage.storageList) {
        		rowHEAT[counter] = -1;
        		rowHEAT[counter + nStepsMPC] = 1;
			}
        	
        	lp.addConstraint(rowHEAT, LpSolve.EQ, demand[i]);
        	
        	System.out.println("index i: " + i);
        	System.out.println("rowHEAT: " + Arrays.toString(rowHEAT));
        	lp.writeLp("MILP_MEMAP"+i+".lp");
		}
        
    	
        
	 	
	 	int countTimeStep = 0;
        for (int i = demand.length / 2; i < demand.length; i++) {
        	double[] rowELEC = new double[nCols+1];	
        	/* TODO ADD Electricity
        	for (ProducerMessage pm : buildingMessage.controllableProducerList) {
        		colno[counter] = counter;
        		row[counter] = -pm.efficiency;
        		counter++;
        		colno[counter] = counter;
        		row[counter] = 0; // Boolsche Variable hat nur Einfluss auf min, max, nicht aber auf produktion.
        		counter++;
			}
        	
        	for (StorageMessage sm : buildingMessage.storageList) {
        		colno[counter] = counter;
        		row[counter] = -1;
        		counter++;
        		colno[counter] = counter;
        		row[counter] = 1;
        		counter++;
			}
			*/
        	
        	// ADD Markets

        	int countShifts = (numberControllableProducers*2) + 
    				+ (numberVolatileProducers) + (numberCouplers * 2) + (numberStorages*2);
        	int counter = nStepsMPC*countShifts + 1 + countTimeStep; 
        	
    	 	rowELEC[counter] = -1;
        	rowELEC[counter+nStepsMPC] = 1;
        	
        	lp.addConstraint(rowELEC, LpSolve.EQ, demand[i]);
        	
        	System.out.println("Adding markets --> rowELEC: " + Arrays.toString(rowELEC));
        	lp.writeLp("MILP_MEMAP"+i+".lp");
        	
        	countTimeStep++;
		}                       
        
		// 3) inequality constraints
        
        // HEAT
        for (int i = 0; i < demand.length / 2; i++) {
        	
        	int counter = i+1;
        	// MAX Constraints
        	for (ProducerMessage pm : buildingMessage.controllableProducerList) {        		
            	double[] rowHEAT = new double[nCols+1];
        		rowHEAT[counter] = pm.efficiency;
        		rowHEAT[counter + nStepsMPC] = pm.maxPower;        		
        		lp.addConstraint(rowHEAT, LpSolve.LE, pm.maxPower);            	
            	System.out.println("Adding max constraint --> rowHEAT: " + Arrays.toString(rowHEAT) + " <= " + pm.maxPower);
			}

        	// MIN Constraints
        	for (ProducerMessage pm : buildingMessage.controllableProducerList) {        		
            	double[] rowHEAT = new double[nCols+1];
        		rowHEAT[counter] = -pm.efficiency;
        		rowHEAT[counter + nStepsMPC] = -pm.minPower;        		
        		lp.addConstraint(rowHEAT, LpSolve.LE, -pm.minPower);
            	System.out.println("Adding min constraint --> rowHEAT: " + Arrays.toString(rowHEAT) + " <= -" + pm.minPower);
			}
		}
        
        // TODO hier weiter!!!
		
		// 4) soc inequalitiy constraints.
                
		// 6) Set objective function, here index starts from zero again...
        lp.setAddRowmode(false); /* rowmode should be turned off again when done building the model */
        int[] colno  = new int[nCols];
        
        for (int i = 0; i < nStepsMPC; i++) {
        	for (ProducerMessage pm : buildingMessage.controllableProducerList) {        		
            	colno[i] = i+1;
            	row[i] = pm.operationalPriceEURO;
    		}
        }
        
        
        
        /* set the objective in lpsolve */
        lp.setObjFnex(2, row, colno);        
        
        /* set the object direction to minimize */
        lp.setMinim();        
        
        /* just out of curioucity, now generate the model in lp format in file model.lp */
        lp.writeLp("MILP_MEMAP.lp");
        System.out.println("problem written");

		
	}


	public int solveMILP() {
		return 0;
	}
	
	
}
