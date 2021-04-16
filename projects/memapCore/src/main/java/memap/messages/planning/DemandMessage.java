package memap.messages.planning;

import com.google.gson.Gson;

import akka.basicMessages.AnswerContent;
import memap.messages.extension.NetworkType;

public class DemandMessage implements AnswerContent {

	public String id;
	public String name;
	private double[] demandForecast; // that certainly includes both heat and electricity
	public String forecastType;
	public NetworkType networkType;
	
	public double[] varNetworkCostEUR;
	// only needed in a perspective CO2-optimization in dependence on the RES share in the grid:
	public double[] varNetworkCostCO2;

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
	
	public String toString() {
		Gson gson = new Gson();
		String result = "Demandmessage: " + gson.toJson(this);
		return result;
	}
	
}
