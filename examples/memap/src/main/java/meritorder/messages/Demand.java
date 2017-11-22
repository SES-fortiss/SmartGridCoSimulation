package meritorder.messages;

import akka.basicMessages.AnswerContent;

public class Demand implements AnswerContent{
	
	public String type = "Demand";
	public Accepted accepted = Accepted.none;
	public double price;
	public double volume;
	
}
