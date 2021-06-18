package memap.helper.JsonExportHelper;

import com.google.gson.annotations.Expose;

import memap.messages.planning.DemandMessage;

/**
 * Demand is the class for representing Consumers.
 */
public class DemandJsonHelper {

	@Expose
	private String consumptionProfile;
	@Expose
	private String name;

	/**
	 * Constructor for class Demand
	 * 
	 * @param name               an alphanumeric string
	 * @param index              an positive integer
	 * @param consumptionProfile a path to an existing file
	 * @param networkType        a string: Heat or Electricity
	 */
	public DemandJsonHelper(DemandMessage demandMessage) {
		setName(demandMessage.name);
		setConsumptionProfile("");
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
