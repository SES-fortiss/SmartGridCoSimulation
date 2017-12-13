package linprog.components;

import java.util.Calendar;
import java.util.LinkedList;

import com.google.gson.Gson;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;
import linprog.messages.DeviceSpecification;
import linprog.messages.SpecificationRequest;
import memap.external.M2MDisplay;

public abstract class Device extends BehaviorModel {
	
	protected final String name;
	
	protected DeviceSpecification specificationToSend = new DeviceSpecification();
	private M2MDisplay display;
	private Gson gson = new Gson();
	
	public Calendar startTime;
	public int n;
	public int stepSize;
	
	public Device(String name) {
		if(name == null) {
			//TODO throw exception
		}
		this.name = name;
	}


	@Override
	public void handleError(LinkedList<ErrorAnswerContent> errors) {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleRequest() {
		n = ((SpecificationRequest) requestContentReceived).timesteps;
		startTime = ((SpecificationRequest) requestContentReceived).startTime;
		stepSize = ((SpecificationRequest) requestContentReceived).stepSize;
	}

	@Override
	public void makeDecision() {
		specificationToSend.name = this.name;
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
