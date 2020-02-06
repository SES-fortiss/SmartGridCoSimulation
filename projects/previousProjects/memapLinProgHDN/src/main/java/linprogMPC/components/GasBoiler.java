package linprogMPC.components;

import linprogMPC.components.prototypes.Producer;
import linprogMPC.messages.extension.NetworkType;

public class GasBoiler extends Producer {
	
	double cost;
	double minPower;
	
	public GasBoiler(double maxPower, double minPower, double efficiency, double costs, int port) {
		super(maxPower, efficiency, port);
		this.cost = costs;
		this.minPower = minPower;
	}
	
	@Override
	public void makeDecision() {
		producerMessage.id = this.fullActorPath;
		producerMessage.name = this.actorName;		
		producerMessage.operationalCostEUR = this.cost;
		producerMessage.operationalCostCO2 = 0.202; // kg CO2/kWh
		producerMessage.efficiency = efficiency;
		producerMessage.maxPower = maxPower;
		producerMessage.minPower = minPower;
		producerMessage.networkType = NetworkType.HEAT;
	}

}
