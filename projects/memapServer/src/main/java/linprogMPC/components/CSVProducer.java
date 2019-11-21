package linprogMPC.components;

import linprogMPC.components.prototypes.Producer;
import linprogMPC.messages.extension.NetworkType;

public class CSVProducer extends Producer {
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
		this.opCost = opCost;
		this.costCO2 = costCO2;
	}

	@Override
	public void makeDecision() {
		producerMessage.id = this.fullActorPath;
		producerMessage.name = this.actorName;
		producerMessage.operationalCostEUR = opCost;
		producerMessage.operationalCostCO2 = costCO2;
		producerMessage.efficiency = efficiency;
		producerMessage.installedPower = installedPower;
		producerMessage.networkType = NetworkType.HEAT;
	}

}
