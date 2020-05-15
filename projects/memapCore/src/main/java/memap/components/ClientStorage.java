package memap.components;

import static org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.Unsigned.uint;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.function.BiConsumer;

import org.eclipse.milo.opcua.sdk.client.api.subscriptions.UaMonitoredItem;
import org.eclipse.milo.opcua.sdk.client.api.subscriptions.UaSubscription;
import org.eclipse.milo.opcua.stack.core.AttributeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.DataValue;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.QualifiedName;
import org.eclipse.milo.opcua.stack.core.types.builtin.Variant;
import org.eclipse.milo.opcua.stack.core.types.enumerated.MonitoringMode;
import org.eclipse.milo.opcua.stack.core.types.enumerated.TimestampsToReturn;
import org.eclipse.milo.opcua.stack.core.types.structured.MonitoredItemCreateRequest;
import org.eclipse.milo.opcua.stack.core.types.structured.MonitoringParameters;
import org.eclipse.milo.opcua.stack.core.types.structured.ReadValueId;

import memap.components.prototypes.Storage;
import memap.controller.TopologyController;
import memap.helperOPCua.BasicClient;
import memap.messages.extension.NetworkType;

public class ClientStorage extends Storage {
	
	NetworkType networkType;
	double opCost;
	double costCO2;

	public List<UaMonitoredItem> itemsDemand;
	
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
			NodeId maxDischargingId, NodeId effInId, NodeId effOutId, NodeId nodeIdSector, NodeId opCostId,
			NodeId costCO2Id, int port) throws InterruptedException, ExecutionException {
		super(name, client.readFinalDoubleValue(capacityId), client.readFinalDoubleValue(stateOfCharge),
				client.readFinalDoubleValue(maxChargingId), client.readFinalDoubleValue(maxDischargingId),
				client.readFinalDoubleValue(effInId), client.readFinalDoubleValue(effOutId), port);
		this.networkType = setNetworkType(client, nodeIdSector);
		this.opCost = client.readFinalDoubleValue(opCostId);
		this.costCO2 = client.readFinalDoubleValue(costCO2Id);
		
		
		
		// ========= Subscription ==============
		
		// subscribe to the Value attribute of the server's CurrentTime node
		ReadValueId readValueIdConsumption = new ReadValueId(stateOfCharge, AttributeId.Value.uid(), null,
				QualifiedName.NULL_VALUE);
			
		// monitoring parameters
		int clientHandle = 1543453; // just random numbers

		// Forecast ?!		
		MonitoringParameters parameterSOC = new MonitoringParameters(uint(clientHandle), 1000.0, null, uint(10),
				true);
		
		// creation request
		MonitoredItemCreateRequest requestSOC = new MonitoredItemCreateRequest(readValueIdConsumption,
				MonitoringMode.Reporting, parameterSOC);
		
		// The actual consumer. Methods on call are implemented here
		BiConsumer<UaMonitoredItem, DataValue> SOC = (item, value) -> {
			Variant var = value.getValue();
			if (var.getValue() instanceof Number) {
				this.stateOfCharge = (Double) value.getValue().getValue();
				System.out.println("SOC updated");
			} else {
				System.out.println("Value " + value + " is not in Number[] format");
			}
		};

		// setting the consumer after the subscription creation
		BiConsumer<UaMonitoredItem, Integer> onItemCreatedDemand = (monitoredItem, id) -> monitoredItem
				.setValueConsumer(SOC);

		// creating the subscription
		UaSubscription subscriptionSOC;
		
		try {
			subscriptionSOC = client.getSubscriptionManager().createSubscription(1000.0).get();
			itemsDemand = subscriptionSOC
					.createMonitoredItems(TimestampsToReturn.Both, Arrays.asList(requestSOC), onItemCreatedDemand).get();

		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		
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

	@Override
	public Double getStateOfCharge() {
		return stateOfCharge;
	}

}
