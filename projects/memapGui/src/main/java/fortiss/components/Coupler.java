package fortiss.components;

import com.google.gson.annotations.Expose;

/**
 * Coupler is the class for representing Coupler objects. Example: CHP, HeatPump
 */
public class Coupler {
	@Expose
	private String name;
	@Expose
	private String networkTypeP; // Primary, Values: Heat or Electricity
	@Expose
	private String networkTypeS; // Secondary, Values: Heat or Electricity
	@Expose
	private double minimumPower;
	@Expose
	private double maximumPower;
	@Expose
	private double efficiencyPrimary;
	@Expose
	private double efficiencySecondary;
	@Expose
	private double cost;
	@Expose
	private double coEmission;

	/**
	 * Constructor for class Coupler
	 * 
	 * @param name                an alphanumeric string
	 * @param networkTypeP        primary network type. A string: Heat or
	 *                            Electricity
	 * @param networkTypeS        secondary network type. A string: Heat or
	 *                            Electricity
	 * @param minimumPower        a positive double [kW]
	 * @param maximumPower        a positive double [kW]
	 * @param efficiencyPrimary   primary network efficiency. A positive double
	 * @param efficiencySecondary secondary network efficiency. A negative double
	 * @param cost                cost [EUR]
	 * @param coEmission          CO2 Emissions measured in [g/kWh]
	 */
	public Coupler(String name, String networkTypeP, String networkTypeS, double minimumPower, double maximumPower,
			double efficiencyPrimary, double efficiencySecondary, double cost, double coEmission) {
		this.setName(name);
		this.setNetworkTypeP(networkTypeP);
		this.setNetworkTypeS(networkTypeS);
		this.setMinimumPower(minimumPower);
		this.setMaximumPower(maximumPower);
		this.setEfficiencyPrimary(efficiencyPrimary);
		this.setEfficiencySecondary(efficiencySecondary);
		this.setCost(cost);
		this.setCOEmission(coEmission);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNetworkTypeP() {
		return networkTypeP;
	}

	public void setNetworkTypeP(String networkTypeP) {
		this.networkTypeP = networkTypeP;
	}

	public String getNetworkTypeS() {
		return networkTypeS;
	}

	public void setNetworkTypeS(String networkTypeS) {
		this.networkTypeS = networkTypeS;
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

	public double getEfficiencyPrimary() {
		return efficiencyPrimary;
	}

	public void setEfficiencyPrimary(double efficiencyNetworkP) {
		this.efficiencyPrimary = efficiencyNetworkP;
	}

	public double getEfficiencySecondary() {
		return efficiencySecondary;
	}

	public void setEfficiencySecondary(double efficiencyNetworkS) {
		this.efficiencySecondary = efficiencyNetworkS;
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
