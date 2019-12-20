package memap.components;

import memap.components.prototypes.Producer;
import memap.messages.extension.NetworkType;

public class CSVProducer extends Producer {
	public NetworkType networkType;
	double opCost;
	double costCO2;

	/**
	 * @param name           producer name
	 * @param minPower       minimum power [kW]
	 * @param maxPower       maximum power [kW]
	 * @param efficiency     [0-1]
	 * @param networkType
	 * @param opCost         optimization cost [EUR]
	 * @param costCO2        CO2 cost [kg CO2/kWh]
	 * @param port
	 */
	public CSVProducer(String name, double minpower, double maxPower, double efficiency, NetworkType networkType,
			double opCost, double costCO2, int port) {
		super(name, minpower, maxPower, efficiency, port);
		this.networkType = networkType;
		this.opCost = opCost;
		this.costCO2 = costCO2;
	}

	@Override
	public void makeDecision() {
		producerMessage.id = fullActorPath;
		producerMessage.name = actorName;
		producerMessage.minPower = minPower;
		producerMessage.maxPower = maxPower;
		producerMessage.operationalCostEUR = opCost;
		producerMessage.operationalCostCO2 = costCO2;
		producerMessage.efficiency = efficiency;
		producerMessage.networkType = networkType;
	}

}
