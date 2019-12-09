package linprogMPC.components;

import linprogMPC.messages.OptimizationResult;

public class Battery extends Storage {	
	
	public final double efficiencyCharge;
	public final double efficiencyDischarge;
	// stateOfCharge is available in the super class.
	
	public Battery(
			double qdot_max_in, double qdot_max_out, 
			double efficiencyCharge, double efficiencyDischarge, 
			double capacity, int port
			) {
		
		super(qdot_max_in, qdot_max_out, capacity, port);
		
		this.efficiencyCharge = efficiencyCharge;
		this.efficiencyDischarge = efficiencyDischarge;
		
	}

	
	public void makeDecision() {
		super.makeDecision(); // TODO hier wird schon einiges gemacht.
		
//		EnergyPrices energyPrices = new EnergyPrices();
		for (int i = 0; i < nStepsMPC; i++) {
			storageMessage.cost[i] = 0.00001; 
			for (int j = 0; j < 2*nStepsMPC; j++) {
				storageMessage.couplingMatrix_H[i][j] = 0.0;
				storageMessage.couplingMatrix_el[i][j] = 0.0;
			}
			storageMessage.couplingMatrix_el[i][i] = 1.0/efficiencyCharge;
			storageMessage.couplingMatrix_el[i][nStepsMPC+i] = -efficiencyCharge;
			
			if (linprogStorageInput != null && linprogStorageOutput != null) {
//				System.out.println("BAT : " + linprogStorageInput[0] + ", " + linprogStorageOutput[0]);
				storageMessage.h_vector[i] = 0.0000001 + stateOfCharge[0];
			} else {
				storageMessage.h_vector[i] = 0.0000001;
			}
		}
		
		System.out.println("SOC (BAT) : " + String.format("%.04f", storageMessage.h_vector[0])); 
		for (int i = nStepsMPC; i < 2*nStepsMPC; i++) {
			storageMessage.cost[i] = 0.00001;
			storageMessage.h_vector[i] = capacity/360;
		}
		System.out.println("StorageMessage: " + gson.toJson(storageMessage));
		display.update(gson.toJson(storageMessage));
	}

	public void handleRequest() {		
		super.handleRequest();
		if(requestContentReceived instanceof OptimizationResult) {			
			OptimizationResult linprogResult = ((OptimizationResult) requestContentReceived);
			
			for (String key : linprogResult.resultMap.keySet()) {		
				if ((linprogResult.resultMap.get(key) != null) && (key.contains(this.actorName + " Input"))) {			
					linprogStorageInput = linprogResult.resultMap.get(key); 
				} else if ((linprogResult.resultMap.get(key) != null) && (key.contains(this.actorName + " Output"))) {
					linprogStorageOutput = linprogResult.resultMap.get(key);
				} else if ((linprogResult.resultMap.get(key) != null) && (key.contains(this.actorName + " SOC"))) {
					stateOfCharge = linprogResult.resultMap.get(key);
				} 
			}
		display.update(gson.toJson(requestContentReceived));
		}
	}
	
}