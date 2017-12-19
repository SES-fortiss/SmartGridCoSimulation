package linprog.components;

import java.util.Calendar;

import linprog.helper.EnergyPrices;

public class CHP extends Producer {

	public final double efficiency_el;
	public final double efficiency_H;
	
	public CHP(String name, double qdot_max, double efficiency_el, double efficiency_H) {
		super(name, qdot_max);
		if(efficiency_el < 0 || efficiency_el > 1) {
			//TODO throw exception
		}
		if(efficiency_H < 0 || efficiency_H > 1) {
			//TODO throw exception
		}
		this.efficiency_el = efficiency_el;
		this.efficiency_H = efficiency_H;
	}
	
	@Override
	public void makeDecision() {
		super.makeDecision();
		Calendar currentTime = startTime;
		for (int i = 0; i < n; i++) {
			specificationToSend.cost[i] = EnergyPrices.getGasPriceInCent(currentTime) - EnergyPrices.getElectricityPriceInCent(currentTime)*efficiency_el;
			currentTime.add(Calendar.SECOND, stepSize);
			for (int j = 0; j < n; j++) {
				specificationToSend.couplingMatrix[i][j] = 0.0;
			}
			specificationToSend.couplingMatrix[i][i] = -efficiency_H;
			specificationToSend.lowerBound[i] = 0.0;
			specificationToSend.upperBound[i] = qdot_max;
		}
	}

}
