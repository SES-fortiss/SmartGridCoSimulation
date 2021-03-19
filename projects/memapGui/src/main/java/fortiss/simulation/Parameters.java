package fortiss.simulation;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

import com.google.gson.annotations.Expose;

import fortiss.datastructures.DataInterface;
import fortiss.datastructures.TimedDataAdapter;
import fortiss.gui.DesignerPanel;
import fortiss.gui.listeners.helper.FileManager;
import fortiss.media.IconStore;
import fortiss.simulation.helper.Logger;
import memap.examples.ExampleFiles;
import memap.helper.profilehandler.TimedData;

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

	/** Simulation name */
	@Expose
	private String simulationName;
	/** length MemapSimulation steps. An integer */
	@Expose
	private int length;
	/** steps MPC horizon. An integer */
	@Expose
	private int steps;
	/** days Number of days to be simulated */
	@Expose
	private int days;
	/** hasfixedPrice a boolean. Fixed (true)/ variable (false) */
	@Expose
	private boolean hasfixedPrice;
	/** path to a file that describe variability in market prices */
	@Expose
	private String marketPriceFile;
	/** A fixed value for market price */
	@Expose
	private double fixedMarketPrice = 0;
	/** optCriteria a String. Optimization criteria: {cost, co2} */
	@Expose
	private String optCriteria;
	/** optimizer a String. Optimizer: {LP, MILP} */
	@Expose
	private String optimizer;
	/** loggingMode a String. loggingMode: {allLogs, fileLogs, resultLogs} */
	@Expose
	private String loggingMode;
	/** Data read from price files */
	private DataInterface priceData;

	/**
	 * Constructor for class Parameters
	 */
	public Parameters() {
		setSimulationName("InteractiveMEMAP");
		setLength(24);
		setSteps(2);
		setDays(1);
		setFixedPrice(true);
		setFixedMarketPrice(0.275);
		setMarketPriceFile("");
		setOptimizer(optimizerOptions.get(0));
		setOptCriteria(criteriaOptions.get(0));
		setLoggingMode(loggingOptions.get(0));
	}

	public String getSimulationName() {
		return simulationName;
	}

	public void setSimulationName(String simulationName) {
		this.simulationName = simulationName;
	}
	
	public int getStepsPerDay() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getMPCHorizon() {
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
		return hasfixedPrice;
	}

	public void setFixedPrice(boolean price) {
		this.hasfixedPrice = price;
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
			DesignerPanel.parameterPanel.lbOptimizer2.setIcon(IconStore.optimizer.get(0));
		} else {
			setOptimizer(optimizerOptions.get(index + 1));
			DesignerPanel.parameterPanel.lbOptimizer2.setIcon(IconStore.optimizer.get(index + 1));
		}
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
			DesignerPanel.parameterPanel.lbOptCriteria2.setIcon(IconStore.optCriteria.get(0));
		} else {
			setOptCriteria(criteriaOptions.get(index + 1));
			DesignerPanel.parameterPanel.lbOptCriteria2.setIcon(IconStore.optCriteria.get(index + 1));
		}
	}

	public String getMarketPriceFile() {
		return marketPriceFile;
	}

	public void setMarketPriceFile(String marketPriceFile) {
		this.marketPriceFile = marketPriceFile;
		setData();
	}
	
	/**
	 * @return the data
	 */
	public DataInterface getData() {
		return priceData;
	}
	
	/**
	 * @param priceData the data to set
	 */
	public void setData() {
		String location = getMarketPriceFile();

		if (location == null || location.isEmpty()) {
			location = "ELECTRICITYPRICEEXAMPLE"; // Load empty data
		}
		
		try {
			FileManager fm = new FileManager();
			ExampleFiles ef = new ExampleFiles();
			String [] labels = new String[] {"Price [EUR/kWh]"};
			if (ef.isExample(location)) {
				this.priceData = new TimedDataAdapter(new TimedData(fm.readFromResources(ef.getFile(location)), labels));
			} else {
				this.priceData = new TimedDataAdapter(new TimedData(fm.readFromSource(location), labels));
				System.out.println(Parameters.class + " new data loaded.");
				System.out.println(Parameters.class + " data: " + this.priceData.getYValues("Price [EUR/kWh]"));
			}
		} catch (IOException | ParseException e) {
				Logger.getInstance()
						.writeWarning("Data for variable market price at \"" + location + "\" could not be read. Using zeros only.");
				e.printStackTrace();
				setMarketPriceFile(""); // Fix path and load empty data
		}

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
			DesignerPanel.parameterPanel.lbLoggingMode2.setIcon(IconStore.loggingMode.get(0));
		} else {
			setLoggingMode(loggingOptions.get(index + 1));
			DesignerPanel.parameterPanel.lbLoggingMode2.setIcon(IconStore.loggingMode.get(index + 1));
		}
	}
}
