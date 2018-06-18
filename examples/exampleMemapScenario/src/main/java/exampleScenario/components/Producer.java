package exampleScenario.components;

import akka.basicMessages.AnswerContent;
import exampleScenario.messages.ProducerSpec;
public abstract class Producer extends Device {

	protected double qdot_max;
	public ProducerSpec specificationToSend = new ProducerSpec();
	
	public Producer(String name, double qdot_max) {
		super(name);
		this.qdot_max = qdot_max;
	}

	@Override
	public void makeDecision() {
		specificationToSend.name = this.name;
		specificationToSend.cost = 0.0;
		specificationToSend.power_el = 0.0;
		specificationToSend.power_h = 0.0;
	}

	@Override
	public AnswerContent returnAnswerContentToSend() {
		return specificationToSend;
	}
	
	

}
