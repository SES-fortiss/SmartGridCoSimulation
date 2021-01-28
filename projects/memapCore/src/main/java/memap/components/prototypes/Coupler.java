package memap.components.prototypes;

import akka.basicMessages.AnswerContent;
import memap.controller.TopologyController;
import memap.messages.OptimizationResultMessage;
import memap.messages.planning.CouplerMessage;

public abstract class Coupler extends Device {

	/** Reference to the topology */
	protected TopologyController topologyController;
	public double minPower;
	public double maxPower;
	public double efficiencyHeat;
	public double efficiencyElec;
	
	public CouplerMessage couplerMessage = new CouplerMessage();
	public double[] optimizationAdvice;

	public Coupler(String name, double minPower, double maxPower, double efficiencyHeat, double efficiencyElec,
			int port) {
		super(name, port);
		this.minPower = minPower;
		this.maxPower = maxPower;
		this.efficiencyHeat = efficiencyHeat;
		this.efficiencyElec = efficiencyElec;
		// Initialization delayed until after topologyConfig initialization
		optimizationAdvice = new double[topologyConfig.getNrStepsMPC()];
	}

	@Override
	public void makeDecision() {
	}

	@Override
	public AnswerContent returnAnswerContentToSend() {
		couplerMessage.id = this.fullActorPath;
		return couplerMessage;
	}

	@Override
	public void handleRequest() {
		if (requestContentReceived instanceof OptimizationResultMessage) {
			OptimizationResultMessage optResult = ((OptimizationResultMessage) requestContentReceived);
			for (String key : optResult.resultMap.keySet()) {
				if (key.contains(actorName)) {
					optimizationAdvice = optResult.resultMap.get(key);
				}
			}
		}
	}

	@Override
	public void setTopologyController(TopologyController topologyController) {
		this.topologyController = topologyController;
	}

}
