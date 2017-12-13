package linprog.messages;

import akka.basicMessages.AnswerContent;
import linprog.helper.EnergyPrices;

public class OptimizationResult implements AnswerContent {
	
	public EnergyPrices[] anlagenProfile;

}
