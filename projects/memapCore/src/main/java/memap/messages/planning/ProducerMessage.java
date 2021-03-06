package memap.messages.planning;

import akka.basicMessages.AnswerContent;
import memap.messages.extension.NetworkType;

public class ProducerMessage implements AnswerContent {
	
	public String id;
	public String name;
	
	public double maxPower;
	public double minPower;
	
	public double operationalCostEUR;
	public double[] varOperationalCostEUR;
	public double operationalCostCO2;
	
	public double efficiency;
	
	public NetworkType networkType;

}
