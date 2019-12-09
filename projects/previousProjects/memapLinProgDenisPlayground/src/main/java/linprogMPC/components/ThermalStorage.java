package linprogMPC.components;

import java.util.concurrent.TimeUnit;

import linprogMPC.MPCDenisSimulation;
import linprogMPC.messages.OptimizationResult;

public class ThermalStorage extends Storage {
	
	public final double efficiency;
	
	public ThermalStorage(double qdot_max_in, double qdot_max_out, double capacity, double efficiency, int port) {
		super(qdot_max_in, qdot_max_out, capacity, port);
		if(efficiency < 0.0 || efficiency > 1.0) {
			//TODO throw exception
		}
		this.efficiency = efficiency;
	}
	
	@Override
	public void makeDecision() {
		super.makeDecision();
		for (int i = 0; i < nStepsMPC; i++) {
			storageMessage.cost[i] = 0.00001;
			for (int j = 0; j < 2*nStepsMPC; j++) {
				storageMessage.couplingMatrix_H[i][j] = 0.0;
				storageMessage.couplingMatrix_el[i][j] = 0.0;
			}
			storageMessage.couplingMatrix_H[i][i] = 1.0/efficiency;
			storageMessage.couplingMatrix_H[i][nStepsMPC+i] = -efficiency;

			if (linprogStorageInput != null && linprogStorageOutput != null) {
//				System.out.println("TS : " + linprogStorageInput[0] + ", " + linprogStorageOutput[0]);
				storageMessage.h_vector[i] = 0.0000001 + stateOfCharge[0];
			} else {
				storageMessage.h_vector[i] = 0.0000001;
			}
		}
		System.out.println("SOC (TS) : " + String.format("%.04f", storageMessage.h_vector[0])); 
		for (int i = nStepsMPC; i < 2*nStepsMPC; i++) {
			storageMessage.cost[i] = 0.00001; 
			storageMessage.h_vector[i] = capacity/MPCDenisSimulation.stepLength(TimeUnit.SECONDS);
		}
		
//		display.update(gson.toJson(specificationToSend));
	}

	
//	@Override
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
