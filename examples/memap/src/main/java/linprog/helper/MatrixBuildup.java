package linprog.helper;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import linprog.Simulation;

import linprog.messages.BuildingSpec;
import linprog.messages.Consumption;
import linprog.messages.ProducerSpec;
import linprog.messages.StorageSpec;



public abstract class MatrixBuildup {
	
	//  =========================== Matrix Filling ==============================
	final static int n = Simulation.TIMESTEPS_PER_ITERATION;
	
		
	public static OptimizationProblem SingleBuilding(BuildingSpec buildingSpec) {
		
		int nrOfStorages = buildingSpec.getNrOfStorages();
		int nrOfProducers = buildingSpec.getNrOfProducers();
		OptimizationProblem problem = new OptimizationProblem(n, nrOfProducers, nrOfStorages);
		
		/**
		 *  ======= BUILD CONSUMPTION VECTOR b =========
		 */	
		problem.b_eq = buildingSpec.consumption.getVector();
		
		
		/**
		 *  ====== BUILD PRODUCER & STORAGES Matrices =========
		 */
		int producersHandled = 0;
		int storagesHandled = 0;
		
		System.out.println(" << " + buildingSpec.name + " >> ");
		
		for(ProducerSpec producerSpec : buildingSpec.producers) {
			addProducerToProblem(producerSpec, problem, producersHandled, storagesHandled);
			producersHandled++;
			System.out.println("Prod-Nr.: " + producersHandled + ", " + producerSpec.name);
		}	
		
		for(StorageSpec storageSpec : buildingSpec.storages) {
			addStorageToProblem(storageSpec, problem, producersHandled, storagesHandled);
			storagesHandled++;
			System.out.println("Stor-Nr.: " + storagesHandled + ", " + storageSpec.name);
		}
		
		return problem;
	}
	
	
	
	public static OptimizationProblem memapMatrices(int nrOfProducers, int nrOfStorages, 
			ArrayList<BuildingSpec> buildingSpecs, ArrayList<Consumption> consumptionProfiles, ArrayList<ProducerSpec> producerSpecs, ArrayList<StorageSpec> storageSpecs) {
		
		OptimizationProblem problem = new OptimizationProblem(n, nrOfProducers, nrOfStorages);

		/**
		 *  ======= BUILD CONSUMPTION VECTOR b =========
		 */		
		Consumption h_kopp = new Consumption();	
		// Sum of Consumption over all Buildings
		for(BuildingSpec buildingSpec : buildingSpecs) {
			h_kopp.addConsumption(buildingSpec.consumption.getVector());
		}		
		// Adding Non-building consumers
		for(Consumption consumption : consumptionProfiles) {
			h_kopp.addConsumption(consumption.getVector());
		}
		problem.b_eq = h_kopp.getVector();

		/**
		 *  ====== BUILD PRODUCER & STORAGES Matrices =========
		 */
//		System.out.println("****************************************************************");		
		System.out.println(" --- Adding Producer and Storages: --- ");
		int producersHandled = 0;
		int storagesHandled = 0;
		
		for(BuildingSpec buildingSpec : buildingSpecs) {
			
			for(ProducerSpec producerSpec : buildingSpec.producers) {
				addProducerToProblem(producerSpec, problem, producersHandled, storagesHandled);
				producersHandled++;
				System.out.println("Prod-Nr.: " + producersHandled + ", " + buildingSpec.name+ ", " + producerSpec.name);
			}	
			
			for(StorageSpec storageSpec : buildingSpec.storages) {
				addStorageToProblem(storageSpec, problem, producersHandled, storagesHandled);
				storagesHandled++;
				System.out.println("Stor-Nr.: " + storagesHandled + ", " + buildingSpec.name+ ", " + storageSpec.name);
			}	
		}
		
		
		for(ProducerSpec producerSpec : producerSpecs) {
			addProducerToProblem(producerSpec, problem, producersHandled, storagesHandled);
			producersHandled++;
			System.out.println("Ext. Prod-Nr.: " + producersHandled + ", " + producerSpec.name + ", UB: " + producerSpec.upperBound[0]);
		}	
		
		for(StorageSpec storageSpec : storageSpecs) {
			addStorageToProblem(storageSpec, problem, producersHandled, storagesHandled);
			storagesHandled++;
			System.out.println("Ext. Stor-Nr.: " + storagesHandled + ", " + storageSpec.name + ", UB: " + storageSpec.upperBound[0]);
		}		
		
		return problem;
	}

		


	private static void addProducerToProblem(ProducerSpec producerSpec, OptimizationProblem problem, int producersHandledSoFar,
			int storagesHandledSoFar) {
		int n_index = n*(producersHandledSoFar+2*storagesHandledSoFar);
		for(int i = 0; i < n; i++) {
			problem.lambda[n_index+i] = producerSpec.cost[i]*Simulation.stepLength(TimeUnit.SECONDS);
			problem.x_lb[n_index+i] = producerSpec.lowerBound[i];
			problem.x_ub[n_index+i] = producerSpec.upperBound[i];
			
			for(int j = 0; j < n; j++) {
				problem.a_eq[i][n_index +j] = producerSpec.couplingMatrix[i][j];
			}	
		}		
	}
	
	private static void addStorageToProblem(StorageSpec storageSpec, OptimizationProblem problem, int producersHandledSoFar,
			int storagesHandledSoFar) {
		int n_index = n*(producersHandledSoFar+2*storagesHandledSoFar);
		for(int i = 0; i < n; i++) {
			if(i < n) {
				for(int j = 0; j < 2*n; j++) {
					problem.a_eq[i][n_index+j] = storageSpec.couplingMatrix[i][j];
					problem.g[n*(2*storagesHandledSoFar)+i][n_index+j] = storageSpec.capacityMatrix1[i][j];
					problem.g[n*(1+2*storagesHandledSoFar)+i][n_index+j] = storageSpec.capacityMatrix2[i][j];
					problem.lambda[n_index+j] = storageSpec.cost[j]*Simulation.stepLength(TimeUnit.SECONDS);
					problem.x_lb[n_index+j] = storageSpec.lowerBound[j];
					problem.x_ub[n_index+j] = storageSpec.upperBound[j];
					
					problem.h[n*(2*storagesHandledSoFar)+j] = storageSpec.vector[j];	
				}
			}
		}
	}

}
