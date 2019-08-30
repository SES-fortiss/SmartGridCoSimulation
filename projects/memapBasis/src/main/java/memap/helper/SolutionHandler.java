package memap.helper;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;

import helper.IoHelper;
import memap.MemapConfig;
import memap.messages.BuildingMessage;
import memap.messages.extension.NetworkType;
import memap.messages.planning.DemandMessage;
import memap.messages.planning.StorageMessage;

public class SolutionHandler {

	/** Main output directory path */
	private static String mainDir = DirectoryConfiguration.mainDir;
	/** Configuration directory path */
	private static String resultDir = DirectoryConfiguration.resultDir;
	
	int nMPC = MemapConfig.N_STEPS_MPC;

	public void exportVector(double[] data, String filename) {
		BufferedWriter bw = null;
		try {
			String source = "/" + mainDir + "/" + resultDir + "/" + filename;
			String location = System.getProperty("user.dir");
			/*
			 * Note: location is the project directory from which the simulation was started
			 * or or the directory from which the .jar was executed.
			 */
			location = location + source;
			File file = new File(location);

			/*
			 * This logic will make sure that the file gets created if it is not present at
			 * the specified location
			 */
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file);
			bw = new BufferedWriter(fw);

			for (int index = 0; index < data.length; index++) {

				if (index == data.length - 1) {
					bw.write(String.valueOf(data[index]));
				} else {
					bw.write(String.valueOf(data[index]));
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
				ex.printStackTrace();
			}
		}
	}

	public double exportCostsFull(double[] sol, double[] lambda, String filename) {

		// The Costs are evaluated only for the first timestep of the MPC calculation
		double[] costVector = new double[lambda.length];
		double costs = 0;

		for (int i = 0; i < lambda.length; i++) {
			costVector[i] = lambda[i] * sol[i];
			costs += costVector[i];
		}

		exportVector(costVector, filename);
		return costs;
	}

	public double[] calculateTimeStepCosts(double[] sol, double[] lambda) {
		// The Costs are evaluated only for the first timestep of the MPC calculation
		double[] costVector = new double[nMPC];

		for (int j = 0; j < nMPC; j++) {
			for (int i = 0; i < lambda.length / nMPC; i++) {
				costVector[j] += lambda[j + (i * nMPC)] * sol[j + (i * nMPC)];
			}
		}

		return costVector;

	}

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

