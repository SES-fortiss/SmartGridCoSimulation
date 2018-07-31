package exampleScenario.messages;

import java.util.HashMap;
import java.util.Map;

import akka.basicMessages.RequestContent;

public class BuildingRequest implements RequestContent{
	public Consumption consumption = new Consumption();
	public Map<String,ProducerSpec> producers = new HashMap<String,ProducerSpec>();
	public Map<String,StorageSpec> storages = new HashMap<String,StorageSpec>();
	
	public int getNrOfProducers() {
		return producers.size();
	}
	
	public int getNrOfStorages() {
		return storages.size();
	}
	
	public double getHeatProduction() {
		double sum = 0.0;
		if (producers.containsKey("BHKW")) sum += producers.get("BHKW").power_h;
		if (producers.containsKey("Gaskessel")) sum += producers.get("Gaskessel").power_h;
		if (producers.containsKey("Ölkessel")) sum += producers.get("Ölkessel").power_h;
		if (producers.containsKey("Solarthermie")) sum += producers.get("Solarthermie").power_h;
		if (producers.containsKey("Wärmepumpe")) sum += producers.get("Wärmepumpe").power_h;
		return sum;
	}
	
	public double getElectricalProduction() {
		double sum = 0.0;
		if (producers.containsKey("BHKW")) sum += producers.get("BHKW").power_el;
		if (producers.containsKey("PV")) sum += producers.get("PV").power_el;
		return sum;
	}

}
