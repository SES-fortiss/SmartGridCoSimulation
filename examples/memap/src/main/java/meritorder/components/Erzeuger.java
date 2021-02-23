package meritorder.components;

import com.google.gson.Gson;

import akka.basicMessages.AnswerContent;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;
import memap.external.M2MDisplay;
import meritorder.messages.Offer;

public class Erzeuger extends BehaviorModel {
	
	private Offer answerContentToSend = new Offer();
	private M2MDisplay display;
	private Gson gson = new Gson();
	
	double price;
	double erzeugung;
	int port;
	

	public Erzeuger(double erzeugung, double price, int port) {
		this.erzeugung = erzeugung;
		this.price = price;
		this.port = port;
		
		display = new M2MDisplay(port); // add port in to display a json
		display.run();
	}

	@Override
	public void handleRequest() {}

	@Override
	public void makeDecision() {
		answerContentToSend.price = this.price;
		answerContentToSend.volume = this.erzeugung;
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
