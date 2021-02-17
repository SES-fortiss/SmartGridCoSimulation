package linprogMPC.helper;

import java.util.ArrayList;

import linprogMPC.MPCDenisSimulation;
import linprogMPC.messages.BuildingMessage;
import linprogMPC.messages.ConsumptionMessage;
import linprogMPC.messages.ProducerMessage;
import linprogMPC.messages.StorageMessage;




public abstract class MatrixBuildup {
	
	//  =========================== Matrix Filling ==============================
	final static int nStepsMPC = MPCDenisSimulation.N_STEPS_MPC;
	
		
	public static OptimizationProblem getOptProblemForSingleBuilding(BuildingMessage buildingSpec, int currentTimeStep) {		
		
		int nrOfStorages = buildingSpec.getNrOfStorages();
		int nrOfProducers = buildingSpec.getNrOfProducers();
		
		OptimizationProblem problem = new OptimizationProblem(nStepsMPC, nrOfProducers, nrOfStorages);
		ConsumptionMessage b_kopp = new ConsumptionMessage();

		// ======= BUILD CONSUMPTION VECTOR b =========
		
		// account for heat transport Losses:
		problem.b_eq = b_kopp.calcHeatLosses(buildingSpec);
		
		// ====== BUILD PRODUCER & STORAGES Matrices =========
		int producersHandled = 0;
		int storagesHandled = 0;
		
		if (currentTimeStep == 0) {
			System.out.println(" << " + buildingSpec.name + " >> ");
		}
		
		for(ProducerMessage producerSpec : buildingSpec.producers) {
			addProducerToProblem(producerSpec, problem, producersHandled, storagesHandled, buildingSpec.LDHeating);
			producersHandled++;
			if (currentTimeStep == 0) {
				System.out.println("Prod-Nr.: " + producersHandled + ", " + producerSpec.name);
			}
		}	
		
		for(StorageMessage storageSpec : buildingSpec.storages) {
			addStorageToProblem(storageSpec, problem, producersHandled, storagesHandled, buildingSpec.LDHeating);
			storagesHandled++;
			if (currentTimeStep == 0) {
				System.out.println("Stor-Nr.: " + storagesHandled + ", " + storageSpec.name);
			}
		}
		
		addMarkets(problem, producersHandled, storagesHandled, buildingSpec.LDHeating, currentTimeStep);
		
		return problem;
	}
	
	



	public static OptimizationProblem getMemapMatrices(int nrOfProducers, int nrOfStorages, 
			ArrayList<BuildingMessage> buildingMessageList, ArrayList<ConsumptionMessage> consumptionProfiles, 
			ArrayList<ProducerMessage> producerMessageList, ArrayList<StorageMessage> storageMessageList, 
			boolean LDHeating, int currentTimeStep) {
		
		OptimizationProblem problem = new OptimizationProblem(nStepsMPC, nrOfProducers, nrOfStorages); // initiert nur die vektoren, matrizen, ohne füllung

		/**
		 *  ======= BUILD CONSUMPTION VECTOR b =========
		 */		
		ConsumptionMessage b_kopp = new ConsumptionMessage();	
		// Sum of Consumption over all Buildings
		for(BuildingMessage buildingMessage : buildingMessageList) {
			// account for heat transport Losses:
			b_kopp.addConsumption(b_kopp.calcHeatLosses(buildingMessage));
		}		
		// Adding Non-building consumers - without heat losses
		for(ConsumptionMessage consumption : consumptionProfiles) {
			b_kopp.addConsumption(consumption.getDemandVector());
		}
		problem.b_eq = b_kopp.getDemandVector();

		/**
		 *  ====== BUILD PRODUCER & STORAGES Matrices =========
		 */
//		System.out.println("****************************************************************");		
		if (currentTimeStep == 0) {
			System.out.println(" << MEMAP >> ");
		}
		int producersHandled = 0;
		int storagesHandled = 0;
		
		for(BuildingMessage buildingSpec : buildingMessageList) {
			
			for(ProducerMessage producerSpec : buildingSpec.producers) {
				addProducerToProblem(producerSpec, problem, producersHandled, storagesHandled, LDHeating);
				producersHandled++;
				if (currentTimeStep == 0) {
					System.out.println("Prod-Nr.: " + producersHandled + ", " + buildingSpec.name+ ", " + producerSpec.name);
				}
			}	
			
			for(StorageMessage storageSpec : buildingSpec.storages) {
				addStorageToProblem(storageSpec, problem, producersHandled, storagesHandled, LDHeating);
				storagesHandled++;
				if (currentTimeStep == 0) {
					System.out.println("Stor-Nr.: " + storagesHandled + ", " + buildingSpec.name+ ", " + storageSpec.name);
				}
			}
		}
		
		
		for(ProducerMessage producerSpec : producerMessageList) {
			addProducerToProblem(producerSpec, problem, producersHandled, storagesHandled, false);
			producersHandled++;
			if (currentTimeStep == 0) {
				System.out.println("Ext. Prod-Nr.: " + producersHandled + ", " + producerSpec.name);
			}
		}
		
		for(StorageMessage storageSpec : storageMessageList) {
			addStorageToProblem(storageSpec, problem, producersHandled, storagesHandled, false);
			storagesHandled++;
			if (currentTimeStep == 0) {
				System.out.println("Ext. Stor-Nr.: " + storagesHandled + ", " + storageSpec.name);
			}
		}
		
		addMarkets(problem, producersHandled, storagesHandled, LDHeating, currentTimeStep);
		
		if (currentTimeStep == 0) {
			System.out.println("****************************************************************");
		}
		
		return problem;
	}		

