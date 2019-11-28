package linprogMPC.messages.planning;

import akka.basicMessages.AnswerContent;
import linprogMPC.messages.extension.NetworkType;

public class ConnectionMessage implements AnswerContent {
	
	public String name;
	public String id;
	
	public String connectedBuilding;
	
	public double q_max;	
	public double efficiency;
	public double pipeLengthInMeter;
	
	public double operationalPrice;
	
	public NetworkType networkType;

}
