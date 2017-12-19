package linprog.components;

import java.util.Calendar;

import linprog.helper.ConsumptionProfiles;
import linprog.messages.Consumption;

public class Consumer extends Device {
	
	public Consumption specificationToSend = new Consumption();

	public Consumer(String name) {
		super(name);
	}

	@Override
	public void makeDecision() {
		specificationToSend.vector = new double[2*n];
		Calendar currentTime = startTime;
		for (int i = 0; i < n; i++) {
			specificationToSend.vector[i] = ConsumptionProfiles.getConsumption(currentTime);
			currentTime.add(Calendar.SECOND, stepSize);
		}
	}

}
