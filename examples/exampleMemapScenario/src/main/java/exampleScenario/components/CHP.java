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
		
		// strom orientiert
		BuildingRequest request;
		double q_dot_gas;
		double q_dot;
		
		if (requestContentReceived != null) {
			request = (BuildingRequest) requestContentReceived;
			specificationToSend.power_el = request.consumption.getElectricalValue();
			q_dot_gas = specificationToSend.power_el*(1/this.efficiency_el);
			q_dot = q_dot_gas*this.efficiency_H;
			if (q_dot > this.qdot_max) specificationToSend.power_el = this.qdot_max*(1/this.efficiency_H)*this.efficiency_el;
			specificationToSend.power_h = specificationToSend.power_el*(this.efficiency_H/this.efficiency_el);
		}
		
		specificationToSend.cost = 0.06*specificationToSend.power_el*(1/this.efficiency_el);
	}

}
