package linprog.messages;

import akka.basicMessages.AnswerContent;

public class StorageSpec implements AnswerContent {
	
	public String name;
	public double[] cost;
	public double[][] couplingMatrix_H;
	public double[][] couplingMatrix_el;
	public double[] lowerBound;
	public double[] upperBound;

	public double[][] capacityMatrix1;
	public double[][] capacityMatrix2;
	public double[] vector;

}
