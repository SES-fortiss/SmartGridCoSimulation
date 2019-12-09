package exampleScenario.components;

import exampleScenario.messages.BuildingRequest;

public class GasBoiler extends Producer {
	
	public final double efficiency;
	
	public GasBoiler(String name, double qdot_max, double efficiency) {
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
			specificationToSend.power_h = request.consumption.getDhw() + request.consumption.getHeat();
		}
		specificationToSend.cost = 6*(1/(60*60))*specificationToSend.power_h*(1/efficiency);	// ct/kWs
	}

}
