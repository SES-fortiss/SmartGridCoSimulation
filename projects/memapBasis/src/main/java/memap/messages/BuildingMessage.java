package memap.messages;

import java.util.ArrayList;

import akka.basicMessages.AnswerContent;
import memap.messages.extension.ChildSpecification;
import memap.messages.extension.NetworkType;
import memap.messages.planning.CouplerMessage;
import memap.messages.planning.DemandMessage;
import memap.messages.planning.ProducerMessage;
import memap.messages.planning.StorageMessage;
import memap.messages.realTime.AvailableFlexibilities;
import memap.messages.realTime.CurrentMeterValues;
import memap.messages.realTime.CurrentSetPoints;

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
				/*if (dm.networkType == NetworkType.DEMANDWITHBOTH){
					result = new double[dm.getDemandVector().length];
				}*/
				if (dm.networkType == NetworkType.HEAT){
					result = new double[2*dm.getDemandVector().length];
				}
				if (dm.networkType == NetworkType.ELECTRICITY){
					result = new double[2*dm.getDemandVector().length];
				}				
			}
			
			// add consumptions
			/*if (dm.networkType == NetworkType.DEMANDWITHBOTH){
				for (int i = 0; i < result.length; i++) {
					result[i] += dm.getDemandVector()[i];
				}
			}			*/
			
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
