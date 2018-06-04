package linprog.components;

import java.util.LinkedList;

import com.google.gson.Gson;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.BasicAnswer;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;
import linprog.messages.BuildingSpec;
import linprog.messages.Consumption;
import linprog.messages.ProducerSpec;
import linprog.messages.StorageSpec;
import memap.external.M2MDisplay;

public class Building extends BehaviorModel {
	
	//duplicated from Device.java
	protected final String name;
	
	protected M2MDisplay display;
	protected Gson gson = new Gson();
	public int port;
	
	public BuildingSpec specificationToSend = new BuildingSpec();

	public Building(String name, int port) {
		
		//duplicated from Device.java
		if(name == null) {
			//TODO throw exception
		}
		this.name = name;
		this.port = port;
		display = new M2MDisplay(port); // add port in to display a json
		display.run();
	}


	@Override
	public void makeDecision() {
	//	specificationToSend = new BuildingSpec();
		specificationToSend.name = name;
		for(BasicAnswer basicAnswer : answerListReceived) {			
			AnswerContent answerContent = basicAnswer.answerContent;
			if(answerContent instanceof Consumption) {
				specificationToSend.consumption.addConsumption(((Consumption) answerContent).getVector()); 
			}
			if(answerContent instanceof ProducerSpec) {
				specificationToSend.producers.add((ProducerSpec) answerContent);
			}
			if(answerContent instanceof StorageSpec) {
				specificationToSend.storages.add((StorageSpec) answerContent);
			}
		}
		
		display.update(gson.toJson(specificationToSend));

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
		return null;
	}

}
