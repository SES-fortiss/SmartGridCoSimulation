package exampleScenario.components;

import java.time.Duration;

import exampleScenario.messages.BuildingRequest;

public class Battery extends Storage {
	
	public Battery(String name, double p_max_in, double p_max_out, double capacity) {
		super(name, p_max_in, p_max_out, capacity);
	}
	
	@Override
	public void makeDecision() {
		
		Duration timeStepDuration = this.actor.getTimeStepDuration();
		
		super.makeDecision();
		specificationToSend.cost = 0.0;
		
		BuildingRequest request;
		double diff;
		
		if (requestContentReceived != null) {
			request = (BuildingRequest) requestContentReceived;
			diff = request.getElectricalProduction() - request.consumption.getElectricalValue();
			
			// production > consumption -> charge battery
			if (diff > 0) {
				if (diff > this.p_max_in) diff = p_max_in;
				if (diff*timeStepDuration.getSeconds() < (this.max_capacity - this.current_capacity)) {
					specificationToSend.p_in = diff;
					this.current_capacity += diff*timeStepDuration.getSeconds();
					specificationToSend.capacity = this.current_capacity;
				}
			}
			
			// production < consumption -> discharge battery
			if (diff < 0) {
				if (-diff > this.p_max_out) diff = -p_max_out;
				if (-diff*timeStepDuration.getSeconds() < this.current_capacity) {
					specificationToSend.p_out = -diff;
					this.current_capacity += diff*timeStepDuration.getSeconds();
					specificationToSend.capacity = this.current_capacity;
				}
			}
		}
	}

}
