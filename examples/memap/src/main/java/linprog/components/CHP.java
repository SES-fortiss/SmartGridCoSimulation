package linprog.components;

import java.util.Calendar;

import linprog.helper.EnergyPrices;

public class CHP extends Producer {

	public final double efficiency_el;
	public final double efficiency_H;
	
	public CHP(String name, double qdot_max, double efficiency_el, double efficiency_H, int port) {
		super(name, qdot_max, port);
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
		EnergyPrices energyPrices = new EnergyPrices();
//		Calendar currentTime = startTime;
		for (int i = 0; i < n; i++) {
			specificationToSend.cost[i] = EnergyPrices.getGasPriceInCent(i) - energyPrices.getElectricityPriceInCent(i)*efficiency_el;
//			currentTime.add(Calendar.SECOND, stepSize);
			for (int j = 0; j < n; j++) {
				specificationToSend.couplingMatrix[i][j] = 0.0;
			}
			specificationToSend.couplingMatrix[i][i] = -efficiency_H;
			specificationToSend.lowerBound[i] = 0.0;
			specificationToSend.upperBound[i] = qdot_max;
		}
		
		display.update(gson.toJson(specificationToSend));
	}

}
