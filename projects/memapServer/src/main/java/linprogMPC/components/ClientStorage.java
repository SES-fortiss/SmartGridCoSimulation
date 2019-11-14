package linprogMPC.components;

import java.util.concurrent.ExecutionException;

import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;

import linprogMPC.components.prototypes.Storage;
import linprogMPC.helperOPCua.BasicClient;
import linprogMPC.messages.extension.NetworkType;

public class ClientStorage extends Storage {
	NetworkType networkType;

	public ClientStorage(BasicClient client, String name, NodeId capacityId, NodeId maxChargingId, NodeId maxDischargingId,
			NodeId effInId, NodeId effOutId, NetworkType networkType, int port)
			throws InterruptedException, ExecutionException {
		super(name, client.readFinalDoubleValue(capacityId), client.readFinalDoubleValue(maxChargingId),
				client.readFinalDoubleValue(maxDischargingId), client.readFinalDoubleValue(effInId),
				client.readFinalDoubleValue(effOutId), port);
		this.networkType = networkType;
	}

	@Override
	public void makeDecision() {
		
		storageMessage.stateOfCharge = myStateOfCharge;
		
		// alle parameter ändern sich nicht während der laufzeit
		storageMessage.networkType = this.networkType;
		storageMessage.name = this.actorName;
		storageMessage.id = this.fullActorPath;
		storageMessage.operationalPriceEURO = 0.0001;
		storageMessage.capacity = this.capacity;
		storageMessage.maxLoad = this.max_charging;
		storageMessage.maxDischarge = this.max_discharging;
		storageMessage.efficiencyCharge = this.effIN;
		storageMessage.efficiencyDischarge = this.effOUT;
	}

}
