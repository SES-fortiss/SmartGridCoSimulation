package memap.components.prototypes;

import akka.basicMessages.AnswerContent;
import memap.controller.TopologyController;
import memap.messages.OptimizationResultMessage;
import memap.messages.planning.ProducerMessage;

public abstract class Producer extends Device {

	/** Reference to the topology */
	protected TopologyController topologyController;
	public double minPower;
	public double maxPower;
	public double efficiency;

	public ProducerMessage producerMessage = new ProducerMessage();
	public double[] optimizationAdvice;

	public Producer(String name, double minPower, double maxPower, double efficiency, int port) {
		super(name, port);
		this.minPower = minPower;
		this.maxPower = maxPower;
		this.efficiency = efficiency;
		// Initialization delayed until after topologyConfig initialization
		optimizationAdvice = new double[topologyConfig.getNrStepsMPC()];
	}

	@Override
	public void makeDecision() {
	}

	@Override
	public AnswerContent returnAnswerContentToSend() {
		return producerMessage;
	}

	@Override
	public void handleRequest() {
		if (requestContentReceived instanceof OptimizationResultMessage) {
			OptimizationResultMessage linprogResult = ((OptimizationResultMessage) requestContentReceived);

			for (String key : linprogResult.resultMap.keySet()) {
				if (key.contains(actorName)) {
					optimizationAdvice = linprogResult.resultMap.get(key);
				}
			}
		}
	}

	@Override
	public void setTopologyController(TopologyController topologyController) {
		this.topologyController = topologyController;
	}

}
