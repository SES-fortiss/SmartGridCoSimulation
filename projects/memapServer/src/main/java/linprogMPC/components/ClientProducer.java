package linprogMPC.components;

import java.util.concurrent.ExecutionException;

import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;

import linprogMPC.components.prototypes.Producer;
import linprogMPC.helperOPCua.BasicClient;
import linprogMPC.messages.extension.NetworkType;

public class ClientProducer extends Producer {
	public double opCost;
	public double costCO2;
	public final NetworkType networkType;

	public ClientProducer(BasicClient client, String name, NodeId installedPowerId, NodeId effId, NodeId opCostId,
			NodeId costCO2Id, NetworkType networkType, int port) throws InterruptedException, ExecutionException {

	/**
	 * @param client
	 * @param name                volatile producer name
	 * @param installedPowerId    volatile power in kW
	 * @param effId               efficiency [0-1]
	 * @param networkType
	 * @param opCostId            optimization cost [EUR]
	 * @param costCO2Id           CO2 cost [kg CO2/kWh]
	 * @param port
	 */
	public ClientProducer(BasicClient client, String name, NodeId installedPowerId, NodeId effId,
			NetworkType networkType, NodeId opCostId, NodeId costCO2Id, int port)
			throws InterruptedException, ExecutionException {
		super(name, client.readFinalDoubleValue(installedPowerId), client.readFinalDoubleValue(effId), port);
		this.opCost = client.readFinalDoubleValue(opCostId);
		this.costCO2 = client.readFinalDoubleValue(costCO2Id);
		this.networkType = networkType;
	}

	public void makeDecision() {
		producerMessage.id = this.fullActorPath;
		producerMessage.name = this.actorName;
		producerMessage.operationalCostEUR = opCost;
		producerMessage.operationalCostCO2 = costCO2; // kg CO2/kWh
		producerMessage.efficiency = efficiency;
		producerMessage.installedPower = installedPower;
		producerMessage.networkType = networkType;
	}

}
