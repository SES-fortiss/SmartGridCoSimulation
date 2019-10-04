package linprogMPC.components;

import linprogMPC.components.prototypes.Storage;
import linprogMPC.messages.extension.NetworkType;

public class ThermalStorage extends Storage {

	/**
	 * Parameters: capacity, maxIN, maxOUT, effIN, effOUT, port;
	 * 
	 * 
	 * @param capacity
	 * @param qdot_max_in
	 * @param qdot_max_out
	 * @param effIN
	 * @param effOUT
	 * @param port
	 */
	public ThermalStorage(
			double capacity,
			double max_charging, double max_dischariging, 
			double effIN, double effOUT, int port
			) {
		super(capacity, max_charging, max_dischariging, effIN, effOUT, port);
	}
	
	@Override
	public void makeDecision() {
		storageMessage.stateOfCharge = myStateOfCharge;
		
		// alle parameter ändern sich nicht während der laufzeit.
		storageMessage.networkType = NetworkType.HEAT;
		storageMessage.name = this.actorName;
		storageMessage.id = this.fullActorPath;
		storageMessage.operationalPriceEURO = 0.0001;	
		storageMessage.operationalPriceCO2 = 0.0;
		storageMessage.capacity = this.capacity;		
		storageMessage.maxLoad = this.max_charging;
		storageMessage.maxDischarge = this.max_discharging;
		storageMessage.efficiencyCharge = this.effIN;
		storageMessage.efficiencyDischarge = this.effOUT;		
	}
}
