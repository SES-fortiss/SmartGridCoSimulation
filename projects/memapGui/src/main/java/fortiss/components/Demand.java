package fortiss.components;

/**
 * Demand is the class for representing Consumers.
 */
public class Demand {
	private String name;
	private String consumptionProfile;

	/**
	 * Constructor for class Demand
	 * 
	 * @param name               an alphanumeric string
	 * @param index              an positive integer
	 * @param consumptionProfile a path to an existing file
	 * @param networkType        a string: Heat or Electricity
	 */
	public Demand(String name, String consumptionProfile) {
		this.setName(name);
		this.setConsumptionProfile(consumptionProfile);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getConsumptionProfile() {
		return consumptionProfile;
	}

	public void setConsumptionProfile(String consumptionFile) {
		this.consumptionProfile = consumptionFile;
	}

}
