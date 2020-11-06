package memap.components;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;

import org.eclipse.milo.opcua.stack.core.types.builtin.DataValue;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.Variant;
import org.eclipse.milo.opcua.stack.core.types.enumerated.TimestampsToReturn;

import com.google.common.collect.ImmutableList;

import akka.basicMessages.RequestContent;
import memap.components.prototypes.Producer;
import memap.controller.TopologyController;
import memap.helper.EnergyPrices;
import memap.helperOPCua.BasicClient;
import memap.main.TopologyConfig;
import memap.messages.OptimizationResultMessage;
import memap.messages.extension.NetworkType;

public class ClientProducer extends Producer {
	
	public final NetworkType networkType;
	public double opCost;
	double trigger;
	public double costCO2;
	public BasicClient client;
//	public List<NodeId> setpointIds = new ArrayList<NodeId>();
	public NodeId setpointsId;
	public NodeId triggerId;
	
	/**
	 * @param client
	 * @param name        producer name
	 * @param minPower    minimum power [kW]
	 * @param maxPower    maximum power [kW]
	 * @param effId       efficiency [0-1]
	 * @param networkType
	 * @param opCostId    optimization cost [EUR]
	 * @param costCO2Id   CO2 cost [kg CO2/kWh]
	 * @param setpointsId 
	 * @param port
	 */
	public ClientProducer(BasicClient client, String name, NodeId triggerId, NodeId nodeIdSector, NodeId minPowerId, NodeId maxPowerId, NodeId effId, NodeId opCostId, NodeId costCO2Id, NodeId setpointsId, int port)
			throws InterruptedException, ExecutionException {
		super(name, client.readFinalDoubleValue(minPowerId), client.readFinalDoubleValue(maxPowerId),
				client.readFinalDoubleValue(effId), port);

		// TODO an in superclass device:
		this.client = client;
		this.setpointsId = setpointsId;
		this.networkType = this.setNetworkType(client, nodeIdSector);
		this.triggerId = triggerId;
		this.trigger = client.readFinalDoubleValue(triggerId);
		this.opCost = client.readFinalDoubleValue(opCostId);
//		this.opCost = opCostId;
		this.costCO2 = client.readFinalDoubleValue(costCO2Id);
		
	}

	public void makeDecision() {
		producerMessage.id = fullActorPath;
		producerMessage.name = actorName;
		producerMessage.minPower = minPower;
		producerMessage.maxPower = maxPower;
		producerMessage.operationalCostEUR = opCost;
		producerMessage.operationalCostCO2 = costCO2;
		producerMessage.efficiency = efficiency;
		producerMessage.networkType = networkType;
	}
	
	@Override
	public void handleRequest() {
		
		if (requestContentReceived instanceof OptimizationResultMessage) {
			
			OptimizationResultMessage optResult = ((OptimizationResultMessage) requestContentReceived);
			for (String key : optResult.resultMap.keySet()) {
				if (key.equals(actorName)) {
					optimizationAdvice = optResult.resultMap.get(key);
					try {
						if (client.readValue(Integer.MAX_VALUE, TimestampsToReturn.Neither, setpointsId).getValue().getValue().getClass().isArray()) {
							DataValue data = new DataValue(new Variant(optimizationAdvice), null, null);
							client.writeValue(setpointsId, data);
						}
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ExecutionException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
//					for (int i = 0; i < TopologyConfig.getInstance().getNrStepsMPC(); i++) {
//						DataValue data = new DataValue(new Variant(optimizationAdvice[i]), null, null);					
//						client.writeValue(setpointIds.get(i), data);						
//					}			
				}
				
			}
			System.out.println("Setpoint written for CPROD.");
		}
		
		double tr = trigger;
		System.out.println(tr + " - CPROD waiting for new trigger....");
		while (tr ==  trigger) {
			try {
				tr = client.readFinalDoubleValue(triggerId);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		trigger = tr;
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/** Passes a reference of an object of class {@link TopologyController} to the parent class */
	public void setTopologyController(TopologyController topologyController) {
		super.setTopologyController(topologyController);
	}
	

	@Override
	public NetworkType setNetworkType(BasicClient client, NodeId nodeIdSector) {
		return super.setNetworkType(client, nodeIdSector);
	}


}
