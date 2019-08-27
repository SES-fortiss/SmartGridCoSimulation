package memap.components;

import memap.components.prototypes.Coupler;

public class HeatPump extends Coupler {
	
	public HeatPump(double installedPower, double efficiencyHeat, double efficiencyElec, int port) {
		super(installedPower, efficiencyHeat, efficiencyElec, port);
	}
	
	@Override
	public void makeDecision() {			
		couplerMessage.name = this.actorName;
		couplerMessage.id = this.fullActorPath;
		
		couplerMessage.operationalCostEUR = 0.00001;
		couplerMessage.efficiencyElec = efficiencyElec;
		couplerMessage.efficiencyHeat = efficiencyHeat;
		couplerMessage.installedPower = installedPower;
		
		super.updateDisplay(couplerMessage);
	}
}
