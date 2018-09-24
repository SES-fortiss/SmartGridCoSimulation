package linprogMPC.components;

import akka.basicMessages.AnswerContent;
import linprogMPC.messages.OptimizationResult;
import linprogMPC.messages.ProducerSpec;

public abstract class Producer extends Device {

	protected double qdot_max;
	public ProducerSpec specificationToSend = new ProducerSpec();
	public double[] linprogAdvice  = new double[n];
	
	public Producer(String name, double qdot_max, int port) {
		super(name, port);
		this.qdot_max = qdot_max;
		specificationToSend.name = name;
	}

	@Override
	public void makeDecision() {
		
		specificationToSend.name = this.name;
		specificationToSend.cost = new double[n];
		specificationToSend.couplingMatrix_H = new double[n][n];
		specificationToSend.couplingMatrix_el = new double[n][n];
		specificationToSend.lowerBound = new double[n];
		specificationToSend.upperBound = new double[n];
		
		for (int i = 0; i < n; i++) {
			specificationToSend.lowerBound[i] = 0.0;
			specificationToSend.upperBound[i] = qdot_max;			
		}
	}

	@Override
	public AnswerContent returnAnswerContentToSend() {
		return specificationToSend;
	}
	
	@Override
	public void handleRequest() {
		if(requestContentReceived instanceof OptimizationResult) {

			OptimizationResult linprogResult = ((OptimizationResult) requestContentReceived);

			for (String key : linprogResult.resultMap.keySet()) {		
				if (key.contains(this.name)) {
					linprogAdvice = linprogResult.resultMap.get(key);
				} 
			}
		}
	}

}
