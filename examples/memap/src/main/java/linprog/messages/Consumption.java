package linprog.messages;

import akka.basicMessages.AnswerContent;

public class Consumption implements AnswerContent {
	
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
}
