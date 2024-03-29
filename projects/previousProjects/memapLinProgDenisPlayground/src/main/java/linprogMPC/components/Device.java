package linprogMPC.components;

import com.google.gson.Gson;

import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;
import linprogMPC.MPCDenisSimulation;
import linprogMPC.external.M2MDisplay;

public abstract class Device extends BehaviorModel {
		
	protected M2MDisplay display;
	protected Gson gson = new Gson();
	private long waitDisplayClose = 0L;
	
	public int nStepsMPC = MPCDenisSimulation.N_STEPS_MPC;
	
	/**
	 * This class is only there so that each component receives a display, if the port != 0; <br>
	 * It also has the nSepsMPC (how many time steps the MPC calculates).
	 *
	 * @param port
	 */
	public Device(int port) {	
		
		if (port != 0) {
			display = new M2MDisplay(port); // add port in to display a json
			display.run();
			System.out.println("Device-Display Port: " + port);
		}
	}

	@Override
	public void handleRequest() {}

	@Override
	public void makeDecision() {}

	@Override
	public RequestContent returnRequestContentToSend() {
		return null;
	}
	
	@Override
	public void stop() {
		try {			
			Thread.sleep(waitDisplayClose); // displays are keept for 1 minute alive after the simulation is executed
			if (display != null) {
				display.server.stop();
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
		super.stop();
	}
	
	public void updateDisplay(Object o) {		
		if (display != null) {
			display.update(gson.toJson(o));
		}		
	}
}
