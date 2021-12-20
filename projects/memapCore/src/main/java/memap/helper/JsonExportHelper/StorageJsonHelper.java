package memap.helper.JsonExportHelper;

import com.google.gson.annotations.Expose;

import memap.messages.extension.NetworkType;
import memap.messages.planning.StorageMessage;

/**
 * Storage is the class for representing Storage objects. Example: Battery,
 * ThermalStorage.
 */
public class StorageJsonHelper {

	@Expose
	private String name;
	@Expose
	private String networkType;
	@Expose
	private double capacity;
	@Expose
	private double soc;
	@Expose
	private double losses;
	@Expose
	private double maxCharging;
	@Expose
	private double maxDischarging;
	@Expose
	private double effIN;
	@Expose
	private double effOUT;

	/**
	 * Constructor for class Storage
	 * 
	 * @param name           an alphanumeric string
	 * @param networkType    a string: Heat or Electricity
	 * @param capacity       a positive double
	 * @param soc            state of charge
	 * @param losses         losses [%/h]. Percentage is in [0, 1]
	 * @param maxCharging    maximum charging rate. A positive double
	 * @param maxDischarging maximum discharging rate. A positive double
	 * @param effIN          charging efficiency. A positive double
	 * @param effOUT         discharging efficiency. A positive double
	 */
	public StorageJsonHelper(StorageMessage storageMessage) {
		setName(storageMessage.name);
		setNetworkType(storageMessage.networkType);
		setCapacity(storageMessage.capacity);
		setSoc(storageMessage.stateOfCharge);
		setLosses(storageMessage.storageLosses[0]);
		setMaxCharging(storageMessage.maxLoad);
		setMaxDischarging(storageMessage.maxDischarge);
		setEffIN(storageMessage.efficiencyCharge);
		setEffOUT(storageMessage.efficiencyDischarge);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getNetworkType() {
		return networkType;
	}

	public void setNetworkType(NetworkType networkType) {
		this.networkType = networkType.toString();
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public double getSoc() {
		return soc;
	}

	public void setSoc(double soc) {
		this.soc = soc;
	}

	public double getLosses() {
		return losses;
	}

	public void setLosses(double losses) {
		// TODO, we might add units for losses in future. We should assure that it is written here correctly.
		this.losses = losses;
	}

	public double getMaxCharging() {
		return maxCharging;
	}

	public void setMaxCharging(double maxCharging) {
		this.maxCharging = maxCharging;
	}

	public double getMaxDischarging() {
		return maxDischarging;
	}

	public void setMaxDischarging(double maxDischargeRate) {
		this.maxDischarging = maxDischargeRate;
	}

	public double getEffIN() {
		return effIN;
	}

	public void setEffIN(double efficiencyCharge) {
		this.effIN = efficiencyCharge;
	}

	public double getEffOUT() {
		return effOUT;
	}

	public void setEffOUT(double efficiencyDischarge) {
		this.effOUT = efficiencyDischarge;
	}

}
