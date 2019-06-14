package linprogMPC.helper;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import linprogMPC.helper.SolutionHandler;
import linprogMPC.Simulation;
import linprogMPC.messages.BuildingSpec;
import meritorder.helper.ReadMemapFiles;

public abstract class SolutionHandler {


	final static int n = Simulation.N_STEPS_MPC;
	
	
	public static void exportData(double[] data, String filename) {

		BufferedWriter bw = null;

		try {
			String source = "res/results/" + filename;
			String location = ReadMemapFiles.class.getProtectionDomain().getCodeSource().getLocation().getPath();
			location = location.replace("%20", " ");
			location = location.substring(0, location.length() - 15);
			location = location + source;

			// Specify the file name and path here
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
				
				if (index == data.length - 1){
					bw.write(String.valueOf(data[index]));
			    }
			    else {
			    	bw.write(String.valueOf(data[index]));
					bw.newLine();
			    }

			}

//			System.out.println("File written Successfully");

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

	
	public static double exportCostsFull(double[] sol, double[] lambda, String filename) {

		// The Costs are evaluated only for the first timestep of the MPC calculation
		double[] costVector = new double[lambda.length];
		double costs = 0;
		
		for (int i=0; i<lambda.length; i++) {
			costVector[i] = lambda[i]*sol[i];
			costs += costVector[i];
		}	
			
		SolutionHandler.exportData(costVector, filename);

		return costs;	
	
	}
	
	public static double[] exportCosts(double[] sol, double[] lambda, String filename) {

		// The Costs are evaluated only for the first timestep of the MPC calculation
		double[] costVector = new double[n];
		
		for (int j=0; j<n; j++) {
			for (int i=0; i<lambda.length/n; i++) {
				costVector[j] += lambda[j+(i*n)]*sol[j+(i*n)];
			}	
		}

		return costVector;	
	
	}
	
	public static double exportCostsStatic(double[] sol, double[] lambda, String filename) {

		double costs = 0;
		double[] costVector = new double[lambda.length];
		
		for (int i=0; i<lambda.length; i++) {
			costVector[i] = lambda[i]*sol[i];
			costs += costVector[i];
		}	

		SolutionHandler.exportData(costVector, filename);

		return costs;	

	}
	
//	public static double exportMemapCosts(double[] sol, double[] lambda, String filename) {
//
//		// The Costs are evaluated only for the first timestep of the MPC calculation
//		double[] costVector = new double[lambda.length/n];
//		double costs = 0;
//		
//		for (int i=0; i<lambda.length/n; i++) {
//			costVector[i] = lambda[i*n]*sol[i*n];
//			costs += costVector[i];
//		}	
//			
////		SolutionHandler.exportData(costVector, filename);
//
//		return costs;	
//	
//	}

	public static double[] matrixMultiplication(double[][] matrix, double[] vec) throws IOException {
		
		if (matrix[0].length == vec.length) {
			double[] result = new double[matrix[0].length];
					 
			for (int i = 0; i <  matrix.length; i++)	{
			    for (int j = 0; j < vec.length; j++) {
			            result[i] += matrix[i][j] * vec[j];
			    }
			}
	
			return result;
		}
		
		return null;
 
	}

	public static void exportMatrix(double[][] data, String filename) {

		BufferedWriter bw = null;

		try {
			String source = "res/results/" + filename;
			String location = ReadMemapFiles.class.getProtectionDomain().getCodeSource().getLocation().getPath();
			location = location.replace("%20", " ");
			location = location.substring(0, location.length() - 15);
			location = location + source;

			// Specify the file name and path here
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
				
				if (index == data.length - 1){
					for (int j=0; j< data[0].length; j++) {
						if (j == data[0].length -1) {
							bw.write(String.valueOf(data[index][j]));
						} else {
							bw.write(String.valueOf(data[index][j]) + ";");
						}
					}
			    }
			    else {
			    	for (int j=0; j< data[0].length; j++) {
			    		if (j == data[0].length -1) {
							bw.write(String.valueOf(data[index][j]));
						} else {
							bw.write(String.valueOf(data[index][j]) + ";");
						}
			    	}
					bw.newLine();
			    }

			}

//			System.out.println("File written Successfully");

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

	public static void exportProduction(double[][] matrixA, double[] sol, String filename) {

		try {
			double[] result = SolutionHandler.matrixMultiplication(matrixA, sol);
			SolutionHandler.exportData(result, filename);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return;	
	}
	
	public static double calcAutarky(OptimizationProblem problem, double[] sol) {
		
		double summeB_H = 0 ;
		double summeB_el = 0 ;
		for (int j=0; j<problem.b_eq.length/2; j++) {
			summeB_H += problem.b_eq[j];
			summeB_el += problem.b_eq[n+j];
		}
		
//		System.out.println("Predicted Heat Consumption: " + -(int)summeB_H + " kWh in " + Simulation.N_DAYS + " days"); // + " - ok.");
//		System.out.println("Predicted Elec Consumption: " + -(int)summeB_el + " kWh in " + Simulation.N_DAYS + " days"); // + " - ok.");		
		
		int x1 = (int)(sol.length-4*n);
		double purchase_el = 0;
		double purchase_H = 0;
		
		
		for (int i=x1; i < x1+n ; i++ ) {
			purchase_el += sol[n+i]-sol[i];		 //difference between purchased and sold electricity
			purchase_H += sol[3*n+i]-sol[2*n+i]; //difference between purchased and sold heat
		}
		
		double purchasedEnergy = purchase_el + purchase_H;
		double consumption = summeB_H + summeB_el;
		
		double autarky = (consumption-purchasedEnergy)/consumption; // in %
		
		return 100*autarky;
		
	}

	public static void calcNewCosts(OptimizationProblem problem, double[] sol, ArrayList<BuildingSpec> buildingSpecs) {
		
		int nrOfStorages2 = 0;
		int nrOfProducers2 = 0;
		int building = 0;
		int range1 = 0;
		int range2 = 0;
		double tradingCosts = 0;
		
		System.out.println(" << New Costs >>");
					
		for(BuildingSpec buildingSpec : buildingSpecs) {
			double newBuildingCosts = 0;
			nrOfProducers2 += buildingSpec.getNrOfProducers();
			nrOfStorages2 += buildingSpec.getNrOfStorages();	
			range2 = n*(nrOfProducers2+2*nrOfStorages2);
			for (int j=range1; j<range2; j++) {
				newBuildingCosts += problem.lambda[j]*sol[j];
			}	
			range1=range2;
			building++;
			
			System.out.println("Building " + building + ": " + String.format("%.02f", newBuildingCosts));
			
		}
		
		for (int j=range1; j<problem.lambda.length; j++) {
			tradingCosts += problem.lambda[j]*sol[j];
		}	
		
		System.out.println("Trading with energy supplier: " + String.format("%.02f", tradingCosts));
		
	}

	
	
}
