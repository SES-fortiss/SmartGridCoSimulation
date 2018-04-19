package exampleScenario.components;

import exampleScenario.messages.BuildingRequest;

public class OilBoiler extends Producer {
	
	public final double efficiency;
	
	public OilBoiler(String name, double qdot_max, double efficiency) {
		super(name, qdot_max);
		if(efficiency < 0.0 || efficiency > 1.0) {
			//TODO throw exception
		}
		this.efficiency = efficiency;
	}
	
	@Override
	public void makeDecision() {
		super.makeDecision();
		
		BuildingRequest request;
		if (requestContentReceived != null) {
			request = (BuildingRequest) requestContentReceived;
			specificationToSend.power_h = request.consumption.getDHWValue() + request.consumption.getHeatValue();
			if (specificationToSend.power_h > this.qdot_max) specificationToSend.power_h = this.qdot_max;
		}
		specificationToSend.cost = 0.10*specificationToSend.power_h*(1/efficiency);
	}

}
