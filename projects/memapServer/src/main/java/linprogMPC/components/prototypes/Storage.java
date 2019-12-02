package linprogMPC.components.prototypes;

import java.util.concurrent.TimeUnit;

import akka.basicMessages.AnswerContent;
import linprogMPC.helper.MyTimeUnit;
import linprogMPC.messages.OptimizationResultMessage;
import linprogMPC.messages.planning.StorageMessage;

public abstract class Storage extends Device {

	public double capacity;
	public double max_charging;
	public double max_discharging;
	public double effIN;
	public double effOUT;
	public double stateOfCharge;

	public StorageMessage storageMessage = new StorageMessage();

	public double[] linprogStorageInput = new double[nStepsMPC];
	public double[] linprogStorageOutput = new double[nStepsMPC];

	

	/**
	 * Parameters: capacity, maxIN, maxOUT, effIN, effOUT, port;
	 * 
	 * 
	 * @param capacity
	 * @param max_charging
	 * @param max_discharging
	 * @param effIN
	 * @param effOUT
	 * @param port
	 */
	public Storage(String name, double capacity, double stateOfCharge, double max_charging, double max_discharging, double effIN,
			double effOUT, int port) {
		super(name, port);

		this.capacity = capacity;
		this.stateOfCharge = stateOfCharge;
		this.max_charging = max_charging;
		this.max_discharging = max_discharging;
		this.effIN = effIN;
		this.effOUT = effOUT;
	}

	@Override
	public AnswerContent returnAnswerContentToSend() {

		this.storageMessage.id = this.fullActorPath;

		return storageMessage;
	}

	@Override
	public void handleRequest() {
		if (requestContentReceived instanceof OptimizationResultMessage) {
			OptimizationResultMessage linprogResult = ((OptimizationResultMessage) requestContentReceived);

			String key = this.actorName + "Discharge";
			if (linprogResult.resultMap.containsKey(key)) {
				linprogStorageOutput = linprogResult.resultMap.get(key);
			}

			key = this.actorName + "Charge";
			if (linprogResult.resultMap.containsKey(key)) {
				linprogStorageInput = linprogResult.resultMap.get(key);
			}

			double soc_alt = stateOfCharge;
			double leistung = linprogStorageInput[0] * effIN - linprogStorageOutput[0] * 1 / effOUT;
			stateOfCharge = soc_alt + leistung * MyTimeUnit.stepLength(TimeUnit.MINUTES) / 60;
		}
	}

}
