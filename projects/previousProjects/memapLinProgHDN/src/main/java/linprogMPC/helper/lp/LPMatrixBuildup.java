package linprogMPC.helper.lp;

import java.util.ArrayList;
import java.util.HashMap;

import linprogMPC.ConfigurationMEMAP;
import linprogMPC.MILPTopology;
import linprogMPC.helper.EnergyPrices;
import linprogMPC.messages.BuildingMessage;
import linprogMPC.messages.extension.NetworkType;
import linprogMPC.messages.planning.ConnectionMessage;
import linprogMPC.messages.planning.CouplerMessage;
import linprogMPC.messages.planning.DemandMessage;
import linprogMPC.messages.planning.ProducerMessage;
import linprogMPC.messages.planning.StorageMessage;
import linprogMPC.messages.planning.VolatileProducerMessage;

/**
 * Note, this class is used to solve the LP problem.
 * The class was refactored at 15.11.2019 in the process of introducing MILP.
 * In that process we removed the dependency on the old LDHeating boolean in that class.
 * 
 * @author bytschkow
 *
 */
public class LPMatrixBuildup {
	
	//  =========================== Matrix Filling ==============================
	int nStepsMPC = 0;
	
	HashMap<String, Integer> mapBuildingToInt = new HashMap<>();
	HashMap<String, Integer> mapConnectionMessageToInt = new HashMap<>();
	ArrayList<String> arrayOfBuildings = new ArrayList<>();
	
	
	public LPMatrixBuildup() {
		 nStepsMPC = MILPTopology.N_STEPS_MPC;
	}
		
	public LPOptimizationProblem singleBuilding(BuildingMessage buildingMessage, int currentTimeStep) {		
		
		int nrOfStorages = buildingMessage.getNrOfStorages();
		int nrOfProducers = buildingMessage.getNrOfControllableProducers() + buildingMessage.getNrOfVolatileProducers();
		int nrOfCouplers = buildingMessage.getNrOfCouplers();
		
		LPOptimizationProblem problem = new LPOptimizationProblem(nStepsMPC, 1, nrOfProducers, nrOfStorages, nrOfCouplers, 0);

		// ======= BUILD CONSUMPTION VECTOR b =========			
		problem.b_eq = buildingMessage.getCombinedDemandVector();
		
		/**********************************************
		 *  			BUILD Matrices
		 **********************************************/
		int producersHandled = 0;
		int storagesHandled = 0;
		int couplersHandled = 0;
		
		if (currentTimeStep == 0 && ConfigurationMEMAP.chosenMEMAPLogging == ConfigurationMEMAP.MEMAPLogging.ALL) {
			System.out.println(" << " + buildingMessage.name + " >> ");
		}
		
		for(ProducerMessage producerMessage : buildingMessage.volatileProducerList) {
			addProducerToProblem(producerMessage, problem, 0, producersHandled, storagesHandled, couplersHandled, 0);
			producersHandled++;
			if (currentTimeStep == 0 && ConfigurationMEMAP.chosenMEMAPLogging == ConfigurationMEMAP.MEMAPLogging.ALL) {
				System.out.println("Prod-Nr.: " + producersHandled + ", " + producerMessage.name);
			}
		}
		
		for(ProducerMessage producerMessage : buildingMessage.controllableProducerList) {
			addProducerToProblem(producerMessage, problem, 0, producersHandled, storagesHandled, couplersHandled, 0);
			producersHandled++;
			if (currentTimeStep == 0 && ConfigurationMEMAP.chosenMEMAPLogging == ConfigurationMEMAP.MEMAPLogging.ALL) {
				System.out.println("Prod-Nr.: " + producersHandled + ", " + producerMessage.name);
			}
		}
		
		for(StorageMessage storageMessage : buildingMessage.storageList) {
			addStorageToProblem(storageMessage, problem, 0, producersHandled, storagesHandled, couplersHandled, 0);
			storagesHandled++;
			if (currentTimeStep == 0 && ConfigurationMEMAP.chosenMEMAPLogging == ConfigurationMEMAP.MEMAPLogging.ALL) {
				System.out.println("Stor-Nr.: " + storagesHandled + ", " + storageMessage.name);
			}
		}
		
		for(CouplerMessage couplerMessage : buildingMessage.couplerList) {
			addCouplerToProblem(couplerMessage, problem, 0, producersHandled, storagesHandled, couplersHandled, 0);
			couplersHandled++;
			if (currentTimeStep == 0 && ConfigurationMEMAP.chosenMEMAPLogging == ConfigurationMEMAP.MEMAPLogging.ALL) {
				System.out.println("Coupler-Nr.: " + couplersHandled + ", " + couplerMessage.name);
			}
		}
		
		addMarkets(problem, 1, producersHandled, storagesHandled, couplersHandled, 0, currentTimeStep);
		
		return problem;
	}
		
