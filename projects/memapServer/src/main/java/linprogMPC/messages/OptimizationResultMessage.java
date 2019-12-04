package linprogMPC.messages;

import java.util.SortedMap;
import java.util.TreeMap;

import akka.basicMessages.RequestContent;

public class OptimizationResultMessage implements RequestContent {

	/** Stores the results using <BuilidingName>.<DeviceName><DataName> as key */
	public SortedMap<String, double[]> resultMap = new TreeMap<String, double[]>();		
}
