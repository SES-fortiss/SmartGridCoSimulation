package linprog.components;

import java.util.concurrent.TimeUnit;

import linprog.LinProgSimulation;
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
//		Calendar currentTime = startTime;
		for (int i = 0; i < n; i++) {
			specificationToSend.cost[i] = 0.00001 + EnergyPrices.getGasPriceInEuro(i) + LinProgSimulation.CO2_PRICE/1000.0 * 0.202; 
			specificationToSend.costCO2[i] = 0.202; // kg CO2/kWh 
			specificationToSend.cost_plus[i] =1.19*(0.044 + 0.0263) + EnergyPrices.getGasPriceInEuro(i) + LinProgSimulation.CO2_PRICE/1000.0 * 0.202; 
//			currentTime.add(Calendar.SECOND, stepSize);
			for (int j = 0; j < n; j++) {
				specificationToSend.couplingMatrix_H[i][j] = 0.0;
				specificationToSend.couplingMatrix_el[i][j] = 0.0;
			}
			specificationToSend.couplingMatrix_H[i][i] = -efficiency_H;
			specificationToSend.couplingMatrix_el[i][i] = -efficiency_el;
			specificationToSend.lowerBound[i] = 0.0;
			specificationToSend.upperBound[i] = (qdot_max/efficiency_H)*LinProgSimulation.stepLength(TimeUnit.HOURS);
		}
		
		display.update(gson.toJson(specificationToSend));
	}

}
