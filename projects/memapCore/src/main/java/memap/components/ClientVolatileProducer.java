package memap.components;

import static org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.Unsigned.uint;

import java.util.Arrays;
import java.util.ArrayList;
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
import memap.components.prototypes.Producer;
import memap.controller.TopologyController;
import memap.helperOPCua.BasicClient;
import memap.main.TopologyConfig;
import memap.messages.OptimizationResultMessage;
import memap.messages.extension.NetworkType;
import memap.messages.planning.VolatileProducerMessage;


public class ClientVolatileProducer extends Producer {
	
	public double productionProfile[];
	public List<UaMonitoredItem> itemsProduction;
	public NetworkType networkType;
	double opCost;
	double costCO2;
	public BasicClient client;

	VolatileProducerMessage volatileProducerMessage;

	/**
	 * @param client
	 * @param name                volatile producer name
	 * @param minPower            volatile minimum power [kW]
	 * @param maxPower            volatile maximum power [kW]
	 * @param effId               efficiency [0-1]
	 * @param currentProductionId current production
	 * @param networkType
	 * @param opCostId            optimization cost [EUR]
	 * @param costCO2Id           CO2 cost [kg CO2/kWh]
	 * @param port
	 */
	public ClientVolatileProducer(BasicClient client, String name,  NodeId nodeIdSector, NodeId maxPowerId,
			NodeId currentProductionId, NodeId opCostId, NodeId costCO2Id, int port)
			throws InterruptedException, ExecutionException {
		super(name, 0.0, client.readFinalDoubleValue(maxPowerId),
				1.0, port);

		volatileProducerMessage = new VolatileProducerMessage();
		this.client = client;
		this.networkType = setNetworkType(client, nodeIdSector);
		this.opCost = client.readFinalDoubleValue(opCostId);
		this.costCO2 = client.readFinalDoubleValue(costCO2Id);
		
		// Initialization delayed until after topologyConfig initialization
		productionProfile = new double[topologyConfig.getNrStepsMPC()];

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
				Arrays.fill(productionProfile, (Math.abs((Double) value.getValue().getValue())));
			} else {
				System.out.println("Value " + value + " is not in double format");
			}
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
			e.printStackTrace();
		}
	}

	@Override
	public void makeDecision() {
		volatileProducerMessage.id = fullActorPath;
		volatileProducerMessage.name = actorName;
		volatileProducerMessage.minPower = minPower;
		volatileProducerMessage.maxPower = maxPower;
		volatileProducerMessage.operationalCostEUR = opCost;
		volatileProducerMessage.operationalCostCO2 = costCO2;
		volatileProducerMessage.efficiency = efficiency;
		volatileProducerMessage.networkType = networkType;
		volatileProducerMessage.forecast = productionProfile;
	}
	
	@Override
	public void handleRequest() {
//		if (requestContentReceived instanceof OptimizationResultMessage) {
//			OptimizationResultMessage optResult = ((OptimizationResultMessage) requestContentReceived);
//			for (String key : optResult.resultMap.keySet()) {
//				if (key.equals(actorName)) {
//					optimizationAdvice = optResult.resultMap.get(key);
//					for (int i = 0; i < TopologyConfig.getInstance().getNrStepsMPC(); i++) {
//						DataValue data = new DataValue(new Variant(optimizationAdvice[i]), null, null);					
//						client.writeValue(setpointIds.get(i), data);						
//					}			
//				}
//
//			}
//		}
	}

	@Override
	public AnswerContent returnAnswerContentToSend() {
		return volatileProducerMessage;
	}
	
	/** Passes a reference of an object of class {@link TopologyController} to the parent class */
	@Override
	public void setTopologyController(TopologyController topologyController) {
		super.setTopologyController(topologyController);
	}

	@Override
	public NetworkType setNetworkType(BasicClient client, NodeId nodeIdSector) {
		return super.setNetworkType(client, nodeIdSector);
	}
}
