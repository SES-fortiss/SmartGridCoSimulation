package linprog.components;

import java.util.Calendar;

import linprog.helper.EnergyPrices;

public class BHKW extends DeviceIn {

	public static final double QDOT_MAX = 550;
	public final double efficiency;
	
	public BHKW(String name, double qt_max, double efficiency) {
		super(name, qt_max);
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
			specificationToSend.cost[i] = EnergyPrices.getGasPriceInCent(currentTime) - EnergyPrices.getElectricityPriceInCent(currentTime)*efficiency;
			currentTime.add(Calendar.SECOND, stepSize);
			for (int j = 0; j < n; j++) {
				specificationToSend.couplingMatrix[i][j] = 0.0;
			}
			specificationToSend.couplingMatrix[i][i] = -efficiency;
			specificationToSend.lowerBound[i] = 0.0;
			specificationToSend.upperBound[i] = 0.0;
		}
	}

}
