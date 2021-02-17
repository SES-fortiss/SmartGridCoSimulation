package linprogMPC.components;

import linprogMPC.helper.SolarRadiation;

public class SolarThermic extends Producer {

	static double efficiency = 1.0;
	
	public SolarThermic(double installedPower, int port) {
		super(installedPower, efficiency, port); //qdot_max not needed here
		if(efficiency < 0.0 || efficiency > 1.0) {
			//TODO throw exception
		}
	}
	
	@Override
	public void makeDecision() {
		super.makeDecision();
		SolarRadiation solarRadiation = new SolarRadiation();
		
		int cts = this.actor.getCurrentTimeStep();
		for (int i = 0; i < nStepsMPC; i++) {
			producerMessage.cost[i] = 0.00001;
			for (int j = 0; j < nStepsMPC; j++) {
				producerMessage.couplingMatrix_H[i][j] = 0.0;
				producerMessage.couplingMatrix_el[i][j] = 0.0;
			}
			producerMessage.couplingMatrix_H[i][i] = -efficiency;
			producerMessage.lowerBound[i] = 0.0;
			producerMessage.upperBound[i] = solarRadiation.getSolarProductionPerKWp(cts+i)*installedPower;
		}
		
		super.updateDisplay(producerMessage);
	}
}
