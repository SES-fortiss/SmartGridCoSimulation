package meritorder.components;

import java.util.LinkedList;

import com.google.gson.Gson;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;
import memap.external.M2MDisplay;
import meritorder.helper.ReadMemapFiles;
import meritorder.messages.Accepted;
import meritorder.messages.Demand;

public class Verbraucher extends BehaviorModel {
	
	public Demand answerContentToSend = new Demand();
	public M2MDisplay display;
	Gson gson = new Gson();	
	
	double price;
	int port;
	
	ReadMemapFiles file;

	public Verbraucher(String file, double price, int port) {
		this.file = new ReadMemapFiles(file);
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
		answerContentToSend.accepted = Accepted.none;
		answerContentToSend.price = this.price;
		answerContentToSend.volume = file.getStrom(actualTimeValue);
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
