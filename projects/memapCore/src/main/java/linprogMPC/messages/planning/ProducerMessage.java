package linprogMPC.messages.planning;

import akka.basicMessages.AnswerContent;
import linprogMPC.messages.extension.NetworkType;

public class ProducerMessage implements AnswerContent {
	
	public String id;
	public String name;
	
	public double maxPower;
	public double minPower;
	
	public double operationalCostEUR;
	public double operationalCostCO2;
	
	public double efficiency;
	
	public NetworkType networkType;

}
