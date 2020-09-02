package fortiss.components;

import com.google.gson.annotations.Expose;

/**
 * Volatile is the class for representing volatile Producer objects. Example:
 * PV, SolarThermic
 */
public class Volatile {
	@Expose
	private String name;
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
	public Volatile(String name, String networkType, double minimumPower, double maximumPower, String forecastFile, double cost,
			double coEmission) {
		this.setName(name);
		this.setNetworkType(networkType);
		this.setMinimumPower(minimumPower);
		this.setMaximumPower(maximumPower);
		this.setForecastFile(forecastFile);
		this.setCost(cost);
		this.setCOEmission(coEmission);
	}

	public String getName() {
		return name;
	}

	public void setName(String producerId) {
		this.name = producerId;
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
