package memap.components;

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

import akka.basicMessages.RequestContent;
import akka.timeManagement.CurrentTimeStepSubscriber;
import memap.components.prototypes.Consumer;
import memap.controller.TopologyController;
import memap.helperOPCua.BasicClient;
import memap.messages.extension.NetworkType;

public class ClientDemand extends Consumer implements CurrentTimeStepSubscriber {
	
	/** Current time step */
	private int currentTimeStep;
	public BasicClient client;
	public NodeId nodeId;
	public NodeId triggerId;
	double trigger;
	/** Consumption profile values */
	public Double consumptionProfile[];

	public List<UaMonitoredItem> itemsDemand;

	public final NetworkType networkType;
	
	/**
	 * @param client
	 * @param name              consumer name
	 * @param nodeIdHeat        heat consumption profile values
	 * @param nodeIdElectricity electricity consumption profile values
	 * @param demandSetpointId 
	 * @param jsonForecastId 
	 * @param port
	 */

	public ClientDemand(BasicClient client, String name, NodeId triggerId, NodeId nodeIdSector, NodeId nodeIdConsumption, NodeId arrayForecastId, NodeId demandSetpointId, int port) {
		super(name, port);
		this.client = client;
		this.triggerId = triggerId;
		networkType = setNetworkType(client, nodeIdSector);
		
		
		
		// Initialization delayed until after topologyConfig initialization
		
		consumptionProfile = new Double[topologyConfig.getNrStepsMPC()];
		Arrays.fill(consumptionProfile, 0.0);
		
		// subscribe to the Value attribute of the server's CurrentTime node
		ReadValueId readValueIdConsumption = new ReadValueId(arrayForecastId, AttributeId.Value.uid(), null,
				QualifiedName.NULL_VALUE);

		// monitoring parameters
		int clientHandle = 1543453; // just random numbers

		// Forecast		
		MonitoringParameters parametersDemand = new MonitoringParameters(uint(clientHandle), 1000.0, null, uint(10),
				true);


		// creation request
		MonitoredItemCreateRequest requestDemand = new MonitoredItemCreateRequest(readValueIdConsumption,
				MonitoringMode.Reporting, parametersDemand);
		
		
		// The actual consumer. Methods on call are implemented here
		BiConsumer<UaMonitoredItem, DataValue> demand = (item, value) -> {
			Variant var = value.getValue();
			if (var.getValue() instanceof Number[]) {
				consumptionProfile = (Double[]) var.getValue();
//				Arrays.fill(consumptionProfile, (Math.abs((double[]) value.getValue().getValue())));
//				System.out.println("Consumption value " + value + " was read: " + consumptionProfile[0]);
			} else {
				System.out.println("Value " + value + " is not in Number[] format");
			}
		};

		// setting the consumer after the subscription creation
		BiConsumer<UaMonitoredItem, Integer> onItemCreatedDemand = (monitoredItem, id) -> monitoredItem
				.setValueConsumer(demand);

		// creating the subscription
		UaSubscription subscriptionDemand;


		try {
			subscriptionDemand = client.getSubscriptionManager().createSubscription(1000.0).get();
			itemsDemand = subscriptionDemand
					.createMonitoredItems(TimestampsToReturn.Both, Arrays.asList(requestDemand), onItemCreatedDemand).get();

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

		consumptionMessage.name = actorName;
		consumptionMessage.id = fullActorPath;
		consumptionMessage.setDemandVector(demandVectorB);
		consumptionMessage.forecastType = "Profile";
		consumptionMessage.networkType = networkType;

		super.updateDisplay(consumptionMessage);
	}
	
	
	
	
	@Override
	public void handleRequest() {
		
		try {
			this.trigger = client.readFinalDoubleValue(triggerId);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ExecutionException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		// CoSES: Trigger should be increased only once
		if (this.networkType == NetworkType.HEAT) {
			trigger++;
			
			DataValue newTrigger = new DataValue(new Variant(trigger), null, null);
			client.writeValue(triggerId, newTrigger);
			System.out.println("Trigger written: " + trigger);
		}
		
//		double tr = trigger;
//		while (tr ==  trigger) {
//			try {
//				tr = client.readFinalDoubleValue(this.triggerId);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (ExecutionException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		trigger = tr;
//		try {
//			Thread.sleep(1500);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
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
