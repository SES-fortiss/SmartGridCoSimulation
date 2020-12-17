package fortiss.components;

import com.google.gson.annotations.Expose;

import fortiss.gui.icons.ComponentIcon;
import fortiss.media.IconStore;

/**
 * Demand is the class for representing Consumers.
 */
public class Demand extends Component {
	
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
	public Demand(Building building, String name, String consumptionProfile) {
		super(name, building);
		setConsumptionProfile(consumptionProfile);
		setIcon(new ComponentIcon(this, "demand", IconStore.sDemand, IconStore.uDemand));
	}

	public String getConsumptionProfile() {
		return consumptionProfile;
	}

	public void setConsumptionProfile(String consumptionFile) {
		this.consumptionProfile = consumptionFile;
	}
	
}
