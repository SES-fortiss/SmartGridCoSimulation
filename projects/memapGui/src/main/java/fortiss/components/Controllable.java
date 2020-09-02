package fortiss.components;

import com.google.gson.annotations.Expose;

/**
 * Controllable is the class for representing controllable Producer objects.
 * Example: Gas Boiler
 */
public class Controllable {
	@Expose
	private String name;
	@Expose
	private String networkType; // Values: Heat or Electricity
	@Expose
	private double minimumPower;
	@Expose
	private double maximumPower;
	@Expose
	private double efficiency;
	@Expose
	private double cost;
	@Expose
	private double coEmission;

	/**
	 * Constructor for class Controllable
	 * 
	 * @param name        an alphanumeric string
	 * @param networkType a string: Heat or Electricity
	 * @param minimumPower        a positive double [kW]
	 * @param maximumPower        a positive double [kW]
	 * @param efficiency  a positive double
	 * @param cost        a positive double [EUR]
	 * @param coEmission  CO2 Emissions measured in [g/kWh]
	 */
	public Controllable(String name, String networkType, double minimumPower, double maximumPower, double efficiency, double cost,
			double coEmission) {
		this.setName(name);
		this.setNetworkType(networkType);
		this.setMinimumPower(minimumPower);
		this.setMaximumPower(maximumPower);
		this.setEfficiency(efficiency);
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

	public double getEfficiency() {
		return efficiency;
	}

	public void setEfficiency(double efficiency) {
		this.efficiency = efficiency;
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
