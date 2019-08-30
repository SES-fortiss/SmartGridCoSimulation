package linprogMPC.components;

import java.util.concurrent.ExecutionException;

import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;

import linprogMPC.components.prototypes.Producer;
import linprogMPC.helperOPCua.BasicClient;
import linprogMPC.messages.extension.NetworkType;

public class ClientProducer extends Producer {
	public final double costs;
	public final NetworkType networkType;

	public ClientProducer(BasicClient client, NodeId installedPowerId, NodeId effId, NodeId costsId,
			NetworkType networkType, int port) throws InterruptedException, ExecutionException {

		super(client.readFinalDoubleValue(installedPowerId), client.readFinalDoubleValue(effId), port);

		this.costs = client.readFinalDoubleValue(costsId);
		this.networkType = networkType;
	}

	public void makeDecision() {
		producerMessage.id = this.fullActorPath;
		producerMessage.name = this.actorName;
		producerMessage.operationalPriceEURO = this.costs;
		producerMessage.efficiency = efficiency;
		producerMessage.installedPower = installedPower;
		producerMessage.networkType = networkType;
	}

}
