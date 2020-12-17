package memap.helper;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;

import memap.helper.lp.LPOptimizationProblem;
import memap.messages.BuildingMessage;
import memap.messages.planning.CouplerMessage;
import memap.messages.planning.ProducerMessage;
import memap.messages.planning.StorageMessage;


public class SolutionHandler {

	/** MPC horizon: Initialization must be delayed until after {@link TopologyConfig} initialization */
	private int nStepsMPC;
	
	public SolutionHandler(int nStepsMPC){
		this.nStepsMPC = nStepsMPC;
	}
	
	/**
	 * Export a matrix with or without header.
	 * 
	 * @param data
	 * @param filename
	 * @param header   if null, the matrix is exported without header
	 */
	public void exportMatrix(double[][] data, String filename, String[] header) {
		
		BufferedWriter bw = null;
		String source = File.separator + DirectoryConfiguration.mainDir + File.separator + DirectoryConfiguration.resultDir + File.separator + filename;
		String location = System.getProperty("user.dir");
		/*
		 * Note: location is the project directory from which the simulation was started
		 * or or the directory from which the .jar was executed.
		 */
		location = location + source;
		System.out.println("Try file location: " + location);
		
		
	    File destination = new File(location);
	    
	    FileManager.setUpDirectoryHierarchy(destination);
		
		File file = destination;
		try {
			/*
			 * This logic will make sure that the file gets created if it is not present at
			 * the specified location
			 */
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file);
			bw = new BufferedWriter(fw);

			// Use header if it is different from null
			if (header != null) {
				for (int i = 0; i < header.length; i++) {
					bw.write(header[i] + ";");
				}

				bw.newLine();
			}

			for (int index = 0; index < data.length; index++) {
				if (index == data.length - 1) {
					for (int j = 0; j < data[0].length; j++) {
						if (j == data[0].length - 1) {
							bw.write(String.format(Locale.GERMAN, "%.4f", data[index][j]));
						} else {
							bw.write(String.format(Locale.GERMAN, "%.4f", data[index][j]) + ";");
						}
					}
				} else {
					for (int j = 0; j < data[0].length; j++) {
						if (j == data[0].length - 1) {
							bw.write(String.format(Locale.GERMAN, "%.4f", data[index][j]));
						} else {
							bw.write(String.format(Locale.GERMAN, "%.4f", data[index][j]) + ";");
						}
					}
					bw.newLine();
				}
			}

		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				if (bw != null)
					bw.close();
			} catch (Exception ex) {
				System.out.println("Error in closing the BufferedWriter" + ex);
			}
		}
	}

	// TODO: Not used. Remove?
	public double[][] getCorrectedSolutionVector(double[][] matrix, double[] vec, int NumberOfStorages)
			throws IOException {
		if (matrix[0].length == vec.length) {
			int size = (int) (matrix[0].length / nStepsMPC - 4);
			double[][] TotalDeviceProduction = new double[size + NumberOfStorages][2];

			for (int i = 0; i < size + NumberOfStorages; i++) {
				for (int j = 0; j < nStepsMPC; j++) {

					TotalDeviceProduction[i][0] += matrix[j][i * nStepsMPC + j] * vec[i * nStepsMPC + j]; // Heat
					TotalDeviceProduction[i][1] += matrix[j + nStepsMPC][i * nStepsMPC + j] * vec[i * nStepsMPC + j]; // Electricity
				}
			}
			return TotalDeviceProduction;
		}
		return null;

	}
	
	/**
	 * @param optSolution optimization solution
	 * @param lambda      
	 * @return cost vector according to optimization criteria
	 */
	public double calculateTimeStepCosts(double[] optSolution, double[] lambda) {
		double result = 0;

		for (int i = 0; i < lambda.length / nStepsMPC; i++) {
			result += lambda[(i * nStepsMPC)] * optSolution[(i * nStepsMPC)] * 0.25;
		}

		return result;
	}

	// TODO: Not used. Remove?
	public double[] matrixMultiplication(double[][] matrix, double[] vec) throws IOException {
		if (matrix[0].length == vec.length) {
			double[] result = new double[matrix[0].length];

			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < vec.length; j++) {
					result[i] += matrix[i][j] * vec[j];
				}
			}
			return result;
		}
		return null;

	}

	/**
	 * Calculates the autarky or economic independence or self-sufficiency.
	 * 
	 * @param problem     A linear programming problem
	 * @param optSolution optimization solution
	 * @return autarky
	 */
	// TODO: Not used. Remove?
	public double calcAutarky(LPOptimizationProblem problem, double[] optSolution) {

		double summeB_H = 0;
		double summeB_el = 0;
		for (int j = 0; j < problem.b_eq.length / 2; j++) {
			summeB_H += problem.b_eq[j];
			summeB_el += problem.b_eq[nStepsMPC + j];
		}

		int x1 = (int) (optSolution.length - 4 * nStepsMPC);
		double purchase_el = 0;
		double purchase_H = 0;

		for (int i = x1; i < x1 + nStepsMPC; i++) {
			// difference between purchased and sold electricity
			purchase_el += optSolution[nStepsMPC + i] - optSolution[i];
			// difference between purchased and sold heat
			purchase_H += optSolution[3 * nStepsMPC + i] - optSolution[2 * nStepsMPC + i];
		}

		double purchasedEnergy = purchase_el + purchase_H;
		double consumption = summeB_H + summeB_el;

		double autarky = (consumption - purchasedEnergy) / consumption; // in %

		return 100 * autarky;

	}

	// TODO: Not used. Remove?
	public void calcNewCosts(LPOptimizationProblem problem, double[] sol, ArrayList<BuildingMessage> buildingSpecs) {

		int nrOfStorages2 = 0;
		int nrOfProducers2 = 0;
		int building = 0;
		int range1 = 0;
		int range2 = 0;
		double tradingCosts = 0;

		System.out.println(" << New Costs >>");

		for (BuildingMessage buildingSpec : buildingSpecs) {
			double newBuildingCosts = 0;
			nrOfProducers2 += buildingSpec.getNrOfVolatileProducers() + buildingSpec.getNrOfControllableProducers();
			nrOfStorages2 += buildingSpec.getNrOfStorages();
			range2 = nStepsMPC * (nrOfProducers2 + 2 * nrOfStorages2);
			for (int j = range1; j < range2; j++) {
				newBuildingCosts += problem.lambda[j] * sol[j];
			}
			range1 = range2;
			building++;

			System.out.println("Building " + building + ": " + String.format("%.02f", newBuildingCosts));
		}

		for (int j = range1; j < problem.lambda.length; j++) {
			tradingCosts += problem.lambda[j] * sol[j];
		}
		System.out.println("Trading with energy supplier: " + String.format("%.02f", tradingCosts));
	}

	/**
	 * @param optSolution optimization solution
	 * @param nStepsMPC   the number of steps for MPC
	 * @return an array with the solution for the time step
	 */
	public double[] getSolutionForThisTimeStep(double[] optSolution, int nStepsMPC) {
		double[] result = new double[optSolution.length / nStepsMPC];
		for (int i = 0; i < result.length; i++) {
			result[i] = optSolution[i * nStepsMPC];
		}
		return result;
	}
	
	/**
	 * This method will compare the names with the ones from 
	 * the building messages and will correct the output efficiency
	 * 
	 * @param localBuildingMessage
	 * @param names
	 * @param optSolution
	 * @param nStepsMPC
	 * @return
	 */
	public double[] getEffSolutionForThisTimeStep(BuildingMessage lbm, String[] names, double[] optSolution, int nStepsMPC) {
		// Caution: this method works only for one device per device class !
		
		double[] result = new double[optSolution.length / nStepsMPC];
		
		ArrayList<ProducerMessage> pm = lbm.controllableProducerList;
		ArrayList<ProducerMessage> vpm = lbm.volatileProducerList;
		ArrayList<CouplerMessage> cm = lbm.couplerList;
		ArrayList<StorageMessage> sm = lbm.storageList;
		
		// create loop till maxNr to catch other devices of ne class.
		int maxNr = Math.max(Math.max(lbm.getNrOfCouplers(), lbm.getNrOfControllableProducers()), Math.max(lbm.getNrOfStorages(), lbm.getNrOfVolatileProducers()));
//		System.out.println("Numbers: " + lbm.getNrOfCouplers() + lbm.getNrOfControllableProducers() + lbm.getNrOfStorages() + lbm.getNrOfVolatileProducers());
			
		for (int i = 0; i < result.length; i++) {
			// get device name at this position
			String devName;
			if (names[i * nStepsMPC].length() > 3) {
				devName = names[i * nStepsMPC].substring(0, names[i * nStepsMPC].length() - 3);
			} else {
				devName = names[i * nStepsMPC];
			}
			// compare device name with building message
			for (int j = 0; j < maxNr; j++) {	
				
				if (lbm.getNrOfControllableProducers() > j && devName.equals(pm.get(j).name)) {
					result[i] = optSolution[i * nStepsMPC]*pm.get(j).efficiency;
				} else if (lbm.getNrOfVolatileProducers() > j && devName.equals(vpm.get(j).name)) {
					result[i] = optSolution[i * nStepsMPC]*vpm.get(j).efficiency;
				} else if (lbm.getNrOfCouplers() > j && devName.equals(cm.get(j).name)) {
					// has to be changed to primary efficiency ?
					result[i] = optSolution[i * nStepsMPC]*cm.get(j).efficiencyHeat;
				} else if (lbm.getNrOfStorages() > j && devName.equals(sm.get(j).name + "Discharge")) {
					result[i] = optSolution[i * nStepsMPC]*sm.get(j).efficiencyDischarge;
				} else if (lbm.getNrOfStorages() > j && devName.equals(sm.get(j).name + "Charge")) {
					result[i] = optSolution[i * nStepsMPC]*sm.get(j).efficiencyCharge;
				} else {
					result[i] = optSolution[i * nStepsMPC];
				}
			}
		}
		return result;
	}
	

	/**
	 * @param demand    combined demand vector
	 * @param nStepsMPC the number of steps for MPC
	 * @return an array with the demand values for a given time step
	 */
	public double[] getDemandForThisTimestep(double[] demand, int nStepsMPC) {
		double[] result = new double[demand.length / nStepsMPC];

		for (int i = 0; i < result.length; i++) {
			result[i] = demand[i * nStepsMPC];
		}

		return result;
	}

	/**
	 * @param optSolution optimization solution
	 * @param etas        transformation vectors
	 * @param nStepsMPC   the number of steps for MPC
	 * @return an array with the demand values for a given time step
	 */
	public double[] getEffSolutionForThisTimeStep(double[] optSolution, double[] etas, int nStepsMPC) {
		double[] result = new double[optSolution.length / nStepsMPC];
		for (int i = 0; i < result.length; i++) {
			result[i] = optSolution[i * nStepsMPC] * etas[i * nStepsMPC];
		}
		return result;
	}

	/**
	 * @param problem   A linear programming problem
	 * @param nStepsMPC the number of steps for MPC
	 * @return an array with the positive demand values
	 */
	public double[] getPositiveDemandForThisTimestep(LPOptimizationProblem problem, int nStepsMPC) {
		double[] result = new double[problem.b_eq.length / nStepsMPC + 1];

		for (int i = 0; i < result.length - 2; i++) {
			result[i] = -problem.b_eq[i * nStepsMPC];
			result[result.length - 2] += result[i];
		}
		result[result.length - 1] = -problem.b_eq[(result.length - 2) * nStepsMPC];
		return result;
	}

	/**
	 * @param storageMessageList a list of storage messages
	 * @return an array with the current state of charge of the storage objects of a
	 *         building
	 */
	public double[] getCurrentSOC(ArrayList<StorageMessage> storageMessageList) {
		double[] result = new double[storageMessageList.size()];
		for (int i = 0; i < result.length; i++) {
			result[i] = storageMessageList.get(i).stateOfCharge;
		}
		return result;
	}

	/**
	 * @param buildingMessageList a list of building messages
	 * @return an array with the current state of charge of all storage objects
	 */
	public double[] getCurrentSOCs(ArrayList<BuildingMessage> buildingMessageList) {
		ArrayList<StorageMessage> storeMessageList = new ArrayList<StorageMessage>();

		for (BuildingMessage bm : buildingMessageList) {
			storeMessageList.addAll(bm.storageList);
		}

		return getCurrentSOC(storeMessageList);
	}

	/**
	 * @param buildingMessageList a list of building messages
	 * @param nStepsMPC           the number of steps for MPC
	 * @return an array with the demand names when Global MEMAP optimization is ON
	 */
	// TODO: Decide whether this function should be here or in a message handler
	public String[] getNamesForDemand(ArrayList<BuildingMessage> buildingMessageList, int nStepsMPC) {
		String[] result = new String[buildingMessageList.size() + 1];

		for (int i = 0; i < result.length - 1; i++) {
			result[i] = "Heat demand - " + buildingMessageList.get(i).name;
		}
		result[result.length - 1] = "Combined electricity demand";
		return result;
	}

	/**
	 * @return an array with the demand type names
	 */
	// TODO: Decide whether this function should be here or in a message handler
	public String[] getNamesForDemand() {
		String[] result = { "Heat demand", "Electricity demand" };
		return result;
	}

	/**
	 * @return an array with the demand names when Global MEMAP optimization is ON
	 */
	public String[] getNamesForPositiveDemand(ArrayList<BuildingMessage> buildingMessageList) {
		String[] result = new String[buildingMessageList.size() + 2];

		for (int i = 0; i < result.length - 2; i++) {
			result[i] = "(+) Heat demand - " + buildingMessageList.get(i).name;
		}
		result[result.length - 2] = "Combined heat demand";
		result[result.length - 1] = "Combined electricity demand";
		return result;
	}

	/**
	 * @param names     an array with the names for every time steps
	 * @param nStepsMPC the number of steps for MPC
	 * @return an array with the efficiency names when Global MEMAP optimization is
	 *         ON
	 */
	public String[] getEffNamesForThisTimeStep(String[] names, int nStepsMPC) {
		String[] result = new String[names.length / nStepsMPC];
		for (int i = 0; i < result.length; i++) {
			result[i] = names[i * nStepsMPC];
			if (result[i].contains(".")) {
				String[] strSplit = result[i].split("\\.");
				result[i] = "(+) " + strSplit[strSplit.length - 1] + " times ETA";
			}
		}
		return result;
	}

	/**
	 * @param names     an array with the names for every time steps
	 * @param nStepsMPC the number of steps for MPC
	 * @return an array with the names for this time step
	 */
	public String[] getVectorNamesForThisTimeStep(String[] names, int nStepsMPC) {
		String[] result = new String[names.length / nStepsMPC];
		
		for (int i = 0; i < result.length; i++) {
			result[i] = names[i * nStepsMPC];
			if (result[i].contains(".")) {
				String[] strSplit = result[i].split("\\.");
				result[i] = strSplit[strSplit.length - 1];
			}
			
			result[i] = result[i].replace("_T0", "");
		}
		
		return result;
	}

	/**
	 * @param storageMessageList a list of storage messages
	 * @return an array with the names of storage objects
	 */
	public String[] getNamesForSOC(ArrayList<StorageMessage> storageMessageList) {
		String[] result = new String[storageMessageList.size()];
		for (int i = 0; i < result.length; i++) {
			result[i] = storageMessageList.get(i).name;
			if (result[i].contains(".")) {
				String[] strSplit = result[i].split("\\.");
				result[i] = strSplit[strSplit.length - 1];
			}
			result[i] = "B"+i + "_" + result[i] + "_SOC";
		}
		return result;
	}

	/**
	 * @param buildingMessageList a list of building messages
	 * @return an array with the names of storage objects
	 */
	// TODO: Not used. Remove?
public String[] getNamesForSOCs(ArrayList<BuildingMessage> buildingMessageList) {
		ArrayList<StorageMessage> storeMessageList = new ArrayList<StorageMessage>();
		for (BuildingMessage bm : buildingMessageList) {
			storeMessageList.addAll(bm.storageList);
		}
		return getNamesForSOC(storeMessageList);
	}

}
