package linprogMPC.components;

import java.util.Calendar;
import java.util.LinkedList;

import com.google.gson.Gson;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.RequestContent;
import akka.timeManagement.CurrentTimeStepSubscriber;
import behavior.BehaviorModel;
import linprogMPC.Simulation;
import memap.external.M2MDisplay;

public abstract class Device extends BehaviorModel implements CurrentTimeStepSubscriber{
	
	protected final String name;
	
	protected M2MDisplay display;
	protected Gson gson = new Gson();
	public int port;
	
	public Calendar startTime;
	public int n = Simulation.N_STEPS_MPC;
	
	protected int timeStep = 0;
	
	public Device(String name, int port) {
		if(name == null) {
			//TODO throw exception
		}
		this.name = name;
		this.port = port;
		display = new M2MDisplay(port); // add port in to display a json
		display.run();
		
		Simulation.getGlobalTime().subscribeToCurrentTimeStep(this);
	}


	@Override
	public void handleError(LinkedList<ErrorAnswerContent> errors) {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleRequest() {
//		n = ((SpecificationRequest) requestContentReceived).timesteps;
//		startTime = ((SpecificationRequest) requestContentReceived).startTime;
//		stepSize = ((SpecificationRequest) requestContentReceived).stepSize;
	}

	@Override
	public void makeDecision() {
	}

	@Override
	public RequestContent returnRequestContentToSend() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void update(int currentTimeStep) {
		this.timeStep = currentTimeStep;		
	}

}
