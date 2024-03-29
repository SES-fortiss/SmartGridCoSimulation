package linprogMPC.components;

import java.util.concurrent.TimeUnit;

import linprog.LinProgSimulation;
import linprogMPC.helper.SolarRadiation;

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
		int cts = super.timeStep;
		for (int i = 0; i < n; i++) {
			specificationToSend.cost[i] = 0.00001;
			for (int j = 0; j < n; j++) {
				specificationToSend.couplingMatrix_H[i][j] = 0.0;
				specificationToSend.couplingMatrix_el[i][j] = 0.0;
			}
			specificationToSend.couplingMatrix_H[i][i] = -efficiency;
			specificationToSend.lowerBound[i] = 0.0;
			specificationToSend.upperBound[i] = area*solarRadiation.getSolarProductionPerKWp(cts+i)*LinProgSimulation.stepLength(TimeUnit.HOURS); // area x incidend power (converted from PV production) 
//			currentTime.add(Calendar.SECOND, stepSize);
		}
		
		display.update(gson.toJson(specificationToSend));
	}
}
