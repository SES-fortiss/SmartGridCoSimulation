package linprogMPC.messages.individualParts.planning;

import akka.basicMessages.AnswerContent;
import linprogMPC.messages.types.NetworkType;

public class StorageMessage implements AnswerContent {
	
	public String name;
	public String id;
	
	public double operationalPriceEURO;
	public double operationalPriceCO2;
	
	public double capacity;
	public double stateOfCharge;
	
	public double maxLoad;
	public double maxDischarge;
	
	public double efficiencyCharge;
	public double efficiencyDischarge;
	
	public NetworkType networkType;

}
