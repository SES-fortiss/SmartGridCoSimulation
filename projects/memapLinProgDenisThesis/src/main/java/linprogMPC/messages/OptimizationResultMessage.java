package linprogMPC.messages;

import java.util.SortedMap;
import java.util.TreeMap;

import akka.basicMessages.RequestContent;

public class OptimizationResultMessage implements RequestContent {
	
	// TODO it is not clear, what is a basicMap, resultMar or marketMap
	
	public SortedMap<String, double[]> basicsMap = new TreeMap<String, double[]>();
	public SortedMap<String, double[]> resultMap = new TreeMap<String, double[]>();	
	public SortedMap<String, double[]> marketMap = new TreeMap<String, double[]>();	
	public SortedMap<String, Object> buildingResultsMap = new TreeMap<String, Object>();
	public SortedMap<String, double[]> generalResultsMap =  new TreeMap<String, double[]>();

}
