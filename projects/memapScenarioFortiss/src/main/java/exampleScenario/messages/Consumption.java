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
	
	public double getHeat() {
		return heat;
	}
	
	public double getElectrical() {
		return electrical;
	}
	
	public double getDhw() {
		return dhw;
	}
}
