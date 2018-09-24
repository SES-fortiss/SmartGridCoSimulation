package linprogMPC.components;

import akka.basicMessages.AnswerContent;
import akka.systemActors.GlobalTime;
import linprogMPC.helper.ConsumptionProfiles;
import linprogMPC.messages.Consumption;

public class Consumer extends Device {
	
	public Consumption specificationToSend = new Consumption();
	public final int consumerIndex;
	private final ConsumptionProfiles consumptionProfiles;

	public Consumer(String name, ConsumptionProfiles consumptionProfiles, int consumerIndex, int port) {
		super(name, port);
		this.consumerIndex = consumerIndex;
		this.consumptionProfiles = consumptionProfiles;
	}

	@Override
	public void makeDecision() {
		double[] vector = new double[2*n];
//		Calendar currentTime = startTime; 
		int cts = GlobalTime.getCurrentTimeStep();
		for (int i = 0; i < n; i++) {
			vector[i] = -consumptionProfiles.getHeatConsumption(consumerIndex, cts+i);
			vector[n+i] = -consumptionProfiles.getElectricConsumption(consumerIndex, cts+i);
//			currentTime.add(Calendar.SECOND, stepSize);
		}
		specificationToSend.setVector(vector);
		display.update(gson.toJson(specificationToSend));
	}

	@Override
	public AnswerContent returnAnswerContentToSend() {
		return specificationToSend;
	}	

}
