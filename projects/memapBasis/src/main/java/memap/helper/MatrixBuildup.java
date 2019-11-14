package memap.helper;

import java.util.ArrayList;

import akka.systemActors.GlobalTime;
import memap.MemapConfig;
import memap.messages.BuildingMessage;
import memap.messages.extension.NetworkType;
import memap.messages.planning.CouplerMessage;
import memap.messages.planning.DemandMessage;
import memap.messages.planning.ProducerMessage;
import memap.messages.planning.StorageMessage;
import memap.messages.planning.VolatileProducerMessage;

public class MatrixBuildup {
	
	//  =========================== Matrix Filling ==============================
	int nStepsMPC = 0;
	
	public MatrixBuildup() {
		 nStepsMPC = MemapConfig.N_STEPS_MPC;
	}
		
	public OptimizationProblem singleBuilding(BuildingMessage buildingMessage) {		
		
		int nrOfStorages = buildingMessage.getNrOfStorages();
		int nrOfProducers = buildingMessage.getNrOfProducers();
		int nrOfCouplers = buildingMessage.getNrOfCouplers();
		
		OptimizationProblem problem = new OptimizationProblem(nStepsMPC, nrOfProducers, nrOfStorages, nrOfCouplers);	

		// ======= BUILD CONSUMPTION VECTOR b =========
		DemandMessage b_kopp = new DemandMessage();
		// account for heat transport Losses:
		problem.b_eq = b_kopp.calcHeatLosses(buildingMessage);
		
		/**********************************************
		 *  			BUILD Matrices
		 **********************************************/
		int producersHandled = 0;
		int storagesHandled = 0;
		int couplersHandled = 0;
		
		if (GlobalTime.getCurrentTimeStep() == 0) {
			System.out.println(" << " + buildingMessage.name + " >> ");
		}
		
		for(ProducerMessage producerMessage : buildingMessage.volatileProducerList) {
			addProducerToProblem(producerMessage, problem, producersHandled, storagesHandled, couplersHandled);
			producersHandled++;
			if (GlobalTime.getCurrentTimeStep() == 0) {
				System.out.println("Prod-Nr.: " + producersHandled + ", " + producerMessage.name);
			}
		}
		
		for(ProducerMessage producerMessage : buildingMessage.controllableProducerList) {
			addProducerToProblem(producerMessage, problem, producersHandled, storagesHandled, couplersHandled);
			producersHandled++;
			if (GlobalTime.getCurrentTimeStep() == 0) {
				System.out.println("Prod-Nr.: " + producersHandled + ", " + producerMessage.name);
			}
		}
		
		for(StorageMessage storageMessage : buildingMessage.storageList) {
			addStorageToProblem(storageMessage, problem, producersHandled, storagesHandled, couplersHandled);
			storagesHandled++;
			if (GlobalTime.getCurrentTimeStep() == 0) {
				System.out.println("Stor-Nr.: " + storagesHandled + ", " + storageMessage.name);
			}
		}
		
		for(CouplerMessage couplerMessage : buildingMessage.couplerList) {
			addCouplerToProblem(couplerMessage, problem, producersHandled, storagesHandled, couplersHandled);
			couplersHandled++;
			if (GlobalTime.getCurrentTimeStep() == 0) {
				System.out.println("Coupler-Nr.: " + couplersHandled + ", " + couplerMessage.name);
			}
		}
		
		addMarkets(problem, producersHandled, storagesHandled, couplersHandled, buildingMessage.LDHeating);
		
		return problem;
	}
		
