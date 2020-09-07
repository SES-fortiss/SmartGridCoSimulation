package memap.components;

import java.util.concurrent.ExecutionException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.DataValue;
import org.eclipse.milo.opcua.stack.core.types.builtin.Variant;

import com.google.common.collect.ImmutableList;
import memap.components.prototypes.Coupler;
import memap.controller.TopologyController;
import memap.helperOPCua.BasicClient;
import memap.messages.extension.NetworkType;
import memap.main.TopologyConfig;
import memap.messages.OptimizationResultMessage;

public class ClientCoupler extends Coupler {
	
	NetworkType primaryNetwork;
	NetworkType secondaryNetwork;
	double opCost;
	double costCO2;
	
	public BasicClient client;
	public List<NodeId> setpointIds = new ArrayList<NodeId>();
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
	public ClientCoupler(BasicClient client, String name, NodeId nodeIdPrimSector, NodeId nodeIdSecSector, NodeId minPowerId, NodeId maxPowerId, NodeId effHeatId, NodeId effElecId,
			NodeId opCostId, NodeId costCO2Id, List<NodeId> setpointIds, int port) throws InterruptedException, ExecutionException {
		super(name, client.readFinalDoubleValue(minPowerId), client.readFinalDoubleValue(maxPowerId), client.readFinalDoubleValue(effHeatId),
				client.readFinalDoubleValue(effElecId), port);
		
		this.client = client;
		this.setpointIds = setpointIds;
		this.primaryNetwork = this.setNetworkType(client, nodeIdPrimSector);
		this.secondaryNetwork = this.setNetworkType(client, nodeIdSecSector);
		//primaryNetwork = setNetworkType(client, nodeIdPrimSector);
		//secondaryNetwork = setNetworkType(client, nodeIdSecSector);
		this.opCost = client.readFinalDoubleValue(opCostId);
		this.costCO2 = client.readFinalDoubleValue(costCO2Id);
	}

	@Override
	public void makeDecision() {
		super.makeDecision();
		couplerMessage.name = actorName;
		couplerMessage.id = fullActorPath;
		couplerMessage.primaryNetwork = primaryNetwork;
		couplerMessage.secondaryNetwork = secondaryNetwork;
		couplerMessage.operationalCostEUR = opCost;
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
					for (int i = 0; i < TopologyConfig.getInstance().getNrStepsMPC(); i++) {
						DataValue data = new DataValue(new Variant(optimizationAdvice[i]), null, null);					
						client.writeValue(setpointIds.get(i), data);
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
