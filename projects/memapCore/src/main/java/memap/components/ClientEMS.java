package memap.components;

import java.util.concurrent.ExecutionException;

import org.eclipse.milo.opcua.stack.core.types.builtin.DataValue;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.Variant;

import akka.basicMessages.AnswerContent;
import memap.components.prototypes.Device;
import memap.helperOPCua.BasicClient;


/**
 * @param client
 * @param name              EMS name
 * @param trigger			triggers EMS to update Setpoints
 * @param port
 */

public class ClientEMS extends Device {
	
	public BasicClient client;
	public NodeId triggerId;
	double trigger;
	
	public ClientEMS(BasicClient client, String name, NodeId triggerId, int port) {
		super(name, port);
		this.client = client;
		this.triggerId = triggerId;
		
		
		
	}



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
