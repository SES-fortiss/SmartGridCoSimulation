package linprogMPC.components;

import linprogMPC.components.prototypes.Storage;
import linprogMPC.messages.extension.NetworkType;

public class CSVStorage extends Storage {
    NetworkType networkType;

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
    public CSVStorage(double capacity, double max_charging, double max_dischariging, double effIN, double effOUT,
	    NetworkType networkType, int port) {
	super(capacity, max_charging, max_dischariging, effIN, effOUT, port);
	this.networkType = networkType;
    }

    @Override
    public void makeDecision() {
	storageMessage.stateOfCharge = myStateOfCharge;

	// alle parameter ändern sich nicht während der laufzeit.
	storageMessage.networkType = this.networkType;
	storageMessage.name = this.actorName;
	storageMessage.id = this.fullActorPath;
	storageMessage.operationalPriceEURO = 0.0001;
	storageMessage.capacity = this.capacity;
	storageMessage.maxLoad = this.max_charging;
	storageMessage.maxDischarge = this.max_discharging;
	storageMessage.efficiencyCharge = this.effIN;
	storageMessage.efficiencyDischarge = this.effOUT;
    }

}
