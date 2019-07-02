package linprogMPC.components;

import static org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.Unsigned.uint;

import java.util.Arrays;
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
import org.eclipse.milo.opcua.stack.core.types.enumerated.MonitoringMode;
import org.eclipse.milo.opcua.stack.core.types.enumerated.TimestampsToReturn;
import org.eclipse.milo.opcua.stack.core.types.structured.MonitoredItemCreateRequest;
import org.eclipse.milo.opcua.stack.core.types.structured.MonitoringParameters;
import org.eclipse.milo.opcua.stack.core.types.structured.ReadValueId;

import akka.basicMessages.AnswerContent;
import linprogMPC.components.prototypes.Producer;
import linprogMPC.helperOPCua.BasicClient;
import linprogMPC.messages.extension.NetworkType;
import linprogMPC.messages.planning.VolatileProducerMessage;

public class ClientVolatileProducer extends Producer {

	static double eff = 1.0;
	public NetworkType networkType;
	VolatileProducerMessage volatileProducerMessage;
	public CircularFifoQueue<Double> productionProfile = new CircularFifoQueue<Double>(nStepsMPC);
	public List<UaMonitoredItem> itemsProduction;

	public ClientVolatileProducer(BasicClient client, NodeId installedPowerId, NodeId effId, NodeId currentProductionId,
			NetworkType networkType, int port) throws InterruptedException, ExecutionException {

		super(client.readFinalDoubleValue(installedPowerId), client.readFinalDoubleValue(effId), port);

		this.volatileProducerMessage = new VolatileProducerMessage();
		this.networkType = networkType;

		// subscribe to the Value attribute of the server's CurrentTime node
		ReadValueId readProductionId = new ReadValueId(currentProductionId, AttributeId.Value.uid(), null,
				QualifiedName.NULL_VALUE);

		// monitoring parameters
		int clientHandleProduction = 1543453; // just random numbers

		MonitoringParameters parametersProduction = new MonitoringParameters(uint(clientHandleProduction), 1000.0, null,
				uint(10), true);

		// creation request
		MonitoredItemCreateRequest requestProduction = new MonitoredItemCreateRequest(readProductionId,
				MonitoringMode.Reporting, parametersProduction);

		// The actual consumer. Methods on call are implemented here
		BiConsumer<UaMonitoredItem, DataValue> volatileProducerProduction = (item, value) -> {
			Variant var = value.getValue();
			if (var.getValue() instanceof Double) {
				productionProfile.add((Double) value.getValue().getValue());
				// System.out.println("New productionProfile" + productionProfile);
			} else {
				System.out.println("Value " + value + " is not in double format");
			}
			// System.out.format("%s -> %s%n", item, value);
		};

		// setting the consumer after the subscription creation
		BiConsumer<UaMonitoredItem, Integer> onItemCreatedProduction = (monitoredItem, id) -> monitoredItem
				.setValueConsumer(volatileProducerProduction);

		// creating the subscription
		UaSubscription subscriptionProduction;

		try {
			subscriptionProduction = client.getSubscriptionManager().createSubscription(1000.0).get();
			itemsProduction = subscriptionProduction.createMonitoredItems(TimestampsToReturn.Both,
					Arrays.asList(requestProduction), onItemCreatedProduction).get();

			subscriptionProduction = client.getSubscriptionManager().createSubscription(1000.0).get();
			itemsProduction = subscriptionProduction.createMonitoredItems(TimestampsToReturn.Both,
					Arrays.asList(requestProduction), onItemCreatedProduction).get();
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void makeDecision() {
		volatileProducerMessage.name = this.actorName;
		volatileProducerMessage.id = this.fullActorPath;
		volatileProducerMessage.operationalPriceEURO = 0.00001;
		volatileProducerMessage.efficiency = efficiency;
		volatileProducerMessage.installedPower = installedPower;
		volatileProducerMessage.networkType = networkType;
		volatileProducerMessage.forecast = productionProfile.stream().mapToDouble(Double::doubleValue).toArray();
	}

	@Override
	public AnswerContent returnAnswerContentToSend() {
		return volatileProducerMessage;
	}

}
