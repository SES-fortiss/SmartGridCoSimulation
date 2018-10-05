package linprogMPC.messages;

import java.util.SortedMap;
import java.util.TreeMap;

import akka.basicMessages.RequestContent;

public class OptimizationResult implements RequestContent {
	
	public SortedMap<String, double[]> basicsMap = new TreeMap<String, double[]>();
	public SortedMap<String, double[]> resultMap = new TreeMap<String, double[]>();	
	public SortedMap<String, double[]> marketMap = new TreeMap<String, double[]>();	
	
}
