package exampleScenario.components;

import java.time.LocalDateTime;

import akka.basicMessages.AnswerContent;
import exampleScenario.helper.ReadMemapFiles;
import exampleScenario.messages.Consumption;

public class Consumer extends Device {
	
	public Consumption specificationToSend = new Consumption();
	public ReadMemapFiles consumptionProfiles;

	public Consumer(String name, String filename) {
		super(name);
		this.consumptionProfiles = new ReadMemapFiles(filename);
	}

	@Override
	public void makeDecision() {
		
		LocalDateTime currentTime = this.actor.getCurrentTime();
		
		double heat_consumption;
		double electricity_consumption;
		double dhw_consumption;
		heat_consumption = consumptionProfiles.getHeizWaerme(currentTime);
		electricity_consumption = consumptionProfiles.getStrom(currentTime);
		dhw_consumption = consumptionProfiles.getWarmwasser(currentTime);
		specificationToSend.setValues(heat_consumption, electricity_consumption, dhw_consumption);
	}

	@Override
	public AnswerContent returnAnswerContentToSend() {
		return specificationToSend;
	}	

}
