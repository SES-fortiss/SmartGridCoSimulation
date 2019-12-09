package linprogMPC.messages.planning;

import akka.basicMessages.AnswerContent;
import linprogMPC.TopologyConfig;
import linprogMPC.messages.BuildingMessage;
import linprogMPC.messages.extension.NetworkType;

public class DemandMessage implements AnswerContent {

	public String id;
	public String name;
	private double[] demandForecast; // that certainly includes both
	public String forecastType;
	public String optimizationCriteria;
	public NetworkType networkType;

	public DemandMessage() {
		demandForecast = null;
	}

	public void setDemandVector(double[] consumption) {
		demandForecast = consumption;
	}

	public void addConsumption(double[] consumption) {
		if (consumption == null) {
			return;
		}

		if (demandForecast == null) {
			setDemandVector(consumption);
			return;
		}

		for (int i = 0; i < demandForecast.length; i++) {
			demandForecast[i] += consumption[i];
		}
	}

	public double[] getDemandVector() {
		return demandForecast;
	}

	/**
	 * This function calculates the heat losses in dependence of the individual heat
	 * transport lengths, that are defined in the building topology and increases
	 * the heat demand accordingly
	 * 
	 * TODO: This function should move to another part of the code. Messages should
	 * have no functions!
	 */
	public double[] calcHeatLosses(BuildingMessage buildingSpec) {
		double[] consumptionVector = buildingSpec.getCombinedDemandVector();
		// 1.5 % Verlust auf 100 Metern Leitung
		double losses = Math.pow(TopologyConfig.HEAT_LOSSES, buildingSpec.heatTransportLength / 100);
		for (int j = 0; j < consumptionVector.length / 2; j++) {
			consumptionVector[j] = losses * consumptionVector[j];
		}

		return consumptionVector;
	}
}
