package linprogMPC.components;

import linprogMPC.messages.types.NetworkType;

public class Battery extends Storage {	
		
	/**
	 * Parameters: capacity, maxIN, maxOUT, effIN, effOUT, port;
	 * 
	 * 
	 * @param capacity
	 * @param max_charging
	 * @param max_dischariging
	 * @param effIN
	 * @param effOUT
	 * @param port
	 */
	public Battery(
			double capacity,
			double max_charging, double max_dischariging, 
			double effIN, double effOUT, int port
			) {
		
		super(capacity, max_charging, max_dischariging, effIN, effOUT, port);
	}
	
	public void makeDecision() {		
		// alle parameter mit schicken.
		storageMessage.networkType = NetworkType.ELECTRICITY;
		storageMessage.operationalPriceEURO = 0.0001;						
		storageMessage.capacity = this.capacity;		
		storageMessage.maxLoad = this.max_charging;
		storageMessage.maxDischarge = this.max_discharging;
		storageMessage.efficiencyCharge = this.effIN;
		storageMessage.efficiencyDischarge = this.effOUT;		
		storageMessage.stateOfCharge = myStateOfCharge;
		storageMessage.name = this.actorName;
	}
	
}