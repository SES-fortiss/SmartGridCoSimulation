package memap.helper.lp;

import java.util.ArrayList;
import java.util.HashMap;

import memap.controller.TopologyController;
import memap.helper.EnergyPrices;
import memap.helper.MEMAPLogging;
import memap.main.TopologyConfig;
import memap.messages.BuildingMessage;
import memap.messages.extension.NetworkType;
import memap.messages.planning.ConnectionMessage;
import memap.messages.planning.CouplerMessage;
import memap.messages.planning.DemandMessage;
import memap.messages.planning.ProducerMessage;
import memap.messages.planning.StorageMessage;
import memap.messages.planning.VolatileProducerMessage;

/**
 * Note, this class is used to solve the LP problem. The class was re-factored
 * in 15.11.2019 in the process of introducing MILP. In that process we removed
 * the dependency on the old LDHeating boolean in that class.
 * 
 * @author bytschkow
 *
 */
public class LPMatrixBuildup {

	/** Reference to topologyController ancestor */
	private TopologyController topologyController;
	/** Reference to topology configuration */
	TopologyConfig topologyConfig = TopologyConfig.getInstance();
	/** Time step for which the matrix is created */
	int currentTimeStep;
	
	// Matrix Filling
	int nStepsMPC;

	HashMap<String, Integer> mapBuildingToInt = new HashMap<>();
	HashMap<String, Integer> mapConnectionMessageToInt = new HashMap<>();
	ArrayList<String> arrayOfBuildings = new ArrayList<>();

	public LPMatrixBuildup(TopologyController topologyController, int currentTimeStep) {
		this.topologyController = topologyController;
		this.currentTimeStep = currentTimeStep;
		// Initialization delayed until after topologyConfig initialization
		nStepsMPC = topologyConfig.getNrStepsMPC();
	}

	public LPOptimizationProblem singleBuilding(BuildingMessage buildingMessage) {

		int nrOfStorages = buildingMessage.getNrOfStorages();
		int nrOfProducers = buildingMessage.getNrOfControllableProducers() + buildingMessage.getNrOfVolatileProducers();
		int nrOfCouplers = buildingMessage.getNrOfCouplers();

		LPOptimizationProblem problem = new LPOptimizationProblem(nStepsMPC, 1, nrOfProducers, nrOfStorages,
				nrOfCouplers, 0);

		// Build consumption vector b
		problem.b_eq = buildingMessage.getCombinedDemandVector();

		// Build Matrices

		int producersHandled = 0;
		int storagesHandled = 0;
		int couplersHandled = 0;

		if (currentTimeStep == 0
				&& topologyController.getLogging() == MEMAPLogging.ALL) {
			System.out.println(" << " + buildingMessage.name + " >> ");
		}

		for (ProducerMessage producerMessage : buildingMessage.volatileProducerList) {
			addProducerToProblem(producerMessage, problem, 0, producersHandled, storagesHandled, couplersHandled, 0);
			producersHandled++;
			if (currentTimeStep == 0
					&& topologyController.getLogging() == MEMAPLogging.ALL) {
				System.out.println("Prod-Nr.: " + producersHandled + ", " + producerMessage.name);
			}
		}

		for (ProducerMessage producerMessage : buildingMessage.controllableProducerList) {
			addProducerToProblem(producerMessage, problem, 0, producersHandled, storagesHandled, couplersHandled, 0);
			producersHandled++;
			if (currentTimeStep == 0
					&& topologyController.getLogging() == MEMAPLogging.ALL) {
				System.out.println("Prod-Nr.: " + producersHandled + ", " + producerMessage.name);
			}
		}

		for (StorageMessage storageMessage : buildingMessage.storageList) {
			addStorageToProblem(storageMessage, problem, 0, producersHandled, storagesHandled, couplersHandled, 0);
			storagesHandled++;
			if (currentTimeStep == 0
					&& topologyController.getLogging() == MEMAPLogging.ALL) {
				System.out.println("Stor-Nr.: " + storagesHandled + ", " + storageMessage.name);
			}
		}

		for (CouplerMessage couplerMessage : buildingMessage.couplerList) {
			addCouplerToProblem(couplerMessage, problem, 0, producersHandled, storagesHandled, couplersHandled, 0);
			couplersHandled++;
			if (currentTimeStep == 0
					&& topologyController.getLogging() == MEMAPLogging.ALL) {
				System.out.println("Coupler-Nr.: " + couplersHandled + ", " + couplerMessage.name);
			}
		}

		addMarkets(problem, 1, producersHandled, storagesHandled, couplersHandled, 0);

		return problem;
	}

