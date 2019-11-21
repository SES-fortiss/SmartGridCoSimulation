package linprogMPC.components;

import java.util.concurrent.ExecutionException;

import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;

import linprogMPC.components.prototypes.Storage;
import linprogMPC.helperOPCua.BasicClient;
import linprogMPC.messages.extension.NetworkType;

public class ClientStorage extends Storage {
	NetworkType networkType;
	double opCost;
	double costCO2;

	/**
	 * @param client
	 * @param name             storage name
	 * @param capacityId       storage capacity [kWh]
	 * @param maxChargingId    maximum charge rate [kW]
	 * @param maxDischargingId maximum discharge rate [kW]
	 * @param effInId          charge efficiency [0-1]
	 * @param effOutId         discharge efficiency [0-1]
	 * @param networkType
	 * @param opCostId         optimization cost [EUR]
	 * @param costCO2Id        CO2 cost [kg CO2/kWh]
	 * @param port
	 */
	public ClientStorage(BasicClient client, String name, NodeId capacityId, NodeId maxChargingId,
			NodeId maxDischargingId, NodeId effInId, NodeId effOutId, NetworkType networkType, NodeId opCostId,
			NodeId costCO2Id, int port) throws InterruptedException, ExecutionException {
		super(name, client.readFinalDoubleValue(capacityId), client.readFinalDoubleValue(maxChargingId),
				client.readFinalDoubleValue(maxDischargingId), client.readFinalDoubleValue(effInId),
				client.readFinalDoubleValue(effOutId), port);
		this.networkType = networkType;
		this.opCost = client.readFinalDoubleValue(opCostId);
		this.costCO2 = client.readFinalDoubleValue(costCO2Id);
	}

	@Override
	public void makeDecision() {

		storageMessage.stateOfCharge = myStateOfCharge;

		// alle parameter ändern sich nicht während der laufzeit
		storageMessage.networkType = this.networkType;
		storageMessage.name = this.actorName;
		storageMessage.id = this.fullActorPath;
		storageMessage.operationalPriceEURO = opCost;
		storageMessage.operationalPriceCO2 = costCO2;
		storageMessage.capacity = this.capacity;
		storageMessage.maxLoad = this.max_charging;
		storageMessage.maxDischarge = this.max_discharging;
		storageMessage.efficiencyCharge = this.effIN;
		storageMessage.efficiencyDischarge = this.effOUT;
	}

}
