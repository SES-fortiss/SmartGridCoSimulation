package linprogMPC.messages.planning;

import com.google.gson.Gson;

import akka.basicMessages.AnswerContent;
import linprogMPC.messages.extension.NetworkType;

public class DemandMessage implements AnswerContent {	
	
	private double[] demandForecast; // das beinhaltet je nach dem auch beide forecasts für heat und elec.
	
	public String optimizationCriteria;
	public String forecastType;
	public NetworkType networkType;
	public String id;
	public String name;
	
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
		
		if(demandForecast == null) {
			setDemandVector(consumption);
			return;
		}
		
		for(int i = 0; i < demandForecast.length; i++) {
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
