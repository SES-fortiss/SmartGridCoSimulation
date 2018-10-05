package linprogMPC.messages;

import akka.basicMessages.AnswerContent;

public class StorageMessage implements AnswerContent {
	
	public String name;
	public double[] cost;
	public double[][] couplingMatrix_H;
	public double[][] couplingMatrix_el;
	public double[] lowerBound; // x_lb
	public double[] upperBound; // x_ub

	public double[][] capacityMatrix1;
	public double[][] capacityMatrix2;
	public double[] h_vector; // h-vector?
	
	/**
	 * die neuen Werte - ich möchte von den Matrizen weg, stattdessen sollen nur die Parameter übergeben werden.
	 */
	
	public double efficiencyCharge;
	public double efficiencyDischarge;

}
