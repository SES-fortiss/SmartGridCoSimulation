package memap.components;

import static org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.Unsigned.uint;

import java.util.ArrayList;
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

import akka.timeManagement.CurrentTimeStepSubscriber;
import memap.components.prototypes.Consumer;
import memap.controller.TopologyController;
import memap.helperOPCua.BasicClient;
import memap.messages.extension.NetworkType;

public class ClientDemand extends Consumer implements CurrentTimeStepSubscriber {
	
	NetworkType networkType;
	/** Current time step */
	private int currentTimeStep;
	public BasicClient client;
	public NodeId nodeId;
	/** Consumption profile values */
	public Double consumptionProfile[];
	public Double networkCostFC[];

	public List<UaMonitoredItem> itemsDemand;

	
	
	/**
	 * @param client
	 * @param name              consumer name
	 * @param nodeIdHeat        heat consumption profile values
	 * @param nodeIdElectricity electricity consumption profile values
	 * @param demandSetpointId 
	 * @param jsonForecastId 
	 * @param port
	 */

	public ClientDemand(BasicClient client, String name, NodeId nodeIdSector, NodeId nodeIdConsumption, 
			NodeId arrayDemandForecastId, NodeId arrayPriceForecastId, int port) {
		super(name, port);
		this.client = client;
		networkType = setNetworkType(client, nodeIdSector);
		// TODO: nodeIdConsumption (= current demand) is not needed at the moment
		// because it is assumed that forecast is perfect. 
		
		
		// Initialization delayed until after topologyConfig initialization
		networkCostFC = new Double[topologyConfig.getNrStepsMPC()];
		Arrays.fill(networkCostFC, 0.0);
		
		consumptionProfile = new Double[topologyConfig.getNrStepsMPC()];
		Arrays.fill(consumptionProfile, 0.0);
		
		// subscribe to the Value attribute of the server's CurrentTime node
		ReadValueId readValueIdConsumption = new ReadValueId(arrayDemandForecastId, AttributeId.Value.uid(), null,
				QualifiedName.NULL_VALUE);
		
		ReadValueId readValueIdPrices = new ReadValueId(arrayPriceForecastId, AttributeId.Value.uid(), null,
				QualifiedName.NULL_VALUE);

		// monitoring parameters
		int clientHandle = 1543453; // just random numbers

		// Forecast		
		MonitoringParameters parametersDemand = new MonitoringParameters(uint(clientHandle), 1000.0, null, uint(10),
				true);
		MonitoringParameters parametersPrice = new MonitoringParameters(uint(clientHandle), 1000.0, null, uint(10),
				true);


		// creation request
		MonitoredItemCreateRequest requestDemand = new MonitoredItemCreateRequest(readValueIdConsumption,
				MonitoringMode.Reporting, parametersDemand);
		MonitoredItemCreateRequest requestPrice = new MonitoredItemCreateRequest(readValueIdPrices,
				MonitoringMode.Reporting, parametersPrice);
		
		
		// The actual consumer. Methods on call are implemented here
		BiConsumer<UaMonitoredItem, DataValue> demand = (item, value) -> {
			Variant var = value.getValue();
			if (var.getValue() instanceof Number[]) {
				consumptionProfile = (Double[]) var.getValue();
			} else {
				System.out.println("Value " + value + " is not in Number[] format");
			}
		};
		
		// The actual consumer. Methods on call are implemented here
		BiConsumer<UaMonitoredItem, DataValue> priceFC = (item, value) -> {
			Variant var = value.getValue();
			if (var.getValue() instanceof Number[]) {
				networkCostFC = (Double[]) var.getValue();
			} else {
				System.out.println("Value " + value + " is not in Number[] format");
			}
		};

		// setting the consumer after the subscription creation
		BiConsumer<UaMonitoredItem, Integer> onItemCreatedDemand = (monitoredItem, id) -> monitoredItem
				.setValueConsumer(demand);
		
		BiConsumer<UaMonitoredItem, Integer> onItemCreatedPrice = (monitoredItem, id) -> monitoredItem
				.setValueConsumer(priceFC);

		// creating the subscriptions
		UaSubscription subscriptionDemand;
		UaSubscription subscriptionPrice;


		try {
			subscriptionDemand = client.getSubscriptionManager().createSubscription(1000.0).get();
			itemsDemand = subscriptionDemand
					.createMonitoredItems(TimestampsToReturn.Both, Arrays.asList(requestDemand), onItemCreatedDemand).get();

		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		
		try {
			subscriptionPrice = client.getSubscriptionManager().createSubscription(1000.0).get();
			itemsDemand = subscriptionPrice
					.createMonitoredItems(TimestampsToReturn.Both, Arrays.asList(requestPrice), onItemCreatedPrice).get();

		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}


	@Override
	public void makeDecision() {
		int nStepsMPC = topologyConfig.getNrStepsMPC();
		double[] demandVectorB = new double[nStepsMPC];
		int cts = currentTimeStep;
		
		List<Double>  currentConsumptionProfile = null;
		// Getting the sector-dependent ConsumptionProfiles at the current time step with predictions
		// TODO: change to single method getConsumptionProfiles in Consumer Super-Class
		if (networkType == NetworkType.HEAT) {
			currentConsumptionProfile = getHeatProfile(cts, nStepsMPC);
		} else if (networkType == NetworkType.ELECTRICITY) {
			currentConsumptionProfile = getElectricityProfile(cts, nStepsMPC);
		}
		
		// Creating demand vector
		for (int i = 0; i < nStepsMPC; i++) {
			try {
				demandVectorB[i] = -currentConsumptionProfile.get(0 + i);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		demandMessage.name = actorName;
		demandMessage.id = fullActorPath;
		demandMessage.setDemandVector(demandVectorB);
		demandMessage.forecastType = "Profile";
		demandMessage.networkType = networkType;
		// TODO: Include Subscription to price forecast if datapoint is availible and =! null
		demandMessage.varNetworkCostEUR = Stream.of(networkCostFC).mapToDouble(Double::doubleValue).toArray();

		super.updateDisplay(demandMessage);
	}


	@Override
	public List<Double> getHeatProfile(int timeStep, int mpcHorizon) {
		return new ArrayList<Double>(Arrays.asList(consumptionProfile));
	}

	@Override
	public List<Double> getElectricityProfile(int timeStep, int mpcHorizon) {
		return new ArrayList<Double>(Arrays.asList(consumptionProfile));
	}
	
	/** Passes a reference of an object of class {@link TopologyController} to the parent class */
	@Override
	public void setTopologyController(TopologyController topologyController) {
		super.setTopologyController(topologyController);
		topologyController.subscribeToCurrentTimeStep(this);
	}

	@Override
	public void update(int currentTimeStep) {
		this.currentTimeStep = currentTimeStep;
	}

	@Override
	public NetworkType setNetworkType(BasicClient client, NodeId nodeIdSector) {
		return super.setNetworkType(client, nodeIdSector);
	}
	
	
}
