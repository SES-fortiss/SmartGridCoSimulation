package linprogMPC.components;

import java.util.concurrent.ExecutionException;

import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;

import linprogMPC.components.prototypes.Producer;
import linprogMPC.helperOPCua.BasicClient;
import linprogMPC.messages.extension.NetworkType;

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
	public ClientProducer(BasicClient client, String name, NodeId minPowerId, NodeId maxPowerId, NodeId effId,
			NetworkType networkType, NodeId opCostId, NodeId costCO2Id, int port)
			throws InterruptedException, ExecutionException {
		super(name, client.readFinalDoubleValue(minPowerId), client.readFinalDoubleValue(maxPowerId),
				client.readFinalDoubleValue(effId), port);
		this.networkType = networkType;
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

}