	public LPOptimizationProblem multipleBuildings(ArrayList<BuildingMessage> buildingMessageList) {

		int nrOfBuildings = 0;
		int nrOfProducers = 0;
		int nrOfStorages = 0;
		int nrOfCouplers = 0;
		int nrOfConnections = 0;

		for (BuildingMessage buildingMessage : buildingMessageList) {

			mapBuildingToInt.put(buildingMessage.name, nrOfBuildings);
			arrayOfBuildings.add(buildingMessage.name);

			// TODO Fix after including connections between buildings
			// Note, this is a hack, that assumes that buildings are named "B...1", "B..2",
			// etc. This might be super buggy.

			for (ConnectionMessage cm : buildingMessage.connectionList) {
				if (cm.connectedBuildingTo.contains("1"))
					mapConnectionMessageToInt.put(cm.name, 0);
				if (cm.connectedBuildingTo.contains("2"))
					mapConnectionMessageToInt.put(cm.name, 1);
				if (cm.connectedBuildingTo.contains("3"))
					mapConnectionMessageToInt.put(cm.name, 2);
				if (cm.connectedBuildingTo.contains("4"))
					mapConnectionMessageToInt.put(cm.name, 3);
				if (cm.connectedBuildingTo.contains("5"))
					mapConnectionMessageToInt.put(cm.name, 4);
			}

			nrOfBuildings++;
			nrOfStorages += buildingMessage.getNrOfStorages();
			nrOfProducers += buildingMessage.getNrOfControllableProducers()
					+ buildingMessage.getNrOfVolatileProducers();
			nrOfCouplers += buildingMessage.getNrOfCouplers();
			nrOfConnections += buildingMessage.getNrOfConnections();
		}

		LPOptimizationProblem problem = new LPOptimizationProblem(nStepsMPC, nrOfBuildings, nrOfProducers, nrOfStorages,
				nrOfCouplers, nrOfConnections); // only initiates the vectors, matrices, without filling them

		/**
		 * Note, this version was used for the LP. In the mean time, we removed some
		 * part of the old code, so that we needed to adapted this code.
		 */
		DemandMessage b_kopp = new DemandMessage();
		int b_index = 0;
		double[] b_building = new double[nStepsMPC * 2];
		// Sum of Consumption over all Buildings
		// Heat
		for (BuildingMessage buildingMessage : buildingMessageList) {
			b_building = buildingMessage.getCombinedDemandVector();
			for (int i = 0; i < nStepsMPC; i++) {
				problem.b_eq[b_index * nStepsMPC + i] = b_building[i];
			}
			b_kopp.addConsumption(b_building);
			b_index++;
		}

		// Electricity
		for (int i = 0; i < nStepsMPC; i++) {
			problem.b_eq[b_index * nStepsMPC + i] = b_kopp.getDemandVector()[nStepsMPC + i];
		}

		// Build producer & storage matrices
		if (currentTimeStep == 0) {
			System.out.println(" << MEMAP >> ");
		}
		int buildingsHandled = 0;
		int producersHandled = 0;
		int storagesHandled = 0;
		int couplersHandled = 0;
		int connectionsHandled = 0;

		for (BuildingMessage buildingMessage : buildingMessageList) {

			for (ProducerMessage producerSpec : buildingMessage.volatileProducerList) {
				addProducerToProblem(producerSpec, problem, buildingsHandled, producersHandled, storagesHandled,
						couplersHandled, connectionsHandled);
				producersHandled++;
				if (currentTimeStep == 0) {
					System.out.println(
							"Prod-Nr.: " + producersHandled + ", " + buildingMessage.name + ", " + producerSpec.name);
				}
			}

			for (ProducerMessage producerSpec : buildingMessage.controllableProducerList) {
				addProducerToProblem(producerSpec, problem, buildingsHandled, producersHandled, storagesHandled,
						couplersHandled, connectionsHandled);
				producersHandled++;
				if (currentTimeStep == 0) {
					System.out.println(
							"Prod-Nr.: " + producersHandled + ", " + buildingMessage.name + ", " + producerSpec.name);
				}
			}

			for (StorageMessage storageSpec : buildingMessage.storageList) {
				addStorageToProblem(storageSpec, problem, buildingsHandled, producersHandled, storagesHandled,
						couplersHandled, connectionsHandled);
				storagesHandled++;
				if (currentTimeStep == 0) {
					System.out.println(
							"Stor-Nr.: " + storagesHandled + ", " + buildingMessage.name + ", " + storageSpec.name);
				}
			}

			for (CouplerMessage couplerMessage : buildingMessage.couplerList) {
				addCouplerToProblem(couplerMessage, problem, buildingsHandled, producersHandled, storagesHandled,
						couplersHandled, connectionsHandled);
				couplersHandled++;
				if (currentTimeStep == 0) {
					System.out.println("Coupler-Nr.: " + couplersHandled + ", " + couplerMessage.name);
				}
			}

			for (ConnectionMessage connectionMessage : buildingMessage.connectionList) {
				addConnectionToProblem(connectionMessage, problem, buildingsHandled, producersHandled, storagesHandled,
						couplersHandled, connectionsHandled);
				connectionsHandled++;
				if (currentTimeStep == 0) {
					System.out.println("Connection-Nr.: " + connectionsHandled + ", " + connectionMessage.name);
				}
			}

			buildingsHandled++;
		}

		addMarkets(problem, buildingsHandled, producersHandled, storagesHandled, couplersHandled, connectionsHandled);

		if (currentTimeStep == 0) {
			System.out.println("****************************************************************");
		}

		return problem;
	}

