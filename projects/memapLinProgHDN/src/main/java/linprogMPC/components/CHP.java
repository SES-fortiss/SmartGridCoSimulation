package linprogMPC.components;

import akka.systemActors.GlobalTime;
import linprogMPC.components.prototypes.Coupler;
import linprogMPC.helper.EnergyPrices;

public class CHP extends Coupler {

	public final double efficiency_el;
	public final double efficiency_H;
	
	public CHP(double installedPower, double efficiency_H, double efficiency_el, int port) {
		super(installedPower, efficiency_H, efficiency_el, port);
		if(efficiency_el < 0.0 || efficiency_el > 1.0) {
			//TODO throw exception
		}
		this.efficiency_el = efficiency_el;
		this.efficiency_H = efficiency_H;
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
		
		super.updateDisplay(couplerMessage);
	}

}
