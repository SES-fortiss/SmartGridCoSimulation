package linprogMPC.messages.planning;

import akka.basicMessages.AnswerContent;
import linprogMPC.messages.extension.NetworkType;

public class ProducerMessage implements AnswerContent {
	
	public String id;
	public String name;
	
	public double maxPower;
	public double minPower;
	
	public double operationalPriceEURO;
	public double operationalPriceCO2;
	
	public double efficiency;
	public NetworkType networkType;

}