	public LPOptimizationProblem multipleBuildings(ArrayList<BuildingMessage> buildingMessageList, int currentTimeStep) {
		
		int nrOfBuildings = 0;
		int nrOfProducers = 0;
		int nrOfStorages = 0;
		int nrOfCouplers = 0;
		int nrOfConnections = 0;
		
		for (BuildingMessage buildingMessage : buildingMessageList) {
			
			mapBuildingToInt.put(buildingMessage.name, nrOfBuildings);
			arrayOfBuildings.add(buildingMessage.name);
			
			// note, this is a hack, that assumes that buildings are named "B...1", "B..2", etc.
			// note, this might be super buggy...
			
			for (ConnectionMessage cm : buildingMessage.connectionList) {
				if (cm.connectedBuildingTo.contains("1")) mapConnectionMessageToInt.put(cm.name, 0);
				if (cm.connectedBuildingTo.contains("2")) mapConnectionMessageToInt.put(cm.name, 1);
				if (cm.connectedBuildingTo.contains("3")) mapConnectionMessageToInt.put(cm.name, 2);
				if (cm.connectedBuildingTo.contains("4")) mapConnectionMessageToInt.put(cm.name, 3);
				if (cm.connectedBuildingTo.contains("5")) mapConnectionMessageToInt.put(cm.name, 4);
			}
			
			nrOfBuildings++;
			nrOfStorages += buildingMessage.getNrOfStorages();
			nrOfProducers += buildingMessage.getNrOfControllableProducers() + buildingMessage.getNrOfVolatileProducers();
			nrOfCouplers += buildingMessage.getNrOfCouplers();
			nrOfConnections += buildingMessage.getNrOfConnections();			
		}
		
		LPOptimizationProblem problem = new LPOptimizationProblem(nStepsMPC, nrOfBuildings, nrOfProducers, nrOfStorages, nrOfCouplers, nrOfConnections); // initiert nur die vektoren, matrizen, ohne fuellung
		
		/**
		 *  ======= BUILD CONSUMPTION VECTOR b =========
		 *  Note, this version was used for the LP.
		 *  In the mean time, we removed some part of the old code,
		 *  so that we needed to adapted this code.
		 */				
		DemandMessage b_kopp = new DemandMessage();
		int b_index = 0;
		double[] b_building = new double[nStepsMPC*2];
		// Sum of Consumption over all Buildings
		// Heating
		for(BuildingMessage buildingMessage : buildingMessageList) {
			b_building = buildingMessage.getCombinedDemandVector();
			for(int i = 0; i < nStepsMPC; i++) {
				problem.b_eq[b_index*nStepsMPC+i] = b_building[i];
			}
			b_kopp.addConsumption(b_building);
			b_index++;
		}
		
		// electricity
		for(int i = 0; i < nStepsMPC; i++) {
			problem.b_eq[b_index*nStepsMPC+i] = b_kopp.getDemandVector()[nStepsMPC+i];
		}
		
		/**
		 *  ====== BUILD PRODUCER & STORAGES Matrices =========
		 */
		if (currentTimeStep == 0) {
			System.out.println(" << MEMAP >> ");
		}
		int buildingsHandled = 0;
		int producersHandled = 0;
		int storagesHandled = 0;
		int couplersHandled = 0;
		int connectionsHandled = 0;
		
		for(BuildingMessage buildingMessage : buildingMessageList) {
			
			for(ProducerMessage producerSpec : buildingMessage.volatileProducerList) {
				addProducerToProblem(producerSpec, problem, buildingsHandled, producersHandled, storagesHandled, couplersHandled, connectionsHandled);
				producersHandled++;
				if (currentTimeStep == 0) {
					System.out.println("Prod-Nr.: " + producersHandled + ", " + buildingMessage.name+ ", " + producerSpec.name);
				}
			}
			
			for(ProducerMessage producerSpec : buildingMessage.controllableProducerList) {
				addProducerToProblem(producerSpec, problem, buildingsHandled, producersHandled, storagesHandled, couplersHandled, connectionsHandled);
				producersHandled++;
				if (currentTimeStep == 0) {
					System.out.println("Prod-Nr.: " + producersHandled + ", " + buildingMessage.name+ ", " + producerSpec.name);
				}
			}	
			
			for(StorageMessage storageSpec : buildingMessage.storageList) {
				addStorageToProblem(storageSpec, problem, buildingsHandled, producersHandled, storagesHandled, couplersHandled, connectionsHandled);
				storagesHandled++;
				if (currentTimeStep == 0) {
					System.out.println("Stor-Nr.: " + storagesHandled + ", " + buildingMessage.name+ ", " + storageSpec.name);
				}
			}
			
			for(CouplerMessage couplerMessage : buildingMessage.couplerList) {
				addCouplerToProblem(couplerMessage, problem, buildingsHandled, producersHandled, storagesHandled, couplersHandled, connectionsHandled);
				couplersHandled++;
				if (currentTimeStep == 0) {
					System.out.println("Coupler-Nr.: " + couplersHandled + ", " + couplerMessage.name);
				}
			}
			
			for(ConnectionMessage connectionMessage : buildingMessage.connectionList) {
				addConnectionToProblem(connectionMessage, problem, buildingsHandled, producersHandled, storagesHandled, couplersHandled, connectionsHandled);
				connectionsHandled++;
				if (currentTimeStep == 0) {
					System.out.println("Connection-Nr.: " + connectionsHandled + ", " + connectionMessage.name);
				}
			}
			
			buildingsHandled++;
		}						
		
		addMarkets(problem, buildingsHandled, producersHandled, storagesHandled, couplersHandled, connectionsHandled, currentTimeStep);
		
		if (currentTimeStep == 0) {
			System.out.println("****************************************************************");
		}
		
		return problem;
	}		

