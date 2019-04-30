package linprogMPC.components;

import static org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.Unsigned.uint;

import java.util.Arrays;
import java.util.LinkedList;
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

import linprogMPC.helperOPCua.BasicClient;

public class ClientConsumer extends Consumer {
    public BasicClient client;
    public NodeId nodeId;
    public List<Double> heatProfile = new LinkedList<Double>();
    public List<Double> electricityProfile = new LinkedList<Double>();
    public List<UaMonitoredItem> itemsHeat;
    public List<UaMonitoredItem> itemsElectricity;

    public ClientConsumer(BasicClient client, NodeId nodeIdHeat, NodeId nodeIdElectricity, int port) {
	super(port);
	this.client = client;

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
		heatProfile.add((Double) value.getValue().getValue());
		System.out.println("New heatProfileProfile" + heatProfile);
	    } else {
		System.out.println("Value " + value + " is not in double format");
	    }
	    System.out.format("%s -> %s%n", item, value);
	};

	BiConsumer<UaMonitoredItem, DataValue> consumerElectricity = (item, value) -> {
	    Variant var = value.getValue();
	    if (var.getValue() instanceof Double) {
		electricityProfile.add((Double) value.getValue().getValue());
		System.out.println("New electricityProfile" + electricityProfile);
	    } else {
		System.out.println("Value " + value + " is not in double format");
	    }
	    System.out.format("%s -> %s%n", item, value);
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
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }

    @Override
    public List<Double> getHeatProfile(int timeStep, int mpcHorizon) {
	return heatProfile;
    }

    @Override
    public List<Double> getElectricityProfile(int timeStep, int mpcHorizon) {
	return electricityProfile;
    }

}
