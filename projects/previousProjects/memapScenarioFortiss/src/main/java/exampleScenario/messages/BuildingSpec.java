package exampleScenario.messages;

import java.util.HashMap;
import akka.basicMessages.AnswerContent;

public class BuildingSpec implements AnswerContent {
	
	public String name;
	public Consumption consumption = new Consumption();
	public HashMap<String,ProducerSpec> producers = new HashMap<String,ProducerSpec>();
	public HashMap<String,StorageSpec> storages = new HashMap<String,StorageSpec>();

	public int getNrOfProducers() {
		return producers.size();
	}
	
	public int getNrOfStorages() {
		return storages.size();
	}

}
