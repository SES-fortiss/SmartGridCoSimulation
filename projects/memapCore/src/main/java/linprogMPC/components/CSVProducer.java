package linprogMPC.components;

import linprogMPC.components.prototypes.Producer;
import linprogMPC.messages.extension.NetworkType;

public class CSVProducer extends Producer {
	public NetworkType networkType;
	double opCost;
	double costCO2;

	/**
	 * @param name           producer name
	 * @param installedPower power [kW]
	 * @param efficiency     [0-1]
	 * @param networkType
	 * @param opCost         optimization cost [EUR]
	 * @param costCO2        CO2 cost [kg CO2/kWh]
	 * @param port
	 */
	public CSVProducer(String name, double installedPower, double efficiency, NetworkType networkType, double opCost,
			double costCO2, int port) {
		super(name, installedPower, efficiency, port);
		this.networkType = networkType;
		this.opCost = opCost;
		this.costCO2 = costCO2;
	}

	@Override
	public void makeDecision() {
		producerMessage.id = fullActorPath;
		producerMessage.name = actorName;
		producerMessage.installedPower = installedPower;
		producerMessage.operationalCostEUR = opCost;
		producerMessage.operationalCostCO2 = costCO2;
		producerMessage.efficiency = efficiency;
		producerMessage.networkType = networkType;
	}

}