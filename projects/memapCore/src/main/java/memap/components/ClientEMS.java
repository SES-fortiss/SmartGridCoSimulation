package memap.components;

import java.util.concurrent.ExecutionException;

import org.eclipse.milo.opcua.stack.core.types.builtin.DataValue;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.Variant;

import akka.basicMessages.AnswerContent;
import memap.components.prototypes.Connection;
import memap.controller.TopologyController;
import memap.helper.configurationOptions.Optimizer;
import memap.helperOPCua.BasicClient;
import memap.messages.extension.NetworkType;
import memap.messages.planning.ConnectionMessage;


/**
 * @param client
 * @param name              EMS name
 * @param trigger			triggers EMS to update Setpoints
 * @param port
 */

public class ClientEMS extends Connection {
	
	/** Reference to the topology */
	protected TopologyController topologyController;
	
	public ConnectionMessage connectionMessage = new ConnectionMessage();
	
	public BasicClient client;
	public NodeId triggerId;
	public NodeId connEffId;
	public double trigger;
	
	public ClientEMS(BasicClient client, TopologyController topologyController, String name, String connFrom, String connTo, NodeId triggerId, NodeId connEffId, int port) throws InterruptedException, ExecutionException {
		super(connFrom, connTo, 50, client.readFinalDoubleValue(connEffId), 999);
		this.client = client;
		this.topologyController = topologyController;
		this.triggerId = triggerId; 
	}

	@Override
	public void makeDecision() {
		if (topologyController.getOptimizer() == Optimizer.MILPwithConnections) {
					
			connectionMessage.networkType = NetworkType.HEAT;
			
			connectionMessage.name = actorName;
			connectionMessage.id = fullActorPath;
			
			connectionMessage.connectedBuildingFrom = sourceBuilding;
			connectionMessage.connectedBuildingTo = connectedBuilding;
			
			connectionMessage.efficiency = efficiency;
			connectionMessage.maxPower = 0.0; //q_max;
			// TODO: efficiency = 0 seems to not prevent heat transfer
			connectionMessage.pipeLengthInMeter = pipeLengthInMeter;
			connectionMessage.operationalCostEUR = 0.0001;
			connectionMessage.operationalCostCO2 = 0.0001;
		}
	}

	@Override
	public AnswerContent returnAnswerContentToSend() {
		return connectionMessage;
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

}
