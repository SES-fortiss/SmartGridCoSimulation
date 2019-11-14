package memap.messages.planning;

import akka.basicMessages.AnswerContent;
import memap.messages.extension.NetworkType;

//@Deprecated
public class ProducerMessage implements AnswerContent {
	
	public String id;
	public String name;
	
	public double installedPower;
	
	public double operationalPriceEURO;
	public double operationalPriceCO2;
	
	public double efficiency;
	public NetworkType networkType;

}
