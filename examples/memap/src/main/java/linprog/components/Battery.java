package linprog.components;

import java.util.concurrent.TimeUnit;

import linprog.Simulation;
import linprog.helper.EnergyPrices;
import linprog.helper.SolarRadiation;

public class Battery extends Storage {
	
	public Battery(String name, double qdot_max_in, double qdot_max_out, double capacity, int port) {
		super(name, qdot_max_in, qdot_max_out, capacity, port);
	}
	
	@Override
	public void makeDecision() {
		super.makeDecision();
		EnergyPrices energyPrices = new EnergyPrices();
		for (int i = 0; i < n; i++) {
			specificationToSend.cost[i] = energyPrices.getElectricityPriceInCent(i); //  + 0.001 * Math.random();
			for (int j = 0; j < 2*n; j++) {
				specificationToSend.couplingMatrix[i][j] = 0.0;
			}
			specificationToSend.vector[i] = 0.0;
		}
		for (int i = n; i < 2*n; i++) {
//			specificationToSend.cost[i] = -energyPrices.getElectricityPriceInCent(i) + 0.001 * Math.random();
			specificationToSend.cost[i] = -energyPrices.getElectricityPricePVInCent(i)/3600*1.1;
			specificationToSend.vector[i] = capacity/Simulation.stepLength(TimeUnit.SECONDS);
		}
	
		display.update(gson.toJson(specificationToSend));
	}

}