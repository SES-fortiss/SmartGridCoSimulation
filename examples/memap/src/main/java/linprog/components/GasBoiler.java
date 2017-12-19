package linprog.components;

import java.util.Calendar;

import linprog.helper.EnergyPrices;

public class GasBoiler extends Producer {
	
	public final double efficiency;
	
	public GasBoiler(String name, double qdot_max, double efficiency) {
		super(name, qdot_max);
		if(efficiency < 0 || efficiency > 1) {
			//TODO throw exception
		}
		this.efficiency = efficiency;
	}
	
	@Override
	public void makeDecision() {
		super.makeDecision();
		Calendar currentTime = startTime;
		for (int i = 0; i < n; i++) {
			specificationToSend.cost[i] = EnergyPrices.getGasPriceInCent(currentTime);
			currentTime.add(Calendar.SECOND, stepSize);
			for (int j = 0; j < n; j++) {
				specificationToSend.couplingMatrix[i][j] = 0.0;
			}
			specificationToSend.couplingMatrix[i][i] = -efficiency;
			specificationToSend.lowerBound[i] = 0.0;
			specificationToSend.upperBound[i] = qdot_max;
		}
	}

}
