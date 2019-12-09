package linprogMPC.messages.planning;
import akka.basicMessages.AnswerContent;
import linprogMPC.messages.extension.NetworkType;

public class ConnectionMessage implements AnswerContent {
	
	public String name;
	public String id;
	
	public String connectedBuildingTo;
	public String connectedBuildingFrom;
	
	public double maxPower;	
	public double efficiency;
	public double pipeLengthInMeter;
	
	public double operationalCostEUR;
	public double operationalCostCO2;
	
	public NetworkType networkType;

}