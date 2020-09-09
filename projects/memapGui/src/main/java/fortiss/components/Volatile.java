package fortiss.components;

import com.google.gson.annotations.Expose;

import fortiss.gui.icons.ComponentIcon;
import fortiss.media.IconStore;

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

	/**
	 * Constructor for class Volatile
	 * 
	 * @param name         an alphanumeric string
	 * @param networkType  a string: Heat or Electricity
	 * @param minimumPower        a positive double [kW]
	 * @param maximumPower        a positive double [kW]
	 * @param forecastFile a path to an existing file
	 * @param cost         a positive double [EUR]
	 * @param coEmission   CO2 Emissions measured in [g/kWh]
	 */
	public Volatile(Building building, String name, String networkType, double minimumPower, double maximumPower, String forecastFile, double cost,
			double coEmission) {
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
	}

	public double getMinimumPower() {
		return minimumPower;
	}

	public void setMinimumPower(double minimumPower) {
		this.minimumPower = minimumPower;
	}
	
	public double getMaximumPower() {
		return maximumPower;
	}

	public void setMaximumPower(double maximumPower) {
		this.maximumPower = maximumPower;
	}

	public String getForecastFile() {
		return forecastFile;
	}

	public void setForecastFile(String forecastFile) {
		this.forecastFile = forecastFile;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getCOEmission() {
		return coEmission;
	}

	public void setCOEmission(double coEmission) {
		this.coEmission = coEmission;
	}

}
