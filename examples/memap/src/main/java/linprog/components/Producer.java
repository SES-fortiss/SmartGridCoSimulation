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
		specificationToSend.costCO2 = new double[n];
		specificationToSend.cost_plus = new double[n];
		specificationToSend.couplingMatrix_H = new double[n][n];
		specificationToSend.couplingMatrix_el = new double[n][n];
		specificationToSend.lowerBound = new double[n];
		specificationToSend.upperBound = new double[n];
		
		for (int i = 0; i < n; i++) {
			specificationToSend.lowerBound[i] = 0.0;
//			specificationToSend.upperBound[i] = qdot_max*LinProgSimulation.stepLength(TimeUnit.HOURS);	
		}
	}

	@Override
	public AnswerContent returnAnswerContentToSend() {
		return specificationToSend;
	}
	
	

}
