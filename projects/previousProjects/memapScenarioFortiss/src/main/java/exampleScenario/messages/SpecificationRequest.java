package exampleScenario.messages;

import java.util.Calendar;

import akka.basicMessages.RequestContent;

public class SpecificationRequest implements RequestContent {
	
	public Calendar startTime;
	public int timesteps;
	public int stepSize; //in seconds

}