	private void addProducerToProblem(
			ProducerMessage producerMessage,
			LPOptimizationProblem optProblem,
			int buildingsHandledSoFar,
			int producersHandledSoFar,
			int storagesHandledSoFar, int couplersHandledSoFar, int connectionsHandledSoFar) {
						
		int n_index = nStepsMPC*(producersHandledSoFar+2*storagesHandledSoFar+couplersHandledSoFar+2*connectionsHandledSoFar);			
		int b_index = nStepsMPC*buildingsHandledSoFar;
		int el_index = nStepsMPC*optProblem.getNrOfBuildings();
		
		double[] lambda = new double[nStepsMPC];
		double[] lambdaCO2 = new double[nStepsMPC];
		double[] lb = new double[nStepsMPC];
		double[] ub = new double[nStepsMPC];
		
		String[] namesUB = new String[nStepsMPC];
		
		double[][] couplingMatrix_H = new double[nStepsMPC][nStepsMPC];
		double[][] couplingMatrix_el = new double[nStepsMPC][nStepsMPC];
				
		// fill the basic vectors and matrices
		for(int i = 0; i < nStepsMPC; i++) {
			lambda[i] = producerMessage.operationalCostEUR;
			lambdaCO2[i] = producerMessage.operationalCostCO2;
			lb[i] = 0;
			ub[i] = producerMessage.maxPower;		
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
			optProblem.lambdaCO2[n_index+i] = lambdaCO2[i];
			optProblem.x_lb[n_index+i] = lb[i];
			optProblem.x_ub[n_index+i] = ub[i];
			optProblem.namesUB[n_index+i] = namesUB[i];
			optProblem.etas[n_index+i] = producerMessage.efficiency;
			
			for(int j = 0; j < nStepsMPC; j++) {
				optProblem.a_eq[b_index+i][n_index +j] = couplingMatrix_H[i][j];
				optProblem.a_eq[el_index+i][n_index+j] = couplingMatrix_el[i][j];
			}
		}
	}
	
	private void addCouplerToProblem(
			CouplerMessage couplerMessage,
			LPOptimizationProblem optProblem,
			int buildingsHandledSoFar,
			int producersHandledSoFar,
			int storagesHandledSoFar, 
			int couplersHandledSoFar,
			int connectionsHandledSoFar) {
		
		double[] lambda = new double[nStepsMPC];
		double[] lambdaCO2 = new double[nStepsMPC];
		double[] lb = new double[nStepsMPC];
		double[] ub = new double[nStepsMPC];
		String[] namesUB = new String[nStepsMPC];
		
		double[][] couplingMatrix_H = new double[nStepsMPC][nStepsMPC];
		double[][] couplingMatrix_el = new double[nStepsMPC][nStepsMPC];						
				
		// fill the matrices
		
		int n_index = nStepsMPC*(producersHandledSoFar+2*storagesHandledSoFar+couplersHandledSoFar+2*connectionsHandledSoFar);
		int b_index = nStepsMPC*buildingsHandledSoFar;
		int el_index = nStepsMPC*optProblem.getNrOfBuildings();
		
		for(int i = 0; i < nStepsMPC; i++) {
			lambda[i] = couplerMessage.operationalCostEUR;
			lambdaCO2[i] = couplerMessage.operationalCostCO2;
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
			optProblem.lambdaCO2[n_index+i] = lambdaCO2[i];
			optProblem.x_lb[n_index+i] = lb[i];
			optProblem.x_ub[n_index+i] = ub[i];
			optProblem.namesUB[n_index+i] = namesUB[i];
			optProblem.etas[n_index+i] = couplerMessage.efficiencyHeat;
			
			for(int j = 0; j < nStepsMPC; j++) {
				optProblem.a_eq[b_index+i][n_index +j] = couplingMatrix_H[i][j];
				optProblem.a_eq[el_index+i][n_index+j] = couplingMatrix_el[i][j];
			}
		}
	}
	
