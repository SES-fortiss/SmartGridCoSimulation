package linprogMPC.messages;

import java.util.ArrayList;

import akka.basicMessages.AnswerContent;

public class BuildingMessage implements AnswerContent {
	
	public String name;
	
	// NEW(7.8.18 by JMr): Long-distance heating supply
	
	public boolean LDHeating;
	public int heatTransportLength;
	// ================================
	public ConsumptionMessage consumption = new ConsumptionMessage();
	public ArrayList<ProducerMessage> producers = new ArrayList<ProducerMessage>();
	public ArrayList<StorageMessage> storages = new ArrayList<StorageMessage>();

	public int getNrOfProducers() {
		return producers.size();
	}
	
	public int getNrOfStorages() {
		return storages.size();
	}

}
