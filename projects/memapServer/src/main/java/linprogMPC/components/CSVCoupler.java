package linprogMPC.components;

import linprogMPC.components.prototypes.Coupler;
import linprogMPC.helper.EnergyPrices;

public class CSVCoupler extends Coupler {
    Boolean gas;

    public CSVCoupler(String name, double installedPower, double efficiencyHeat, double efficiencyElec, Boolean gas, int port) {
	super(name, installedPower, efficiencyHeat, efficiencyElec, port);
	this.gas = gas;
    }

    @Override
    public void makeDecision() {
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