	private void addStorageToProblem(
			StorageMessage storageMessage, 
			LPOptimizationProblem problem, 
			int buildingsHandledSoFar,
			int producersHandledSoFar, 
			int storagesHandledSoFar, 
			int couplersHandledSoFar,
			int connectionsHandledSoFar) {
		
		// Matrizen bef�llen. Zuerst die regul�ren, dann die Kapazit�t
				
		double[] lambda = new double[2*nStepsMPC];
		double[] lambdaCO2 = new double[2*nStepsMPC];
		double[] lb = new double[2*nStepsMPC];
		double[] ub = new double[2*nStepsMPC];
		String[] namesUB = new String[2*nStepsMPC];
		
		double[][] couplingMatrix_H = new double[nStepsMPC][2*nStepsMPC];
		double[][] couplingMatrix_el = new double[nStepsMPC][2*nStepsMPC];
		
		for(int i = 0; i < nStepsMPC; i++) { // zuerst kommt das ent-laden (produzieren), dann das be-laden (verbrauchen)
			lambda[i] = storageMessage.operationalCostEUR; // + 0.0001*i;
			lambda[nStepsMPC+i] = storageMessage.operationalCostEUR; // + 0.0001*i;
			lambdaCO2[i] = storageMessage.operationalCostCO2;
			lambdaCO2[nStepsMPC+i] = storageMessage.operationalCostCO2;
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
		
		
		double factor = 24.0 / MILPTopology.TIMESTEPS_PER_DAY; // = 0.25 fuer 96 Schritte /Tag
		
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
		
		// Matrizen in das Gesamtsystem uebernehmen
		int n_index = nStepsMPC*(producersHandledSoFar+2*storagesHandledSoFar+couplersHandledSoFar+2*connectionsHandledSoFar);
		int b_index = nStepsMPC*buildingsHandledSoFar;
		int el_index = nStepsMPC*problem.getNrOfBuildings();

		for(int i = 0; i < nStepsMPC; i++) {
			if(i < nStepsMPC) {
				for(int j = 0; j < 2*nStepsMPC; j++) {
					problem.a_eq[b_index+i][n_index+j] = couplingMatrix_H[i][j];
					problem.a_eq[el_index+i][n_index+j] = couplingMatrix_el[i][j];
					problem.g[nStepsMPC*(2*storagesHandledSoFar)+i][n_index+j] = capacityMatrix1[i][j];
					problem.g[nStepsMPC*(1+2*storagesHandledSoFar)+i][n_index+j] = capacityMatrix2[i][j];
					problem.lambda[n_index+j] = storageMessage.operationalCostEUR;
					problem.lambdaCO2[n_index+j] = storageMessage.operationalCostCO2;
					problem.x_lb[n_index+j] = lb[j];
					problem.x_ub[n_index+j] = ub[j];
					problem.namesUB[n_index+j] = namesUB[j];
					problem.etas[n_index+j] = storageMessage.efficiencyCharge;
					
					problem.h[nStepsMPC*(2*storagesHandledSoFar)+j] = h_vector[j];	
				}
			}
		}
	}
	
	private void addConnectionToProblem(ConnectionMessage connectionMessage, LPOptimizationProblem problem,
			int buildingsHandledSoFar, int producersHandledSoFar, int storagesHandledSoFar, int couplersHandledSoFar,
			int connectionsHandledSoFar) {
		
			int n_index = nStepsMPC*(producersHandledSoFar+2*storagesHandledSoFar+couplersHandledSoFar+2*connectionsHandledSoFar);
			int bi_index = nStepsMPC*buildingsHandledSoFar;			
			int bj_index = nStepsMPC*(mapConnectionMessageToInt.get(connectionMessage.name));
			
			double[] lb = new double[2*nStepsMPC];
			double[] ub = new double[2*nStepsMPC];
			String[] namesUB = new String[2*nStepsMPC];
			double[] etas = new double[2*nStepsMPC];
			
			double[][] couplingMatrix_H_i = new double[nStepsMPC][2*nStepsMPC];
			double[][] couplingMatrix_H_j = new double[nStepsMPC][2*nStepsMPC];
			
			for(int i = 0; i < nStepsMPC; i++) { // zuerst kommt die Verbindung ij, dann ji
				lb[i] = 0;
				lb[nStepsMPC+i] = 0;
				ub[i] = connectionMessage.q_max;
				ub[nStepsMPC + i] = connectionMessage.q_max;
				namesUB[i] = connectionMessage.name+"_FROM"+(buildingsHandledSoFar+1)+"_TO"+connectionMessage.connectedBuildingTo;
				namesUB[nStepsMPC+i] = connectionMessage.name+"_FROM"+connectionMessage.connectedBuildingTo+"_TO"+(buildingsHandledSoFar+1);
				etas[i] = connectionMessage.efficiency;
				etas[nStepsMPC+i] = connectionMessage.efficiency;
				
				couplingMatrix_H_i[i][i] = 1;
				couplingMatrix_H_i[i][nStepsMPC + i] = -connectionMessage.efficiency;
				couplingMatrix_H_j[i][i] = -connectionMessage.efficiency;
				couplingMatrix_H_j[i][nStepsMPC + i] = 1;
			}
			
			// Matrizen in das Gesamtsystem uebernehmen

			for(int i = 0; i < nStepsMPC; i++) {
				if(i < nStepsMPC) {
					for(int j = 0; j < 2*nStepsMPC; j++) {
						problem.a_eq[bi_index+i][n_index+j] = couplingMatrix_H_i[i][j];
						problem.a_eq[bj_index+i][n_index+j] = couplingMatrix_H_j[i][j]; 
						problem.lambda[n_index+j] = connectionMessage.operationalPrice;
						problem.lambdaCO2[n_index+j] = connectionMessage.operationalPrice;
						problem.x_lb[n_index+j] = lb[j];
						problem.x_ub[n_index+j] = ub[j];
						problem.namesUB[n_index+j] = namesUB[j];
						problem.etas[n_index+j] = etas[j];
					}
				}
			}
		
	}
	
	private void addMarkets(
			LPOptimizationProblem problem, 
			int buildingsHandled, int producersHandled, int storagesHandled, int couplersHandled, int connectionsHandled,
			int currentTimeStep) {		
		// After the last systems was added, more matrices will be added to handle buying and selling of electricity and heat
		if (producersHandled+storagesHandled+couplersHandled+connectionsHandled == problem.getNumberofProducers()+problem.getNumberofStorages()+ problem.getNumberofCouplers()+problem.getNrOfConnections()) {				
			int n_index = nStepsMPC*(producersHandled+2*storagesHandled+couplersHandled+2*connectionsHandled);
			int b_index = 0;
			int cts = currentTimeStep;
						
			for(int i = 0; i < nStepsMPC; i++) {
				// limits for JOptimizer: selling or buying of electricity
				problem.x_lb[n_index+b_index+i] = 0.0;
				problem.x_ub[n_index+b_index+i] = 999.9;
				
				problem.x_lb[n_index+b_index+nStepsMPC+i] = 0.0;
				problem.x_ub[n_index+b_index+nStepsMPC+i] = 999.9;
				
				problem.a_eq[buildingsHandled*nStepsMPC+i][n_index+b_index+i] = -1.0;  			// matrix: buying of electricity
				problem.namesUB[n_index+b_index+i] = "ElecBuy";
				problem.etas[n_index+b_index+i] = 1;
				
				problem.a_eq[buildingsHandled*nStepsMPC+i][n_index+b_index+nStepsMPC+i] = 1.0;	// matrix: selling of electricity
				problem.namesUB[nStepsMPC+n_index+b_index+i] = "ElecSell";
				problem.etas[nStepsMPC+n_index+b_index+i] = -1;
				
				// Extended price vector for market
				problem.lambda[n_index+b_index+i] = EnergyPrices.getElectricityPriceInEuro(cts+i);					// electricity buy price
				problem.lambda[n_index+b_index+nStepsMPC+i] = -EnergyPrices.getElectricityPriceInEuro(cts+i)*0.5;   // electricity sell price
				problem.lambdaCO2[n_index+b_index+i] = 0.474; 														// Emissionen deutscher Strommix   kg CO2 / kWh
				problem.lambdaCO2[n_index+b_index+nStepsMPC+i] = 0.0 ;	 											// electricity sell price
			}
		}		
	}
}
