package linprogMPC.components;

import akka.systemActors.GlobalTime;
import linprogMPC.components.prototypes.Coupler;
import linprogMPC.helper.EnergyPrices;

public class CHP extends Coupler {
	
	public CHP(double installedPower, double minPower, double efficiency_H, double efficiency_el, int port) {
		super(installedPower, minPower, efficiency_H, efficiency_el, port);
	}
	
	@Override
	public void makeDecision() {
		super.makeDecision();
		
		int cts = GlobalTime.getCurrentTimeStep();
		couplerMessage.name = this.actorName;
		couplerMessage.id = this.fullActorPath;
		couplerMessage.operationalCostEUR = 0.00001 + EnergyPrices.getGasPriceInEuro(cts);		
		couplerMessage.operationalCostCO2 = 0.202; // kg CO2/kWh 
		couplerMessage.efficiencyElec = efficiencyElec;
		couplerMessage.efficiencyHeat = efficiencyHeat;
		couplerMessage.installedPower = installedPower;
		couplerMessage.minPower = minPower;
		
		super.updateDisplay(couplerMessage);
	}

}
