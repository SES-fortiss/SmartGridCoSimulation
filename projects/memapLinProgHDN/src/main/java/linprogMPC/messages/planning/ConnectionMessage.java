package linprogMPC.messages.planning;

import akka.basicMessages.AnswerContent;
import linprogMPC.messages.extension.NetworkType;

public class ConnectionMessage implements AnswerContent {
	
	public String name;
	public String id;
	
	public int connectedBuilding;
	
	public double maxIn;
	public double maxOut;
	
	public double efficiencyIn;
	public double efficiencyOut;
	
	public double operationalPriceEURO;
	
	public NetworkType networkType;

}
