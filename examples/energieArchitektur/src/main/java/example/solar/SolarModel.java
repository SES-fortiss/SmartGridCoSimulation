package example.solar;

import helper.lastProfil.SolarProduction;

import java.util.LinkedList;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;
import example.helper.TypKlasse;

public class SolarModel extends BehaviorModel {
	
	public SolarModelAnswer answerContentToSend = new SolarModelAnswer();
	public TypKlasse typ = TypKlasse.SOLAR; 
	
	double jahresProduktion;
	public SolarRecorder recorder;// = new SolarRecorder(this);
	
	public SolarModel(double jahresProduktion){
		this.jahresProduktion = jahresProduktion;	
	}

	@Override
	public void handleRequest() {}

	@Override
	public void makeDecision() {
		
		answerContentToSend.verbrauch = 0;
		answerContentToSend.erzeugung = SolarProduction.getSolarProductionPower(jahresProduktion, actualTimeValue);
		answerContentToSend.last = answerContentToSend.erzeugung - answerContentToSend.verbrauch;
		answerContentToSend.typ = this.typ;
		answerContentToSend.jahresProduktion = this.jahresProduktion;
		
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
