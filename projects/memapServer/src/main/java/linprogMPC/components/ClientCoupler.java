package linprogMPC.components;

import java.util.concurrent.ExecutionException;

import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;

import linprogMPC.components.prototypes.Coupler;
import linprogMPC.helper.EnergyPrices;
import linprogMPC.helperOPCua.BasicClient;

public class ClientCoupler extends Coupler {
    Boolean gas;

    public ClientCoupler(BasicClient client, NodeId installedPowerId, NodeId effHeatId, NodeId effElecId, Boolean gas,
	    int port) throws InterruptedException, ExecutionException {
	super(client.readFinalDoubleValue(installedPowerId), client.readFinalDoubleValue(effHeatId),
		client.readFinalDoubleValue(effElecId), port);

	this.gas = gas;
    }

    @Override
    public void makeDecision() {
	super.makeDecision();
	couplerMessage.name = this.actorName;
	couplerMessage.id = this.fullActorPath;
	double opCost = 0.00001;
	if (gas) {
	    opCost += EnergyPrices.getGasPriceInEuro(1);
	}
	couplerMessage.operationalCostEUR = opCost;
	couplerMessage.efficiencyElec = efficiencyElec;
	couplerMessage.efficiencyHeat = efficiencyHeat;
	couplerMessage.installedPower = installedPower;

	super.updateDisplay(couplerMessage);
    }
}
