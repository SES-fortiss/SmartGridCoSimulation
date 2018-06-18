package exampleScenario.messages;

import java.util.HashMap;

import akka.basicMessages.RequestContent;

public class BuildingRequest implements RequestContent{
	public Consumption consumption = new Consumption();
	public HashMap<String,ProducerSpec> producers = new HashMap<String,ProducerSpec>();
	public HashMap<String,StorageSpec> storages = new HashMap<String,StorageSpec>();
	
	public int getNrOfProducers() {
		return producers.size();
	}
	
	public int getNrOfStorages() {
		return storages.size();
	}
	
	public double getHeatProduction() {
		double sum = 0.0;
		if (producers.containsKey("CHP")) sum += producers.get("CHP").power_h;
		if (producers.containsKey("GasBoiler")) sum += producers.get("GasBoiler").power_h;
		if (producers.containsKey("OilBoiler")) sum += producers.get("OilBoiler").power_h;
		if (producers.containsKey("SolarThermic")) sum += producers.get("SolarThermic").power_h;
		if (producers.containsKey("HeatPump")) sum += producers.get("HeatPump").power_h;
		return sum;
	}
	
	public double getElectricalProduction() {
		double sum = 0.0;
		if (producers.containsKey("CHP")) sum += producers.get("CHP").power_el;
		if (producers.containsKey("PV")) sum += producers.get("PV").power_el;
		return sum;
	}
	
	public String toString(){
		return ("GenericRequestContent={" +
                "reductionFactor: " + consumption.getElectricalValue() + 
				"}");
	}
}
