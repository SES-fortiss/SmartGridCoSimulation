package fortiss.simulation;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

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
	
	/** optimizerOptions List of optimizers available */
	@SuppressWarnings("serial")
	private transient ArrayList<String> optimizerOptions = new ArrayList<String>() {
		{
			add("lp");
			add("milp");
		}
	};
	
	/** loggingOptions List of logging modes available */
	@SuppressWarnings("serial")
	private transient ArrayList<String> loggingOptions = new ArrayList<String>() {
		{
			add("resultLogs");
			add("fileLogs");
			add("allLogs");
		}
	};

	/** paths to descriptor files */
	private Set<File> descriptorFiles = new HashSet<File>();
	/** Simulation name */
	private String simulationName;
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
	/** optimizer a String. Optimizer: {LP, MILP} */
	private String optimizer;
	/** loggingMode a String. loggingMode: {allLogs, fileLogs, resultLogs} */
	private String loggingMode;
	/** lastSavedFile remembers the last save of a file this allows to reset the session during next startup */
	private String lastSavedFile;

	/**
	 * Constructor for class Parameters
	 */
	public Parameters() {
		setSimulationName("InteractiveMEMAP");
		setLength(24);
		setSteps(2);
		setDays(1);
		setFixedPrice(true);
		setFixedMarketPrice(27.5);
		setMarketPriceFile("");
		setOptimizer(optimizerOptions.get(0));
		setMemapON(false);
		setOptCriteria(criteriaOptions.get(0));
		setLoggingMode(loggingOptions.get(0));
		setLastSavedFile("");
		clearDescriptorFile();
	}

	public String getSimulationName() {
		return simulationName;
	}

	public void setSimulationName(String simulationName) {
		this.simulationName = simulationName;
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

	public String getOptimizer() {
		return optimizer;
	}

	private void setOptimizer(String optimizer) {
		this.optimizer = optimizer;
	}
	
	public void nextOptimizer() {
		int index = optimizerOptions.indexOf(optimizer);

		if (index == optimizerOptions.size() - 1) {
			setOptimizer(optimizerOptions.get(0));
			Designer.parameterPanel.lbOptimizer2.setIcon(Icon.optimizer.get(0));
		} else {
			setOptimizer(optimizerOptions.get(index + 1));
			Designer.parameterPanel.lbOptimizer2.setIcon(Icon.optimizer.get(index + 1));
		}
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

	private void setOptCriteria(String optCriteria) {
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

	public Set<File> getDescriptorFiles() {
		return descriptorFiles;
	}

	public void addDescriptorFile(File descriptorFile) {
		descriptorFiles.add(descriptorFile);
	}
	
	public void clearDescriptorFile() {
		descriptorFiles.clear();
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

	public String getLoggingMode() {
		return loggingMode;
	}

	private void setLoggingMode(String loggingMode) {
		this.loggingMode = loggingMode;
	}
	
	public void nextLoggingMode() {
		int index = loggingOptions.indexOf(loggingMode);

		if (index == loggingOptions.size() - 1) {
			setLoggingMode(loggingOptions.get(0));
			Designer.parameterPanel.lbLoggingMode2.setIcon(Icon.loggingMode.get(0));
		} else {
			setLoggingMode(loggingOptions.get(index + 1));
			Designer.parameterPanel.lbLoggingMode2.setIcon(Icon.loggingMode.get(index + 1));
		}
	}

	public String getLastSavedFile() {
		return lastSavedFile;
	}

	public void setLastSavedFile(String lastSavedFile) {
		this.lastSavedFile = lastSavedFile;
	}
}