	public void exportMatrix(double[][] data, String filename) {

		BufferedWriter bw = null;

		try {
			String source = "/" + mainDir + "/" + resultDir + "/" + filename;
			String location = System.getProperty("user.dir");
			/*
			 * Note: location is the project directory from which the simulation was started
			 * or or the directory from which the .jar was executed.
			 */
			location = location + source;
			File file = new File(location);

			/*
			 * This logic will make sure that the file gets created if it is not present at
			 * the specified location
			 */
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file);
			bw = new BufferedWriter(fw);

			for (int index = 0; index < data.length; index++) {

				if (index == data.length - 1) {
					for (int j = 0; j < data[0].length; j++) {
						if (j == data[0].length - 1) {
							bw.write(String.valueOf(data[index][j]));
						} else {
							bw.write(String.valueOf(data[index][j]) + ";");
						}
					}
				} else {
					for (int j = 0; j < data[0].length; j++) {
						if (j == data[0].length - 1) {
							bw.write(String.valueOf(data[index][j]));
						} else {
							bw.write(String.valueOf(data[index][j]) + ";");
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

	public void exportProduction(double[][] matrixA, double[] sol, String filename) {

		try {
			double[] result = matrixMultiplication(matrixA, sol);
			exportVector(result, filename);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return;
	}

	public double calcAutarky(OptimizationProblem problem, double[] sol) {

		double summeB_H = 0;
		double summeB_el = 0;
		for (int j = 0; j < problem.b_eq.length / 2; j++) {
			summeB_H += problem.b_eq[j];
			summeB_el += problem.b_eq[nMPC + j];
		}

//		System.out.println("Predicted Heat Consumption: " + -(int)summeB_H + " kWh in " + MemapSimulation.N_DAYS + " days"); // + " - ok.");
//		System.out.println("Predicted Elec Consumption: " + -(int)summeB_el + " kWh in " + MemapSimulation.N_DAYS + " days"); // + " - ok.");		

		int x1 = (int) (sol.length - 4 * nMPC);
		double purchase_el = 0;
		double purchase_H = 0;

		for (int i = x1; i < x1 + nMPC; i++) {
			purchase_el += sol[nMPC + i] - sol[i]; // difference between purchased and sold electricity
			purchase_H += sol[3 * nMPC + i] - sol[2 * nMPC + i]; // difference between purchased and sold heat
		}

		double purchasedEnergy = purchase_el + purchase_H;
		double consumption = summeB_H + summeB_el;

		double autarky = (consumption - purchasedEnergy) / consumption; // in %

		return 100 * autarky;

	}

	public void calcNewCosts(OptimizationProblem problem, double[] sol, ArrayList<BuildingMessage> buildingSpecs) {

		int nrOfStorages2 = 0;
		int nrOfProducers2 = 0;
		int building = 0;
		int range1 = 0;
		int range2 = 0;
		double tradingCosts = 0;

		System.out.println(" << New Costs >>");

		for (BuildingMessage buildingSpec : buildingSpecs) {
			double newBuildingCosts = 0;
			nrOfProducers2 += buildingSpec.getNrOfProducers();
			nrOfStorages2 += buildingSpec.getNrOfStorages();
			range2 = nMPC * (nrOfProducers2 + 2 * nrOfStorages2);
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

	public double[] getSolutionForThisTimeStep(double[] optSolution, int nStepsMPC) {

		double[] result = new double[optSolution.length / nStepsMPC];

		for (int i = 0; i < result.length; i++) {
			result[i] = optSolution[i * nStepsMPC];
		}

		return result;
	}

	public String[] getNamesForThisTimeStep(OptimizationProblem problem, int nStepsMPC) {
		String[] result = new String[problem.namesUB.length / nStepsMPC];

		for (int i = 0; i < result.length; i++) {
			result[i] = problem.namesUB[i * nStepsMPC];
		}

		return result;
	}

	/**
	 * Verifies the type of demand of the building and returns the solution for the
	 * nStepsMPC time step accordingly.
	 * 
	 * @return the solution for the nStepsMPC time step.
	 */
	public double[] getDemandForThisTimestep(OptimizationProblem problem, int nStepsMPC,
			BuildingMessage buildingMessage) {
		double[] results = { problem.b_eq[0], problem.b_eq[nStepsMPC] };
		if (isOneDemandType(buildingMessage)) {
			double[] result = new double[1];
			if (buildingMessage.demandList.get(0).networkType == NetworkType.HEAT) {
				result[0] = results[0];
			} else {
				result[0] = results[1];
			}
			return result;
		}
		return results;
	}

	public double[] getDemandForThisTimestep(OptimizationProblem problem, int nStepsMPC) {
		double[] result = new double[problem.b_eq.length / (2 * nStepsMPC)];
		for (int i = 0; i < result.length; i++) {
			result[i] = problem.b_eq[i * nStepsMPC];
		}
		return result;
	}

	public double[] getCurrentSOC(ArrayList<StorageMessage> storages) {
		double[] result = new double[storages.size()];

		for (int i = 0; i < result.length; i++) {
			result[i] = storages.get(i).stateOfCharge;
		}

		return result;
	}

	public double[] getCurrentSOCs(ArrayList<BuildingMessage> buildingMessageList) {
		ArrayList<StorageMessage> storeMessageList = new ArrayList<StorageMessage>();

		for (BuildingMessage bm : buildingMessageList) {
			storeMessageList.addAll(bm.storageList);
		}

		return getCurrentSOC(storeMessageList);
	}

	/**
	 * Verifies the type of demand of the building and returns the demand strings
	 * accordingly.
	 * 
	 * @return the demand strings
	 */
	public String[] getNamesForDemand(BuildingMessage buildingMessage) {
		String[] demandStrings = { buildingMessage.name + " (Heat demand)",
				buildingMessage.name + " (Electricity demand)" };

		if (isOneDemandType(buildingMessage) == true) {
			String[] demandString = new String[1];
			if (buildingMessage.demandList.get(0).networkType == NetworkType.HEAT) {
				demandString[0] = demandStrings[0];
			} else {
				demandString[0] = demandStrings[1];
			}
			return demandString;
		}

		return demandStrings;
	}

	public boolean isOneDemandType(BuildingMessage buildingMessage) {
		boolean allEqualDemand = true;

		for (DemandMessage demand : buildingMessage.demandList) {
			if (demand.networkType != buildingMessage.demandList.get(0).networkType) {
				allEqualDemand = false;
			}
		}
		return allEqualDemand;
	}

	public String[] getNamesForSOC(ArrayList<StorageMessage> storages) {

		String[] result = new String[storages.size()];

		for (int i = 0; i < result.length; i++) {
			result[i] = storages.get(i).name + " (SOC)";
		}

		return result;
	}

	public String[] getNamesForSOCs(ArrayList<BuildingMessage> buildingMessageList) {
		ArrayList<StorageMessage> storeMessageList = new ArrayList<StorageMessage>();

		for (BuildingMessage bm : buildingMessageList) {
			storeMessageList.addAll(bm.storageList);
		}
		return getNamesForSOC(storeMessageList);
	}

	/**
	 * Achtung code is quick und dirty L�sung, weil das meiste copy pasted von
	 * export matrix ist. M�sste bei Gelegenheit verbessert werden.
	 * 
	 * @param data
	 * @param filename
	 * @param header
	 */
	public void exportMatrixWithHeader(double[][] data, String filename, String[] header) {

		BufferedWriter bw = null;

		try {
			String source = "/" + mainDir + "/" + resultDir + "/" + filename;
			String location = System.getProperty("user.dir");
			/*
			 * Note: location is the project directory from which the simulation was started
			 * or or the directory from which the .jar was executed.
			 */
			location = location + source;

			System.out.println("Try Filelocation: " + location);
			IoHelper.createParentFolders(location);
			File file = new File(location);

			/*
			 * This logic will make sure that the file gets created if it is not present at
			 * the specified location
			 */
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file);
			bw = new BufferedWriter(fw);

			// die Zeilen wurden an die copy-pasted L�sung hinzugef�gt
			for (int i = 0; i < header.length; i++) {
				bw.write(header[i] + ";");
			}

			bw.newLine();

			// hier ende der �nderung

			for (int index = 0; index < data.length; index++) {
				if (index == data.length - 1) {
					for (int j = 0; j < data[0].length; j++) {
						if (j == data[0].length - 1) {
							bw.write(String.format(Locale.US, "%1$,.2f", data[index][j]));
						} else {
							bw.write(String.format(Locale.US, "%1$,.2f", data[index][j]) + ";");
						}
					}
				} else {
					for (int j = 0; j < data[0].length; j++) {
						if (j == data[0].length - 1) {
							bw.write(String.format(Locale.US, "%.2f", data[index][j]));
						} else {
							bw.write(String.format(Locale.US, "%.2f", data[index][j]) + ";");
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

}