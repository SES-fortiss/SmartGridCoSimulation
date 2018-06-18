package linprog.components;

import java.util.Calendar;

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
			specificationToSend.cost[i] = 0.0;
			for (int j = 0; j < n; j++) {
				specificationToSend.couplingMatrix[i][j] = 0.0;
			}
			specificationToSend.couplingMatrix[i][i] = -efficiency;
			specificationToSend.lowerBound[i] = 0.0;
			specificationToSend.upperBound[i] = solarRadiation.getRadiation(i)*area*efficiency*10;
//			currentTime.add(Calendar.SECOND, stepSize);
		}
		
		display.update(gson.toJson(specificationToSend));
	}
}
