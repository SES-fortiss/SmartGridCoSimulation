package linprogMPC.messages;

import akka.basicMessages.AnswerContent;
import linprogMPC.messages.types.NetworkType;

public class ProducerMessage implements AnswerContent {
	
	public String name;
	public double installedPower; 
	public double cost;
	public double efficiency;
	public NetworkType networkType;

}
