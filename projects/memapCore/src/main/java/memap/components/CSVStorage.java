package memap.components;

import memap.components.prototypes.Storage;
import memap.controller.TopologyController;
import memap.messages.extension.NetworkType;

public class CSVStorage extends Storage {
	
	NetworkType networkType;
	double opCost;
	double costCO2;

	/**
	 * @param name            storage name
	 * @param capacity        storage capacity in [kWh]
	 * @param max_charging    maximum charge rate [kW]
	 * @param max_discharging maximum discharge rate [kW]
	 * @param effIN           charge efficiency [0-1]
	 * @param effOUT          discharge efficiency [0-1]
	 * @param networkType
	 * @param opCost          optimization cost [EUR]
	 * @param costCO2         CO2 cost [kg CO2/kWh]
	 * @param port
	 */
	public CSVStorage(String name, double capacity, double stateOfCharge, double max_charging, double max_discharging,
			double effIN, double effOUT, NetworkType networkType, double opCost, double costCO2, double storageLoss, int port) {
		super(name, capacity, stateOfCharge, max_charging, max_discharging, effIN, effOUT, storageLoss, port);
		this.networkType = networkType;
		this.opCost = opCost;
		this.costCO2 = costCO2;
	}

	@Override
	public void makeDecision() {
		storageMessage.id = fullActorPath;
		storageMessage.name = actorName;
		storageMessage.operationalCostEUR = opCost;
		storageMessage.operationalCostCO2 = costCO2;
		storageMessage.capacity = capacity;
		storageMessage.stateOfCharge = stateOfCharge;
		storageMessage.maxLoad = max_charging;
		storageMessage.maxDischarge = max_discharging;
		storageMessage.efficiencyCharge = effIN;
		storageMessage.efficiencyDischarge = effOUT;
		storageMessage.networkType = networkType;
		storageMessage.storageLosses = storageLoss;
	}
	
	/** Passes a reference of an object of class {@link TopologyController} to the parent class */
	@Override
	public void setTopologyController(TopologyController topologyController) {
		super.setTopologyController(topologyController);
	}
	
	@Override
	public Double getStateOfCharge() {		
		return stateOfCharge;
	}

}
