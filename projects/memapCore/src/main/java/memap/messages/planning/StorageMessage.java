package memap.messages.planning;

import com.google.gson.Gson;

import akka.basicMessages.AnswerContent;
import memap.messages.extension.NetworkType;

public class StorageMessage implements AnswerContent {
	
	public String id;
	public String name;
	
	public double operationalCostEUR;
	public double operationalCostCO2;
	
	public double capacity;
	public double stateOfCharge;
	public double storageEnergyContent;
	
	public double maxLoad;
	public double maxDischarge;
	
	public double efficiencyCharge;
	public double efficiencyDischarge;
	
	public double storageLosses;
	public STORAGELOSS_UNITS storageLossUnit;
	
	public NetworkType networkType;
	
	public String toString() {
		Gson gson = new Gson();
		String result = "";
		result = gson.toJson(this);
		return result;
	}
	
	public enum STORAGELOSS_UNITS {
        WATT, KWH_DAY, PERCENT_HOUR, PERCENT_MONTH;
    } 

}
