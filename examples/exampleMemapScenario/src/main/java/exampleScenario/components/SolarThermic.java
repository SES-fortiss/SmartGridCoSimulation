package exampleScenario.components;

import exampleScenario.helper.SolarRadiation;

public class SolarThermic extends Producer {

	public final double efficiency;
	public final double area;
	
	public SolarThermic(String name, double area, double efficiency) {
		super(name, 0); //qdot_max not needed here
		if(efficiency < 0.0 || efficiency > 1.0) {
			//TODO throw exception
		}
		this.efficiency = efficiency;
		this.area = area;
	}
	
	@Override
	public void makeDecision() {
		super.makeDecision();
		
		specificationToSend.cost = 0.00;
		specificationToSend.power_h = SolarRadiation.getRadiation(this.actor.getCurrentTime())*area*efficiency;
	}
}
