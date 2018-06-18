package exampleScenario.messages;

import akka.basicMessages.AnswerContent;

public class ProducerSpec implements AnswerContent {
	
	public String name;
	public double cost;
	public double power_el;
	public double power_h;

}
