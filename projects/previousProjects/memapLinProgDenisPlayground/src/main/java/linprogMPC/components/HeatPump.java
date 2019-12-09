package linprogMPC.components;

public class HeatPump extends Producer {
	
	public HeatPump(double installedPower, double efficiency, int port) {
		super(installedPower, efficiency, port);
	}
	
	@Override
	public void makeDecision() {
		super.makeDecision();
//		Calendar currentTime = startTime;
		for (int i = 0; i < nStepsMPC; i++) {
			
			producerMessage.cost[i] = 0.00001;
//			currentTime.add(Calendar.SECOND, stepSize);
			for (int j = 0; j < nStepsMPC; j++) {
				producerMessage.couplingMatrix_H[i][j] = 0.0;
				producerMessage.couplingMatrix_el[i][j] = 0.0;
			}
			
			// TODO efficiency for HeatPump is higher that 1. It is the COP.
			producerMessage.couplingMatrix_H[i][i] = -efficiency;
			
			// Electricity for heat pump is added to electricity consumption:
			producerMessage.couplingMatrix_el[i][i] = 1.0;
			producerMessage.lowerBound[i] = 0.0;
			producerMessage.upperBound[i] = installedPower;
		}
		
		super.updateDisplay(producerMessage);
	}
}
