package linprogMPC.messages;

import akka.basicMessages.AnswerContent;

public class ControllableGeneration implements AnswerContent {
	
	public String name;
	
	public double installedPower; 
	public double costD;
	public double efficiency;
	public NetworkType networkType;

}
