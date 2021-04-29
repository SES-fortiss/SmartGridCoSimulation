package memap.components;

import static org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.Unsigned.uint;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.QualifiedName;
import org.eclipse.milo.opcua.sdk.client.api.subscriptions.UaMonitoredItem;
import org.eclipse.milo.opcua.sdk.client.api.subscriptions.UaSubscription;
import org.eclipse.milo.opcua.stack.core.AttributeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.DataValue;
import org.eclipse.milo.opcua.stack.core.types.builtin.Variant;
import org.eclipse.milo.opcua.stack.core.types.enumerated.MonitoringMode;
import org.eclipse.milo.opcua.stack.core.types.enumerated.TimestampsToReturn;
import org.eclipse.milo.opcua.stack.core.types.structured.MonitoredItemCreateRequest;
import org.eclipse.milo.opcua.stack.core.types.structured.MonitoringParameters;
import org.eclipse.milo.opcua.stack.core.types.structured.ReadValueId;

import memap.components.prototypes.Coupler;
import memap.controller.TopologyController;
import memap.helperOPCua.BasicClient;
import memap.messages.extension.NetworkType;
import memap.messages.OptimizationResultMessage;

public class ClientCoupler extends Coupler {
	
	NetworkType primaryNetwork;
	NetworkType secondaryNetwork;
	double opCost;
	public Double opCostFC[] = new Double[topologyConfig.getNrStepsMPC()];;
	double costCO2;
	public double[] costCO2Array = new double[topologyConfig.getNrStepsMPC()];
	
	public BasicClient client;
	public NodeId setpointId;
	public NodeId setpointsId;
	
	public List<UaMonitoredItem> itemsCost;
	
	/**
	 * @param client
	 * @param name             coupler name
	 * @param minPower         coupler minimum power [kW]
	 * @param maxPower         coupler maximum power [kW]	 * @param effHeatId        heat efficiency [-1, 10]
	 * @param effElecId        electricity efficiency [-1, 10]
	 * @param primaryNetwork
	 * @param secondaryNetwork
	 * @param opCostId         optimization cost [EUR]
	 * @param costCO2Id        CO2 cost [kg CO2/kWh]
	 * @param port
	 * @param setpointIds
	 */
	public ClientCoupler(BasicClient client, 
			String name, 
			NodeId nodeIdPrimSector, 
			NodeId nodeIdSecSector, 
			NodeId minPowerId, 
			NodeId maxPowerId, 
			NodeId effHeatId, 
			NodeId effElecId,
			NodeId opCostId,
			NodeId priceFCId,
			NodeId costCO2Id, 
			NodeId setpointsId, 
			NodeId setpointId, 
			int port) 
			throws InterruptedException, ExecutionException {
		super(name, client.readFinalDoubleValue(minPowerId), client.readFinalDoubleValue(maxPowerId), client.readFinalDoubleValue(effHeatId),
				client.readFinalDoubleValue(effElecId), port);
		
		this.client = client;
		this.setpointId = setpointId;
		this.setpointsId = setpointsId;
		this.primaryNetwork = this.setNetworkType(client, nodeIdPrimSector);
		this.secondaryNetwork = this.setNetworkType(client, nodeIdSecSector);
		
		
		if (client.readValue(Integer.MAX_VALUE, TimestampsToReturn.Neither, costCO2Id).getValue().getValue().getClass().isArray()) {
			this.costCO2Array = client.readFinalDoubleArrayValue(costCO2Id);
			this.costCO2 = costCO2Array[0];
		} else {
			this.costCO2 = client.readFinalDoubleValue(costCO2Id);
			Arrays.fill(costCO2Array, costCO2);
		}		
		
		// subscription if array with price forecast is available at the EMS 
		if (client.readValue(Integer.MAX_VALUE, TimestampsToReturn.Neither, priceFCId).getValue().getValue().getClass().isArray()) {
			
			System.out.println("Coupler price is forecast array.");
			
			// Subscription to variable primary energy costs
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

			this.opCost = opCostFC[0];
			
		} else {
			this.opCost = client.readFinalDoubleValue(priceFCId);
			Arrays.fill(opCostFC, opCost);
		}
		
	}

	@Override
	public void makeDecision() {
		super.makeDecision();
		couplerMessage.name = actorName;
		couplerMessage.id = fullActorPath;
		couplerMessage.primaryNetwork = primaryNetwork;
		couplerMessage.secondaryNetwork = secondaryNetwork;
		couplerMessage.operationalCostEUR = opCost;
		couplerMessage.varOperationalCostEUR = Stream.of(opCostFC).mapToDouble(Double::doubleValue).toArray();
		couplerMessage.operationalCostCO2 = costCO2;
		couplerMessage.efficiencyElec = efficiencyElec;
		couplerMessage.efficiencyHeat = efficiencyHeat;
		couplerMessage.minPower = minPower;
		couplerMessage.maxPower = maxPower;

		super.updateDisplay(couplerMessage);
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
					
					// If available: write setpoint array to EMS (length = mpc)
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
