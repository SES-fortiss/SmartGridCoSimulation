package memap.messages;

import java.util.ArrayList;

import com.google.gson.Gson;

import akka.basicMessages.AnswerContent;
import memap.messages.extension.ChildSpecification;
import memap.messages.extension.NetworkType;
import memap.messages.planning.ConnectionMessage;
import memap.messages.planning.CouplerMessage;
import memap.messages.planning.DemandMessage;
import memap.messages.planning.ProducerMessage;
import memap.messages.planning.StorageMessage;
import memap.messages.realTime.AvailableFlexibilities;
import memap.messages.realTime.CurrentMeterValues;
import memap.messages.realTime.CurrentSetPoints;

public class BuildingMessage implements AnswerContent {

	/** The name of the actor, i.e. building */
	public String name;
	/** Unique id of the sender */
	public String id;
	/**  Maximum to buy from the grid per timestep */
	public double[] varNetworkBuyCap;

	// Place holders for OPC UA interface
	public ArrayList<CurrentSetPoints> currentSetPointList = new ArrayList<CurrentSetPoints>();
	public ArrayList<CurrentMeterValues> currentMeterValueList = new ArrayList<CurrentMeterValues>();
	public ArrayList<AvailableFlexibilities> availableFlexibilitiesList = new ArrayList<AvailableFlexibilities>();
	public ArrayList<ChildSpecification> childrenList = new ArrayList<ChildSpecification>();

	// Required for Optimization
	public ArrayList<DemandMessage> demandList = new ArrayList<DemandMessage>();
	public ArrayList<StorageMessage> storageList = new ArrayList<StorageMessage>();
	public ArrayList<CouplerMessage> couplerList = new ArrayList<CouplerMessage>();
	public ArrayList<ProducerMessage> volatileProducerList = new ArrayList<ProducerMessage>();
	public ArrayList<ProducerMessage> controllableProducerList = new ArrayList<ProducerMessage>();
	public ArrayList<ConnectionMessage> connectionList = new ArrayList<ConnectionMessage>();
	public OptimizationResultMessage currentOptimizationResults;

	public int getNrOfConsumers() {
		return demandList.size();
	}

	public int getNrOfControllableProducers() {
		return controllableProducerList.size();
	}

	public int getNrOfVolatileProducers() {
		return volatileProducerList.size();
	}

	public int getNrOfStorages() {
		return storageList.size();
	}

	public int getNrOfCouplers() {
		return couplerList.size();
	}

	public int getNrOfConnections() {
		return connectionList.size();
	}

	/**
	 * returns a single double[] array, where the heat represents the first
	 * n-entries and electricity the second n-entries.
	 */
	public double[] getCombinedDemandVector() {
		double[] result = null;
		for (DemandMessage dm : demandList) {

			// init result
			if (result == null) {
				if (dm.networkType == NetworkType.DEMANDWITHBOTH) {
					result = new double[dm.getDemandVector().length];
				}
				if (dm.networkType == NetworkType.HEAT) {
					result = new double[2 * dm.getDemandVector().length];
				}
				if (dm.networkType == NetworkType.ELECTRICITY) {
					result = new double[2 * dm.getDemandVector().length];
				}
			}

			// add consumptions
			if (dm.networkType == NetworkType.DEMANDWITHBOTH) {
				for (int i = 0; i < result.length; i++) {
					result[i] += dm.getDemandVector()[i];
				}
			}

			if (dm.networkType == NetworkType.HEAT) {
				for (int i = 0; i < dm.getDemandVector().length; i++) {
					result[i] += dm.getDemandVector()[i];
				}
			}

			if (dm.networkType == NetworkType.ELECTRICITY) {
				int length = dm.getDemandVector().length;
				for (int i = 0; i < length; i++) {
					result[length + i] += dm.getDemandVector()[i];
				}
			}

		}

		return result;
	}

	public String toString() {
		Gson gson = new Gson();
		String result = "";
		result = gson.toJson(this);
		return result;
	}
}
