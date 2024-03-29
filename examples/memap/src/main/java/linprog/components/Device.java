package linprog.components;

import java.util.Calendar;

import com.google.gson.Gson;

import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;
import linprog.LinProgSimulation;
import memap.external.M2MDisplay;

public abstract class Device extends BehaviorModel {
	
	protected final String name;
	
	protected M2MDisplay display;
	protected Gson gson = new Gson();
	public int port;
	
	public Calendar startTime;
	public int n = LinProgSimulation.TIMESTEPS_PER_ITERATION;
	
	public Device(String name, int port) {
		if(name == null) {
			//TODO throw exception
		}
		this.name = name;
		this.port = port;
		display = new M2MDisplay(port); // add port in to display a json
		display.run();
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

}
