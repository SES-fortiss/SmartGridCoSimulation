package linprog.components;

import java.util.concurrent.TimeUnit;

import linprog.LinProgSimulation;
//import linprog.helper.EnergyPrices;

public class Battery extends Storage {
	
	
	public final double efficiency;
	
	public Battery(String name, double qdot_max_in, double qdot_max_out, double efficiency, double capacity, int port) {
		super(name, qdot_max_in, qdot_max_out, capacity, port);
		this.efficiency = efficiency;
	}

	
	@Override
	public void makeDecision() {
		super.makeDecision();
//		EnergyPrices energyPrices = new EnergyPrices();
		for (int i = 0; i < n; i++) {
			specificationToSend.cost[i] = 0.00001; 
			for (int j = 0; j < 2*n; j++) {
				specificationToSend.couplingMatrix_H[i][j] = 0.0;
				specificationToSend.couplingMatrix_el[i][j] = 0.0;
			}
			specificationToSend.couplingMatrix_el[i][i] = 1.0/efficiency;
			specificationToSend.couplingMatrix_el[i][n+i] = -efficiency;
			specificationToSend.vector[i] = 0.0000001;
		}
		for (int i = n; i < 2*n; i++) {
			specificationToSend.cost[i] = 0.00001; 
			specificationToSend.vector[i] = capacity;
		}
	
		display.update(gson.toJson(specificationToSend));
	}

}