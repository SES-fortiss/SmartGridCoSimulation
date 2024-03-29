package linprog.components;

import java.util.concurrent.TimeUnit;

import linprog.LinProgSimulation;
import linprog.helper.SolarRadiation;

public class SolarThermic extends Producer {

	public final double efficiency;
	public final double area;
	
	public SolarThermic(String name, double area, double efficiency, int port) {
		super(name, 0, port); //qdot_max not needed here
		if(efficiency < 0.0 || efficiency > 1.0) {
			//TODO throw exception
		}
		this.efficiency = efficiency;
		this.area = area;
	}
	
	@Override
	public void makeDecision() {
		super.makeDecision();
		SolarRadiation solarRadiation = new SolarRadiation();
		
//		Calendar currentTime = startTime;
		for (int i = 0; i < n; i++) {
			specificationToSend.cost[i] = 0.00001;// + LinProgSimulation.CO2_PRICE/1000.0 * 0.0;
			specificationToSend.costCO2[i] = 0.0; // kg CO2/kWh
			specificationToSend.cost_plus[i] =  1.19*(0.0635 + 0.0962) + LinProgSimulation.CO2_PRICE/1000.0 * 0.0;
			for (int j = 0; j < n; j++) {
				specificationToSend.couplingMatrix_H[i][j] = 0.0;
				specificationToSend.couplingMatrix_el[i][j] = 0.0;
			}
			specificationToSend.couplingMatrix_H[i][i] = -efficiency;
			specificationToSend.lowerBound[i] = 0.0;
			specificationToSend.upperBound[i] = area*solarRadiation.getSolarProductionPerKWp(i)*LinProgSimulation.stepLength(TimeUnit.HOURS);
//			currentTime.add(Calendar.SECOND, stepSize);
		}
		
		display.update(gson.toJson(specificationToSend));
	}
}
