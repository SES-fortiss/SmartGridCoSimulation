package linprogMPC.messages;

import akka.basicMessages.AnswerContent;
import linprogMPC.MPCDenisSimulation;

public class ConsumptionMessage implements AnswerContent {
	
	
	private double[] demandVector;

	public void setDemandVector(double[] consumption) {
		demandVector = consumption;		
	}
	
	public void addConsumption(double[] consumption) {
		if (consumption == null) {
			return;
		}
		if(demandVector == null) {
			setDemandVector(consumption);
			return;
		}
		if (demandVector.length != consumption.length){
			throw new RuntimeException("Consumption vector must have the same length to add.");
		}
		for(int i = 0; i < demandVector.length; i++) {
			demandVector[i] += consumption[i];
		}	
	}
	
	public double[] getDemandVector() {
		return demandVector;
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
		double losses = Math.pow(MPCDenisSimulation.HEAT_LOSSES,buildingSpec.heatTransportLength/100);
		
		for (int j = 0; j < consumptionVector.length/2; j++) {
			consumptionVector[j] = losses*consumptionVector[j];
		}
				
		return consumptionVector;
	}

}
