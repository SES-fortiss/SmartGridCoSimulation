package example.batterie;

import java.util.LinkedList;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.RequestContent;
import akka.systemActors.GlobalTime;
import behavior.BehaviorModel;
import example.haus.HausRequest;
import example.helper.TypKlasse;

public class BatterieModel extends BehaviorModel {
	
	public BatterieModelAnswer answerContentToSend = new BatterieModelAnswer();
	public TypKlasse typ = TypKlasse.BATTERY; 
	public double capacity; // in kWh;
	public double soc; // in kWh;
	public double lastResult;
	
	public BatterieModel(double capacity){
		this.capacity = capacity;
		this.soc = capacity / 2;
	}
	
	HausRequest request;
	double lastRequested = 0;

	@Override
	public void handleRequest() {			
		if (this.requestContentReceived != null) {
			request = (HausRequest) this.requestContentReceived; 
			this.lastRequested = request.prognose;
		}		
	}

	@Override
	public void makeDecision() {
		
		bufferLast(this.lastRequested);		
		double prod = 0;
		double verb = 0;
		
		if(this.lastResult > 0) {
			prod = this.lastResult;
		}
		
		if (this.lastResult < 0) {
			verb = -this.lastResult;			
		}
		
		answerContentToSend.verbrauch = verb;
		answerContentToSend.erzeugung = prod;
		answerContentToSend.last = answerContentToSend.erzeugung - answerContentToSend.verbrauch;
		answerContentToSend.typ = this.typ;
		answerContentToSend.soc = this.soc;
	}

	private void bufferLast(double last) {		
		if (last > 0){
			charge(last);
		} else discharge(last);		
	}

	private void discharge(double lastRequested) {		
		lastRequested = lastRequested * (-1.0);
		double lastInWattSeconds = lastRequested*GlobalTime.period.getSeconds();
		double lastInKWH = lastInWattSeconds / 3600 / 1000;	
		
		if (this.soc - lastInKWH > 0) {
			this.soc -= lastInKWH;
			this.lastResult = lastRequested;
		} else {
			this.lastResult = this.soc;
			this.soc = 0;
		}
	}

	private void charge(double lastRequested) {		
		double lastInWattSeconds = lastRequested*GlobalTime.period.getSeconds();
		double lastInKWH = lastInWattSeconds / 3600 / 1000;		
		
		if (this.soc + lastInKWH < this.capacity){
			this.soc += lastInKWH;
			this.lastResult = -lastRequested;
		} else {
			this.lastResult = this.capacity - this.soc;
			this.soc = this.capacity;
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
}
