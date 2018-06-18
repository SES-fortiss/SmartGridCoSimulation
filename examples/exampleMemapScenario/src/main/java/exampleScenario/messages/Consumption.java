package exampleScenario.messages;

import akka.basicMessages.AnswerContent;

public class Consumption implements AnswerContent {
	
	private double heat;
	private double electrical;
	private double dhw;

	public void setValues(double heat, double electrical, double dhw) {
		this.heat = heat;	
		this.electrical = electrical;
		this.dhw = dhw;
	}
	
	public void addConsumption(Consumption consumption) {
		this.heat += consumption.heat;	
		this.electrical += consumption.electrical;
		this.dhw += consumption.dhw;
	}
	
	public double getHeatValue() {
		return heat;
	}
	
	public double getElectricalValue() {
		return electrical;
	}
	
	public double getDHWValue() {
		return dhw;
	}
}
