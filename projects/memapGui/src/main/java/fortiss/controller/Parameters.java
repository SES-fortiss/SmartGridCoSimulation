package fortiss.controller;

import java.util.ArrayList;

import fortiss.gui.Designer;
import fortiss.media.Icon;

/**
 * Stores the parameter configuration selected by the user and the default
 * values.
 */
public class Parameters {

	/** criteriaOptions List of optimization criteria */
	@SuppressWarnings("serial")
	private transient ArrayList<String> criteriaOptions = new ArrayList<String>() {
		{
			add("cost");
			add("co2");
		}
	};

	/** length MemapSimulation steps. An integer */
	private int length;
	/** steps MPC horizon. An integer */
	private int steps;
	/** days Number of days to be simulated */
	private int days;
	/** weather a boolean. Good weather (true)/ bad weather(false) */
	private boolean weather;
	/** price a boolean. Fixed (true)/ volatile (false) */
	private boolean price;
	/** memapON a boolean. On(true)/ off (false) */
	private boolean memapON;
	/** optCriteria a String. Optimization criteria: {cost, co2} */
	private String optCriteria;
	/**
	 * runInServer a boolean. Simulation is run in the server if <code>true</code>
	 */
	private boolean runInServer;

	/**
	 * Constructor for class Parameters
	 */
	public Parameters() {
		setLength(96);
		setSteps(24);
		setDays(1);
		setWeather(true);
		setPrice(true);
		setMemapON(false);
		setRunInServer(false);
		setOptCriteria(criteriaOptions.get(0));
	}

	public void setRunInServer(boolean runInServer) {
		this.runInServer = runInServer;
	}

	public boolean getRunInServer() {
		return runInServer;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getSteps() {
		return steps;
	}

	public void setSteps(int nstep) {
		this.steps = nstep;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public boolean isWeather() {
		return weather;
	}

	public void setWeather(boolean weather) {
		this.weather = weather;
	}

	public boolean isPrice() {
		return price;
	}

	public void setPrice(boolean price) {
		this.price = price;
	}

	public boolean isMemapON() {
		return memapON;
	}

	public void setMemapON(boolean memapON) {
		this.memapON = memapON;
	}

	public String getOptCriteria() {
		return optCriteria;
	}

	public void setOptCriteria(String optCriteria) {
		this.optCriteria = optCriteria;
	}

	public void nextOptCriteria() {
		int index = criteriaOptions.indexOf(optCriteria);

		if (index == criteriaOptions.size() - 1) {
			setOptCriteria(criteriaOptions.get(0));
			Designer.control.lbOptCriteria2.setIcon(Icon.optCriteria.get(0));
		} else {
			setOptCriteria(criteriaOptions.get(index + 1));
			Designer.control.lbOptCriteria2.setIcon(Icon.optCriteria.get(index + 1));
		}
	}
}
