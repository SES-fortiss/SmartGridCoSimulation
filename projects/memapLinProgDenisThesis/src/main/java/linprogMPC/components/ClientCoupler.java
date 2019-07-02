package linprogMPC.components;

import java.util.concurrent.ExecutionException;

import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;

import linprogMPC.components.prototypes.Coupler;
import linprogMPC.helper.EnergyPrices;
import linprogMPC.helperOPCua.BasicClient;

public class ClientCoupler extends Coupler {

	public ClientCoupler(BasicClient client, NodeId installedPowerId, NodeId effHeatId, NodeId effElecId, int port)
			throws InterruptedException, ExecutionException {

		super(client.readFinalDoubleValue(installedPowerId), client.readFinalDoubleValue(effHeatId),
				client.readFinalDoubleValue(effElecId), port);
	}

	@Override
	public void makeDecision() {
		super.makeDecision();
		couplerMessage.name = this.actorName;
		couplerMessage.id = this.fullActorPath;
		couplerMessage.operationalCostEUR = 0.00001 + EnergyPrices.getGasPriceInEuro(1);
		couplerMessage.efficiencyElec = efficiencyElec;
		couplerMessage.efficiencyHeat = efficiencyHeat;
		couplerMessage.installedPower = installedPower;

		super.updateDisplay(couplerMessage);
	}

}
