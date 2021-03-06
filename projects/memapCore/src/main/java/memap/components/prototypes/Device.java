package memap.components.prototypes;

import java.util.concurrent.ExecutionException;

import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;

import com.google.gson.Gson;

import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;
import memap.controller.TopologyController;
import memap.external.M2MDisplay;
import memap.helperOPCua.BasicClient;
import memap.main.TopologyConfig;
import memap.messages.extension.NetworkType;

public abstract class Device extends BehaviorModel {

	/** Reference to topology configuration */
	protected TopologyConfig topologyConfig = TopologyConfig.getInstance();
	protected M2MDisplay display;
	protected Gson gson = new Gson();
	private long waitDisplayClose = 0L;

	/**
	 * This class is only there so that each component receives a display, if the
	 * port != 0; <br>
	 *
	 * @param port
	 */
	public Device(String actorName, int port) {
		super();
		this.actorName = actorName;
		if (port != 0) {
			// display = new M2MDisplay(port); // add port in to display a json
			// display.run();
			System.out.println("Device-Display Port: " + port);
		}
	}

	@Override
	public void handleRequest() {
	}

	@Override
	public void makeDecision() {
	}

	@Override
	public RequestContent returnRequestContentToSend() {
		return null;
	}

	@Override
	public void stop() {
		try {
			Thread.sleep(waitDisplayClose); // displays are kept for 1 minute alive after the simulation is executed
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
			// display.update(gson.toJson(o));
		}
	}

	/**
	 * Allows a device to get a reference to the topology where it is contained. The
	 * parameter topologyController must be created on each class where the method
	 * is overridden or a parent class.
	 */
	public void setTopologyController(TopologyController topologyController) {
	};
	

	public NetworkType setNetworkType(BasicClient client, NodeId nodeIdSector) {
		// TODO Hard-coded readable strings
		NetworkType nwT = null;		
		String primarynetwork = null;
		
		try {
			primarynetwork = client.readFinalStringValue(nodeIdSector);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		switch (primarynetwork) {
		case "elec":
			nwT = NetworkType.ELECTRICITY;
			break;
		case "electricity":
			nwT =  NetworkType.ELECTRICITY;
			break;
		case "heat":
			nwT =  NetworkType.HEAT;
			break;
		case "":
			System.out.println("Sector not defined!");
			break;
		}
		return nwT;
	};

}
