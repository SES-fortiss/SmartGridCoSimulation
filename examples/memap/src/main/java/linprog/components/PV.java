package linprog.components;

import java.util.concurrent.TimeUnit;

import linprog.LinProgSimulation;
//import linprog.helper.EnergyPrices;
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
		//EnergyPrices energyPrices = new EnergyPrices();
		SolarRadiation solarRadiation = new SolarRadiation();
		
//		Calendar currentTime = startTime;
		for (int i = 0; i < n; i++) {
			specificationToSend.cost[i] = 0.00001;// + LinProgSimulation.CO2_PRICE/1000.0 * 0.0;
			specificationToSend.costCO2[i] = 0.0; // kg CO2/kWh
			specificationToSend.cost_plus[i] = 1.19*(0.0125 + 0.065) + LinProgSimulation.CO2_PRICE/1000.0 * 0.0;
//			currentTime.add(Calendar.SECOND, stepSize);
			for (int j = 0; j < n; j++) {
				specificationToSend.couplingMatrix_H[i][j] = 0.0;
				specificationToSend.couplingMatrix_el[i][j] = 0.0;
			}
			specificationToSend.couplingMatrix_el[i][i] = -efficiency;
			specificationToSend.lowerBound[i] = 0.0;
			specificationToSend.upperBound[i] = area*solarRadiation.getSolarProductionPerKWp(i)*LinProgSimulation.stepLength(TimeUnit.HOURS);
			
		}
		display.update(gson.toJson(specificationToSend));
	}
	

}