	private void addProducerToProblem(ProducerMessage producerMessage, LPOptimizationProblem optProblem,
			int buildingsHandledSoFar, int producersHandledSoFar, int storagesHandledSoFar, int couplersHandledSoFar,
			int connectionsHandledSoFar) {

		int n_index = nStepsMPC * (producersHandledSoFar + 2 * storagesHandledSoFar + couplersHandledSoFar
				+ 2 * connectionsHandledSoFar);
		int b_index = nStepsMPC * buildingsHandledSoFar;
		int el_index = nStepsMPC * optProblem.getNrOfBuildings();

		double[] lambda = new double[nStepsMPC];
		double[] lambdaCO2 = new double[nStepsMPC];
		double[] lb = new double[nStepsMPC];
		double[] ub = new double[nStepsMPC];

		String[] namesUB = new String[nStepsMPC];

		double[][] couplingMatrix_H = new double[nStepsMPC][nStepsMPC];
		double[][] couplingMatrix_el = new double[nStepsMPC][nStepsMPC];

		// Fill the basic vectors and matrices
		for (int i = 0; i < nStepsMPC; i++) {
			lambda[i] = producerMessage.operationalCostEUR;
			lambdaCO2[i] = producerMessage.operationalCostCO2;
			lb[i] = 0;
			ub[i] = producerMessage.maxPower;
			namesUB[i] = producerMessage.name;
		}

		if (producerMessage instanceof VolatileProducerMessage) {
			for (int i = 0; i < nStepsMPC; i++) {
				ub[i] = ((VolatileProducerMessage) producerMessage).forecast[i];
			}
		}

		if (producerMessage.networkType.equals(NetworkType.HEAT)) {
			for (int i = 0; i < nStepsMPC; i++) {
				couplingMatrix_H[i][i] = -producerMessage.efficiency;
			}
		}

		if (producerMessage.networkType.equals(NetworkType.ELECTRICITY)) {
			for (int i = 0; i < nStepsMPC; i++) {
				couplingMatrix_el[i][i] = -producerMessage.efficiency;
			}
		}

		// Fill the problem matrices
		for (int i = 0; i < nStepsMPC; i++) {
			optProblem.lambda[n_index + i] = lambda[i];
			optProblem.lambdaCO2[n_index + i] = lambdaCO2[i];
			optProblem.x_lb[n_index + i] = lb[i];
			optProblem.x_ub[n_index + i] = ub[i];
			optProblem.namesUB[n_index + i] = namesUB[i];
			optProblem.etas[n_index + i] = producerMessage.efficiency;

			for (int j = 0; j < nStepsMPC; j++) {
				optProblem.a_eq[b_index + i][n_index + j] = couplingMatrix_H[i][j];
				optProblem.a_eq[el_index + i][n_index + j] = couplingMatrix_el[i][j];
			}
		}
	}

