package memap.components;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;

import org.eclipse.milo.opcua.stack.core.types.builtin.DataValue;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.Variant;

import com.google.common.collect.ImmutableList;

import memap.components.prototypes.Producer;
import memap.controller.TopologyController;
import memap.helperOPCua.BasicClient;
import memap.main.TopologyConfig;
import memap.messages.OptimizationResultMessage;
import memap.messages.extension.NetworkType;

public class ClientProducer extends Producer {
	
	public final NetworkType networkType;
	public double opCost;
	public double costCO2;
	public BasicClient client;
	public List<NodeId> setpointIds = new ArrayList<NodeId>();
	
	/**
	 * @param client
	 * @param name        producer name
	 * @param minPower    minimum power [kW]
	 * @param maxPower    maximum power [kW]
	 * @param effId       efficiency [0-1]
	 * @param networkType
	 * @param opCostId    optimization cost [EUR]
	 * @param costCO2Id   CO2 cost [kg CO2/kWh]
	 * @param setpointIds 
	 * @param port
	 */
	public ClientProducer(BasicClient client, String name, NodeId nodeIdSector, NodeId minPowerId, NodeId maxPowerId, NodeId effId, NodeId opCostId, NodeId costCO2Id, List<NodeId> setpointIds, int port)
			throws InterruptedException, ExecutionException {
		super(name, client.readFinalDoubleValue(minPowerId), client.readFinalDoubleValue(maxPowerId),
				client.readFinalDoubleValue(effId), port);

		// TODO an in superclass device:
		this.client = client;
		this.setpointIds = setpointIds;
		this.networkType = this.setNetworkType(client, nodeIdSector);
		this.opCost = client.readFinalDoubleValue(opCostId);
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
					for (int i = 0; i < TopologyConfig.getInstance().getNrStepsMPC(); i++) {
						DataValue data = new DataValue(new Variant(optimizationAdvice[i]), null, null);					
						client.writeValue(setpointIds.get(i), data);						
					}			
				}
				
			}
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
