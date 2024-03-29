package fortiss.components;

import com.google.gson.annotations.Expose;

import fortiss.gui.icons.ComponentIcon;
import fortiss.media.IconStore;

/**
 * Storage is the class for representing Storage objects. Example: Battery,
 * ThermalStorage.
 */
public class Storage extends Component {

	@Expose
	private String networkType;
	@Expose
	private double capacity;
	@Expose
	private double soc;
	@Expose
	private double losses;
	@Expose
	private double maxCharging;
	@Expose
	private double maxDischarging;
	@Expose
	private double effIN;
	@Expose
	private double effOUT;

	/**
	 * Constructor for class Storage
	 * 
	 * @param name           an alphanumeric string
	 * @param networkType    a string: Heat or Electricity
	 * @param capacity       a positive double
	 * @param soc            state of charge
	 * @param losses         losses [%/h]. Percentage is in [0, 1]
	 * @param maxCharging    maximum charging rate. A positive double
	 * @param maxDischarging maximum discharging rate. A positive double
	 * @param effIN          charging efficiency. A positive double
	 * @param effOUT         discharging efficiency. A positive double
	 */
	public Storage(Building building, String name, String networkType, double capacity, double soc, double losses,
			double maxCharging, double maxDischarging, double effIN, double effOUT) {
		super(name, building);
		setNetworkType(networkType);
		setCapacity(capacity);
		setSoc(soc);
		setLosses(losses);
		setMaxCharging(maxCharging);
		setMaxDischarging(maxDischarging);
		setEffIN(effIN);
		setEffOUT(effOUT);
		setIcon(new ComponentIcon(this, "storage", IconStore.sStorage, IconStore.uStorage));
	}

	public String getNetworkType() {
		return networkType;
	}

	public void setNetworkType(String networkType) {
		this.networkType = networkType;
		setSaved(false);
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
		setSaved(false);
	}

	public double getSoc() {
		return soc;
	}

	public void setSoc(double soc) {
		this.soc = soc;
		setSaved(false);
	}

	public double getLosses() {
		return losses;
	}

	public void setLosses(double losses) {
		// TODO, we might add units for losses in future. We should assure that it is written here correctly.
		this.losses = losses;
		setSaved(false);
	}

	public double getMaxCharging() {
		return maxCharging;
	}

	public void setMaxCharging(double maxCharging) {
		this.maxCharging = maxCharging;
		setSaved(false);
	}

	public double getMaxDischarging() {
		return maxDischarging;
	}

	public void setMaxDischarging(double maxDischargeRate) {
		this.maxDischarging = maxDischargeRate;
		setSaved(false);
	}

	public double getEffIN() {
		return effIN;
	}

	public void setEffIN(double efficiencyCharge) {
		this.effIN = efficiencyCharge;
		setSaved(false);
	}

	public double getEffOUT() {
		return effOUT;
	}

	public void setEffOUT(double efficiencyDischarge) {
		this.effOUT = efficiencyDischarge;
		setSaved(false);
	}

}
