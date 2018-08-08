package linprog.messages;

import akka.basicMessages.AnswerContent;

public class Consumption implements AnswerContent {
	
	public final double HEAT_LOSSES = 1.015;
	
	private double[] vector;

	public void setVector(double[] consumption) {
		vector = consumption;		
	}
	
	public void addConsumption(double[] consumption) {
		if (consumption == null) {
			return;
		}
		if(vector == null) {
			setVector(consumption);
			return;
		}
		if (vector.length != consumption.length){
			throw new RuntimeException("Consumption vector must have the same length to add.");
		}
		for(int i = 0; i < vector.length; i++) {
			vector[i] += consumption[i];
		}	
	}
	
	public double[] getVector() {
		return vector;
	}
	
	/*
	 * This function calculates the heat losses in dependence of the individual 
	 * heat transport lengths, that are defined in the building topology and increases 
	 * the heat demand accordingly
	 */
	public double[] CalcHeatLosses(BuildingSpec buildingSpec) {
		
		double[] ConsumptionVector = buildingSpec.consumption.getVector();
		
		// 1.5 % Verlust auf 100 Metern Leitung
		double losses = Math.pow(HEAT_LOSSES,buildingSpec.heatTransportLength/100);
				
		for (int j = 0; j < ConsumptionVector.length/2; j++) {
			ConsumptionVector[j] = losses*ConsumptionVector[j];
		}
				
		return ConsumptionVector;
	}

}
