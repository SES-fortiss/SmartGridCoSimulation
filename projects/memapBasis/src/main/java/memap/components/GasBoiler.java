package memap.components;

import memap.components.prototypes.Producer;
import memap.messages.extension.NetworkType;

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
		producerMessage.efficiency = efficiency;
		producerMessage.installedPower = installedPower;
		producerMessage.networkType = NetworkType.HEAT;
	}

}
