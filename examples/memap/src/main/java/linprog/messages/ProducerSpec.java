package linprog.messages;

import akka.basicMessages.AnswerContent;

public class ProducerSpec implements AnswerContent {
	
	public String name;
	public double[] cost;
	public double[] costCO2;
	public double[] cost_plus;
	public double[][] couplingMatrix_H;
	public double[][] couplingMatrix_el;
	public double[] lowerBound;
	public double[] upperBound;
	

}
