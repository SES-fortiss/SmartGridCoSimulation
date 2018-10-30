package linprog.messages;

import java.util.SortedMap;
import java.util.TreeMap;

import akka.basicMessages.AnswerContent;

public class OptimizationResult implements AnswerContent {
	
	public SortedMap<String, double[]> basicsMap = new TreeMap<String, double[]>();

	public SortedMap<String, double[]> resultMap = new TreeMap<String, double[]>();
	
	public SortedMap<String, double[]> marketMap = new TreeMap<String, double[]>();
	
	
}