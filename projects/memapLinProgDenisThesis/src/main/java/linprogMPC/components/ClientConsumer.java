package linprogMPC.components;

import static org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.Unsigned.uint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.function.BiConsumer;

import org.apache.commons.collections4.queue.CircularFifoQueue;
import org.eclipse.milo.opcua.sdk.client.api.subscriptions.UaMonitoredItem;
import org.eclipse.milo.opcua.sdk.client.api.subscriptions.UaSubscription;
import org.eclipse.milo.opcua.stack.core.AttributeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.DataValue;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.QualifiedName;
import org.eclipse.milo.opcua.stack.core.types.builtin.Variant;
import org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.UByte;
import org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.UInteger;
import org.eclipse.milo.opcua.stack.core.types.enumerated.MonitoringMode;
import org.eclipse.milo.opcua.stack.core.types.enumerated.TimestampsToReturn;
import org.eclipse.milo.opcua.stack.core.types.structured.MonitoredItemCreateRequest;
import org.eclipse.milo.opcua.stack.core.types.structured.MonitoringParameters;
import org.eclipse.milo.opcua.stack.core.types.structured.ReadValueId;

import akka.systemActors.GlobalTime;
import linprogMPC.helperOPCua.BasicClient;
import linprogMPC.messages.extension.NetworkType;

public class ClientConsumer extends Consumer {
    public BasicClient client;
    public NodeId nodeId;
    public CircularFifoQueue<Double> heatProfile = new CircularFifoQueue<Double>(Collections.nCopies(nStepsMPC, 0.0));
    public CircularFifoQueue<Double> electricityProfile = new CircularFifoQueue<Double>(
	    Collections.nCopies(nStepsMPC, 0.0));
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
		heatProfile.add(Math.abs((Double) value.getValue().getValue()));
		// System.out.println("New heatProfileProfile" + heatProfile);
	    } else {
		System.out.println("Value " + value + " is not in double format");
	    }
	    // System.out.format("%s -> %s%n", item, value);
	};

	BiConsumer<UaMonitoredItem, DataValue> consumerElectricity = (item, value) -> {
	    Variant var = value.getValue();
	    if (var.getValue() instanceof Double) {
		electricityProfile.add(Math.abs((Double) value.getValue().getValue()));
		// System.out.println("New electricityProfile" + electricityProfile);
	    } else {
		System.out.println("Value " + value + " is not in double format");
	    }
	    // System.out.format("%s -> %s%n", item, value);
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
//	    subscriptionHeat = client.getSubscriptionManager().createSubscription(1000.0, UInteger.valueOf(5), UInteger.valueOf(1), UInteger.valueOf(2000), true, UByte.valueOf(1)).get();
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
    public void makeDecision() {
	double[] demandVectorB = new double[2 * nStepsMPC];
	int cts = GlobalTime.getCurrentTimeStep();
	// Getting the HeatProfiles at the current timestep with predictions
	List<Double> currentHeatProfile = getHeatProfile(cts, nStepsMPC);
//	System.out.println("Hier Steht das Profil:"+currentHeatProfile.toString()+"Und hier der Zeitpunkt"+cts);
	List<Double> currentElectricityProfile = getElectricityProfile(cts, nStepsMPC);
	// Creating demand vector
	for (int i = 0; i < nStepsMPC; i++) {
	    // ToDo: Why / 60 ?
	    try {
		demandVectorB[i] = -currentHeatProfile.get(0 + i) / 60;
		demandVectorB[nStepsMPC + i] = -currentElectricityProfile.get(0 + i) / 60;
	    } catch (Exception e) {
		e.printStackTrace();
	    }

	}

	consumptionMessage.setDemandVector(demandVectorB);
	consumptionMessage.networkType = NetworkType.DEMANDWITHBOTH;
	consumptionMessage.name = this.actorName;
	consumptionMessage.id = this.fullActorPath;
	consumptionMessage.forecastType = "Profile";
	consumptionMessage.optimizationCriteria = "Price";

	super.updateDisplay(consumptionMessage);
    }

    @Override
    public List<Double> getHeatProfile(int timeStep, int mpcHorizon) {
	return new ArrayList<Double>(heatProfile);
    }

    @Override
    public List<Double> getElectricityProfile(int timeStep, int mpcHorizon) {
	return new ArrayList<Double>(electricityProfile);
    }

}
