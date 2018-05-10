package exampleScenario.components;

import akka.systemActors.GlobalTime;
import exampleScenario.messages.BuildingRequest;

public class ThermalStorage extends Storage {
	
	public final double efficiency;
	
	public ThermalStorage(String name, double qdot_max_in, double qdot_max_out, double capacity, double efficiency) {
		super(name, qdot_max_in, qdot_max_out, capacity);
		if(efficiency < 0.0 || efficiency > 1.0) {
			//TODO throw exception
		}
		this.efficiency = efficiency;
	}
	
	@Override
	public void makeDecision() {
		super.makeDecision();
		specificationToSend.cost = 0.0;
		specificationToSend.max_capacity = this.max_capacity;
		
		BuildingRequest request;
		double diff;
		
		if (requestContentReceived != null) {
			request = (BuildingRequest) requestContentReceived;
			diff = request.getHeatProduction() - (request.consumption.getDHWValue()+request.consumption.getHeatValue());
			
			// production > consumption -> charge thermal storage
			if (diff > 0) {
				if (diff > this.p_max_in) diff = p_max_in;
				if (diff*GlobalTime.period.getSeconds() < (this.max_capacity - this.current_capacity)) {
					specificationToSend.p_in = diff;
					this.current_capacity += diff*GlobalTime.period.getSeconds();
					specificationToSend.cur_capacity = this.current_capacity;
				}
			}
			
			// production < consumption -> discharge thermal storage
			if (diff < 0) {
				if (-diff > this.p_max_out) diff = -p_max_out;
				if (-diff*GlobalTime.period.getSeconds() < this.current_capacity) {
					specificationToSend.p_out = -diff;
					this.current_capacity += diff*GlobalTime.period.getSeconds();
					specificationToSend.cur_capacity = this.current_capacity;
				}
			}
		}
	}

}
