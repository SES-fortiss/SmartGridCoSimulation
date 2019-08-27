package memap.components;

import akka.basicMessages.AnswerContent;
import akka.systemActors.GlobalTime;
import memap.components.prototypes.Device;
import memap.helper.ConsumptionProfiles;
import memap.messages.extension.NetworkType;
import memap.messages.planning.DemandMessage;

/**
 * This class represents the consumer. It is responsible to generate the
 * consumption profiles. This is also the place if additional uncertainties
 * should be implemented.
 */
public class Consumer extends Device {

	/**
	 * @par consumptionMessage
	 * @par consumptionProfiles consumption profile read from file
	 * @par consumerIndex Index of the column to be read in consumptionProfiles
	 */
	public DemandMessage consumptionMessage = new DemandMessage();
	private final ConsumptionProfiles consumptionProfiles;
	public final int consumerIndex;

	/*
	 * * Constructor for class Consumer
	 */
	public Consumer(String profilesPath, String networkType, int consumerIndex, int port) {
		super(port);
		this.consumerIndex = consumerIndex;
		this.consumptionProfiles = new ConsumptionProfiles(profilesPath, networkType);

		// Choose network type
		if (networkType.equals("Heat")) {
			consumptionMessage.networkType = NetworkType.HEAT;
		} else if (networkType.equals("Electricity")) {
			consumptionMessage.networkType = NetworkType.ELECTRICITY;
		}
	}

	/*
	 * * Construct the right hand side of the equation A x = b according to the type
	 * of network. The vector b concatenates the heat demand values and the
	 * electricity demand values, in that order. Demand values from different
	 * buildings are sum-up together in the appropriate portion of the vector.
	 * 
	 * Set demand parameters and optimization criteria.
	 * 
	 */
	@Override
	public void makeDecision() {
		double[] demandVectorB = new double[2 * nStepsMPC];
		int cts = GlobalTime.getCurrentTimeStep();

		for (int i = 0; i < nStepsMPC; i++) {

			try {
				if (consumptionMessage.networkType == NetworkType.HEAT) {
					demandVectorB[i] = -consumptionProfiles.getHeatConsumption(consumerIndex, cts + i);
				} else if (consumptionMessage.networkType == NetworkType.ELECTRICITY) {
					demandVectorB[nStepsMPC + i] = -consumptionProfiles.getElectricConsumption(consumerIndex, cts + i);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		consumptionMessage.setDemandVector(demandVectorB);
		consumptionMessage.name = this.actorName;
		consumptionMessage.id = this.fullActorPath;
		consumptionMessage.forecastType = "Profile";
		consumptionMessage.optimizationCriteria = "Price";

		super.updateDisplay(consumptionMessage);
	}

	@Override
	public AnswerContent returnAnswerContentToSend() {
		return consumptionMessage;
	}

}
