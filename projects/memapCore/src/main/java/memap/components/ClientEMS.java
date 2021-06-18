package memap.components;

import java.util.concurrent.ExecutionException;

import org.eclipse.milo.opcua.stack.core.types.builtin.DataValue;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.Variant;

import akka.basicMessages.AnswerContent;
import memap.components.prototypes.Device;
import memap.controller.TopologyController;
import memap.helperOPCua.BasicClient;


/**
 * @param client
 * @param name              EMS name
 * @param trigger			triggers EMS to update Setpoints
 * @param port
 */

public class ClientEMS extends Device {
	
	/** Reference to the topology */
	protected TopologyController topologyController;
	
	public BasicClient client;
	public NodeId triggerId;
	public NodeId connEffId;
	public double trigger;
	
	// Constructor with Connection
	public ClientEMS (BasicClient client, String name, NodeId triggerId, int port) throws InterruptedException, ExecutionException {
		super(name, port);
		this.client = client;
		this.triggerId = triggerId; 
	}
	
	@Override
	public void handleRequest() {
		
		if (triggerId != null) {
			try {
				this.trigger = client.readFinalDoubleValue(triggerId);
			} catch (InterruptedException | ExecutionException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			// CoSES: Trigger should be increased only once
			trigger++;
			DataValue newTrigger = new DataValue(new Variant(trigger), null, null);
			client.writeValue(triggerId, newTrigger);
			
			System.out.println("Trigger written: " + trigger);
		}
	}

	@Override
	public AnswerContent returnAnswerContentToSend() {
		// TODO Auto-generated method stub
		return null;
	}

}
