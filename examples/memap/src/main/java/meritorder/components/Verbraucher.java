package meritorder.components;

import java.util.LinkedList;

import com.google.gson.Gson;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;
import helper.standardLastProfil.StandardLastProfil;
import memap.external.M2MDisplay;
import meritorder.messages.Demand;

public class Verbraucher extends BehaviorModel {
	
	public Demand answerContentToSend = new Demand();
	public M2MDisplay display;
	Gson gson = new Gson();
	
	double price;
	double verbrauch;
	int port;
	

	public Verbraucher(double verbrauch, double price, int port) {
		this.verbrauch = verbrauch;
		this.price = price;
		this.port = port;
		
		display = new M2MDisplay(port); // add port in to display a json
		display.run();
	}

	@Override
	public void handleError(LinkedList<ErrorAnswerContent> errors) {}

	@Override
	public void handleRequest() {}

	@Override
	public void makeDecision() {
		answerContentToSend.price = this.price;
		answerContentToSend.volume = StandardLastProfil.getH0DemandInterpolated(verbrauch, actualTimeValue);
		display.update(gson.toJson(answerContentToSend));
	}

	@Override
	public AnswerContent returnAnswerContentToSend() {		
		return answerContentToSend;
	}

	@Override
	public RequestContent returnRequestContentToSend() {
		return null;
	}

}