	private void addCouplerToProblem(CouplerMessage couplerMessage, LPOptimizationProblem optProblem,
			int buildingsHandledSoFar, int producersHandledSoFar, int storagesHandledSoFar, int couplersHandledSoFar,
			int connectionsHandledSoFar) {

		double[] lambda = new double[nStepsMPC];
		double[] lambdaCO2 = new double[nStepsMPC];
		double[] lb = new double[nStepsMPC];
		double[] ub = new double[nStepsMPC];
		String[] namesUB = new String[nStepsMPC];

		double[][] couplingMatrix_H = new double[nStepsMPC][nStepsMPC];
		double[][] couplingMatrix_el = new double[nStepsMPC][nStepsMPC];

		// Fill the matrices
		int n_index = nStepsMPC * (producersHandledSoFar + 2 * storagesHandledSoFar + couplersHandledSoFar
				+ 2 * connectionsHandledSoFar);
		int b_index = nStepsMPC * buildingsHandledSoFar;
		int el_index = nStepsMPC * optProblem.getNrOfBuildings();

		for (int i = 0; i < nStepsMPC; i++) {
			lambda[i] = couplerMessage.operationalCostEUR;
			lambdaCO2[i] = couplerMessage.operationalCostCO2;
			lb[i] = 0;
			// Attention here, the efficiencies play a role, because of the specified
			// services.
			// Z.b. need a 10kW heat pump no 10kW electricity.
			ub[i] = couplerMessage.maxPower / couplerMessage.efficiencyHeat;
			namesUB[i] = couplerMessage.name;

		}

		for (int i = 0; i < nStepsMPC; i++) {
			couplingMatrix_H[i][i] = -couplerMessage.efficiencyHeat;
		}

		for (int i = 0; i < nStepsMPC; i++) {
			couplingMatrix_el[i][i] = -couplerMessage.efficiencyElec;
		}

		// Fill the problem matrices
		for (int i = 0; i < nStepsMPC; i++) {
			optProblem.lambda[n_index + i] = lambda[i];
			optProblem.lambdaCO2[n_index + i] = lambdaCO2[i];
			optProblem.x_lb[n_index + i] = lb[i];
			optProblem.x_ub[n_index + i] = ub[i];
			optProblem.namesUB[n_index + i] = namesUB[i];
			optProblem.etas[n_index + i] = couplerMessage.efficiencyHeat;

			for (int j = 0; j < nStepsMPC; j++) {
				optProblem.a_eq[b_index + i][n_index + j] = couplingMatrix_H[i][j];
				optProblem.a_eq[el_index + i][n_index + j] = couplingMatrix_el[i][j];
			}
		}
	}

