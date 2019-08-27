package fortiss.components;

/**
 * Controllable is the class for representing controllable Producer objects.
 * Example: Gas Boiler
 */
public class Controllable {
	private String name;
	private String networkType; // Values: Heat or Electricity
	private double power;
	private double efficiency;
	private double cost;
	private double coEmission;

	/**
	 * Constructor for class Controllable
	 * 
	 * @param name        an alphanumeric string
	 * @param networkType a string: Heat or Electricity
	 * @param power       a positive double
	 * @param efficiency  a positive double
	 * @param cost        a positive double
	 * @param coEmission  CO2 Emissions measured in [g/kWh]
	 */
	public Controllable(String name, String networkType, double power, double efficiency, double cost,
			double coEmission) {
		this.setName(name);
		this.setNetworkType(networkType);
		this.setPower(power);
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

	public double getPower() {
		return power;
	}

	public void setPower(double power) {
		this.power = power;
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
