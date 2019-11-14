package linprogMPC.components;

import linprogMPC.components.prototypes.Producer;
import linprogMPC.messages.extension.NetworkType;

public class CSVProducer extends Producer {
	double cost;

	public CSVProducer(String name, double installedPower, double efficiency, double costs, int port) {
		super(name, installedPower, efficiency, port);
		this.cost = costs;
	}

	@Override
	public void makeDecision() {
		producerMessage.id = this.fullActorPath;
		producerMessage.name = this.actorName;
		producerMessage.operationalPriceEURO = this.cost;
		producerMessage.efficiency = efficiency;
		producerMessage.installedPower = installedPower;
		producerMessage.networkType = NetworkType.HEAT;
	}

}
