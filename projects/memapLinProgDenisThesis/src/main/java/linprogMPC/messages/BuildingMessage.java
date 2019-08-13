package linprogMPC.messages;

import java.util.ArrayList;

import akka.basicMessages.AnswerContent;
import linprogMPC.messages.extension.ChildSpecification;
import linprogMPC.messages.extension.NetworkType;
import linprogMPC.messages.planning.CouplerMessage;
import linprogMPC.messages.planning.DemandMessage;
import linprogMPC.messages.planning.ProducerMessage;
import linprogMPC.messages.planning.StorageMessage;
import linprogMPC.messages.realTime.AvailableFlexibilities;
import linprogMPC.messages.realTime.CurrentMeterValues;
import linprogMPC.messages.realTime.CurrentSetPoints;

public class BuildingMessage implements AnswerContent {
	
	public String name;
	public String id;
	
	// NEW(7.8.18 by JMr): Long-distance heating supply
	
	public boolean LDHeating;
	public int heatTransportLength;
	public boolean ack  = true;
	// ================================
	
	public ArrayList<CurrentSetPoints> currentSetPointList = new ArrayList<CurrentSetPoints>();
	public ArrayList<CurrentMeterValues> currentMeterValueList = new ArrayList<CurrentMeterValues>();
	public ArrayList<AvailableFlexibilities> availableFlexibilitiesList = new ArrayList<AvailableFlexibilities>();
	
	public ArrayList<DemandMessage> demandList = new ArrayList<DemandMessage>();
	public ArrayList<StorageMessage> storageList = new ArrayList<StorageMessage>();
	public ArrayList<CouplerMessage> couplerList = new ArrayList<CouplerMessage>();
	public ArrayList<ProducerMessage> volatileProducerList = new ArrayList<ProducerMessage>();
	public ArrayList<ProducerMessage> controllableProducerList = new ArrayList<ProducerMessage>();
	public ArrayList<String> someValues=new ArrayList<String>();
	boolean yes=someValues.add("Dieser Wert");
	
	public ArrayList<ChildSpecification> childrenList = new ArrayList<ChildSpecification>();
	
	public int getNrOfProducers() {
		return volatileProducerList.size() + controllableProducerList.size();
	}
	
	public int getNrOfStorages() {
		return storageList.size();
	}
	
	public int getNrOfCouplers() {
		return couplerList.size();
	}

	/**
	 * returns a single double[] array, where the heat represents the first 
	 * n-entries and electricity the second n-entries. 
	 */
	public double[] getCombinedDemandVector() {
		double[] result = null;		
		for (DemandMessage dm : demandList) {
			
			// init result
			if (result == null) {
				if (dm.networkType == NetworkType.DEMANDWITHBOTH){
					result = new double[dm.getDemandVector().length];
				}
				if (dm.networkType == NetworkType.HEAT){
					result = new double[2*dm.getDemandVector().length];
				}
				if (dm.networkType == NetworkType.ELECTRICITY){
					result = new double[2*dm.getDemandVector().length];
				}				
			}
			
			// add consumptions
			if (dm.networkType == NetworkType.DEMANDWITHBOTH){
				for (int i = 0; i < result.length; i++) {
					result[i] += dm.getDemandVector()[i];
				}
			}			
			
			if (dm.networkType == NetworkType.HEAT){
				for (int i = 0; i < dm.getDemandVector().length; i++) {
					result[i] += dm.getDemandVector()[i];
				}
			}
			
			if (dm.networkType == NetworkType.ELECTRICITY){				
				int length = dm.getDemandVector().length;				
				for (int i = 0; i < length; i++) {
					result[length+i] += dm.getDemandVector()[i];
				}
			}
			
		}
		
		return result;
	}
}
