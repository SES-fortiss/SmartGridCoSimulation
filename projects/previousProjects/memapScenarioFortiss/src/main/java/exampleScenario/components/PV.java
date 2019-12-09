package exampleScenario.components;

import akka.systemActors.GlobalTime;
import exampleScenario.helper.SolarRadiation;

public class PV extends Producer {
	
	public double area;
	public double efficiency;

	public PV(String name, double area, double efficiency) {
		super(name, 0); //qdot_max not used here
		this.area = area;
		this.efficiency = efficiency;
	}

	@Override
	public void makeDecision() {
		super.makeDecision();
		
		specificationToSend.power_el = SolarRadiation.getRadiation(GlobalTime.currentTime)*area*efficiency;
		specificationToSend.cost = 0.0;
	}
	

}
