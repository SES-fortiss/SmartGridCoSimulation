package linprogMPC.components;

import java.util.concurrent.TimeUnit;

import linprog.LinProgSimulation;
//import linprog.helper.EnergyPrices;
import linprogMPC.helper.SolarRadiation;

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
		int cts = super.timeStep;
		for (int i = 0; i < n; i++) {
			specificationToSend.cost[i] = 0.00001;
//			currentTime.add(Calendar.SECOND, stepSize);
			for (int j = 0; j < n; j++) {
				specificationToSend.couplingMatrix_H[i][j] = 0.0;
				specificationToSend.couplingMatrix_el[i][j] = 0.0;
			}
			specificationToSend.couplingMatrix_el[i][i] = -efficiency;
			specificationToSend.lowerBound[i] = 0.0;
			specificationToSend.upperBound[i] = area*solarRadiation.getSolarProductionPerKWp(cts+i)*LinProgSimulation.stepLength(TimeUnit.HOURS); // area x incidend power (converted from PV production)
			
		}
		display.update(gson.toJson(specificationToSend));
	}
	

}
