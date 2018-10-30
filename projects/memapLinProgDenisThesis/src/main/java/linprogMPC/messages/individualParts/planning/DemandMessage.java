package linprogMPC.messages.individualParts.planning;

import akka.basicMessages.AnswerContent;
import linprogMPC.ThesisTopologySimple;
import linprogMPC.messages.BuildingMessage;
import linprogMPC.messages.types.NetworkType;

public class DemandMessage implements AnswerContent {
	
	
	private double[] demandForecast;
	
	private String optimizationCriteria;
	private String forecastType;
	private NetworkType networkType;
	private String ID;
	private String name;
	
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
	
	/**
	 * This function calculates the heat losses in dependence of the individual 
	 * heat transport lengths, that are defined in the building topology and increases 
	 * the heat demand accordingly
	 * 
	 * TODO: This function should move to another part of the code. Messages should have no functions!
	 */
	public double[] calcHeatLosses(BuildingMessage buildingSpec) {		
		double[] consumptionVector = buildingSpec.consumption.getDemandVector();		
		// 1.5 % Verlust auf 100 Metern Leitung
		double losses = Math.pow(ThesisTopologySimple.HEAT_LOSSES,buildingSpec.heatTransportLength/100);		
		for (int j = 0; j < consumptionVector.length/2; j++) {
			consumptionVector[j] = losses*consumptionVector[j];
		}
				
		return consumptionVector;
	}

}
