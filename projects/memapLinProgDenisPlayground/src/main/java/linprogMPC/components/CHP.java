package linprogMPC.components;

import akka.systemActors.GlobalTime;
import linprogMPC.helper.EnergyPrices;

public class CHP extends Producer {

	public final double efficiency_el;
	public final double efficiency_H;
	
	public CHP(double installedPower, double efficiency_el, double efficiency_H, int port) {
		super(installedPower, efficiency_H, port);
		if(efficiency_el < 0.0 || efficiency_el > 1.0) {
			//TODO throw exception
		}
		this.efficiency_el = efficiency_el;
		this.efficiency_H = efficiency_H;
	}
	
	@Override
	public void makeDecision() {
		super.makeDecision();
		
		int cts = GlobalTime.getCurrentTimeStep();
		for (int i = 0; i < nStepsMPC; i++) {
			producerMessage.cost[i] = 0.00001 + EnergyPrices.getGasPriceInEuro(cts+i); 
	
			for (int j = 0; j < nStepsMPC; j++) {
				producerMessage.couplingMatrix_H[i][j] = 0.0;
				producerMessage.couplingMatrix_el[i][j] = 0.0;
			}
			
			producerMessage.couplingMatrix_H[i][i] = -efficiency_H;
			producerMessage.couplingMatrix_el[i][i] = -efficiency_el;
			producerMessage.lowerBound[i] = 0.0;
			producerMessage.upperBound[i] = installedPower;
		}
				
		super.updateDisplay(producerMessage);
	}

}
