package fortiss.components;

import com.google.gson.annotations.Expose;

/**
 * Demand is the class for representing Consumers.
 */
public class Demand {
	@Expose
	private String name;
	@Expose
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
		setName(name);
		setConsumptionProfile(consumptionProfile);
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
