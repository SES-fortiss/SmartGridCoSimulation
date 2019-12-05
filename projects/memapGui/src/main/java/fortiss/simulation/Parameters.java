package fortiss.simulation;

import java.io.File;
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

	/** paths to descriptor files */
	private ArrayList<File> descriptorFiles = new ArrayList<File>();
	/** length MemapSimulation steps. An integer */
	private int length;
	/** steps MPC horizon. An integer */
	private int steps;
	/** days Number of days to be simulated */
	private int days;
	/** fixedPrice a boolean. Fixed (true)/ variable (false) */
	private boolean fixedPrice;
	/** path to a file that describe variability in market prices */
	private String marketPriceFile;
	/** A fixed value for market price */
	private double fixedMarketPrice = 0;
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
		setFixedPrice(true);
		setMarketPriceFile("");
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

	public boolean isFixedPrice() {
		return fixedPrice;
	}

	public void setFixedPrice(boolean price) {
		this.fixedPrice = price;
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
			Designer.parameterPanel.lbOptCriteria2.setIcon(Icon.optCriteria.get(0));
		} else {
			setOptCriteria(criteriaOptions.get(index + 1));
			Designer.parameterPanel.lbOptCriteria2.setIcon(Icon.optCriteria.get(index + 1));
		}
	}

	public ArrayList<File> getDescriptorFiles() {
		return descriptorFiles;
	}

	public void addDescriptorFile(File descriptorFile) {
		descriptorFiles.add(descriptorFile);
	}

	public String getMarketPriceFile() {
		return marketPriceFile;
	}

	public void setMarketPriceFile(String marketPriceFile) {
		this.marketPriceFile = marketPriceFile;
	}

	public double getFixedMarketPrice() {
		return fixedMarketPrice;
	}

	public void setFixedMarketPrice(double fixedMarketPrice) {
		this.fixedMarketPrice = fixedMarketPrice;
	}
}
