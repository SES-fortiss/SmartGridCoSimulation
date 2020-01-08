package memap.components;

import java.util.concurrent.ExecutionException;

import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;

import memap.components.prototypes.Coupler;
import memap.helperOPCua.BasicClient;
import memap.messages.extension.NetworkType;

public class ClientCoupler extends Coupler {
	NetworkType primaryNetwork;
	NetworkType secondaryNetwork;
	double opCost;
	double costCO2;

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
	 */
	public ClientCoupler(BasicClient client, String name, NodeId minPowerId, NodeId maxPowerId, NodeId effHeatId, NodeId effElecId,
			NetworkType primaryNetwork, NetworkType secondaryNetwork, NodeId opCostId, NodeId costCO2Id, int port) throws InterruptedException, ExecutionException {
		super(name, client.readFinalDoubleValue(minPowerId), client.readFinalDoubleValue(maxPowerId), client.readFinalDoubleValue(effHeatId),
				client.readFinalDoubleValue(effElecId), port);
		
		this.primaryNetwork = primaryNetwork;
		this.secondaryNetwork = secondaryNetwork;
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
}
