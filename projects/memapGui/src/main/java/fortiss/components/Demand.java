package fortiss.components;

import java.io.IOException;
import java.text.ParseException;

import com.google.gson.annotations.Expose;

import fortiss.datastructures.DataInterface;
import fortiss.datastructures.TimedDataAdapter;
import fortiss.gui.icons.ComponentIcon;
import fortiss.gui.listeners.helper.FileManager;
import fortiss.media.IconStore;
import fortiss.simulation.helper.Logger;
import memap.examples.ExampleFiles;
import memap.helper.profilehandler.TimedData;

/**
 * Demand is the class for representing Consumers.
 */
public class Demand extends Component {

	@Expose
	private String consumptionProfile;
	/** Data read from consumption profiles file */
	private DataInterface data;

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
		setData();
		setSaved(false);
	}

	/**
	 * @return the data
	 */
	public DataInterface getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData() {		
		
		String location = getConsumptionProfile();
		String[] labels = { "Electricity", "Heat" };

		if (location == null || location.isEmpty()) {
			location = "CONSUMPTIONEXAMPLE0"; // Load empty data
		}

		try {
			FileManager fm = new FileManager();
			ExampleFiles ef = new ExampleFiles();
			if (ef.isExample(location)) {
				this.data = new TimedDataAdapter(new TimedData(fm.readFromResources(ef.getFile(location)), labels));
			} else {
				this.data = new TimedDataAdapter(new TimedData(fm.readFromSource(location), labels));
			}
		} catch (IOException | ParseException e) {
			Logger.getInstance()
					.writeWarning("Data for demand at \"" + location + "\" could not be read. Using zeros only.");
			e.printStackTrace();

			setConsumptionProfile(""); // Fix path and load empty data

		}
	}

}
