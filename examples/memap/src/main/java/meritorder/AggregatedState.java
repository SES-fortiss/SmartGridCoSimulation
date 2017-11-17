package meritorder;

import java.util.ArrayList;

import akka.basicMessages.AnswerContent;
import meritorder.messages.Demand;
import meritorder.messages.Offer;

public class AggregatedState implements AnswerContent{
	
	double systemprice;
	double volume;
	public ArrayList<Demand> demandlist = new ArrayList<Demand>();
	public ArrayList<Offer> offerlist = new ArrayList<Offer>();
}
