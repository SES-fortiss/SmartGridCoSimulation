package linprogMPC.messages;

import akka.basicMessages.AnswerContent;

public class CouplerMessage implements AnswerContent {
	
	public String name;
	public double installedPower;
	public double cost;
	public double efficiencyHeat;
	public double efficiencyElec;
}
