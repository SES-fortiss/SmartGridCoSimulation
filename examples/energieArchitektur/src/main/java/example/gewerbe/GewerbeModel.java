package example.gewerbe;

import helper.lastProfil.LastProfilTennet;

import java.util.LinkedList;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;
import example.aggregator.HouseToAggregator;
import example.helper.TypKlasse;

public class GewerbeModel extends BehaviorModel {
	
	public HouseToAggregator answerContentToSend = new HouseToAggregator();
	public TypKlasse typ = TypKlasse.GEWERBE;
	public boolean rec = false;
	
	
	double jahresVerbrauch;
	public GewerbeRecorder recorder;
	
	public GewerbeModel(double jahresVerbrauch){
		this.jahresVerbrauch = jahresVerbrauch;
		answerContentToSend.typ = this.typ;
	}
	
	@Override
	public void handleRequest() {
		if ((this.recorder == null)) {
			this.recorder = new GewerbeRecorder(this);
		}
	}

	@Override
	public void makeDecision() {		
		answerContentToSend.verbrauch = LastProfilTennet.getLoadCommercial(jahresVerbrauch, actualTimeValue);		
		answerContentToSend.erzeugung = 0;
		answerContentToSend.last = answerContentToSend.erzeugung - answerContentToSend.verbrauch;
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
