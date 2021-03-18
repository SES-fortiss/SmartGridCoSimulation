package memap.components.prototypes;

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
	
	public double storageLoss; // Unit [%/h] Example 0.021 represents 2.1%/h

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
		// TODO remove hard coding.
		// this.storageLoss = storageLoss;
		
		this.storageLoss = 0.1;
		
		
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
			if (linprogResult.resultMap.containsKey(dataKey)) {
				storageDischargeRequest = linprogResult.resultMap.get(dataKey);
			}
			
			dataKey = actorName + "Charge";			
			if (linprogResult.resultMap.containsKey(dataKey)) {
				storageChargeRequest = linprogResult.resultMap.get(dataKey);
			}
			
			if (storageChargeRequest!= null && storageDischargeRequest!= null) {
				double soc_alt = stateOfCharge;
				double leistung = storageChargeRequest[0] * effIN - storageDischargeRequest[0] * 1 / effOUT;
				//stateOfCharge = soc_alt + leistung * stepLengthInHours;
				stateOfCharge = soc_alt * Math.pow(1-storageLoss, stepLengthInHours) + leistung * stepLengthInHours;
			}
		}
	}
	
	@Override
	public void setTopologyController(TopologyController topologyController) {
		this.topologyController = topologyController;
	}
}
