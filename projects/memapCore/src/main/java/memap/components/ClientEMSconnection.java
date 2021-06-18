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

public class ClientEMSconnection extends Connection {
	
	/** Reference to the topology */
	protected TopologyController topologyController;
	
	public ConnectionMessage connectionMessage = new ConnectionMessage();
	
	public BasicClient client;
	public NodeId triggerId;
	public NodeId connEffId;
	public double trigger;
	public double connLosses;
	
	// Constructor with Connection
	public ClientEMSconnection(BasicClient client, TopologyController topologyController, String name, NodeId triggerId, String connFrom, String connTo, double connLength, double connLosses, double q_max, int port) throws InterruptedException, ExecutionException {
		super(connFrom, connTo, connLength, connLosses, q_max);

		this.client = client;
		this.topologyController = topologyController;
		this.triggerId = triggerId; 
		this.connLosses = connLosses;
	}

	@Override
	public void makeDecision() {
		if (topologyController.getOptimizer() == Optimizer.MILPwithConnections) {
					
			connectionMessage.networkType = NetworkType.HEAT;
			
			connectionMessage.name = actorName;
			connectionMessage.id = fullActorPath;
			
			connectionMessage.connectedBuildingFrom = sourceBuilding;
			connectionMessage.connectedBuildingTo = connectedBuilding;
			
			connectionMessage.maxPower = q_max;
			connectionMessage.pipeLengthInMeter = pipeLengthInMeter;
			connectionMessage.losses = connLosses;
			connectionMessage.efficiency = efficiency;
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
