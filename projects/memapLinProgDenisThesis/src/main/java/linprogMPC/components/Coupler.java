package linprogMPC.components;

import akka.basicMessages.AnswerContent;
import linprogMPC.messages.OptimizationResultMessage;
import linprogMPC.messages.individualParts.planning.CouplerMessage;

public abstract class Coupler extends Device {

	public double installedPower;
	public double efficiencyHeat;
	public double efficiencyElec;
	
	public CouplerMessage couplerMessage = new CouplerMessage();
	
	public double[] mpcSignal  = new double[nStepsMPC];
	
	public Coupler(double installedPower, double efficiencyHeat, double efficiencyElec, int port) {
		super(port);
		this.installedPower = installedPower;
		this.efficiencyHeat = efficiencyHeat;
		this.efficiencyElec = efficiencyElec;		
		couplerMessage.name = this.actorName;
	}

	@Override
	public void makeDecision() {}

	@Override
	public AnswerContent returnAnswerContentToSend() {
		return couplerMessage;
	}
	
	@Override
	public void handleRequest() {
		if(requestContentReceived instanceof OptimizationResultMessage) {
			
			OptimizationResultMessage optResult = ((OptimizationResultMessage) requestContentReceived);
			for (String key : optResult.resultMap.keySet()) {		
				if (key.contains(this.actorName)) {
					mpcSignal = optResult.resultMap.get(key);
				}
			}
		}
	}

}
