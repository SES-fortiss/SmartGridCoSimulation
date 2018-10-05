package linprogMPC.messages;

import akka.basicMessages.AnswerContent;

public class ProducerMessage implements AnswerContent {
	
	public String name;
	public double installedPower; 
	public double cost;
	public double efficiency;
	public NetworkType networkType;

}
