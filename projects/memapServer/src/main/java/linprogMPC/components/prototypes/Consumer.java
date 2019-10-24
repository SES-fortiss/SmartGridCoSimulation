package linprogMPC.components.prototypes;

import java.util.List;

import akka.basicMessages.AnswerContent;
import akka.systemActors.GlobalTime;
import linprogMPC.TopologyConfig;
import linprogMPC.messages.extension.NetworkType;
import linprogMPC.messages.planning.DemandMessage;

/**
 * This class represents the consumer. It is responsible to generate the
 * consumption profiles. This is also the place if additional uncertainties
 * should be implemented.
 */
public abstract class Consumer extends Device {

	public Consumer(int port) {
		super(port);
	}

	public DemandMessage consumptionMessage = new DemandMessage();

	@Override
	public void makeDecision() {
		double[] demandVectorB;
		if (getNetworkType() == NetworkType.DEMANDWITHBOTH) {
			demandVectorB = new double[2 * nStepsMPC];
		} else {
			demandVectorB = new double[nStepsMPC];
		}

		int cts = GlobalTime.getCurrentTimeStep();

		List<Double> currentProfile = getProfile(cts, nStepsMPC);

		// Creating demand vector
		for (int i = 0; i < demandVectorB.length; i++) {
			try {
				demandVectorB[i] = -currentProfile.get(0 + i) / 60;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		consumptionMessage.setDemandVector(demandVectorB);
		consumptionMessage.networkType = getNetworkType();
		consumptionMessage.name = this.actorName;
		consumptionMessage.id = this.fullActorPath;
		consumptionMessage.forecastType = "Profile";
		consumptionMessage.optimizationCriteria = TopologyConfig.OPTIMIZATION_CRITERIA;

		super.updateDisplay(consumptionMessage);
	}

	@Override
	public AnswerContent returnAnswerContentToSend() {
		return consumptionMessage;
	}

	/**
	 * Implement this method to retrieve the current consumption together with a
	 * prediction of up to mpcHorizon time steps.
	 * 
	 * @param timeStep
	 * @param mpcHorizon
	 * @return consumption for mpcHorizon timeSteps
	 */
	public abstract List<Double> getProfile(int timeStep, int mpcHorizon);

	public abstract NetworkType getNetworkType();

}
