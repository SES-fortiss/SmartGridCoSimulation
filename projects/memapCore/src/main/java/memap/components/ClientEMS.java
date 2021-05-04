package memap.components;

import java.util.concurrent.ExecutionException;

import org.eclipse.milo.opcua.stack.core.types.builtin.DataValue;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.Variant;

import akka.basicMessages.AnswerContent;
import memap.components.prototypes.Device;
import memap.controller.TopologyController;
import memap.helperOPCua.BasicClient;
import memap.messages.extension.NetworkType;
import memap.messages.planning.ConnectionMessage;


/**
 * @param client
 * @param name              EMS name
 * @param trigger			triggers EMS to update Setpoints
 * @param port
 */

public class ClientEMS extends Device {
	
	/** Reference to the topology */
	protected TopologyController topologyController;
	
	public ConnectionMessage connectionMessage = new ConnectionMessage();
	
	public BasicClient client;
	public NodeId triggerId;
	public NodeId connEffId;
	public double connEff;
	public double trigger;
	
	public ClientEMS(BasicClient client, String name, NodeId triggerId, NodeId connEffId, int port) throws InterruptedException, ExecutionException {
		super(name, port);
		this.client = client;
		this.triggerId = triggerId;
		this.connEff = client.readFinalDoubleValue(connEffId);
	}

	@Override
	public void makeDecision() {
//		if (topologyController.getOptimizer() == Optimizer.MILPwithConnections) {
		connectionMessage.id = fullActorPath;
		connectionMessage.name = actorName;
//		connectionMessage.efficiency = connEff;
		connectionMessage.efficiency = 0.0001;
		// How to get the Stings names of connected buildings? From connection Matrix
//		connectionMessage.connectedBuildingFrom = "CoSES_H1";
//		connectionMessage.connectedBuildingTo = "unknown";
		connectionMessage.pipeLengthInMeter = 50;
		connectionMessage.operationalCostEUR = 0.0001;
		connectionMessage.operationalCostCO2 = 0.0001;
		connectionMessage.networkType = NetworkType.HEAT;
//		}
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
