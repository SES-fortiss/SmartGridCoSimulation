package example.aggregator;

import java.util.LinkedList;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.BasicAnswer;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;
import example.helper.TypKlasse;

public class AggregatorModel extends BehaviorModel {
	
	double summeKWH = 0;
	public AggregatorRecorder recorder = new AggregatorRecorder(this);
	public AggregatorAnswer aggregation = new AggregatorAnswer();
	
	@Override
	public void handleRequest() {}

	@Override
	public void makeDecision() {				
		double verbrauch = 0;
		double erzeugung = 0;
		double last = 0;
		
		double privat = 0;
		double gewerbe = 0;
		double landwirtschaft = 0;
		double strasse = 0;
		double solar = 0;
		
		for (BasicAnswer answer : super.answerListReceived) {
			
			HouseToAggregator ans = (HouseToAggregator) answer.answerContent;
			verbrauch = verbrauch + ans.verbrauch;
			erzeugung = erzeugung + ans.erzeugung;
			last = last + ans.last;
			
			if (ans.typ == TypKlasse.HAUS) privat += ans.verbrauch;
			if (ans.typ == TypKlasse.GEWERBE) gewerbe += ans.verbrauch;
			if (ans.typ == TypKlasse.LANDWIRTSCHAFT) landwirtschaft += ans.verbrauch;
			if (ans.typ == TypKlasse.STRASSENBELEUCHTUNG) strasse += ans.verbrauch;
			if (ans.typ == TypKlasse.SOLAR) solar += ans.erzeugung;
		}
		
		aggregation.verbrauch = (int) verbrauch;
		aggregation.erzeugung = (int) erzeugung;
		aggregation.last = (int) last;
		
		aggregation.privat = (int) privat;
		aggregation.gewerbe = (int) gewerbe; 
		aggregation.landwirtschaft = (int) landwirtschaft; 
		aggregation.strasse = (int) strasse;
		aggregation.solar = (int) solar;	
		
		//summeKWH += last * GlobalTime.period.toMinutes() / 60;
		
		if (recorder != null){
			recorder.saveAnswer(aggregation);
		}
		
	}

	@Override
	public AnswerContent returnAnswerContentToSend() {
		return null;
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
