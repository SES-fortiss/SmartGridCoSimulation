package exampleScenario.components;

import java.util.LinkedList;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;

public abstract class Device extends BehaviorModel {
	
	protected final String name;
	
	//protected M2MDisplay display;
	//protected Gson gson = new Gson();
	//public int port;
	//public int n = Simulation.maxTimeStep;
	
	//public Device(String name, int port) {
	public Device(String name) {
		if(name == null) {
			//TODO throw exception
		}
		this.name = name;
		//this.port = port;
		//display = new M2MDisplay(port); // add port in to display a json
		//display.run();
	}


	@Override
	public void handleError(LinkedList<ErrorAnswerContent> errors) {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleRequest() {
	}

	@Override
	public void makeDecision() {
	}

	@Override
	public RequestContent returnRequestContentToSend() {
		// TODO Auto-generated method stub
		return null;
	}

}
