package linprog.components;

import java.util.LinkedList;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.BasicAnswer;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;
import linprog.messages.BuildingSpec;
import linprog.messages.Consumption;
import linprog.messages.ProducerSpec;
import linprog.messages.StorageSpec;

public class Building extends BehaviorModel {
	
	public BuildingSpec specificationToSend = new BuildingSpec();

	@Override
	public void handleError(LinkedList<ErrorAnswerContent> errors) {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleRequest() {
		// TODO Auto-generated method stub

	}

	@Override
	public void makeDecision() {
		
		for(BasicAnswer basicAnswer : answerListReceived) {			
			AnswerContent answerContent = basicAnswer.answerContent;
			if(answerContent instanceof Consumption) {
				specificationToSend.consumption.addConsumption(((Consumption) answerContent).getVector()); 
			}
			if(answerContent instanceof ProducerSpec) {
				specificationToSend.producers.add((ProducerSpec)answerContent);
			}
			if(answerContent instanceof StorageSpec) {
				specificationToSend.storages.add((StorageSpec)answerContent);
			}
		}

	}

	@Override
	public AnswerContent returnAnswerContentToSend() {
		return specificationToSend;
	}

	@Override
	public RequestContent returnRequestContentToSend() {
		// TODO Auto-generated method stub
		return null;
	}

}
