package example.aggregator;

import akka.basicMessages.AnswerContent;
import akka.systemActors.GlobalTime;
import example.helper.Types;

/**
 * 
 * @author bytschkow
 * 
 */
public class AnswerToAggregator implements AnswerContent  {
	public double demand;
	public double generation;
	public double powerInjection; // powerInjection = generation - demand
	public Types typ;
	
	public String toString(){
		return 
				typ + ", " +
				GlobalTime.currentTime + ", " + 
				demand + ", " + 
				generation + ", " + 
				powerInjection;
	}
}