	public OptimizationProblem multipleBuildings(ArrayList<BuildingMessage> buildingMessageList, boolean LDHeating) {			
		
		int nrOfProducers = 0;
		int nrOfStorages = 0;
		int nrOfCouplers = 0;
		
		for (BuildingMessage buildingMessage : buildingMessageList) {
			nrOfStorages += buildingMessage.getNrOfStorages();
			nrOfProducers += buildingMessage.getNrOfProducers();
			nrOfCouplers += buildingMessage.getNrOfCouplers();
		}
		
		OptimizationProblem problem = new OptimizationProblem(nStepsMPC, nrOfProducers, nrOfStorages, nrOfCouplers); // initiert nur die vektoren, matrizen, ohne f�llung
		
		/**
		 *  ======= BUILD CONSUMPTION VECTOR b =========
		 */		
		DemandMessage b_kopp = new DemandMessage();		
		// Sum of Consumption over all Buildings
		for(BuildingMessage buildingMessage : buildingMessageList) {
			// account for heat transport Losses:
			b_kopp.addConsumption(b_kopp.calcHeatLosses(buildingMessage));
		}
		problem.b_eq = b_kopp.getDemandVector();

		
		
		
		/**
		 *  ====== BUILD PRODUCER & STORAGES Matrices =========
		 */
//		System.out.println("****************************************************************");		
		if (GlobalTime.getCurrentTimeStep() == 0) {
			System.out.println(" << MEMAP >> ");
		}
		int producersHandled = 0;
		int storagesHandled = 0;
		int couplersHandled = 0;
		
		for(BuildingMessage buildingMessage : buildingMessageList) {
			
			for(ProducerMessage producerSpec : buildingMessage.volatileProducerList) {
				addProducerToProblem(producerSpec, problem, producersHandled, storagesHandled, couplersHandled);
				producersHandled++;
				if (GlobalTime.getCurrentTimeStep() == 0) {
					System.out.println("Prod-Nr.: " + producersHandled + ", " + buildingMessage.name+ ", " + producerSpec.name);
				}
			}
			
			for(ProducerMessage producerSpec : buildingMessage.controllableProducerList) {
				addProducerToProblem(producerSpec, problem, producersHandled, storagesHandled, couplersHandled);
				producersHandled++;
				if (GlobalTime.getCurrentTimeStep() == 0) {
					System.out.println("Prod-Nr.: " + producersHandled + ", " + buildingMessage.name+ ", " + producerSpec.name);
				}
			}	
			
			for(StorageMessage storageSpec : buildingMessage.storageList) {
				addStorageToProblem(storageSpec, problem, producersHandled, storagesHandled, couplersHandled);
				storagesHandled++;
				if (GlobalTime.getCurrentTimeStep() == 0) {
					System.out.println("Stor-Nr.: " + storagesHandled + ", " + buildingMessage.name+ ", " + storageSpec.name);
				}
			}
			
			for(CouplerMessage couplerMessage : buildingMessage.couplerList) {
				addCouplerToProblem(couplerMessage, problem, producersHandled, storagesHandled, couplersHandled);
				couplersHandled++;
				if (GlobalTime.getCurrentTimeStep() == 0) {
					System.out.println("Coupler-Nr.: " + couplersHandled + ", " + couplerMessage.name);
				}
			}
		}						
		
		addMarkets(problem, producersHandled, storagesHandled, couplersHandled, LDHeating);
		
		if (GlobalTime.getCurrentTimeStep() == 0) {
			System.out.println("****************************************************************");
		}
		
		return problem;
	}		

