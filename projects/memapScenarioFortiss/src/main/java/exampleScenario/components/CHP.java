package exampleScenario.components;

import exampleScenario.messages.BuildingRequest;

public class CHP extends Producer {

	public final double efficiency_el;
	public final double efficiency_H;
	
	public CHP(String name, double qdot_max, double efficiency_el, double efficiency_H) {
		super(name, qdot_max);
		if(efficiency_el < 0.0 || efficiency_el > 1.0) {
			//TODO throw exception
		}
		if(efficiency_H < 0.0 || efficiency_H > 1.0) {
			//TODO throw exception
		}
		this.efficiency_el = efficiency_el;
		this.efficiency_H = efficiency_H;
	}
	
	@Override
	public void makeDecision() {
		super.makeDecision();
		
		// wärme orientiert
		BuildingRequest request;
		//double q_dot_gas;
		double q_dot_other = 0.0;
		
		if (requestContentReceived != null) {
			request = (BuildingRequest) requestContentReceived;
			q_dot_other = request.getHeatProduction() - request.producers.get("BHKW").power_h;
			specificationToSend.power_h = request.consumption.getHeatValue() + request.consumption.getDHWValue() - q_dot_other;
			if(specificationToSend.power_h < 0) specificationToSend.power_h = 0.0;
			//q_dot_gas = specificationToSend.power_h*(1/this.efficiency_H);
			//q_dot = q_dot_gas*this.efficiency_el;
			if (specificationToSend.power_h > this.qdot_max) specificationToSend.power_h = this.qdot_max;
			specificationToSend.power_el = specificationToSend.power_h*(this.efficiency_el/this.efficiency_H);
		}
		
		specificationToSend.cost = 0.06*specificationToSend.power_el*(1/this.efficiency_el);
	}

}
