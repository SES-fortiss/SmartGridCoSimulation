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
import memap.messages.OptimizationResultMessage;
import memap.messages.extension.NetworkType;

public class ClientDemand extends Consumer implements CurrentTimeStepSubscriber {
	
	NetworkType networkType;
	/** Current time step */
	private int currentTimeStep;
	public BasicClient client;
	public NodeId nodeId;
	public NodeId setpointsGridBuyId; 
	public NodeId setpointGridBuyId;
	public NodeId setpointsGridSellId;
	public NodeId setpointGridSellId;
	
	double buyPrice;
	double sellPrice;
	
	/** Consumption profile values */
	public Double consumptionProfile[];
	public Double networkBuyCostFC[] = new Double[topologyConfig.getNrStepsMPC()];
	public Double networkSellCostFC[] = new Double[topologyConfig.getNrStepsMPC()];
	public Double networkBuyCapFC[] = new Double[topologyConfig.getNrStepsMPC()];
	
	public double[] optimizationAdviceBuy;
	public double[] optimizationAdviceSell;

	public List<UaMonitoredItem> itemsDemand;

	boolean priceIsArray = false;
	boolean forecastIsArray = false;
	
	
	/**
	 * @param client
	 * @param name              consumer name
	 * @param nodeIdHeat        heat consumption profile values
	 * @param nodeIdElectricity electricity consumption profile values
	 * @param demandSetpointId 
	 * @param jsonForecastId 
	 * @param port
	 */