	private void addProducerToProblem(
			ProducerMessage producerMessage,
			OptimizationProblem optProblem,
			int producersHandledSoFar,
			int storagesHandledSoFar, int couplersHandledSoFar) {
						
		int n_index = nStepsMPC*(producersHandledSoFar+2*storagesHandledSoFar + couplersHandledSoFar);				
		
		double[] lambda = new double[nStepsMPC];
		double[] lb = new double[nStepsMPC];
		double[] ub = new double[nStepsMPC];
		
		String[] namesUB = new String[nStepsMPC];
		
		double[][] couplingMatrix_H = new double[nStepsMPC][nStepsMPC];
		double[][] couplingMatrix_el = new double[nStepsMPC][nStepsMPC];
				
		// fill the basic vectors and matrices
		for(int i = 0; i < nStepsMPC; i++) {
			lambda[i] = producerMessage.operationalPriceEURO;
			lb[i] = 0;
			ub[i] = producerMessage.installedPower;		
			namesUB[i] = producerMessage.name;
		}
		
		if (producerMessage instanceof VolatileProducerMessage) {
			for(int i = 0; i < nStepsMPC; i++) {
				ub[i] = ((VolatileProducerMessage) producerMessage).forecast[i];			
			}
		}
		
		if (producerMessage.networkType.equals(NetworkType.HEAT)) {
			for(int i = 0; i < nStepsMPC; i++) {
				couplingMatrix_H[i][i] = -producerMessage.efficiency;
			}
		}
		
		if (producerMessage.networkType.equals(NetworkType.ELECTRICITY)) {
			for(int i = 0; i < nStepsMPC; i++) {
				couplingMatrix_el[i][i] = -producerMessage.efficiency;
			}
		}
		
		// fill the problem matrices
		for(int i = 0; i < nStepsMPC; i++) {
			optProblem.lambda[n_index+i] = lambda[i];
			optProblem.x_lb[n_index+i] = lb[i];
			optProblem.x_ub[n_index+i] = ub[i];
			optProblem.namesUB[n_index+i] = namesUB[i];
			
			for(int j = 0; j < nStepsMPC; j++) {
				optProblem.a_eq[i][n_index +j] = couplingMatrix_H[i][j];
				optProblem.a_eq[nStepsMPC+i][n_index+j] = couplingMatrix_el[i][j];
			}
		}
	}
	
	private void addCouplerToProblem(
			CouplerMessage couplerMessage,
			OptimizationProblem optProblem,
			int producersHandledSoFar,
			int storagesHandledSoFar, 
			int couplersHandledSoFar) {
						
		double[] lambda = new double[nStepsMPC];
		double[] lb = new double[nStepsMPC];
		double[] ub = new double[nStepsMPC];
		String[] namesUB = new String[nStepsMPC];
		
		double[][] couplingMatrix_H = new double[nStepsMPC][nStepsMPC];
		double[][] couplingMatrix_el = new double[nStepsMPC][nStepsMPC];						
				
		// fill the matrices
		
		int n_index = nStepsMPC*(producersHandledSoFar+2*storagesHandledSoFar + couplersHandledSoFar);
		
		for(int i = 0; i < nStepsMPC; i++) {
			lambda[i] = couplerMessage.operationalCostEUR;
			lb[i] = 0;
			// Achtung hier spielen die Effizienzen eine Rolle, wegen den angegeben Leistungen.
			// Z.b. brauch eine 10kW W�rmepumpe keine 10kW Strom.
			ub[i] = couplerMessage.installedPower / couplerMessage.efficiencyHeat;
			namesUB[i] = couplerMessage.name;
			
		}
		
		for(int i = 0; i < nStepsMPC; i++) {
			couplingMatrix_H[i][i] = -couplerMessage.efficiencyHeat;
		}
		
		for(int i = 0; i < nStepsMPC; i++) {
			couplingMatrix_el[i][i] = -couplerMessage.efficiencyElec;
		}
		
		// fill the problem matrices
		for(int i = 0; i < nStepsMPC; i++) {
			optProblem.lambda[n_index+i] = lambda[i];
			optProblem.x_lb[n_index+i] = lb[i];
			optProblem.x_ub[n_index+i] = ub[i];
			optProblem.namesUB[n_index+i] = namesUB[i];
			
			for(int j = 0; j < nStepsMPC; j++) {
				optProblem.a_eq[i][n_index +j] = couplingMatrix_H[i][j];
				optProblem.a_eq[nStepsMPC+i][n_index+j] = couplingMatrix_el[i][j];
			}
		}
	}
	
