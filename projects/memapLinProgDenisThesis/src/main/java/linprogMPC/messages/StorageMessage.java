package linprogMPC.messages;

import akka.basicMessages.AnswerContent;

public class StorageMessage implements AnswerContent {
	
	public String name;
	public double cost;
	
	public double capacity;
	public double stateOfCharge;
	
	public double maxLoad;
	public double maxDischarge;
	
	public double efficiencyCharge;
	public double efficiencyDischarge;
	
	public NetworkType networkType;

}
