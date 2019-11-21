package linprogMPC.messages.planning;

import akka.basicMessages.AnswerContent;
import linprogMPC.messages.extension.NetworkType;

//@Deprecated
public class ProducerMessage implements AnswerContent {
	
	public String id;
	public String name;
	
	public double installedPower;
	
	public double operationalCostEUR;
	public double operationalCostCO2;
	
	public double efficiency;
	public NetworkType networkType;

}
