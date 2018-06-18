package linprog.helper;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import meritorder.helper.ReadMemapFiles;

public abstract class SolutionHandler {


	
	public static void exportData(double[] data, String filename) {

		BufferedWriter bw = null;

		try {
			String source = "res/" + filename;
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

	public static double exportCosts(double[] sol, double[] lambda, String filename) {

		double costs = 0;
		double[] costVector = new double[lambda.length];
		
		for (int i=0; i<lambda.length; i++) {
			costVector[i] += lambda[i]*sol[i];
			costs += costVector[i];
		}
		
	//		System.out.println("COSTS without MEMAP: " + buildingsTotalCosts/100);		

		SolutionHandler.exportData(costVector, filename);

		return costs/100;	

		
	}

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
			String source = "res/" + filename;
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
}
