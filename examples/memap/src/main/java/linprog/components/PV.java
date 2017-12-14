package linprog.components;

import java.util.Calendar;

import linprog.helper.EnergyPrices;
import linprog.helper.SolarRadiation;

public class PV extends Producer {
	
	public double area;
	public double efficiency;

	public PV(String name, double qdot_max, double area, double efficiency) {
		super(name, qdot_max);
		this.area = area;
		this.efficiency = efficiency;
	}

	@Override
	public void makeDecision() {
		super.makeDecision();
		
		Calendar currentTime = startTime;
		for (int i = 0; i < n; i++) {
			specificationToSend.cost[i] = -EnergyPrices.getElectricityPriceInCent(currentTime);
			currentTime.add(Calendar.SECOND, stepSize);
			for (int j = 0; j < n; j++) {
				specificationToSend.couplingMatrix[i][j] = 0.0;
			}
			specificationToSend.lowerBound[i] = 0.0;
			specificationToSend.upperBound[i] = SolarRadiation.getRadiation(currentTime)*area*efficiency;
		}
	}
	

}
