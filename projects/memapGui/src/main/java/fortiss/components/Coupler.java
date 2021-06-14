package fortiss.components;

import com.google.gson.annotations.Expose;

import fortiss.gui.icons.ComponentIcon;
import fortiss.media.IconStore;

/**
 * Coupler is the class for representing Coupler objects. Example: CHP, HeatPump
 */
public class Coupler extends Component {

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
	public Coupler(Building building, String name, String networkTypeP, String networkTypeS, double minimumPower, double maximumPower,
			double efficiencyPrimary, double efficiencySecondary, double cost, double coEmission) {
		super(name, building);
		setNetworkTypeP(networkTypeP);
		setNetworkTypeS(networkTypeS);
		setMinimumPower(minimumPower);
		setMaximumPower(maximumPower);
		setEfficiencyPrimary(efficiencyPrimary);
		setEfficiencySecondary(efficiencySecondary);
		setCost(cost);
		setCOEmission(coEmission);
		setIcon(new ComponentIcon(this, "coupler", IconStore.sCoupler, IconStore.uCoupler));
	}

	public String getNetworkTypeP() {
		return networkTypeP;
	}

	public void setNetworkTypeP(String networkTypeP) {
		this.networkTypeP = networkTypeP;
		setSaved(false);
	}

	public String getNetworkTypeS() {
		return networkTypeS;
	}

	public void setNetworkTypeS(String networkTypeS) {
		this.networkTypeS = networkTypeS;
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

	public double getEfficiencyPrimary() {
		return efficiencyPrimary;
	}

	public void setEfficiencyPrimary(double efficiencyNetworkP) {
		this.efficiencyPrimary = efficiencyNetworkP;
		setSaved(false);
	}

	public double getEfficiencySecondary() {
		return efficiencySecondary;
	}

	public void setEfficiencySecondary(double efficiencyNetworkS) {
		this.efficiencySecondary = efficiencyNetworkS;
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

}
