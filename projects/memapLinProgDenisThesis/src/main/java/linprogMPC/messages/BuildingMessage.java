package linprogMPC.messages;

import java.util.ArrayList;

import akka.basicMessages.AnswerContent;
import linprogMPC.messages.individualParts.planning.CouplerMessage;
import linprogMPC.messages.individualParts.planning.DemandMessage;
import linprogMPC.messages.individualParts.planning.StorageMessage;
import linprogMPC.messages.individualParts.realTime.AvailableFlexibilities;
import linprogMPC.messages.individualParts.realTime.CurrentMeterValues;
import linprogMPC.messages.individualParts.realTime.CurrentSetPoints;

public class BuildingMessage implements AnswerContent {
	
	public String name;
	
	// NEW(7.8.18 by JMr): Long-distance heating supply
	
	public boolean LDHeating;
	public int heatTransportLength;
	public boolean ack  = true;
	// ================================
	
	public ArrayList<CurrentMeterValues> currentMeterValueList = new ArrayList<CurrentMeterValues>();
	public ArrayList<CurrentSetPoints> currentSetPointList = new ArrayList<CurrentSetPoints>();
	public ArrayList<AvailableFlexibilities> availableFlexibilitiesList = new ArrayList<AvailableFlexibilities>();
	
	public DemandMessage consumption = new DemandMessage(); // TODO remove
	
	public ArrayList<DemandMessage> demandList = new ArrayList<DemandMessage>();
	public ArrayList<ProducerMessage> volatileProducerList = new ArrayList<ProducerMessage>(); // TODO adapt
	public ArrayList<ProducerMessage> controllableProducerList = new ArrayList<ProducerMessage>(); // TODO adapt
	public ArrayList<StorageMessage> storageList = new ArrayList<StorageMessage>(); // ok
	public ArrayList<CouplerMessage> couplerList = new ArrayList<CouplerMessage>(); // ok
	
	
	
	public int getNrOfProducers() {
		return volatileProducerList.size() + controllableProducerList.size();
	}
	
	public int getNrOfStorages() {
		return storageList.size();
	}
	
	public int getNrOfCouplers() {
		return couplerList.size();
	}
}
