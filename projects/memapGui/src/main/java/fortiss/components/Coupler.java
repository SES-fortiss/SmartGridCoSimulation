package fortiss.components;

/**
 * Coupler is the class for representing Coupler objects. Example: CHP, HeatPump
 */
public class Coupler {
	private String name;
	private String networkTypeP; // Primary, Values: Heat or Electricity
	private String networkTypeS; // Secondary, Values: Heat or Electricity
	private double power;
	private double efficiencyPrimary;
	private double efficiencySecondary;
	private double cost;
	private double coEmission;

	/**
	 * Constructor for class Coupler
	 * 
	 * @param name                an alphanumeric string
	 * @param networkTypeP        primary network type. A string: Heat or
	 *                            Electricity
	 * @param networkTypeS        secondary network type. A string: Heat or
	 *                            Electricity
	 * @param power               a positive double
	 * @param efficiencyPrimary   primary network efficiency. A positive double
	 * @param efficiencySecondary secondary network efficiency. A negative double
	 * @param cost                cost
	 * @param coEmission          CO2 Emissions measured in [g/kWh]
	 */
	public Coupler(String name, String networkTypeP, String networkTypeS, double power, double efficiencyPrimary,
			double efficiencySecondary, double cost, double coEmission) {
		this.setName(name);
		this.setNetworkTypeP(networkTypeP);
		this.setNetworkTypeS(networkTypeS);
		this.setPower(power);
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

	public double getPower() {
		return power;
	}

	public void setPower(double power) {
		this.power = power;
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
