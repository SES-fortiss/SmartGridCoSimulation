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
 * Volatile is the class for representing volatile Producer objects. Example:
 * PV, SolarThermic
 */
public class Volatile extends Component {

	@Expose
	private String networkType; // Values: Heat or Electricity
	@Expose
	private double minimumPower;
	@Expose
	private double maximumPower;
	@Expose
	private String forecastFile;
	@Expose
	private double cost;
	@Expose
	private double coEmission;
	/** Data read from forecast profiles file */
	private DataInterface data;

	/**
	 * Constructor for class Volatile
	 * 
	 * @param name         an alphanumeric string
	 * @param networkType  a string: Heat or Electricity
	 * @param minimumPower a positive double [kW]
	 * @param maximumPower a positive double [kW]
	 * @param forecastFile a path to an existing file
	 * @param cost         a positive double [EUR]
	 * @param coEmission   CO2 Emissions measured in [g/kWh]
	 */
	public Volatile(Building building, String name, String networkType, double minimumPower, double maximumPower,
			String forecastFile, double cost, double coEmission) {
		super(name, building);
		setNetworkType(networkType);
		setMinimumPower(minimumPower);
		setMaximumPower(maximumPower);
		setForecastFile(forecastFile);
		setCost(cost);
		setCOEmission(coEmission);
		setIcon(new ComponentIcon(this, "volatile", IconStore.sVolatile, IconStore.uVolatile));
	}

	public String getNetworkType() {
		return networkType;
	}

	public void setNetworkType(String networkType) {
		this.networkType = networkType;
		setSaved(false);
	}

	public double getMinimumPower() {
		return minimumPower;
	}

	public void setMinimumPower(double minimumPower) {
		this.minimumPower = minimumPower;
		setSaved(false);
	}

	public double getMaximumPower() {
		return maximumPower;
	}

	public void setMaximumPower(double maximumPower) {
		this.maximumPower = maximumPower;
		setSaved(false);
	}

	public String getForecastFile() {
		return forecastFile;
	}

	public void setForecastFile(String forecastFile) {
		this.forecastFile = forecastFile;
		setData();
		setSaved(false);
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
		setSaved(false);
	}

	public double getCOEmission() {
		return coEmission;
	}

	public void setCOEmission(double coEmission) {
		this.coEmission = coEmission;
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
		String location = getForecastFile();
		String[] labels = { "Normalized Power [%]" };
		if (location == null || location.isEmpty()) {
			location = "FORECASTEXAMPLE"; // Load empty data
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
					.writeWarning("Data for volatile at \"" + location + "\" could not be read. Using zeros only.");
			e.printStackTrace();
			setForecastFile(""); // Fix path and load empty data
		}

	}

}
