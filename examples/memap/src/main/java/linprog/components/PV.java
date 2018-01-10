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
		
//		Calendar currentTime = startTime;
		for (int i = 0; i < n; i++) {
			specificationToSend.cost[i] = -energyPrices.getElectricityPriceInCent(i)+0.001*Math.random();
//			currentTime.add(Calendar.SECOND, stepSize);
			for (int j = 0; j < n; j++) {
				specificationToSend.couplingMatrix[i][j] = 0.0;
			}
			specificationToSend.lowerBound[i] = 0.0;
			specificationToSend.upperBound[i] = SolarRadiation.getRadiation(i)*area*efficiency;
		}
		
		display.update(gson.toJson(specificationToSend));
	}
	

}
