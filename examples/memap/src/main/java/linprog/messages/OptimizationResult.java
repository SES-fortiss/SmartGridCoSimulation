package linprog.messages;

import java.util.HashMap;
import java.util.LinkedList;

import akka.basicMessages.AnswerContent;

public class OptimizationResult implements AnswerContent {
	
	public HashMap<String, double[]> resultMap = new HashMap<String, double[]>();
	
}
