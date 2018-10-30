package linprogMPC.components;

import linprogMPC.messages.types.NetworkType;

public class GasBoiler extends Producer {
	
	double cost;
	
	public GasBoiler(double installedPower, double efficiency, double costs, int port) {
		super(installedPower, efficiency, port);
		this.cost = costs;
	}
	
	@Override
	public void makeDecision() {
		producerMessage.name = this.actorName;		
		producerMessage.cost = this.cost;
		producerMessage.efficiency = efficiency;
		producerMessage.installedPower = installedPower;
		producerMessage.networkType = NetworkType.HEAT;
	}

}
