package exampleScenario.components;

import java.time.LocalDateTime;

import exampleScenario.helper.EnergyPrices;
import exampleScenario.messages.BuildingRequest;

public class HeatPump extends Producer {

	public final double efficiency;
	
	public HeatPump(String name, double qdot_max, double efficiency) {
		super(name, qdot_max);
		if(efficiency < 0.0 || efficiency > 1.0) {
			//TODO throw exception
		}
		this.efficiency = efficiency;
	}
	
	@Override
	public void makeDecision() {
		super.makeDecision();
		
		LocalDateTime currentTime = this.actor.getCurrentTime();
		
		EnergyPrices energyPrices = new EnergyPrices();		
		BuildingRequest request;
		
		if (requestContentReceived != null) {
			request = (BuildingRequest) requestContentReceived;
			specificationToSend.power_h = request.consumption.getDHWValue() + request.consumption.getHeatValue();
			if (specificationToSend.power_h > this.qdot_max) specificationToSend.power_h = this.qdot_max;
		}
		specificationToSend.cost = energyPrices.getElectricityPriceInCent(currentTime)*specificationToSend.power_h*(1/efficiency);
	}
}
