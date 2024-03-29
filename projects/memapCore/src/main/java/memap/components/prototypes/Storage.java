package memap.components.prototypes;

import akka.basicMessages.AnswerContent;
import memap.controller.TopologyController;
import memap.messages.planning.StorageMessage;
import memap.messages.planning.StorageMessage.STORAGELOSS_UNITS;

public abstract class Storage extends Device {

	/** Reference to the topology */
	protected TopologyController topologyController;
	public double capacity;
	public double max_charging;
	public double max_discharging;
	public double effIN;
	public double effOUT;
	
	/** NEW Stuff */
	public double stateOfCharge;
	public double storageEnergyContent;
	public double storageLoss; 
	public STORAGELOSS_UNITS storageLossUnit = STORAGELOSS_UNITS.PERCENT_HOUR; // Unit [%/h] Example 0.021 represents 2.1%/h

	public StorageMessage storageMessage = new StorageMessage();

	public double[] storageChargeRequest;
	public double[] optimizationAdviceInput;
	public double[] optimizationAdviceOutput;
	public double[] storageDischargeRequest;

	public Storage(String name, double capacity, double stateOfCharge, double max_charging, double max_discharging,
			double effIN, double effOUT, double storageLoss,int port) {
		super(name, port);
		this.capacity = capacity;
		this.stateOfCharge = stateOfCharge;
		this.max_charging = max_charging;
		this.max_discharging = max_discharging;
		this.effIN = effIN;
		this.effOUT = effOUT;
		this.storageLoss = storageLoss;

		
		// Initialization delayed until after topologyConfig initialization
		optimizationAdviceInput = new double[topologyConfig.getNrStepsMPC()];
		optimizationAdviceOutput = new double[topologyConfig.getNrStepsMPC()];
	}

	@Override
	public AnswerContent returnAnswerContentToSend() {

		this.storageMessage.id = this.fullActorPath;
		return storageMessage;
	}
	
	/**
	 * Implement this method to retrieve the current SOC.
	 * 
	 * @param timeStep
	 * @return State Of Charge
	 */
	public abstract Double getStateOfCharge();
	
	
	@Override
	public void setTopologyController(TopologyController topologyController) {
		this.topologyController = topologyController;
	}
}
