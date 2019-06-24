package linprog.components;

import java.util.concurrent.TimeUnit;

import linprog.LinProgSimulation;
import linprog.helper.EnergyPrices;

public class GasBoiler extends Producer {
	
	public final double efficiency;
	
	public GasBoiler(String name, double qdot_max, double efficiency, int port) {
		super(name, qdot_max, port);
		if(efficiency < 0.0 || efficiency > 1.0) {
			//TODO throw exception
		}
		this.efficiency = efficiency;
	}
	
	@Override
	public void makeDecision() {
		super.makeDecision();
		
//		Calendar currentTime = startTime;
		for (int i = 0; i < n; i++) {
			specificationToSend.cost[i] = 0.00001 + EnergyPrices.getGasPriceInEuro(i) + LinProgSimulation.CO2_PRICE/1000 * 0.202;
			specificationToSend.costCO2[i] = 0.202; // kg CO2/kWh
			specificationToSend.cost_plus[i] = 1.19*(0.0043 + 0.0086) + EnergyPrices.getGasPriceInEuro(i) + LinProgSimulation.CO2_PRICE/1000 * 0.202;
//			currentTime.add(Calendar.SECOND, stepSize);
			for (int j = 0; j < n; j++) {
				specificationToSend.couplingMatrix_H[i][j] = 0.0;
				specificationToSend.couplingMatrix_el[i][j] = 0.0;
			}
			specificationToSend.couplingMatrix_H[i][i] = -efficiency;
			specificationToSend.lowerBound[i] = 0.0;
			specificationToSend.upperBound[i] = (qdot_max/efficiency)*LinProgSimulation.stepLength(TimeUnit.HOURS);
		}
		
		display.update(gson.toJson(specificationToSend));
	}

}
