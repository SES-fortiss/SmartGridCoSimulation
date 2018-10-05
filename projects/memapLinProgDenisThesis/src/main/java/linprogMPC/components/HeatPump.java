package linprogMPC.components;

public class HeatPump extends Coupler {
	
	public HeatPump(double installedPower, double efficiencyHeat, double efficiencyElec, int port) {
		super(installedPower, efficiencyHeat, efficiencyElec, port);
	}
	
	@Override
	public void makeDecision() {			
		couplerMessage.name = this.actorName;
		
		couplerMessage.cost = 0.00001;
		couplerMessage.efficiencyElec = efficiencyElec;
		couplerMessage.efficiencyHeat = efficiencyHeat;
		couplerMessage.installedPower = installedPower;
		
		super.updateDisplay(couplerMessage);
	}
}
