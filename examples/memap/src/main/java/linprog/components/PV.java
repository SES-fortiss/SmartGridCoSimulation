package linprog.components;

import java.util.Calendar;

import linprog.helper.EnergyPrices;
import linprog.helper.SolarRadiation;

public class PV extends Producer {
	
	public double area;
	public double efficiency;

	public PV(String name, double area, double efficiency, int port) {
		super(name, 0, port); //qdot_max not used here
		this.area = area;
		this.efficiency = efficiency;
	}

	@Override
	public void makeDecision() {
		super.makeDecision();
		EnergyPrices energyPrices = new EnergyPrices();
		SolarRadiation solarRadiation = new SolarRadiation();
		
//		Calendar currentTime = startTime;
		for (int i = 0; i < n; i++) {
			specificationToSend.cost[i] = -energyPrices.getElectricityPriceInCent(i)*1.1; //+0.001*Math.random();
//			currentTime.add(Calendar.SECOND, stepSize);
			for (int j = 0; j < n; j++) {
				specificationToSend.couplingMatrix[i][j] = 0.0;
			}
			specificationToSend.lowerBound[i] = 0.0;
			specificationToSend.upperBound[i] = solarRadiation.getRadiation(i)*area*efficiency;
			
		}
//		System.out.println(solarRadiation.getRadiation(0));
//		System.out.println("PV: " + specificationToSend.cost[0]);
		display.update(gson.toJson(specificationToSend));
	}
	

}
