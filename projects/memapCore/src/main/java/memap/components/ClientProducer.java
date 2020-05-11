package memap.components;

import java.util.concurrent.ExecutionException;

import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;

import memap.components.prototypes.Producer;
import memap.controller.TopologyController;
import memap.helperOPCua.BasicClient;
import memap.messages.extension.NetworkType;

public class ClientProducer extends Producer {
	
	public final NetworkType networkType;
	public double opCost;
	public double costCO2;

	/**
	 * @param client
	 * @param name        producer name
	 * @param minPower    minimum power [kW]
	 * @param maxPower    maximum power [kW]
	 * @param effId       efficiency [0-1]
	 * @param networkType
	 * @param opCostId    optimization cost [EUR]
	 * @param costCO2Id   CO2 cost [kg CO2/kWh]
	 * @param port
	 */
	public ClientProducer(BasicClient client, String name, NodeId nodeIdSector, NodeId minPowerId, NodeId maxPowerId, NodeId effId, NodeId opCostId, NodeId costCO2Id, int port)
			throws InterruptedException, ExecutionException {
		super(name, client.readFinalDoubleValue(minPowerId), client.readFinalDoubleValue(maxPowerId),
				client.readFinalDoubleValue(effId), port);
		this.opCost = client.readFinalDoubleValue(opCostId);
		this.costCO2 = client.readFinalDoubleValue(costCO2Id);
		networkType = this.setNetworkType(client, nodeIdSector);
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
	
	/** Passes a reference of an object of class {@link TopologyController} to the parent class */
	public void setTopologyController(TopologyController topologyController) {
		super.setTopologyController(topologyController);
	}
	

	@Override
	public NetworkType setNetworkType(BasicClient client, NodeId nodeIdSector) {
		return super.setNetworkType(client, nodeIdSector);
	}

}
