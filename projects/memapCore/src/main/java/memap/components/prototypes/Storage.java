package memap.components.prototypes;

import java.util.List;

import akka.basicMessages.AnswerContent;
import memap.controller.TopologyController;
import memap.messages.OptimizationResultMessage;
import memap.messages.planning.StorageMessage;

public abstract class Storage extends Device {

	/** Reference to the topology */
	protected TopologyController topologyController;
	public double capacity;
	public double max_charging;
	public double max_discharging;
	public double effIN;
	public double effOUT;
	public double stateOfCharge;

	public StorageMessage storageMessage = new StorageMessage();

	public double[] linprogStorageInput;
	public double[] optimizationAdviceInput;
	public double[] optimizationAdviceOutput;
	public double[] linprogStorageOutput;

	public Storage(String name, double capacity, double stateOfCharge, double max_charging, double max_discharging,
			double effIN, double effOUT, int port) {
		super(name, port);
		this.capacity = capacity;
		this.stateOfCharge = stateOfCharge;
		this.max_charging = max_charging;
		this.max_discharging = max_discharging;
		this.effIN = effIN;
		this.effOUT = effOUT;
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
	public void handleRequest() {
		if (requestContentReceived instanceof OptimizationResultMessage) {
			double stepLengthInHours = topologyConfig.getStepLengthInHours();
			OptimizationResultMessage linprogResult = ((OptimizationResultMessage) requestContentReceived);

			String dataKey = actorName + "Discharge";
			for (String key : linprogResult.resultMap.keySet()) {		
				if (key.contains(dataKey)) {
					linprogStorageOutput = linprogResult.resultMap.get(key);
				}
			}
			
			dataKey = actorName + "Charge";
			for (String key : linprogResult.resultMap.keySet()) {		
				if (key.contains(dataKey)) {
					linprogStorageInput = linprogResult.resultMap.get(key);
				}
			}

//			double soc_alt = stateOfCharge;
//			double leistung = linprogStorageInput[0] * effIN - linprogStorageOutput[0] * 1 / effOUT;
//			stateOfCharge = soc_alt + leistung * stepLengthInHours;
			stateOfCharge = this.getStateOfCharge();
		}
	}
	
	@Override
	public void setTopologyController(TopologyController topologyController) {
		this.topologyController = topologyController;
	}
}
