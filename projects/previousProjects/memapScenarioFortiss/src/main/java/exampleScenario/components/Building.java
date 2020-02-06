package exampleScenario.components;

import java.util.LinkedList;

import com.google.gson.Gson;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.BasicAnswer;
import akka.basicMessages.RequestContent;
import akka.systemActors.GlobalTime;
import behavior.BehaviorModel;
import exampleScenario.external.M2MDisplay;
import exampleScenario.external.ManageDB;
import exampleScenario.messages.BuildingRequest;
import exampleScenario.messages.BuildingSpec;
import exampleScenario.messages.BuildingSpecDB;
import exampleScenario.messages.Consumption;
import exampleScenario.messages.ProducerSpec;
import exampleScenario.messages.StorageSpec;

public class Building extends BehaviorModel {
	
	//duplicated from Device.java
	protected final String name;
	
	protected M2MDisplay display;
	protected Gson gson = new Gson();
	public int port;
	
	protected ManageDB database;
	
	public BuildingSpec specificationToSend;
	public BuildingSpecDB specificationDB;
	public BuildingRequest request;
	
	public Building(String name, int port) {
		
		//duplicated from Device.java
		if(name == null) {
			//TODO throw exception
		}
		this.name = name;
		this.port = port;
		display = new M2MDisplay(port); // add port in to display a json
		display.run();
		
		// initialize database
		database = new ManageDB();
	}


	@Override
	public void makeDecision() {
		specificationToSend = new BuildingSpec();
		specificationToSend.name = this.name;
		for(BasicAnswer basicAnswer : answerListReceived) {			
			AnswerContent answerContent = basicAnswer.answerContent;
			if(answerContent instanceof Consumption) {
				specificationToSend.consumption.addConsumption(((Consumption) answerContent)); 
			}
			if(answerContent instanceof ProducerSpec) {
				specificationToSend.producers.put(((ProducerSpec) answerContent).name, (ProducerSpec)answerContent);
			}
			if(answerContent instanceof StorageSpec) {
				specificationToSend.storages.put(((StorageSpec) answerContent).name, (StorageSpec)answerContent);
			}
		}
		
		request = new BuildingRequest();
		request.consumption = specificationToSend.consumption;
		request.producers = specificationToSend.producers;
		request.storages = specificationToSend.storages;
		
		specificationDB = new BuildingSpecDB();
		specificationDB.setBuildingSpec(gson.toJson(specificationToSend).toString());
		specificationDB.setName(specificationToSend.name);
		specificationDB.setCurrentTime(GlobalTime.currentTime);
		
		display.update(gson.toJson(specificationToSend));
		
		//database.addBuildingSpec(specificationDB);
		
	}

	@Override
	public AnswerContent returnAnswerContentToSend() {
		return specificationToSend;
	}


	@Override
	public void handleError(LinkedList<ErrorAnswerContent> errors) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void handleRequest() {
		// TODO Auto-generated method stub
	}


	@Override
	public RequestContent returnRequestContentToSend() {
		// TODO Auto-generated method stub
		return request;
	}
	
	@Override
	public void endSimulation() {
		display.stop();
	}

}
