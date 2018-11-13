package linprogMPC.components;

import linprogMPC.messages.OptimizationResult;

public class ThermalStorage extends Storage {
	
	public final double efficiency;
	
	public ThermalStorage(String name, double qdot_max_in, double qdot_max_out, double capacity, double efficiency, int port) {
		super(name, qdot_max_in, qdot_max_out, capacity, port);
		if(efficiency < 0.0 || efficiency > 1.0) {
			//TODO throw exception
		}
		this.efficiency = efficiency;
	}
	
	@Override
	public void makeDecision() {
		super.makeDecision();
		for (int i = 0; i < n; i++) {
			specificationToSend.cost[i] = 0.00001;
			for (int j = 0; j < 2*n; j++) {
				specificationToSend.couplingMatrix_H[i][j] = 0.0;
				specificationToSend.couplingMatrix_el[i][j] = 0.0;
			}
			specificationToSend.couplingMatrix_H[i][i] = 1.0/efficiency;
			specificationToSend.couplingMatrix_H[i][n+i] = -efficiency;

			if (linprogStorageInput != null && linprogStorageOutput != null) {
//				System.out.println("TS : " + linprogStorageInput[0] + ", " + linprogStorageOutput[0]);
				specificationToSend.vector[i] = 0.0000001 + stateOfCharge[0];
			} else {
				specificationToSend.vector[i] = 0.0000001;
			}
		}
//		System.out.println("SOC (TS) : " + String.format("%.04f", specificationToSend.vector[0])); 
		for (int i = n; i < 2*n; i++) {
			specificationToSend.cost[i] = 0.00001; 
			specificationToSend.vector[i] = capacity;
		}
		
//		display.update(gson.toJson(specificationToSend));
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
