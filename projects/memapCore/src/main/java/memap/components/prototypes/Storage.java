package memap.components.prototypes;

import java.util.concurrent.TimeUnit;

import akka.basicMessages.AnswerContent;
import memap.helper.MyTimeUnit;
import memap.messages.OptimizationResultMessage;
import memap.messages.planning.StorageMessage;

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

	public Storage(String name, double capacity, double stateOfCharge, double max_charging, double max_discharging,
			double effIN, double effOUT, int port) {
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

			double soc_alt = stateOfCharge;
			double leistung = linprogStorageInput[0] * effIN - linprogStorageOutput[0] * 1 / effOUT;
			stateOfCharge = soc_alt + leistung * MyTimeUnit.stepLength(TimeUnit.MINUTES) / 60;
		}
	}
}
