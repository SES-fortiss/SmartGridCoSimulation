package linprogMPC.components;

import linprogMPC.components.prototypes.Producer;
import linprogMPC.messages.extension.NetworkType;

public class GasBoiler extends Producer {
	
	double cost;
	
	public GasBoiler(double installedPower, double efficiency, double costs, int port) {
		super(installedPower, efficiency, port);
		this.cost = costs;
	}
	
	@Override
	public void makeDecision() {
		producerMessage.id = this.fullActorPath;
		producerMessage.name = this.actorName;		
		producerMessage.operationalPriceEURO = this.cost;
		producerMessage.operationalPriceCO2 = 0.202; // kg CO2/kWh
		producerMessage.efficiency = efficiency;
		producerMessage.installedPower = installedPower;
		producerMessage.networkType = NetworkType.HEAT;
	}

}
