package memap.components.prototypes;

import java.util.List;

import akka.basicMessages.AnswerContent;
import memap.controller.TopologyController;
import memap.messages.planning.DemandMessage;

/**
 * This class represents the consumer. It is responsible to generate the
 * consumption profiles. This is also the place if additional uncertainties
 * should be implemented.
 * 
 * @author JMr
 * 
 * @version reviewed by DB, on 28.9.18, sollte soweit passen.
 *
 */
public abstract class Consumer extends Device {

	/** Reference to the topology */
	protected TopologyController topologyController;
	
	/**
	 * @param name
	 * @param port
	 */
	public Consumer(String name, int port) {
		super(name, port);
	}

	public DemandMessage demandMessage = new DemandMessage();

	@Override
	public AnswerContent returnAnswerContentToSend() {
		return demandMessage;
	}

	/**
	 * Implement this method to retrieve the current heat consumption together with
	 * a prediction of up to mpcHorizon time steps.
	 * 
	 * @param timeStep
	 * @param mpcHorizon
	 * @return heatConsumption prediction for mpcHorison timeSteps
	 */
	public abstract List<Double> getHeatProfile(int timeStep, int mpcHorizon);

	/**
	 * Implement this method to retrieve the current electricity consumption
	 * together with a prediction of up to mpcHorizon time steps.
	 * 
	 * @param timeStep
	 * @param mpcHorizon
	 * @return electricityConsumption for mpcHorizon timeSteps
	 */
	public abstract List<Double> getElectricityProfile(int timeStep, int mpcHorizon);

	@Override
	public void setTopologyController(TopologyController topologyController) {
		this.topologyController = topologyController;
	}
}
