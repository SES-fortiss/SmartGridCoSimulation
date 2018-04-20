package exampleScenario.components;

import akka.basicMessages.AnswerContent;
import exampleScenario.messages.StorageSpec;

public abstract class Storage extends Device {

	public double p_max_in;
	public double p_max_out;
	public double max_capacity;
	public double current_capacity;
	public StorageSpec specificationToSend = new StorageSpec();

	public Storage(String name, double p_max_in, double p_max_out, double capacity) {
		super(name);
		this.p_max_in = p_max_in;
		this.p_max_out= p_max_out;
		this.max_capacity = capacity;
		this.current_capacity = 0.0;
	}

	@Override
	public void makeDecision() {
		specificationToSend.name = this.name;
		specificationToSend.cost = 0.0;
		specificationToSend.cur_capacity = 0.0;
		specificationToSend.max_capacity = 0.0;
		specificationToSend.p_in = 0.0;
		specificationToSend.p_out = 0.0;

	}

	@Override
	public AnswerContent returnAnswerContentToSend() {
		return specificationToSend;
	}
	
	
	
}
