package memap.messages;

import java.util.ArrayList;

import akka.basicMessages.AnswerContent;
import akka.basicMessages.BasicAnswer;
import memap.messages.extension.NetworkType;
import memap.messages.planning.ConnectionMessage;
import memap.messages.planning.CouplerMessage;
import memap.messages.planning.DemandMessage;
import memap.messages.planning.ProducerMessage;
import memap.messages.planning.StorageMessage;
import memap.messages.planning.VolatileProducerMessage;
import memap.messages.realTime.CurrentMeterValues;

public class BuildingMessageHandler {

	/*
	 * TODO Move functionality to SolutionHandler. Possible solutions: Create
	 * interface and overload method. Keep design, overload method.
	 */
	public double[] getCombinedDemandVector(ArrayList<BuildingMessage> buildingMessages, int nStepsMPC) {

		int nrOfMessages = buildingMessages.size();
		double[] result = new double[(1 + nrOfMessages) * nStepsMPC];

		int bm_counter = 0;
		for (BuildingMessage bm : buildingMessages) {
			double[] demand = bm.getCombinedDemandVector();

			for (int i = 0; i < demand.length / 2; i++) {
				result[bm_counter * nStepsMPC + i] = demand[i];
			}

			for (int i = 0; i < demand.length / 2; i++) {
				result[nrOfMessages * nStepsMPC + i] += demand[nStepsMPC + i];
			}
			bm_counter++;
		}
		return result;
	}

	/* TODO Check for duplicates of these functions in other classes */
	public BuildingMessage aggregateBuildingMessages(BuildingMessage buildingMessage,
			ArrayList<BasicAnswer> answerListReceived) {

		BuildingMessage bm = buildingMessage;

		for (BasicAnswer basicAnswer : answerListReceived) {
			AnswerContent answerContent = basicAnswer.answerContent;

			if (answerContent instanceof BuildingMessage) {

				BuildingMessage bmInternal = (BuildingMessage) answerContent;

				for (DemandMessage dm : bmInternal.demandList) {
					bm.demandList.add(dm);
				}

				for (ProducerMessage pm : bmInternal.volatileProducerList) {
					if (pm instanceof VolatileProducerMessage) {
						bm.volatileProducerList.add((VolatileProducerMessage) pm);
					}
				}

				for (ProducerMessage pm : bmInternal.controllableProducerList) {
					if (pm instanceof VolatileProducerMessage) {
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

			if (answerContent instanceof DemandMessage) {
				DemandMessage dm = (DemandMessage) answerContent;
				bm.demandList.add((DemandMessage) dm);
			}

			if (answerContent instanceof ProducerMessage) {
				if (answerContent instanceof VolatileProducerMessage) {
					bm.volatileProducerList.add((VolatileProducerMessage) answerContent);
				} else {
					bm.controllableProducerList.add((ProducerMessage) answerContent);
				}
			}

			if (answerContent instanceof StorageMessage) {
				bm.storageList.add((StorageMessage) answerContent);
			}

			if (answerContent instanceof CouplerMessage) {
				bm.couplerList.add((CouplerMessage) answerContent);
			}

			if (answerContent instanceof ConnectionMessage) {
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

				int length = demandMessage.getDemandVector().length / 2;
				double[] aInput = new double[length];
				double[] bInput = new double[length];

				for (int i = 0; i < length; i++) {
					aInput[i] = demandMessage.getDemandVector()[i];
					bInput[i] = demandMessage.getDemandVector()[length + i];
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