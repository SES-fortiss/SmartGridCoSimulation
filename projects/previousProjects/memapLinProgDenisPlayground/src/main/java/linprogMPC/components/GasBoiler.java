package linprogMPC.components;

import linprogMPC.helper.EnergyPrices;

public class GasBoiler extends Producer {
	
	public GasBoiler(double installedPower, double efficiency, int port) {
		super(installedPower, efficiency, port);
		if(efficiency < 0.0 || efficiency > 1.0) {
			//TODO throw exception
		}
	}
	
	@Override
	public void makeDecision() {
		super.makeDecision();
		
		int cts = this.actor.getCurrentTimeStep();
		for (int i = 0; i < nStepsMPC; i++) {
			producerMessage.cost[i] = 0.00001 + EnergyPrices.getGasPriceInEuro(cts+i);
			for (int j = 0; j < nStepsMPC; j++) {
				producerMessage.couplingMatrix_H[i][j] = 0.0;
				producerMessage.couplingMatrix_el[i][j] = 0.0;
			}
			producerMessage.couplingMatrix_H[i][i] = -efficiency;
			producerMessage.lowerBound[i] = 0.0;
			producerMessage.upperBound[i] = installedPower;
		}
		
		display.update(gson.toJson(producerMessage));
	}

}
