package linprogMPC.messages;

import java.util.ArrayList;

import akka.basicMessages.AnswerContent;
import akka.basicMessages.BasicAnswer;
import linprogMPC.messages.extension.NetworkType;
import linprogMPC.messages.planning.ConnectionMessage;
import linprogMPC.messages.planning.CouplerMessage;
import linprogMPC.messages.planning.DemandMessage;
import linprogMPC.messages.planning.ProducerMessage;
import linprogMPC.messages.planning.StorageMessage;
import linprogMPC.messages.planning.VolatileProducerMessage;
import linprogMPC.messages.realTime.CurrentMeterValues;

public class BuildingMessageHandler {

	public double[] getCombinedDemandVector(ArrayList<BuildingMessage> buildingMessages, int nStepsMPC) {
		
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
	
	public String[] getCombinedDemandNames(ArrayList<BuildingMessage> buildingMessages, int nStepsMPC) {
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

	public double[] getSOC(ArrayList<BuildingMessage> buildingMessages, int nStepsMPC) {		
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

	public String[] getSOCNames(ArrayList<BuildingMessage> buildingMessages, int nStepsMPC) {
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

	public BuildingMessage aggregateBuildingMessages(BuildingMessage buildingMessage,
			ArrayList<BasicAnswer> answerListReceived) {
				
		BuildingMessage bm = buildingMessage;
		
		for(BasicAnswer basicAnswer : answerListReceived) {
			AnswerContent answerContent = basicAnswer.answerContent;
			
			if(answerContent instanceof BuildingMessage) {
				
				BuildingMessage bmInternal = (BuildingMessage) answerContent;
				
				for (DemandMessage dm : bmInternal.demandList) {
					bm.demandList.add(dm);
				}

				for (ProducerMessage pm : bmInternal.volatileProducerList) {
					if(pm instanceof VolatileProducerMessage) {
						bm.volatileProducerList.add((VolatileProducerMessage) pm);
					}
				}
				
				for (ProducerMessage pm : bmInternal.controllableProducerList) {
					if(pm instanceof VolatileProducerMessage) {
						bm.volatileProducerList.add((VolatileProducerMessage) pm);
					} else {
						bm.controllableProducerList.add((ProducerMessage) pm);
					}
				}
				
				for (StorageMessage sm : bmInternal.storageList) {
					bm.storageList.add(sm);
				}
				
				for (CouplerMessage cm : bmInternal.couplerList) {
					bm.couplerList.add(cm);
				}
				
				for (ConnectionMessage cm : bmInternal.connectionList) {
					bm.connectionList.add(cm);
				}			
			}
			
			if(answerContent instanceof DemandMessage) {
				DemandMessage dm = (DemandMessage) answerContent;
				bm.demandList.add( (DemandMessage) dm);
			}
			
			if(answerContent instanceof ProducerMessage) {				
				if(answerContent instanceof VolatileProducerMessage) {
					bm.volatileProducerList.add((VolatileProducerMessage) answerContent);
				} else {
					bm.controllableProducerList.add((ProducerMessage) answerContent);
				}				
			}
			
			if(answerContent instanceof StorageMessage) {
				bm.storageList.add((StorageMessage) answerContent);
			}		
			
			if(answerContent instanceof CouplerMessage) {
				bm.couplerList.add((CouplerMessage) answerContent);
			}
			
			if(answerContent instanceof ConnectionMessage) {
				bm.connectionList.add((ConnectionMessage) answerContent);
			}
		}
		return bm;
	}

	public BuildingMessage refactorDemandList(BuildingMessage buildingMessage) {
		BuildingMessage bm = buildingMessage;
			
		ArrayList<DemandMessage> newDemandList = new ArrayList<DemandMessage>(); 
		
		for (DemandMessage demandMessage : bm.demandList) {
			
			if (demandMessage.networkType == NetworkType.DEMANDWITHBOTH) {
				// Make two separate DemandMessages				
				DemandMessage heatDemand = new DemandMessage();
				DemandMessage elecDemand = new DemandMessage();
				
				heatDemand.forecastType = demandMessage.forecastType;
				elecDemand.forecastType = demandMessage.forecastType;
				
				heatDemand.id = demandMessage.id + "HEAT";
				elecDemand.id = demandMessage.id + "ELECTRICITY";
				
				heatDemand.name = "HEAT_" + demandMessage.name;
				elecDemand.name = "ELECTRICITY_" + demandMessage.name;
				
				heatDemand.networkType = NetworkType.HEAT;
				elecDemand.networkType = NetworkType.ELECTRICITY;
				
				heatDemand.optimizationCriteria = demandMessage.optimizationCriteria;
				elecDemand.optimizationCriteria = demandMessage.optimizationCriteria;
				
				int length = demandMessage.getDemandVector().length / 2;
				double[] aInput =  new double[length];
				double[] bInput =  new double[length];
				
				for (int i = 0; i < length; i++) {
					aInput[i] = demandMessage.getDemandVector()[i];
					bInput[i] = demandMessage.getDemandVector()[length+i];
				}
				
				heatDemand.setDemandVector(aInput);
				elecDemand.setDemandVector(bInput);
				
				newDemandList.add(heatDemand);
				newDemandList.add(elecDemand);
			}
			
			if (demandMessage.networkType == NetworkType.ELECTRICITY) {
				newDemandList.add(demandMessage);
			}
			
			if (demandMessage.networkType == NetworkType.HEAT) {
				newDemandList.add(demandMessage);
			}
		}
			
		buildingMessage.demandList = newDemandList;
		return buildingMessage;
	}

	public BuildingMessage addMetering(BuildingMessage bmIn, String fullActorPath) {
			
		BuildingMessage result = bmIn;
		
		for (DemandMessage demand : bmIn.demandList) {
			CurrentMeterValues cmv = new CurrentMeterValues();			
			if (demand.networkType == NetworkType.HEAT) {
				cmv.name = "HEATDemand";
				cmv.id = fullActorPath + "/HEATDemand";
			}			
			if (demand.networkType == NetworkType.ELECTRICITY) {
				cmv.name = "ELECTRICITYDemand";
				cmv.id = fullActorPath + "/ELECTRICITYDemand";
			}									
			cmv.networkType = demand.networkType;
			cmv.powerInjection = demand.getDemandVector()[0];						
			result.currentMeterValueList.add(cmv);
		}		
		return result;
	}
}