	private void addStorageToProblem(
			StorageMessage storageMessage, 
			OptimizationProblem problem, 
			int producersHandledSoFar, 
			int storagesHandledSoFar, 
			int couplersHandlerdSoFar) {
		
		// Matrizen bef�llen. Zuerst die regul�ren, dann die Kapazit�t
				
		double[] lambda = new double[2*nStepsMPC];
		double[] lb = new double[2*nStepsMPC];
		double[] ub = new double[2*nStepsMPC];
		String[] namesUB = new String[2*nStepsMPC];
		
		double[][] couplingMatrix_H = new double[nStepsMPC][2*nStepsMPC];
		double[][] couplingMatrix_el = new double[nStepsMPC][2*nStepsMPC];		
		
		for(int i = 0; i < nStepsMPC; i++) { // zuerst kommt das ent-laden (produzieren), dann das be-laden (verbrauchen)
			lambda[i] = storageMessage.operationalPriceEURO;
			lambda[nStepsMPC+i] = storageMessage.operationalPriceEURO;
			lb[i] = 0;
			lb[nStepsMPC+i] = 0;
			ub[i] = storageMessage.maxDischarge;
			ub[nStepsMPC + i] = storageMessage.maxLoad;
			namesUB[i] = storageMessage.name+"Discharge";
			namesUB[nStepsMPC+i] = storageMessage.name+"Charge";
		}
		
		double effIN = storageMessage.efficiencyCharge;
		double effOUT = storageMessage.efficiencyDischarge;
		
		if (storageMessage.networkType.equals(NetworkType.HEAT)) {
			for(int i = 0; i < nStepsMPC; i++) {
				couplingMatrix_H[i][i] = -1;
				couplingMatrix_H[i][nStepsMPC + i] = 1;
				/*
				couplingMatrix_H[i][i] = -effOUT;
				couplingMatrix_H[i][nStepsMPC + i] = effIN;
				*/
			}
		}
		
		if (storageMessage.networkType.equals(NetworkType.ELECTRICITY)) {
			for(int i = 0; i < nStepsMPC; i++) {
				
				couplingMatrix_el[i][i] = -1;
				couplingMatrix_el[i][nStepsMPC + i] = 1;
				
				/*
				couplingMatrix_el[i][i] = -effOUT;
				couplingMatrix_el[i][nStepsMPC + i] = effIN;
				*/
			}
		}
		
		// Kapazit�t
		double [] h_vector = new double[2*nStepsMPC];		
		double[][] capacityMatrix1 = new double[nStepsMPC][2*nStepsMPC];
		double[][] capacityMatrix2 = new double[nStepsMPC][2*nStepsMPC];
		
		double maxDischargeCapacity = storageMessage.stateOfCharge;
		if (maxDischargeCapacity >= storageMessage.capacity) {
			maxDischargeCapacity = storageMessage.capacity;
		}
		if (maxDischargeCapacity <= 0) {
			maxDischargeCapacity = 0.0001;
		}
		
		double maxChargeCapacity = storageMessage.capacity - storageMessage.stateOfCharge;
		if (maxChargeCapacity <= 0.0) {
			maxChargeCapacity = 0.0001;
		}
		if (maxChargeCapacity >= storageMessage.capacity) {
			maxChargeCapacity = storageMessage.capacity;
		}
		
		
		double factor = 24.0 / MemapConfig.TIMESTEPS_PER_DAY; // = 0.25 f�r 96 Schritte /Tag
		
		for(int i = 0; i < nStepsMPC; i++) {		
			for(int j = 0; j <= i; j++) {
				capacityMatrix1[i][j] = 1/effOUT * factor; 
				capacityMatrix2[i][j] = -1/effOUT * factor;
				
				capacityMatrix1[i][j+nStepsMPC] = -effIN * factor;
				capacityMatrix2[i][j+nStepsMPC] = effIN * factor;
			}
			
			h_vector[i] = maxDischargeCapacity;
			h_vector[nStepsMPC + i] = maxChargeCapacity;
		}
		
		// Matrizen in das Gesamtsystem �bernehmen
		int n_index = nStepsMPC*(producersHandledSoFar+2*storagesHandledSoFar + couplersHandlerdSoFar);

		for(int i = 0; i < nStepsMPC; i++) {
			if(i < nStepsMPC) {
				for(int j = 0; j < 2*nStepsMPC; j++) {
					problem.a_eq[i][n_index+j] = couplingMatrix_H[i][j];
					problem.a_eq[nStepsMPC+i][n_index+j] = couplingMatrix_el[i][j];
					problem.g[nStepsMPC*(2*storagesHandledSoFar)+i][n_index+j] = capacityMatrix1[i][j];
					problem.g[nStepsMPC*(1+2*storagesHandledSoFar)+i][n_index+j] = capacityMatrix2[i][j];
					problem.lambda[n_index+j] = storageMessage.operationalPriceEURO;
					problem.x_lb[n_index+j] = lb[j];
					problem.x_ub[n_index+j] = ub[j];
					problem.namesUB[n_index+j] = namesUB[j];
					
					problem.h[nStepsMPC*(2*storagesHandledSoFar)+j] = h_vector[j];	
				}
			}
		}
	}
	
