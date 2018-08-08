package linprog.helper;

import java.util.ArrayList;
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
		Consumption b_kopp = new Consumption();	

		// ======= BUILD CONSUMPTION VECTOR b =========
		// account for heat transport Losses:
		problem.b_eq = b_kopp.CalcHeatLosses(buildingSpec);
		
		// ====== BUILD PRODUCER & STORAGES Matrices =========
		int producersHandled = 0;
		int storagesHandled = 0;
		
		System.out.println(" << " + buildingSpec.name + " >> ");
		
		for(ProducerSpec producerSpec : buildingSpec.producers) {
			addProducerToProblem(producerSpec, problem, producersHandled, storagesHandled, buildingSpec.LDHeating);
			producersHandled++;
			System.out.println("Prod-Nr.: " + producersHandled + ", " + producerSpec.name);
		}	
		
		for(StorageSpec storageSpec : buildingSpec.storages) {
			addStorageToProblem(storageSpec, problem, producersHandled, storagesHandled, buildingSpec.LDHeating);
			storagesHandled++;
			System.out.println("Stor-Nr.: " + storagesHandled + ", " + storageSpec.name);
		}
		
		return problem;
	}
	
	
	
	public static OptimizationProblem memapMatrices(int nrOfProducers, int nrOfStorages, 
			ArrayList<BuildingSpec> buildingSpecs, ArrayList<Consumption> consumptionProfiles, 
			ArrayList<ProducerSpec> producerSpecs, ArrayList<StorageSpec> storageSpecs, boolean FDHeating) {
		
		OptimizationProblem problem = new OptimizationProblem(n, nrOfProducers, nrOfStorages);

		/**
		 *  ======= BUILD CONSUMPTION VECTOR b =========
		 */		
		Consumption b_kopp = new Consumption();	
		// Sum of Consumption over all Buildings
		for(BuildingSpec buildingSpec : buildingSpecs) {
			// account for heat transport Losses:
			b_kopp.addConsumption(b_kopp.CalcHeatLosses(buildingSpec));
		}		
		// Adding Non-building consumers - without heat losses
		for(Consumption consumption : consumptionProfiles) {
			b_kopp.addConsumption(consumption.getVector());
		}
		problem.b_eq = b_kopp.getVector();

		/**
		 *  ====== BUILD PRODUCER & STORAGES Matrices =========
		 */
//		System.out.println("****************************************************************");		
		System.out.println(" --- Adding Producer and Storages: --- ");
		int producersHandled = 0;
		int storagesHandled = 0;
		
		for(BuildingSpec buildingSpec : buildingSpecs) {
			
			for(ProducerSpec producerSpec : buildingSpec.producers) {
				addProducerToProblem(producerSpec, problem, producersHandled, storagesHandled, FDHeating);
				producersHandled++;
				System.out.println("Prod-Nr.: " + producersHandled + ", " + buildingSpec.name+ ", " + producerSpec.name);
			}	
			
			for(StorageSpec storageSpec : buildingSpec.storages) {
				addStorageToProblem(storageSpec, problem, producersHandled, storagesHandled, FDHeating);
				storagesHandled++;
				System.out.println("Stor-Nr.: " + storagesHandled + ", " + buildingSpec.name+ ", " + storageSpec.name);
			}	
		}
		
		
		for(ProducerSpec producerSpec : producerSpecs) {
			addProducerToProblem(producerSpec, problem, producersHandled, storagesHandled, false);
			producersHandled++;
			System.out.println("Ext. Prod-Nr.: " + producersHandled + ", " + producerSpec.name + ", UB: " + producerSpec.upperBound[0]);
		}	
		
		for(StorageSpec storageSpec : storageSpecs) {
			addStorageToProblem(storageSpec, problem, producersHandled, storagesHandled, false);
			storagesHandled++;
			System.out.println("Ext. Stor-Nr.: " + storagesHandled + ", " + storageSpec.name + ", UB: " + storageSpec.upperBound[0]);
		}		
		
		return problem;
	}

		


	private static void addProducerToProblem(ProducerSpec producerSpec, OptimizationProblem problem, int producersHandledSoFar,
			int storagesHandledSoFar, boolean LDHeating) {
						
		int n_index = n*(producersHandledSoFar+2*storagesHandledSoFar);
		for(int i = 0; i < n; i++) {
			problem.lambda[n_index+i] = producerSpec.cost[i];
			problem.x_lb[n_index+i] = producerSpec.lowerBound[i];
			problem.x_ub[n_index+i] = producerSpec.upperBound[i];
			
			for(int j = 0; j < n; j++) {
				problem.a_eq[i][n_index +j] = producerSpec.couplingMatrix_H[i][j];
				problem.a_eq[n+i][n_index+j] = producerSpec.couplingMatrix_el[i][j];
			}	
		}
		
		// After the last systems was added, more matrices will be added to handle buying and selling of electricity and heat
		if (producersHandledSoFar+1+storagesHandledSoFar == problem.getNumberofProducers()+problem.getNumberofStorages()) {
			n_index = n_index + n ;
			EnergyPrices energyPrices = new EnergyPrices();
			
			for(int i = 0; i < 2*n; i++) {
				// limits for JOptimizer: selling or buying of electricity
				problem.x_lb[n_index+i] = 0.0; 
				problem.x_ub[n_index+i] = 999.9;  
				// limits for JOptimizer: selling or buying of heat
				problem.x_lb[2*n+n_index+i] = 0.0;  
				if (LDHeating) {
					problem.x_ub[2*n+n_index+i] = 999.0;	// able to purchase heat
				} else {
					problem.x_ub[2*n+n_index+i] = 0.0;   
				}
			}	
			
			for(int j = 0; j < n; j++) {

				problem.a_eq[n+j][n_index+j] = -1.0;  	// buying of electricity
				problem.a_eq[n+j][n_index+n+j] = 1.0;	// selling of electricity
				problem.a_eq[j][n_index+2*n+j] = -1.0;  	// buying of heat
				problem.a_eq[j][n_index+3*n+j] = 1.0;	// selling/disposing of heat

				// Extended price vector for market
				problem.lambda[n_index+j] = energyPrices.getElectricityPriceInEuro(j);			// electricity buy price
				problem.lambda[n_index+n+j] = -energyPrices.getElectricityPriceInEuro(j)*0.5;   // electricity sell price
				problem.lambda[n_index+2*n+j] = EnergyPrices.getHeatPriceInEuro(j);				// heat buy price
				problem.lambda[n_index+3*n+j] = -0.0;											// heat sell price
			}	
			
		}
		
	}
	
	private static void addStorageToProblem(StorageSpec storageSpec, OptimizationProblem problem, int producersHandledSoFar,
			int storagesHandledSoFar, boolean LDHeating) {
		int n_index = n*(producersHandledSoFar+2*storagesHandledSoFar);
		for(int i = 0; i < n; i++) {
			if(i < n) {
				for(int j = 0; j < 2*n; j++) {
					problem.a_eq[i][n_index+j] = storageSpec.couplingMatrix_H[i][j];
					problem.a_eq[n+i][n_index+j] = storageSpec.couplingMatrix_el[i][j];
					problem.g[n*(2*storagesHandledSoFar)+i][n_index+j] = storageSpec.capacityMatrix1[i][j];
					problem.g[n*(1+2*storagesHandledSoFar)+i][n_index+j] = storageSpec.capacityMatrix2[i][j];
					problem.lambda[n_index+j] = storageSpec.cost[j];
					problem.x_lb[n_index+j] = storageSpec.lowerBound[j];
					problem.x_ub[n_index+j] = storageSpec.upperBound[j];
					
					problem.h[n*(2*storagesHandledSoFar)+j] = storageSpec.vector[j];	
				}
			}
		}
		
		// After the last systems was added, another matrix will be added to handle buying and selling of electricity and heat
		if (producersHandledSoFar+storagesHandledSoFar+1 == problem.getNumberofProducers()+problem.getNumberofStorages()) {
			n_index = n_index + 2*n ;
			EnergyPrices energyPrices = new EnergyPrices();
			
			for(int i = 0; i < 2*n; i++) {
				// limits for JOptimizer: selling or buying of electricity
				problem.x_lb[n_index+i] = 0.0; 
				problem.x_ub[n_index+i] = 999.9;  
				// limits for JOptimizer: selling or buying of heat
				problem.x_lb[2*n+n_index+i] = 0.0; 
				if (LDHeating) {
					problem.x_ub[2*n+n_index+i] = 999.0;	// able to purchase heat
				} else {
					problem.x_ub[2*n+n_index+i] = 0.0;   
				}
			}	
			
			for(int j = 0; j < n; j++) {

				problem.a_eq[n+j][n_index+j] = -1.0;  	// buying of electricity
				problem.a_eq[n+j][n_index+n+j] = 1.0;	// selling of electricity
				problem.a_eq[j][n_index+2*n+j] = -1.0;  	// buying of heat - not possible at the moment
				problem.a_eq[j][n_index+3*n+j] = 1.0;		// selling of heat

				// Extended price vector for market
				problem.lambda[n_index+j] = energyPrices.getElectricityPriceInEuro(j);			// electricity buy price
				problem.lambda[n_index+n+j] = -energyPrices.getElectricityPriceInEuro(j)*0.5;   // electricity sell price
				problem.lambda[n_index+2*n+j] = EnergyPrices.getHeatPriceInEuro(j);				// heat buy price
				problem.lambda[n_index+3*n+j] = -0.0;											// heat sell price
			}	

			
		}
	}

}