	public ClientDemand(BasicClient client, 
			String name, 
			NodeId nodeIdSector, 
			NodeId nodeIdConsumption, 
			NodeId arrayDemandForecastId, 
			NodeId buyPriceId, 
			NodeId sellPriceId,
			NodeId setpointsGridBuyId, 
			NodeId setpointGridBuyId, 
			NodeId setpointsGridSellId, 
			NodeId setpointGridSellId,  
			int port) {
		super(name, port);
		
		this.client = client;
		this.setpointGridBuyId = setpointGridBuyId;
		this.setpointGridSellId = setpointGridSellId;
		
		if (nodeIdSector.equals(nodeIdSector)) {
			networkType = NetworkType.HEAT;
		} else {
			networkType = setNetworkType(client, nodeIdSector);
		}
		
		// nodeIdConsumption (= current demand) is not needed at the moment
		// (because it is assumed that forecast is perfect). 
		
		// monitoring parameters
		int clientHandle = 1543453; // just random numbers
		
		// TODO: Improve integration of OPC UA Subscriptions of multiple variables

		try {
			if ((client.readValue(Integer.MAX_VALUE, TimestampsToReturn.Neither, buyPriceId).getValue().getValue().getClass().isArray()) 
			&& (client.readValue(Integer.MAX_VALUE, TimestampsToReturn.Neither, sellPriceId).getValue().getValue().getClass().isArray())) {
				priceIsArray = true;
				System.out.println("   . Price for network " + this.networkType + " is an Array.");
			}
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ExecutionException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
			
		if (priceIsArray) {
			Arrays.fill(networkBuyCostFC, 0.0);
			
			ReadValueId readValueIdBuyPrices = new ReadValueId(buyPriceId, AttributeId.Value.uid(), null,
					QualifiedName.NULL_VALUE);
			
			// Forecast	
			MonitoringParameters parametersBuyPrice = new MonitoringParameters(uint(clientHandle), 1000.0, null, uint(10),
					true);
			
			// creation request
			MonitoredItemCreateRequest requestBuyPrice = new MonitoredItemCreateRequest(readValueIdBuyPrices,
					MonitoringMode.Reporting, parametersBuyPrice);
			
			
			// The actual consumer. Methods on call are implemented here
			BiConsumer<UaMonitoredItem, DataValue> buyPriceFC = (item, value) -> {
				Variant var = value.getValue();
				if (var.getValue() instanceof Number[]) {
					networkBuyCostFC = (Double[]) var.getValue();
				} else {
					System.out.println("   . ERR: Value " + value + " is not in Number[] format");
				}
			};
			
			// setting the consumer after the subscription creation	
			BiConsumer<UaMonitoredItem, Integer> onItemCreatedBuyPrice = (monitoredItem, id) -> monitoredItem
					.setValueConsumer(buyPriceFC);
			
			// creating the subscriptions
			UaSubscription subscriptionBuyPrice;
			
			try {
				subscriptionBuyPrice = client.getSubscriptionManager().createSubscription(1000.0).get();
				itemsDemand = subscriptionBuyPrice
						.createMonitoredItems(TimestampsToReturn.Both, Arrays.asList(requestBuyPrice), onItemCreatedBuyPrice).get();

			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
			
			this.buyPrice = networkBuyCostFC[0];
			
		
			// SellPrice
			Arrays.fill(networkSellCostFC, 0.0);
	
	
			ReadValueId readValueIdSellPrices = new ReadValueId(sellPriceId, AttributeId.Value.uid(), null,
					QualifiedName.NULL_VALUE);
	
			// Forecast	
			MonitoringParameters parametersSellPrice = new MonitoringParameters(uint(clientHandle), 1000.0, null, uint(10),
					true);
	
			// creation request
			MonitoredItemCreateRequest requestSellPrice = new MonitoredItemCreateRequest(readValueIdSellPrices,
					MonitoringMode.Reporting, parametersSellPrice);
			
			// The actual consumer. Methods on call are implemented here
			BiConsumer<UaMonitoredItem, DataValue> sellPriceFC = (item, value) -> {
				Variant var = value.getValue();
				if (var.getValue() instanceof Number[]) {
					networkSellCostFC = (Double[]) var.getValue();
				} else {
					System.out.println("   . ERR: Value " + value + " is not in Number[] format");
				}
			};
	
			// setting the consumer after the subscription creation	
			BiConsumer<UaMonitoredItem, Integer> onItemCreatedSellPrice = (monitoredItem, id) -> monitoredItem
					.setValueConsumer(sellPriceFC);
	
			// creating the subscriptions
			UaSubscription subscriptionSellPrice;
			
			try {
				subscriptionSellPrice = client.getSubscriptionManager().createSubscription(1000.0).get();
				itemsDemand = subscriptionSellPrice
						.createMonitoredItems(TimestampsToReturn.Both, Arrays.asList(requestSellPrice), onItemCreatedSellPrice).get();
	
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
			
			this.sellPrice = networkSellCostFC[0];
		
		} else {
			System.out.println("   . Price for network " + this.networkType + " is single value.");
			
			try {
				buyPrice = client.readFinalDoubleValue(buyPriceId);
				sellPrice = client.readFinalDoubleValue(sellPriceId);
			} catch (InterruptedException e) {
				System.out.println("Cannot read buyprice or sellprice from Node " + buyPriceId.toString() + ", " + sellPriceId.toString());
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			System.out.println("prices are " + buyPrice + ", " + sellPrice);
			Arrays.fill(networkBuyCostFC, buyPrice);		
			Arrays.fill(networkSellCostFC, sellPrice);	
		}

		
		// Subscription for Demand

		try {
			if ((client.readValue(Integer.MAX_VALUE, TimestampsToReturn.Neither, arrayDemandForecastId).getValue().getValue().getClass().isArray()))
				forecastIsArray = true;
				System.out.println("   . Forecast " + this.networkType + " is no Array.");
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ExecutionException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		

		consumptionProfile = new Double[topologyConfig.getNrStepsMPC()];
		Arrays.fill(consumptionProfile, 0.0);
		
		// subscribe to the Value attribute of the server's CurrentTime node
		ReadValueId readValueIdConsumption = new ReadValueId(arrayDemandForecastId, AttributeId.Value.uid(), null,
				QualifiedName.NULL_VALUE);
		
		//Forecast
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
			} else if (!forecastIsArray) {
				// If only a single value is provided the "forecast" is assumed to be constant
				Arrays.fill(consumptionProfile, (Double) var.getValue());
			} else {
				System.out.println("Value " + value + " is not in Number[] format");
			}
		};
		
		// setting the consumer after the subscription creation
		BiConsumer<UaMonitoredItem, Integer> onItemCreatedDemand = (monitoredItem, id) -> monitoredItem
				.setValueConsumer(demand);
		
		// creating the subscriptions
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

		demandMessage.name = actorName;
		demandMessage.id = fullActorPath;
		demandMessage.setDemandVector(demandVectorB);
		demandMessage.forecastType = "Profile";
		demandMessage.networkType = networkType;
		demandMessage.varNetworkBuyCostEUR = Stream.of(networkBuyCostFC).mapToDouble(Double::doubleValue).toArray();
		demandMessage.varNetworkSellCostEUR = Stream.of(networkSellCostFC).mapToDouble(Double::doubleValue).toArray();
		super.updateDisplay(demandMessage);
	}
	
	@Override
	public void handleRequest() {
		if (requestContentReceived instanceof OptimizationResultMessage) {
			OptimizationResultMessage optResult = ((OptimizationResultMessage) requestContentReceived);
			for (String key : optResult.resultMap.keySet()) {
				if ((key.equals("ElecBuy")) && (this.networkType == NetworkType.ELECTRICITY)) {
					optimizationAdviceBuy = optResult.resultMap.get(key);
					DataValue singlevalueBuySetpoint = new DataValue(new Variant(optimizationAdviceBuy[0]), null, null);
					client.writeValue(setpointGridBuyId, singlevalueBuySetpoint);
					try {
						if (client.readValue(Integer.MAX_VALUE, TimestampsToReturn.Neither, setpointsGridBuyId).getValue().getValue().getClass().isArray()) {
							DataValue data = new DataValue(new Variant(optimizationAdviceBuy), null, null);
							client.writeValue(setpointsGridBuyId, data);
						}
					} catch (InterruptedException | ExecutionException e) {
						e.printStackTrace();
					}		
				}
				
				if ((key.equals("ElecSell")) && (this.networkType == NetworkType.ELECTRICITY)) {
					optimizationAdviceSell = optResult.resultMap.get(key);
					DataValue singlevalueSellSetpoint = new DataValue(new Variant(optimizationAdviceSell[0]), null, null);
					client.writeValue(setpointGridSellId, singlevalueSellSetpoint);
					try {
						if (client.readValue(Integer.MAX_VALUE, TimestampsToReturn.Neither, setpointsGridSellId).getValue().getValue().getClass().isArray()) {
							DataValue data = new DataValue(new Variant(optimizationAdviceSell), null, null);
							client.writeValue(setpointsGridSellId, data);
						}
					} catch (InterruptedException | ExecutionException e) {
						e.printStackTrace();
					}
				}
			}
		}
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
