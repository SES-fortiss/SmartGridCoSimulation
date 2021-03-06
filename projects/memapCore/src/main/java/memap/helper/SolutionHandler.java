package memap.helper;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;

import memap.helper.lp.LPOptimizationProblem;
import memap.main.TopologyConfig;
import memap.media.Strings;
import memap.messages.BuildingMessage;
import memap.messages.extension.NetworkType;
import memap.messages.planning.ConnectionMessage;
import memap.messages.planning.CouplerMessage;
import memap.messages.planning.ProducerMessage;
import memap.messages.planning.StorageMessage;


public class SolutionHandler {

	/** MPC horizon: Initialization must be delayed until after {@link TopologyConfig} initialization */
	private int nStepsMPC;
	private TopologyConfig topConfig;
	
	public SolutionHandler(int nStepsMPC, TopologyConfig topConfig){
		this.nStepsMPC = nStepsMPC;
		this.topConfig = topConfig;
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
		System.out.println("WRITE solutions, SolitionHandler, try file location: " + location);
		
		
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
	
	/**
	 * @param optSolution optimization solution
	 * @param lambda      
	 * @return cost vector according to optimization criteria
	 */
	public double calculateTimeStepCosts(double[] optSolution, double[] lambda) {
		double result = 0;

		for (int i = 0; i < lambda.length / nStepsMPC; i++) {
			result += lambda[(i * nStepsMPC)] * optSolution[(i * nStepsMPC)] * topConfig.getStepLengthInHours();
		}

		return result;
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
	
	public double[] getCurrentSOCEnergy(ArrayList<StorageMessage> storageMessageList) {
		double[] result = new double[storageMessageList.size()];
		for (int i = 0; i < result.length; i++) {
			result[i] = storageMessageList.get(i).storageEnergyContent;
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
	
	public double[] getCurrentSOCEnergyMB(ArrayList<BuildingMessage> buildingMessageList) {
		ArrayList<StorageMessage> storeMessageList = new ArrayList<StorageMessage>();

		for (BuildingMessage bm : buildingMessageList) {
			storeMessageList.addAll(bm.storageList);
		}

		return getCurrentSOCEnergy(storeMessageList);
	}

	/**
	 * @param buildingMessageList a list of building messages
	 * @param nStepsMPC           the number of steps for MPC
	 * @return an array with the demand names when Global MEMAP optimization is ON
	 */
	public String[] getNamesForDemand(ArrayList<BuildingMessage> buildingMessageList, int nStepsMPC) {
		
		// following structure is intended: result["System heat demand", "Heat demand - building 1", ..., "System electricity demand"]
		String[] result = new String[2 + buildingMessageList.size()];

		result[0] = Strings.heatDemand;
		
		for (int i = 1; i <= buildingMessageList.size(); i++) {
			result[i] = "Heat demand - " + buildingMessageList.get(i-1).name;
		}
		
		result[result.length - 1] = Strings.electricityDemand;
		return result;
	}

	/**
	 * @return an array with the demand names
	 */
	public String[] getNamesForDemandSingleBuilding() {
		String[] result = { Strings.heatDemand, Strings.electricityDemand };
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
			result[i] =  result[i] + "_SOC";
		}
		return result;
	}
	
	public String[] getNamesForSOCEnergy(ArrayList<StorageMessage> storageMessageList) {
		String[] result = new String[storageMessageList.size()];
		for (int i = 0; i < result.length; i++) {
			result[i] = storageMessageList.get(i).name;
			if (result[i].contains(".")) {
				String[] strSplit = result[i].split("\\.");
				result[i] = strSplit[strSplit.length - 1];
			}
			result[i] =  result[i] + "_SOC_Energy";
		}
		return result;
	}

	/**
	 * @param buildingMessageList a list of building messages
	 * @return an array with the names of storage objects
	 */
	public String[] getNamesForSOCs(ArrayList<BuildingMessage> buildingMessageList) {
		ArrayList<StorageMessage> storeMessageList = new ArrayList<StorageMessage>();
		for (BuildingMessage bm : buildingMessageList) {
			storeMessageList.addAll(bm.storageList);
		}
		return getNamesForSOC(storeMessageList);
	}

	public String[] getNamesForSOCEnergyMB(ArrayList<BuildingMessage> buildingMessageList) {
		ArrayList<StorageMessage> storeMessageList = new ArrayList<StorageMessage>();
		for (BuildingMessage bm : buildingMessageList) {
			storeMessageList.addAll(bm.storageList);
		}
		return getNamesForSOCEnergy(storeMessageList);
	}

	public ArrayList<String> createNamesForCorrEfficiency(BuildingMessage singleBuildingMessage, String[] names) {
		ArrayList<String> additionalNames = new ArrayList<>();
		
		for (ProducerMessage producerMessage : singleBuildingMessage.controllableProducerList) {
			for (int i = 0; i < names.length; i++) {
				if(names[i].contains(producerMessage.name + "_T")) {
					additionalNames.add(names[i] + "_withEfficiency");
				}
			}
		}
		
		for (CouplerMessage couplerMessage : singleBuildingMessage.couplerList) {
			for (int i = 0; i < names.length; i++) {
				if(names[i].contains(couplerMessage.name + "_T")) {
					additionalNames.add(names[i] +  "_withEffieciency" +"_"+ couplerMessage.primaryNetwork);
					additionalNames.add(names[i] +  "_withEffieciency" +"_"+ couplerMessage.secondaryNetwork);
				}
			}
		}
		return additionalNames;
	}

	public ArrayList<Double> createValuesForCorrEfficiency(
			BuildingMessage singleBuildingMessage, 
			String[] names,
			double[] optSolution) {
		
		ArrayList<Double> additionalValues = new ArrayList<>();
		
		for (ProducerMessage producerMessage : singleBuildingMessage.controllableProducerList) {			
			for (int i = 0; i < names.length; i++) {
				if(names[i].contains(producerMessage.name + "_T")) {
					additionalValues.add(optSolution[i]*producerMessage.efficiency);				
				}
			}
		}
		
		for (CouplerMessage couplerMessage : singleBuildingMessage.couplerList) {
			
			for (int i = 0; i < names.length; i++) {
				if(names[i].contains(couplerMessage.name + "_T")) {
					//System.out.println(names[i]);
					if(couplerMessage.primaryNetwork == NetworkType.HEAT) {
						additionalValues.add(optSolution[i]*couplerMessage.efficiencyHeat);
						additionalValues.add(optSolution[i]*couplerMessage.efficiencyElec);
					} else if (couplerMessage.primaryNetwork == NetworkType.ELECTRICITY) {
						additionalValues.add(optSolution[i]*couplerMessage.efficiencyElec);
						additionalValues.add(optSolution[i]*couplerMessage.efficiencyHeat);
					}
				}
			}
		}		
				
		return additionalValues;
	}

	public ArrayList<String> createNamesForCorrEfficiency(ArrayList<BuildingMessage> multipleBuildingMessages, String[] names) {		
		ArrayList<String> buffer = new ArrayList<>();
				
		for (BuildingMessage bm : multipleBuildingMessages) {						
			buffer.addAll(createNamesForCorrEfficiency(bm, names));			
		}		
		
		for (BuildingMessage bm : multipleBuildingMessages) {						
			for (ConnectionMessage cm : bm.connectionList) {
				for (int i = 0; i < names.length; i++) {
					if(names[i].contains(cm.name)) {	
						buffer.add(names[i] + "_withEfficiency");
					}
				}
			}			
		}
		return buffer;
	}

	public ArrayList<Double> createValuesForCorrEfficiency(ArrayList<BuildingMessage> multipleBuildingMessages,
			String[] names, double[] optSolution) {
		ArrayList<Double> buffer = new ArrayList<>();
		
		for (BuildingMessage bm : multipleBuildingMessages) {	
			buffer.addAll(createValuesForCorrEfficiency(bm, names, optSolution));
		}
		
		for (BuildingMessage bm : multipleBuildingMessages) {
			for (ConnectionMessage cm : bm.connectionList) {
				for (int i = 0; i < names.length; i++) {					
					if(names[i].contains(cm.name)) {
						buffer.add(optSolution[i]*cm.efficiency);				
					}
				}
			}
		}
		return buffer;
	}

	public int[] getIndicesByTO(String[] names, int nStepsMPC2) {
		int[] result = new int[ names.length / nStepsMPC2];
		int counter = 0;
		
		for (int i = 0; i < names.length; i++) {
			if(names[i].contains("_T0")) {
				result[counter] = i;
				counter++;
			}
		}
				
		return result;
	}

}
