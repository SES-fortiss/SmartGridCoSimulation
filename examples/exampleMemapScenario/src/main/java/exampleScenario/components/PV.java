package exampleScenario.components;

import exampleScenario.helper.EnergyPrices;
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
		EnergyPrices energyPrices = new EnergyPrices();
		
		specificationToSend.cost = -energyPrices.getElectricityPriceInCent(this.actor.getCurrentTime());
		specificationToSend.power_el = SolarRadiation.getRadiation(this.actor.getCurrentTime())*area*efficiency;
	}
	

}
