package fortiss.components;

/**
 * Volatile is the class for representing volatile Producer objects. Example:
 * PV, SolarThermic
 */
public class Volatile {
	private String name;
	private String networkType; // Values: Heat or Electricity
	private double power;
	private String forecastFile;
	private double cost;
	private double coEmission;

	/**
	 * Constructor for class Volatile
	 * 
	 * @param name         an alphanumeric string
	 * @param networkType  a string: Heat or Electricity
	 * @param power        a positive double
	 * @param forecastFile a path to an existing file
	 * @param cost         a positive double
	 * @param coEmission   CO2 Emissions measured in [g/kWh]
	 */
	public Volatile(String name, String networkType, double power, String forecastFile, double cost,
			double coEmission) {
		this.setName(name);
		this.setNetworkType(networkType);
		this.setPower(power);
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

	public double getPower() {
		return power;
	}

	public void setPower(double power) {
		this.power = power;
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
