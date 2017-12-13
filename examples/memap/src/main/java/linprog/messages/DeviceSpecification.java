package linprog.messages;

import akka.basicMessages.AnswerContent;

public class DeviceSpecification implements AnswerContent {
	
	public String name;
	public double[] cost;
	public double[][] couplingMatrix;
	public double[] lowerBound;
	public double[] upperBound;

	//necessary only if device has in- and output
	public double[][] capacityMatrix1;
	public double[][] capacityMatrix2;
	public double[] vector;
	
}
