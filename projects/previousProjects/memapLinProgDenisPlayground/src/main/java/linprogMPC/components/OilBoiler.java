package linprogMPC.components;

import akka.systemActors.GlobalTime;
import linprogMPC.helper.EnergyPrices;

public class OilBoiler extends Producer {
	
	public OilBoiler(double installedPower, double efficiency, int port) {
		super(installedPower, efficiency, port);
		System.out.println("EfficiencyGiven = " + efficiency);
		if(efficiency < 0.0 || efficiency > 1.0) {
			//TODO throw exception
		}
	}
	
	@Override
	public void makeDecision() {
		super.makeDecision();				
//		Calendar currentTime = startTime;
		int cts = GlobalTime.getCurrentTimeStep();
		for (int i = 0; i < nStepsMPC; i++) {
			producerMessage.cost[i] = 0.00001 + EnergyPrices.getGasPriceInEuro(cts+i);
//			currentTime.add(Calendar.SECOND, stepSize);
			for (int j = 0; j < nStepsMPC; j++) {
				producerMessage.couplingMatrix_H[i][j] = 0.0;
				producerMessage.couplingMatrix_el[i][j] = 0.0;
			}
			producerMessage.couplingMatrix_H[i][i] = -efficiency;
			producerMessage.lowerBound[i] = 0.0;
			producerMessage.upperBound[i] = installedPower;
		}
		super.updateDisplay(producerMessage);
		//display.update(gson.toJson(producerMessage));
	}

}
