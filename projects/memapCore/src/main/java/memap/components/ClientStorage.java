package memap.components;

import java.util.concurrent.ExecutionException;

import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;

import memap.components.prototypes.Storage;
import memap.controller.TopologyController;
import memap.helperOPCua.BasicClient;
import memap.messages.extension.NetworkType;

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
	public ClientStorage(BasicClient client, String name, NodeId capacityId, NodeId stateOfCharge, NodeId maxChargingId,
			NodeId maxDischargingId, NodeId effInId, NodeId effOutId, NetworkType networkType, NodeId opCostId,
			NodeId costCO2Id, int port) throws InterruptedException, ExecutionException {
		super(name, client.readFinalDoubleValue(capacityId), client.readFinalDoubleValue(stateOfCharge),
				client.readFinalDoubleValue(maxChargingId), client.readFinalDoubleValue(maxDischargingId),
				client.readFinalDoubleValue(effInId), client.readFinalDoubleValue(effOutId), port);
		this.networkType = networkType;
		this.opCost = client.readFinalDoubleValue(opCostId);
		this.costCO2 = client.readFinalDoubleValue(costCO2Id);
	}

	@Override
	public void makeDecision() {
		storageMessage.id = fullActorPath;
		storageMessage.name = actorName;
		storageMessage.operationalCostEUR = opCost;
		storageMessage.operationalCostCO2 = costCO2;
		storageMessage.capacity = capacity;
		storageMessage.stateOfCharge = stateOfCharge;
		storageMessage.maxLoad = max_charging;
		storageMessage.maxDischarge = max_discharging;
		storageMessage.efficiencyCharge = effIN;
		storageMessage.efficiencyDischarge = effOUT;
		storageMessage.networkType = networkType;
	}
	
	/** Passes a reference of an object of class {@link TopologyController} to the parent class */
	@Override
	public void setTopologyController(TopologyController topologyController) {
		super.setTopologyController(topologyController);
	}

}