	private void addStorageToProblem(StorageMessage storageMessage, LPOptimizationProblem problem,
			int buildingsHandledSoFar, int producersHandledSoFar, int storagesHandledSoFar, int couplersHandledSoFar,
			int connectionsHandledSoFar) {

		// Fill matrices. First the regulators, then the capacity
		double[] lambda = new double[2 * nStepsMPC];
		double[] lambdaCO2 = new double[2 * nStepsMPC];
		double[] lb = new double[2 * nStepsMPC];
		double[] ub = new double[2 * nStepsMPC];
		String[] namesUB = new String[2 * nStepsMPC];

		double[][] couplingMatrix_H = new double[nStepsMPC][2 * nStepsMPC];
		double[][] couplingMatrix_el = new double[nStepsMPC][2 * nStepsMPC];

		for (int i = 0; i < nStepsMPC; i++) {
			// First comes the unload (produce), then the load (consume)
			lambda[i] = storageMessage.operationalCostEUR;
			lambda[nStepsMPC + i] = storageMessage.operationalCostEUR;
			lambdaCO2[i] = storageMessage.operationalCostCO2;
			lambdaCO2[nStepsMPC + i] = storageMessage.operationalCostCO2;
			lb[i] = 0;
			lb[nStepsMPC + i] = 0;
			ub[i] = storageMessage.maxDischarge;
			ub[nStepsMPC + i] = storageMessage.maxLoad;
			namesUB[i] = storageMessage.name + "Discharge";
			namesUB[nStepsMPC + i] = storageMessage.name + "Charge";
		}

		double effIN = storageMessage.efficiencyCharge;
		double effOUT = storageMessage.efficiencyDischarge;

		if (storageMessage.networkType.equals(NetworkType.HEAT)) {
			for (int i = 0; i < nStepsMPC; i++) {
				couplingMatrix_H[i][i] = -1;
				couplingMatrix_H[i][nStepsMPC + i] = 1;
			}
		}

		if (storageMessage.networkType.equals(NetworkType.ELECTRICITY)) {
			for (int i = 0; i < nStepsMPC; i++) {
				couplingMatrix_el[i][i] = -1;
				couplingMatrix_el[i][nStepsMPC + i] = 1;
			}
		}

		// Capacity
		double[] h_vector = new double[2 * nStepsMPC];
		double[][] capacityMatrix1 = new double[nStepsMPC][2 * nStepsMPC];
		double[][] capacityMatrix2 = new double[nStepsMPC][2 * nStepsMPC];

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

		double factor = 24.0 / topologyConfig.getTimeStepsPerDay(); // 0.25 for 96 steps / day

		for (int i = 0; i < nStepsMPC; i++) {
			for (int j = 0; j <= i; j++) {
				capacityMatrix1[i][j] = 1 / effOUT * factor;
				capacityMatrix2[i][j] = -1 / effOUT * factor;

				capacityMatrix1[i][j + nStepsMPC] = -effIN * factor;
				capacityMatrix2[i][j + nStepsMPC] = effIN * factor;
			}

			h_vector[i] = maxDischargeCapacity;
			h_vector[nStepsMPC + i] = maxChargeCapacity;
		}

		// Apply matrices to the overall system
		int n_index = nStepsMPC * (producersHandledSoFar + 2 * storagesHandledSoFar + couplersHandledSoFar
				+ 2 * connectionsHandledSoFar);
		int b_index = nStepsMPC * buildingsHandledSoFar;
		int el_index = nStepsMPC * problem.getNrOfBuildings();

		for (int i = 0; i < nStepsMPC; i++) {
			if (i < nStepsMPC) {
				for (int j = 0; j < 2 * nStepsMPC; j++) {
					problem.a_eq[b_index + i][n_index + j] = couplingMatrix_H[i][j];
					problem.a_eq[el_index + i][n_index + j] = couplingMatrix_el[i][j];
					problem.g[nStepsMPC * (2 * storagesHandledSoFar) + i][n_index + j] = capacityMatrix1[i][j];
					problem.g[nStepsMPC * (1 + 2 * storagesHandledSoFar) + i][n_index + j] = capacityMatrix2[i][j];
					problem.lambda[n_index + j] = storageMessage.operationalCostEUR;
					problem.lambdaCO2[n_index + j] = storageMessage.operationalCostCO2;
					problem.x_lb[n_index + j] = lb[j];
					problem.x_ub[n_index + j] = ub[j];
					problem.namesUB[n_index + j] = namesUB[j];
					problem.etas[n_index + j] = storageMessage.efficiencyCharge;

					problem.h[nStepsMPC * (2 * storagesHandledSoFar) + j] = h_vector[j];
				}
			}
		}
	}

