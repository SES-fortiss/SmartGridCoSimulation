package linprogMPC.components;

import java.util.concurrent.TimeUnit;

import linprogMPC.Simulation;
//import linprog.helper.EnergyPrices;
import linprogMPC.messages.OptimizationResult;

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
			
			if (linprogStorageInput != null && linprogStorageOutput != null) {
//				System.out.println("BAT : " + linprogStorageInput[0] + ", " + linprogStorageOutput[0]);
				specificationToSend.vector[i] = 0.0000001 + stateOfCharge[0];
			} else {
				specificationToSend.vector[i] = 0.0000001;
			}
		}
//		System.out.println("SOC (BAT) : " + String.format("%.02f", specificationToSend.vector[0])); 
		System.out.println("SOC (BAT) : " + String.format("%.04f", specificationToSend.vector[0])); 
		for (int i = n; i < 2*n; i++) {
			specificationToSend.cost[i] = 0.00001; 
			specificationToSend.vector[i] = capacity/Simulation.stepLength(TimeUnit.SECONDS);
		}
		
		display.update(gson.toJson(specificationToSend));
	}

//	@Override
	public void handleRequest() {
		super.handleRequest();
		if(requestContentReceived instanceof OptimizationResult) {
			
			OptimizationResult linprogResult = ((OptimizationResult) requestContentReceived);
			
			for (String key : linprogResult.resultMap.keySet()) {		
				if ((linprogResult.resultMap.get(key) != null) && (key.contains(this.name + " Input"))) {			
					linprogStorageInput = linprogResult.resultMap.get(key); 
				} else if ((linprogResult.resultMap.get(key) != null) && (key.contains(this.name + " Output"))) {
					linprogStorageOutput = linprogResult.resultMap.get(key);
				} else if ((linprogResult.resultMap.get(key) != null) && (key.contains(this.name + " SOC"))) {
					stateOfCharge = linprogResult.resultMap.get(key);
				} 
			}
		display.update(gson.toJson(requestContentReceived));
		}
	}
	
}