	private static void addProducerToProblem(
			ProducerMessage producerSpec, 
			OptimizationProblem problem, 
			int producersHandledSoFar,
			int storagesHandledSoFar, boolean LDHeating) {
						
		int n_index = nStepsMPC*(producersHandledSoFar+2*storagesHandledSoFar);
		for(int i = 0; i < nStepsMPC; i++) {
			problem.lambda[n_index+i] = producerSpec.cost[i];
			problem.x_lb[n_index+i] = producerSpec.lowerBound[i];
			problem.x_ub[n_index+i] = producerSpec.upperBound[i];
			
			for(int j = 0; j < nStepsMPC; j++) {
				problem.a_eq[i][n_index +j] = producerSpec.couplingMatrix_H[i][j];
				problem.a_eq[nStepsMPC+i][n_index+j] = producerSpec.couplingMatrix_el[i][j];
			}	
		}
	}
	
	private static void addStorageToProblem(StorageMessage storageSpec, OptimizationProblem problem, int producersHandledSoFar,
			int storagesHandledSoFar, boolean LDHeating) {
		int n_index = nStepsMPC*(producersHandledSoFar+2*storagesHandledSoFar);
		for(int i = 0; i < nStepsMPC; i++) {
			if(i < nStepsMPC) {
				for(int j = 0; j < 2*nStepsMPC; j++) {
					problem.a_eq[i][n_index+j] = storageSpec.couplingMatrix_H[i][j];
					problem.a_eq[nStepsMPC+i][n_index+j] = storageSpec.couplingMatrix_el[i][j];
					problem.g[nStepsMPC*(2*storagesHandledSoFar)+i][n_index+j] = storageSpec.capacityMatrix1[i][j];
					problem.g[nStepsMPC*(1+2*storagesHandledSoFar)+i][n_index+j] = storageSpec.capacityMatrix2[i][j];
					problem.lambda[n_index+j] = storageSpec.cost[j];
					problem.x_lb[n_index+j] = storageSpec.lowerBound[j];
					problem.x_ub[n_index+j] = storageSpec.upperBound[j];
					
					problem.h[nStepsMPC*(2*storagesHandledSoFar)+j] = storageSpec.h_vector[j];	
				}
			}
		}
	}
	
	private static void addMarkets(OptimizationProblem problem, int producersHandled, int storagesHandled, boolean lDHeating, int currentTimeStep) {		
		// After the last systems was added, more matrices will be added to handle buying and selling of electricity and heat
		if (producersHandled+storagesHandled == problem.getNumberofProducers()+problem.getNumberofStorages()) {				
			int n_index = nStepsMPC*(producersHandled+2*storagesHandled);
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
			int cts = currentTimeStep;
			for(int j = 0; j < nStepsMPC; j++) {
				problem.a_eq[nStepsMPC+j][n_index+j] = -1.0;  			// matrix: buying of electricity
				problem.a_eq[nStepsMPC+j][n_index+nStepsMPC+j] = 1.0;	// matrix: selling of electricity
				problem.a_eq[j][n_index+2*nStepsMPC+j] = -1.0;  		// matrix: buying of heat
				problem.a_eq[j][n_index+3*nStepsMPC+j] = 1.0;			// matrix: selling/disposing of heat

				// Extended price vector for market
				problem.lambda[n_index+j] = energyPrices.getElectricityPriceInEuro(cts+j);			// electricity buy price
				problem.lambda[n_index+nStepsMPC+j] = -energyPrices.getElectricityPriceInEuro(cts+j)*0.5;   // electricity sell price
				problem.lambda[n_index+2*nStepsMPC+j] = EnergyPrices.getHeatPriceInEuro(cts+j);				// heat buy price
				problem.lambda[n_index+3*nStepsMPC+j] = -0.0;											// heat sell price
			}			
		}		
	}
}
