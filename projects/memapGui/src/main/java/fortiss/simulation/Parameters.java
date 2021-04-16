package fortiss.simulation;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;

import fortiss.gui.DesignerPanel;
import fortiss.gui.listeners.helper.CO2Emission;
import fortiss.gui.listeners.helper.ElectricityPrice;
import fortiss.gui.listeners.helper.HeatPrice;
import fortiss.gui.listeners.helper.Price;
import fortiss.media.IconStore;

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
	private int stepsPerDay;
	/** steps MPC horizon. An integer */
	@Expose
	private int mpcHorizon;
	/** days Number of days to be simulated */
	@Expose
	private int days;
	/** optCriteria a String. Optimization criteria: {cost, co2} */
	@Expose
	private String optCriteria;
	/** optimizer a String. Optimizer: {LP, MILP} */
	@Expose
	private String optimizer;
	/** loggingMode a String. loggingMode: {allLogs, fileLogs, resultLogs} */
	@Expose
	private String loggingMode;
	@Expose
	private Price elecSellingPrice;
	@Expose
	private Price elecBuyingPrice;
	@Expose
	private Price heatBuyingPrice;
	@Expose
	private Price co2Emissions;

	/**
	 * Constructor for class Parameters
	 */
	public Parameters() {
		setSimulationName("InteractiveMEMAP");
		setStepsPerDay(24);
		// Initially setter is not called, so that the prices are not updated
		this.mpcHorizon = 2;
		setDays(1);
		setOptimizer(optimizerOptions.get(0));
		setOptCriteria(criteriaOptions.get(0));
		setLoggingMode(loggingOptions.get(0));
		setElecBuyingPrice(new ElectricityPrice(0.275, mpcHorizon));
		setElecSellingPrice(new ElectricityPrice(0.275, mpcHorizon));
		setHeatBuyingPrice(new HeatPrice(0.275, mpcHorizon));
		setCO2Emissions(new CO2Emission(0.275, mpcHorizon));
	}

	public Parameters(String simulationName, int simulationSteps, int mpcHorizon, int days, String optCriteria,
			String optimizer, String loggingMode, Price elecBuyingPrice, Price elecSellingPrice,
			Price heatBuyingPrice, Price co2Emissions) {
		setSimulationName(simulationName);
		setStepsPerDay(simulationSteps);
		// Initially setter is not called, so that the prices are not updated
		this.mpcHorizon = 2;
		setDays(days);
		setOptimizer(optimizer);
		setOptCriteria(optCriteria);
		setLoggingMode(loggingMode);
		setElecBuyingPrice(elecBuyingPrice);
		setElecSellingPrice(elecSellingPrice);
		setHeatBuyingPrice(heatBuyingPrice);
		setCO2Emissions(co2Emissions);
	}

	public String getSimulationName() {
		return simulationName;
	}

	public void setSimulationName(String simulationName) {
		this.simulationName = simulationName;
		setSaved(false);
	}

	public int getStepsPerDay() {
		return stepsPerDay;
	}

	public void setStepsPerDay(int stepsPerDay) {
		this.stepsPerDay = stepsPerDay;
		setSaved(false);
	}

	public int getMPCHorizon() {
		return mpcHorizon;
	}

	public void setMPCHorizon(int mpcHorizon) {
		this.mpcHorizon = mpcHorizon;
		elecBuyingPrice.updateMPCHorizon(mpcHorizon);
		elecSellingPrice.updateMPCHorizon(mpcHorizon);
		heatBuyingPrice.updateMPCHorizon(mpcHorizon);
		setSaved(false);
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
		setSaved(false);
	}

	public String getOptimizer() {
		return optimizer;
	}

	private void setOptimizer(String optimizer) {
		this.optimizer = optimizer;
		setSaved(false);
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
		setSaved(false);
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

	public String getLoggingMode() {
		return loggingMode;
	}

	private void setLoggingMode(String loggingMode) {
		this.loggingMode = loggingMode;
		setSaved(false);
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

	public Price getElecSellingPrice() {
		return elecSellingPrice;
	}

	public void setElecSellingPrice(Price elecSellingPrice) {
		this.elecSellingPrice = elecSellingPrice;
	}

	public Price getElecBuyingPrice() {
		return elecBuyingPrice;
	}

	public void setElecBuyingPrice(Price elecBuyingPrice) {
		this.elecBuyingPrice = elecBuyingPrice;
	}

	public Price getHeatBuyingPrice() {
		return heatBuyingPrice;
	}

	public void setHeatBuyingPrice(Price heatBuyingPrice) {
		this.heatBuyingPrice = heatBuyingPrice;
	}
	
	public void setCO2Emissions(Price co2Emissions) {
		this.co2Emissions = co2Emissions;
	}
	
	public Price getCO2Emissions() {
		return co2Emissions;
	}
	
	public void setSaved(boolean saved) {
		PlanningTool.getInstance().setSaved(saved);
	}

}
