package memap.components;


import static org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.Unsigned.uint;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

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

import memap.components.prototypes.Producer;
import memap.controller.TopologyController;
import memap.helperOPCua.BasicClient;
import memap.messages.OptimizationResultMessage;
import memap.messages.extension.NetworkType;

public class ClientProducer extends Producer {
	
	NetworkType networkType;
	public double opCost;
	public Double opCostFC[];
	public double costCO2;
	public BasicClient client;
	public NodeId setpointId;
	public NodeId setpointsId;
	
	public List<UaMonitoredItem> itemsCost;
	
	/**
	 * @param client
	 * @param name        producer name
	 * @param minPower    minimum power [kW]
	 * @param maxPower    maximum power [kW]
	 * @param effId       efficiency [0-1]
	 * @param networkType
	 * @param opCostId    optimization cost [EUR]
	 * @param costCO2Id   CO2 cost [kg CO2/kWh]
	 * @param setpointsId 
	 * @param port
	 */
	public ClientProducer(BasicClient client, String name, NodeId nodeIdSector, NodeId minPowerId, NodeId maxPowerId, NodeId effId, NodeId opCostId, NodeId priceFCId, NodeId costCO2Id, NodeId setpointsId,  NodeId setpointId, int port)
			throws InterruptedException, ExecutionException {
		super(name, client.readFinalDoubleValue(minPowerId), client.readFinalDoubleValue(maxPowerId),
				client.readFinalDoubleValue(effId), port);

		// TODO an in superclass device:
		this.client = client;		
		this.setpointId = setpointId;
		this.setpointsId = setpointsId;
		this.networkType = this.setNetworkType(client, nodeIdSector);
//		this.opCostArray = client.readFinalDoubleArrayValue(priceFCId);
//		this.opCost = client.readFinalDoubleValue(opCostId);
//		this.costCO2 = client.readFinalDoubleValue(costCO2Id);
		this.opCost = 0.0;
		this.costCO2 = 0.0;
		
		// Initialization delayed until after topologyConfig initialization
		
		opCostFC = new Double[topologyConfig.getNrStepsMPC()];
		Arrays.fill(opCostFC, 0.0);
		
		// subscribe to the Value attribute of the server's CurrentTime node
		ReadValueId readValueIdCostsFC = new ReadValueId(priceFCId, AttributeId.Value.uid(), null,
				QualifiedName.NULL_VALUE);

		// monitoring parameters
		int clientHandle = 1543453; // just random numbers

		// Forecast		
		MonitoringParameters parametersCost = new MonitoringParameters(uint(clientHandle), 1000.0, null, uint(10),
				true);


		// creation request
		MonitoredItemCreateRequest requestCost = new MonitoredItemCreateRequest(readValueIdCostsFC,
				MonitoringMode.Reporting, parametersCost);
		
		
		// The actual consumer. Methods on call are implemented here
		BiConsumer<UaMonitoredItem, DataValue> costs = (item, value) -> {
			Variant var = value.getValue();
			if (var.getValue() instanceof Number[]) {
				opCostFC = (Double[]) var.getValue();
			} else {
				System.out.println("Value " + value + " is not in Number[] format");
			}
		};

		// setting the consumer after the subscription creation
		BiConsumer<UaMonitoredItem, Integer> onItemCreatedCost = (monitoredItem, id) -> monitoredItem
				.setValueConsumer(costs);

		// creating the subscription
		UaSubscription subscriptionCost;


		try {
			subscriptionCost = client.getSubscriptionManager().createSubscription(1000.0).get();
			itemsCost = subscriptionCost
					.createMonitoredItems(TimestampsToReturn.Both, Arrays.asList(requestCost), onItemCreatedCost).get();

		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		
	}

	public void makeDecision() {
		producerMessage.id = fullActorPath;
		producerMessage.name = actorName;
		producerMessage.minPower = minPower;
		producerMessage.maxPower = maxPower;
		producerMessage.operationalCostEUR = opCost;
		producerMessage.varOperationalCostEUR = Stream.of(opCostFC).mapToDouble(Double::doubleValue).toArray();
		producerMessage.operationalCostCO2 = costCO2;
		producerMessage.efficiency = efficiency;
		producerMessage.networkType = networkType;
	}
	
	@Override
	public void handleRequest() {
		
		if (requestContentReceived instanceof OptimizationResultMessage) {
			
			OptimizationResultMessage optResult = ((OptimizationResultMessage) requestContentReceived);
			for (String key : optResult.resultMap.keySet()) {
				if (key.equals(actorName)) {
					optimizationAdvice = optResult.resultMap.get(key);
					
					// Write scalar setpoint to EMS (single value)
					DataValue singlevalueSetpoint = new DataValue(new Variant(optimizationAdvice[0]), null, null);
					client.writeValue(setpointId, singlevalueSetpoint);
					System.out.println("SP written: " + optimizationAdvice[0]);
					
					// If availible: write setpoint array to EMS (length = mpc)
					try {
						if (client.readValue(Integer.MAX_VALUE, TimestampsToReturn.Neither, setpointsId).getValue().getValue().getClass().isArray()) {
							DataValue data = new DataValue(new Variant(optimizationAdvice), null, null);
							client.writeValue(setpointsId, data);
							
						}
						
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ExecutionException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}	
				}
				
			}
		}

	}
	
	/** Passes a reference of an object of class {@link TopologyController} to the parent class */
	public void setTopologyController(TopologyController topologyController) {
		super.setTopologyController(topologyController);
	}
	

	@Override
	public NetworkType setNetworkType(BasicClient client, NodeId nodeIdSector) {
		return super.setNetworkType(client, nodeIdSector);
	}


}