	private void addMarkets(
			OptimizationProblem problem, 
			int producersHandled, int storagesHandled, int couplersHandled, 
			boolean lDHeating) {		
		// After the last systems was added, more matrices will be added to handle buying and selling of electricity and heat
		if (producersHandled+storagesHandled+couplersHandled == problem.getNumberofProducers()+problem.getNumberofStorages()+ problem.getNumberofCouplers()) {				
			int n_index = nStepsMPC*(producersHandled+2*storagesHandled+couplersHandled);
			EnergyPrices energyPrices = new EnergyPrices();			
			for(int i = 0; i < 2*nStepsMPC; i++) {
				// limits for JOptimizer: selling or buying of electricity
				problem.x_lb[n_index+i] = 0.0;
				problem.x_ub[n_index+i] = 999.9;
				
				// limits for JOptimizer: selling or buying of heat
				problem.x_lb[2*nStepsMPC+n_index+i] = 0.0;
				if (lDHeating) {
					problem.x_ub[2*nStepsMPC+n_index+i] = 999.0;	// able to purchase heat
				} else {
					problem.x_ub[2*nStepsMPC+n_index+i] = 0.0;
				}
			}			
			int cts = GlobalTime.getCurrentTimeStep();
			for(int j = 0; j < nStepsMPC; j++) {				
				problem.a_eq[nStepsMPC+j][n_index+j] = -1.0;  			// matrix: buying of electricity
				problem.namesUB[n_index+j] = "ElecBuy";
				
				problem.a_eq[nStepsMPC+j][n_index+nStepsMPC+j] = 1.0;	// matrix: selling of electricity
				problem.namesUB[nStepsMPC+n_index+j] = "ElecSell";
				
				problem.a_eq[j][n_index+2*nStepsMPC+j] = -1.0;  		// matrix: buying of heat
				problem.namesUB[2*nStepsMPC+n_index+j] = "HeatBuy";
				
				problem.a_eq[j][n_index+3*nStepsMPC+j] = 1.0;			// matrix: selling/disposing of heat		
				problem.namesUB[3*nStepsMPC+n_index+j] = "HeatSell";
				
				// Extended price vector for market
				problem.lambda[n_index+j] = energyPrices.getElectricityPriceInEuro(cts+j);					// electricity buy price
				problem.lambda[n_index+nStepsMPC+j] = -energyPrices.getElectricityPriceInEuro(cts+j)*0.5;   // electricity sell price
				problem.lambda[n_index+2*nStepsMPC+j] = EnergyPrices.getHeatPriceInEuro(cts+j);				// heat buy price
				problem.lambda[n_index+3*nStepsMPC+j] = -0.0;												// heat sell price
			}			
		}		
	}
}
