package meritorder.messages;

import akka.basicMessages.AnswerContent;

public class Offer implements AnswerContent{

	public String type = "Offer"; 
	public Accepted accepted = Accepted.none;
	public double price;
	public double volume;
		
}
