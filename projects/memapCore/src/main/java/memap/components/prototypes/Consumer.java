package memap.components.prototypes;

import java.util.List;

import akka.basicMessages.AnswerContent;
import akka.systemActors.GlobalTime;
import memap.main.ConfigurationMEMAP;
import memap.messages.extension.NetworkType;
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

	/**
	 * @param name
	 * @param port
	 */
	public Consumer(String name, int port) {
		super(name, port);
	}

	public DemandMessage consumptionMessage = new DemandMessage();

	@Override
	public void makeDecision() {
		double[] demandVectorB = new double[2 * nStepsMPC];
		int cts = GlobalTime.getCurrentTimeStep();
		// Getting the HeatProfiles at the current time step with predictions
		List<Double> currentHeatProfile = getHeatProfile(cts, nStepsMPC);
		List<Double> currentElectricityProfile = getElectricityProfile(cts, nStepsMPC);
		// Creating demand vector
		for (int i = 0; i < nStepsMPC; i++) {
			try {
				demandVectorB[i] = -currentHeatProfile.get(0 + i) / 60;
				demandVectorB[nStepsMPC + i] = -currentElectricityProfile.get(0 + i) / 60;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		consumptionMessage.name = actorName;
		consumptionMessage.id = fullActorPath;
		consumptionMessage.setDemandVector(demandVectorB);
		consumptionMessage.forecastType = "Profile";
		consumptionMessage.optimizationCriteria = ConfigurationMEMAP.chosenCriteria;
		consumptionMessage.networkType = NetworkType.DEMANDWITHBOTH;

		super.updateDisplay(consumptionMessage);
	}

	@Override
	public AnswerContent returnAnswerContentToSend() {
		return consumptionMessage;
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

}