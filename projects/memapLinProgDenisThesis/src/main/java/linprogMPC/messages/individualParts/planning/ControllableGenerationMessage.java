package linprogMPC.messages.individualParts.planning;

import akka.basicMessages.AnswerContent;
import linprogMPC.messages.types.NetworkType;

public class ControllableGenerationMessage implements AnswerContent {
	
	public String id;
	public String name;
	
	public double installedPower;
	
	public double operationalPriceEURO;
	public double operationalPriceCO2;
	
	public double efficiency;
	public NetworkType networkType;

}
