package linprog.components;

import akka.basicMessages.AnswerContent;
import linprog.messages.ProducerSpec;
public abstract class Producer extends Device {

	protected double qdot_max;
	public ProducerSpec specificationToSend = new ProducerSpec();
	
	public Producer(String name, double qdot_max, int port) {
		super(name, port);
		this.qdot_max = qdot_max;
		specificationToSend.name = name;
	}

	@Override
	public void makeDecision() {
		specificationToSend.name = this.name;
		specificationToSend.cost = new double[n];
		specificationToSend.couplingMatrix = new double[n][n];
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
	
	

}
