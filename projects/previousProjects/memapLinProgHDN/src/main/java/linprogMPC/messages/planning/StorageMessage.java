package linprogMPC.messages.planning;

import akka.basicMessages.AnswerContent;
import linprogMPC.messages.extension.NetworkType;

public class StorageMessage implements AnswerContent {
	
	public String name;
	public String id;
	
	public double operationalCostEUR;
	public double operationalCostCO2;
	
	public double capacity;
	public double stateOfCharge;
	
	public double maxLoad;
	public double maxDischarge;
	
	public double efficiencyCharge;
	public double efficiencyDischarge;
	
	public NetworkType networkType;

}
