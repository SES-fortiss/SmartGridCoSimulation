package example.commericalComponents;

import helper.lastProfil.LastProfilTennet;

import java.util.LinkedList;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;
import example.aggregator.AnswerToAggregator;
import example.helper.Types;

public class CommercialBuildingModel extends BehaviorModel {
	
	public AnswerToAggregator answerContentToSend = new AnswerToAggregator();
	public Types typ = Types.COMMERCIAL;
	
	double jahresVerbrauch;
	public CommercialBuildingRecorder recorder;
	
	public CommercialBuildingModel(double jahresVerbrauch){
		this.jahresVerbrauch = jahresVerbrauch;
	}

	@Override 
	public void handleRequest() {}

	@Override
	public void makeDecision() {		
		answerContentToSend.demand = LastProfilTennet.getLoadCommercial(jahresVerbrauch, actualTimeValue);		
		answerContentToSend.generation = 0;
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
