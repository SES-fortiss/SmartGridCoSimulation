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

import akka.basicMessages.AnswerContent;
import memap.components.prototypes.Device;
import memap.helperOPCua.BasicClient;
import memap.main.TopologyConfig;

public class ClientResultReader extends Device {
	BasicClient client;
	public Double setpointsHeat[] = new Double[TopologyConfig.N_STEPS_MPC];
	public Double setpointsElectricity[] = new Double[TopologyConfig.N_STEPS_MPC];
	public List<UaMonitoredItem> itemsHeat;
	public List<UaMonitoredItem> itemsElectricity;

	public ClientResultReader(BasicClient client, String name, NodeId nodeIdHeat, NodeId nodeIdElectricity, int port) {
		super(name, port);
		Arrays.fill(setpointsHeat, 0.0);
		Arrays.fill(setpointsElectricity, 0.0);

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
				Arrays.fill(setpointsHeat, (Math.abs((Double) value.getValue().getValue())));
			} else {
				System.out.println("Value " + value + " is not in double format");
			}
		};

		BiConsumer<UaMonitoredItem, DataValue> consumerElectricity = (item, value) -> {
			Variant var = value.getValue();
			if (var.getValue() instanceof Double) {
				Arrays.fill(setpointsElectricity, (Math.abs((Double) value.getValue().getValue())));
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
	public AnswerContent returnAnswerContentToSend() {
		// Does not need to return anything for now
		return null;
	}

}
