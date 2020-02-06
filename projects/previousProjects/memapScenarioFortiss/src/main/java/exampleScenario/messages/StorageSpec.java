package exampleScenario.messages;

import akka.basicMessages.AnswerContent;

public class StorageSpec implements AnswerContent {
	
	public String name;
	public double cost;
	public double cur_capacity;
	public double max_capacity;
	public double p_in;
	public double p_out;
	
}
