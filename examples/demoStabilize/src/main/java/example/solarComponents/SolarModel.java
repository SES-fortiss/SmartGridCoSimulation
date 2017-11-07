package example.solarComponents;

import helper.lastProfil.SolarProduction;

import java.util.LinkedList;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;
import example.aggregator.AnswerToAggregator;
import example.helper.Types;

public class SolarModel extends BehaviorModel {
	
	public AnswerToAggregator answerContentToSend = new AnswerToAggregator();
	public Types typ = Types.SOLAR; 
	
	double jahresVerbrauch;
	public SolarRecorder recorder;
	
	public SolarModel(double jahresProduktion){
		this.jahresVerbrauch = jahresProduktion;	
	}

	@Override
	public void handleRequest() {}

	@Override
	public void makeDecision() {
		
		answerContentToSend.demand = 0;
		answerContentToSend.generation = SolarProduction.getSolarProductionPower(jahresVerbrauch, actualTimeValue);
		answerContentToSend.powerInjection = answerContentToSend.generation - answerContentToSend.demand;
		answerContentToSend.typ = this.typ;		
		
		if (recorder != null){
			recorder.saveAnswer(answerContentToSend);
		}
	}

	@Override
	public AnswerContent returnAnswerContentToSend() {		
		return answerContentToSend;
	}

	@Override
	public RequestContent returnRequestContentToSend() {
		return null;
	}

	@Override
	public void handleError(LinkedList<ErrorAnswerContent> errors) {}
	
	@Override
	public void endSimulation() {
		if (recorder != null){
			recorder.close();
		}
	}
}
