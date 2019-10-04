package linprogMPC.components;

import linprogMPC.components.prototypes.Coupler;

public class HeatPump extends Coupler {
	
	public HeatPump(double installedPower, double efficiencyHeat, double efficiencyElec, int port) {
		super(installedPower, efficiencyHeat, efficiencyElec, port);
	}
	
	@Override
	public void makeDecision() {			
		couplerMessage.name = this.actorName;
		couplerMessage.id = this.fullActorPath;
		
		couplerMessage.operationalCostEUR = 0.00001;
		couplerMessage.operationalCostCO2 = 0.0; // kg CO2/kWh
		couplerMessage.efficiencyElec = efficiencyElec;
		couplerMessage.efficiencyHeat = efficiencyHeat;
		couplerMessage.installedPower = installedPower;
		
		super.updateDisplay(couplerMessage);
	}
}
