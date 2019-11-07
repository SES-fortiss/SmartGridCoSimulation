package linprogMPC.components;

import static org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.Unsigned.uint;

import java.util.ArrayList;
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

import linprogMPC.components.prototypes.Consumer;
import linprogMPC.helperOPCua.BasicClient;

public class ClientConsumer extends Consumer {
	public BasicClient client;
	public NodeId nodeId;
	public Double heatProfile[] = new Double[nStepsMPC];
	public Double electricityProfile[] = new Double[nStepsMPC];
	public List<UaMonitoredItem> itemsHeat;
	public List<UaMonitoredItem> itemsElectricity;

	public ClientConsumer(BasicClient client, NodeId nodeIdHeat, NodeId nodeIdElectricity, int port) {
		super(port);
		this.client = client;
		Arrays.fill(heatProfile, 0.0);
		Arrays.fill(electricityProfile, 0.0);

		// subscribe to the Value attribute of the server's CurrentTime node
		ReadValueId readValueIdHeat = new ReadValueId(nodeIdHeat, AttributeId.Value.uid(), null,
				QualifiedName.NULL_VALUE);
		ReadValueId readValueIdElectricity = new ReadValueId(nodeIdElectricity, AttributeId.Value.uid(), null,
				QualifiedName.NULL_VALUE);

		// monitoring parameters
		int clientHandleHeat = 1543453; // just random numbers
		int clientHandleElectricity = 8934984; // just random numbers
		MonitoringParameters parametersHeat = new MonitoringParameters(uint(clientHandleHeat), 1000.0, null, uint(10),
				true);
		MonitoringParameters parametersElectricity = new MonitoringParameters(uint(clientHandleElectricity), 1000.0,
				null, uint(10), true);

		// creation request
		MonitoredItemCreateRequest requestHeat = new MonitoredItemCreateRequest(readValueIdHeat,
				MonitoringMode.Reporting, parametersHeat);
		MonitoredItemCreateRequest requestElectricity = new MonitoredItemCreateRequest(readValueIdElectricity,
				MonitoringMode.Reporting, parametersElectricity);

		// The actual consumer. Methods on call are implemented here
		BiConsumer<UaMonitoredItem, DataValue> consumerHeat = (item, value) -> {
			Variant var = value.getValue();
			if (var.getValue() instanceof Double) {
				Arrays.fill(heatProfile, (Math.abs((Double) value.getValue().getValue())));
			} else {
				System.out.println("Value " + value + " is not in double format");
			}
		};

		BiConsumer<UaMonitoredItem, DataValue> consumerElectricity = (item, value) -> {
			Variant var = value.getValue();
			if (var.getValue() instanceof Double) {
				Arrays.fill(electricityProfile, (Math.abs((Double) value.getValue().getValue())));
			} else {
				System.out.println("Value " + value + " is not in double format");
			}
		};

		// setting the consumer after the subscription creation
		BiConsumer<UaMonitoredItem, Integer> onItemCreatedHeat = (monitoredItem, id) -> monitoredItem
				.setValueConsumer(consumerHeat);
		BiConsumer<UaMonitoredItem, Integer> onItemCreatedElectricity = (monitoredItem, id) -> monitoredItem
				.setValueConsumer(consumerElectricity);

		// creating the subscription
		UaSubscription subscriptionHeat;
		UaSubscription subscriptionElectricity;

		try {
			subscriptionHeat = client.getSubscriptionManager().createSubscription(1000.0).get();
			itemsHeat = subscriptionHeat
					.createMonitoredItems(TimestampsToReturn.Both, Arrays.asList(requestHeat), onItemCreatedHeat).get();

			subscriptionElectricity = client.getSubscriptionManager().createSubscription(1000.0).get();
			itemsElectricity = subscriptionElectricity.createMonitoredItems(TimestampsToReturn.Both,
					Arrays.asList(requestElectricity), onItemCreatedElectricity).get();
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<Double> getHeatProfile(int timeStep, int mpcHorizon) {
		return new ArrayList<Double>(Arrays.asList(heatProfile));
	}

	@Override
	public List<Double> getElectricityProfile(int timeStep, int mpcHorizon) {
		return new ArrayList<Double>(Arrays.asList(electricityProfile));
	}

}
