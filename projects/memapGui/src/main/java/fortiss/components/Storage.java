package fortiss.components;

/**
 * Storage is the class for representing Storage objects. Example: Battery,
 * ThermalStorage.
 */
public class Storage {
	private String name;
	private String networkType;
	private double capacity;
	private double maxCharging;
	private double maxDischarging;
	private double effIN;
	private double effOUT;

	/**
	 * Constructor for class Storage
	 * 
	 * @param name           an alphanumeric string
	 * @param networkType    a string: Heat or Electricity
	 * @param capacity       a positive double
	 * @param maxCharging    maximum charging rate. A positive double
	 * @param maxDischarging maximum discharging rate. A positive double
	 * @param effIN          charging efficiency. A positive double
	 * @param effOUT         discharging efficiency. A positive double
	 */
	public Storage(String name, String networkType, double capacity, double maxCharging, double maxDischarging,
			double effIN, double effOUT) {
		this.setName(name);
		this.setNetworkType(networkType);
		this.setMaxCharging(maxCharging);
		this.setMaxDischarging(maxDischarging);
		this.setEffIN(effIN);
		this.setEffOUT(effOUT);
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

	public void setNetworkType(String networkType) {
		this.networkType = networkType;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
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
