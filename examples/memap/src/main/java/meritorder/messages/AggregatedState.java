package meritorder.messages;

import java.util.ArrayList;

import akka.basicMessages.AnswerContent;

public class AggregatedState implements AnswerContent{
	
	public double systemPrice;
	public double systemVolume;	
	public double overProduction;
	public double overConsumption;
	
	public ArrayList<Demand> demandlist = new ArrayList<Demand>();
	public ArrayList<Offer> offerlist = new ArrayList<Offer>();
}
