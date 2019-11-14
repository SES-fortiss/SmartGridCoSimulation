package fortiss.components;

/**
 * Demand is the class for representing Consumers.
 */
public class Demand {
	private String name;
	private int index;
	private String consumptionProfile;
	private String networkType;

	/**
	 * Constructor for class Demand
	 * 
	 * @param name               an alphanumeric string
	 * @param index              an positive integer
	 * @param consumptionProfile a path to an existing file
	 * @param networkType        a string: Heat or Electricity
	 */
	public Demand(String name, int index, String consumptionProfile, String networkType) {
		this.setName(name);
		this.setIndex(index);
		this.setConsumptionProfile(consumptionProfile);
		this.setNetworkType(networkType);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getConsumptionProfile() {
		return consumptionProfile;
	}

	public void setConsumptionProfile(String consumptionFile) {
		this.consumptionProfile = consumptionFile;
	}

	public String getNetworkType() {
		return networkType;
	}

	public void setNetworkType(String networkType) {
		this.networkType = networkType;
	}

}
