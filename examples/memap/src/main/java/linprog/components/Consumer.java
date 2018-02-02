package linprog.components;

import java.util.Calendar;

import akka.basicMessages.AnswerContent;
import linprog.helper.ConsumptionProfiles;
import linprog.messages.Consumption;

public class Consumer extends Device {
	
	public Consumption specificationToSend = new Consumption();

	public Consumer(String name, int port) {
		super(name, port);
	}

	@Override
	public void makeDecision() {
		double[] vector = new double[n];
		ConsumptionProfiles consumptionProfiles = new ConsumptionProfiles();
//		Calendar currentTime = startTime; 
		for (int i = 0; i < n; i++) {
			vector[i] = consumptionProfiles.getHeatConsumption(i);
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
