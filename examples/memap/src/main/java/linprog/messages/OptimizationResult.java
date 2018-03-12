package linprog.messages;

import java.util.SortedMap;
import java.util.TreeMap;

import akka.basicMessages.AnswerContent;

public class OptimizationResult implements AnswerContent {
	
	public SortedMap<String, double[]> resultMap = new TreeMap<String, double[]>();
	
}