	private void addConnectionToProblem(ConnectionMessage connectionMessage, LPOptimizationProblem problem,
			int buildingsHandledSoFar, int producersHandledSoFar, int storagesHandledSoFar, int couplersHandledSoFar,
			int connectionsHandledSoFar) {

		int n_index = nStepsMPC * (producersHandledSoFar + 2 * storagesHandledSoFar + couplersHandledSoFar
				+ 2 * connectionsHandledSoFar);
		int bi_index = nStepsMPC * buildingsHandledSoFar;
		int bj_index = nStepsMPC * (mapConnectionMessageToInt.get(connectionMessage.name));

		double[] lb = new double[2 * nStepsMPC];
		double[] ub = new double[2 * nStepsMPC];
		String[] namesUB = new String[2 * nStepsMPC];
		double[] etas = new double[2 * nStepsMPC];

		double[][] couplingMatrix_H_i = new double[nStepsMPC][2 * nStepsMPC];
		double[][] couplingMatrix_H_j = new double[nStepsMPC][2 * nStepsMPC];

		for (int i = 0; i < nStepsMPC; i++) { // First comes the connection {i,j}, then {j,i}
			lb[i] = 0;
			lb[nStepsMPC + i] = 0;
			ub[i] = connectionMessage.maxPower;
			ub[nStepsMPC + i] = connectionMessage.maxPower;
			namesUB[i] = connectionMessage.name + "_FROM" + (buildingsHandledSoFar + 1) + "_TO"
					+ connectionMessage.connectedBuildingTo;
			namesUB[nStepsMPC + i] = connectionMessage.name + "_FROM" + connectionMessage.connectedBuildingTo + "_TO"
					+ (buildingsHandledSoFar + 1);
			etas[i] = connectionMessage.efficiency;
			etas[nStepsMPC + i] = connectionMessage.efficiency;

			couplingMatrix_H_i[i][i] = 1;
			couplingMatrix_H_i[i][nStepsMPC + i] = -connectionMessage.efficiency;
			couplingMatrix_H_j[i][i] = -connectionMessage.efficiency;
			couplingMatrix_H_j[i][nStepsMPC + i] = 1;
		}

		// Take over matrices into the overall system

		for (int i = 0; i < nStepsMPC; i++) {
			if (i < nStepsMPC) {
				for (int j = 0; j < 2 * nStepsMPC; j++) {
					problem.a_eq[bi_index + i][n_index + j] = couplingMatrix_H_i[i][j];
					problem.a_eq[bj_index + i][n_index + j] = couplingMatrix_H_j[i][j];
					problem.lambda[n_index + j] = connectionMessage.operationalCostEUR;
					problem.lambdaCO2[n_index + j] = connectionMessage.operationalCostCO2;
					problem.x_lb[n_index + j] = lb[j];
					problem.x_ub[n_index + j] = ub[j];
					problem.namesUB[n_index + j] = namesUB[j];
					problem.etas[n_index + j] = etas[j];
				}
			}
		}

	}

	private void addMarkets(LPOptimizationProblem problem, int buildingsHandled, int producersHandled,
			int storagesHandled, int couplersHandled, int connectionsHandled) {
		
		EnergyPrices energyPrices = EnergyPrices.getInstance();
		// After the last systems was added, more matrices will be added to handle
		// buying and selling of electricity and heat
		if (producersHandled + storagesHandled + couplersHandled + connectionsHandled == problem.getNumberofProducers()
				+ problem.getNumberofStorages() + problem.getNumberofCouplers() + problem.getNrOfConnections()) {
			int n_index = nStepsMPC
					* (producersHandled + 2 * storagesHandled + couplersHandled + 2 * connectionsHandled);
			int b_index = 0;
			int cts = currentTimeStep;

			for (int i = 0; i < nStepsMPC; i++) {
				// limits for JOptimizer: selling or buying of electricity
				problem.x_lb[n_index + b_index + i] = 0.0;
				problem.x_ub[n_index + b_index + i] = 999.9;

				problem.x_lb[n_index + b_index + nStepsMPC + i] = 0.0;
				problem.x_ub[n_index + b_index + nStepsMPC + i] = 999.9; // able to sell electricity
				// matrix: buying of electricity
				problem.a_eq[buildingsHandled * nStepsMPC + i][n_index + b_index + i] = -1.0;
				problem.namesUB[n_index + b_index + i] = "ElecBuy";
				problem.etas[n_index + b_index + i] = 1;

				// matrix: selling of electricity
				problem.a_eq[buildingsHandled * nStepsMPC + i][n_index + b_index + nStepsMPC + i] = 1.0;
				problem.namesUB[nStepsMPC + n_index + b_index + i] = "ElecSell";
				problem.etas[nStepsMPC + n_index + b_index + i] = -1;

				// Extended price vector for market
				// electricity buy price
				problem.lambda[n_index + b_index + i] = energyPrices.getElectricityPriceInEuro(cts + i);
				// electricity sell price
				problem.lambda[n_index + b_index + nStepsMPC
						+ i] = -energyPrices.getElectricityPriceInEuro(cts + i) * 0.5;
				// Emissions of German electricity kg CO2 / kWh
				problem.lambdaCO2[n_index + b_index + i] = 0.474;
				// electricity sell price
				problem.lambdaCO2[n_index + b_index + nStepsMPC + i] = 0.0;
			}
		}
	}
}
