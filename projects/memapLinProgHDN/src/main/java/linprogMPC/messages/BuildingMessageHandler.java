package linprogMPC.messages;

import java.util.ArrayList;

import linprogMPC.messages.planning.StorageMessage;

public class BuildingMessageHandler {

	public static double[] getCombinedDemandVector(ArrayList<BuildingMessage> buildingMessages, int nStepsMPC) {
		
		int nrOfMessages = buildingMessages.size();
		double[] result = new double[ ( 1 + nrOfMessages) * nStepsMPC];
		
		
		int bm_counter = 0;
		for (BuildingMessage bm : buildingMessages) {			
			double[] demand =  bm.getCombinedDemandVector();
						
			//System.out.println("demand: " + Arrays.toString(demand));
			for (int i = 0; i < demand.length/2; i++) {
				result[bm_counter * nStepsMPC + i] = demand[i];
			}
			
			for (int i = 0; i < demand.length/2; i++){
				result[nrOfMessages * nStepsMPC + i] += demand[nStepsMPC+i];
			}
			bm_counter++;
		}
		return result;
	}
	
	public static String[] getCombinedDemandNames(ArrayList<BuildingMessage> buildingMessages, int nStepsMPC) {
		int nrOfMessages = buildingMessages.size();
		String[] result = new String[ ( 1 + nrOfMessages)];
		
		
		int bm_counter = 0;
		for (BuildingMessage bm : buildingMessages) {			
			result[bm_counter] = "demandHeat_"+ bm.name;
			bm_counter++;
		}
		
		result[bm_counter] = "demandElectricity";
		return result;
	}

	public static double[] getSOC(ArrayList<BuildingMessage> buildingMessages, int nStepsMPC) {		
		double[] result = null;
		
		ArrayList<StorageMessage> sl = new ArrayList<StorageMessage>();
		
		for (BuildingMessage bm : buildingMessages) {
			sl.addAll(bm.storageList);
		}
		
		result = new double[sl.size()];
		
		int counter = 0;
		for (StorageMessage sm : sl) {
			result[counter] = sm.stateOfCharge;
			counter++;
		}
		
		return result;
	}

	public static String[] getSOCNames(ArrayList<BuildingMessage> buildingMessages, int nStepsMPC) {
		String[] result = null;
		
		ArrayList<StorageMessage> sl = new ArrayList<StorageMessage>();
		
		for (BuildingMessage bm : buildingMessages) {
			sl.addAll(bm.storageList);
		}
		
		result = new String[sl.size()];
		
		int counter = 0;
		for (StorageMessage sm : sl) {
			result[counter] = sm.name+"SOC";
			counter++;
		}
		
		return result;
	}
}
