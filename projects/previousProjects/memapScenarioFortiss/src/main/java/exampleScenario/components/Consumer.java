package exampleScenario.components;

import akka.basicMessages.AnswerContent;
import akka.systemActors.GlobalTime;
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
		double heat_consumption;
		double electricity_consumption;
		double dhw_consumption;
		heat_consumption = consumptionProfiles.getHeizWaerme(GlobalTime.currentTime);
		electricity_consumption = consumptionProfiles.getStrom(GlobalTime.currentTime);
		dhw_consumption = consumptionProfiles.getWarmwasser(GlobalTime.currentTime);
		specificationToSend.setValues(heat_consumption, electricity_consumption, dhw_consumption);
	}

	@Override
	public AnswerContent returnAnswerContentToSend() {
		return specificationToSend;
	}	

}
