package linprog.messages;

import java.util.ArrayList;

import akka.basicMessages.AnswerContent;

public class BuildingSpec implements AnswerContent {
	
	public String name;
	// NEW(7.8.18 by JMr): Long-distance heating supply
	public boolean LDHeating;
	public int heatTransportLength;
	// ================================
	public Consumption consumption = new Consumption();
	public ArrayList<ProducerSpec> producers = new ArrayList<ProducerSpec>();
	public ArrayList<StorageSpec> storages = new ArrayList<StorageSpec>();
	
	

	public int getNrOfProducers() {
		return producers.size();
	}
	
	public int getNrOfStorages() {
		return storages.size();
	}

}
