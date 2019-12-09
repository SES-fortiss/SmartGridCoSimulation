package linprogMPC.messages;

import akka.basicMessages.AnswerContent;

public class ProducerMessage implements AnswerContent {
	
	public String name;
	public double[] cost;
	public double[][] couplingMatrix_H;
	public double[][] couplingMatrix_el;
	public double[] lowerBound;
	public double[] upperBound;
	
	// TODO modifizieren, dass nur noch die parameter, nicht aber die Matrizen hochgeschickt werden.
	
	public double qDotMax; 
	public double costD;
	public double efficiency;

}
