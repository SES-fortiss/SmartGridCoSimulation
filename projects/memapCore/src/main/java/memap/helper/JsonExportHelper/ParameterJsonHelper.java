package memap.helper.JsonExportHelper;

import com.google.gson.annotations.Expose;

/**
 * Stores the parameter configuration selected by the user and the default
 * values.
 */
public class ParameterJsonHelper {

	/** Simulation name */
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
	private PriceJsonHelper maxBuyLimit;
	@Expose
	private PriceJsonHelper elecSellingPrice;
	@Expose
	private PriceJsonHelper elecBuyingPrice;
	@Expose
	private PriceJsonHelper heatBuyingPrice;
	@Expose
	private PriceJsonHelper co2Emissions;

	
	public ParameterJsonHelper(int simulationSteps, int mpcHorizon, int days, String optCriteria,
			String optimizer, String loggingMode, PriceJsonHelper maxBuyLimit, PriceJsonHelper elecBuyingPrice, PriceJsonHelper elecSellingPrice,
			PriceJsonHelper heatBuyingPrice, PriceJsonHelper co2Emissions) {
		setSimulationName("ImportFromMEMAPServer");
		setStepsPerDay(simulationSteps);
		this.mpcHorizon = mpcHorizon;
		setDays(days);
		setOptimizer(optimizer);
		setOptCriteria(optCriteria);
		setLoggingMode(loggingMode);
		setMaxBuyLimit(maxBuyLimit);
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
	}

	public int getStepsPerDay() {
		return stepsPerDay;
	}

	public void setStepsPerDay(int stepsPerDay) {
		this.stepsPerDay = stepsPerDay;
	}

	public int getMPCHorizon() {
		return mpcHorizon;
	}

	public void setMPCHorizon(int mpcHorizon) {
		this.mpcHorizon = mpcHorizon;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public String getOptimizer() {
		return optimizer;
	}

	private void setOptimizer(String optimizer) {
		this.optimizer = optimizer;
	}

	public String getOptCriteria() {
		return optCriteria;
	}

	private void setOptCriteria(String optCriteria) {
		this.optCriteria = optCriteria;
	}

	public String getLoggingMode() {
		return loggingMode;
	}

	private void setLoggingMode(String loggingMode) {
		this.loggingMode = loggingMode;
	}

	public PriceJsonHelper getMaxBuyLimit() {
		return maxBuyLimit;
	}

	public void setMaxBuyLimit(PriceJsonHelper maxBuyLimit) {
		this.maxBuyLimit = maxBuyLimit;
	}
	
	public PriceJsonHelper getElecSellingPrice() {
		return elecSellingPrice;
	}

	public void setElecSellingPrice(PriceJsonHelper elecSellingPrice) {
		this.elecSellingPrice = elecSellingPrice;
	}

	public PriceJsonHelper getElecBuyingPrice() {
		return elecBuyingPrice;
	}

	public void setElecBuyingPrice(PriceJsonHelper elecBuyingPrice) {
		this.elecBuyingPrice = elecBuyingPrice;
	}

	public PriceJsonHelper getHeatBuyingPrice() {
		return heatBuyingPrice;
	}

	public void setHeatBuyingPrice(PriceJsonHelper heatBuyingPrice) {
		this.heatBuyingPrice = heatBuyingPrice;
	}
	
	public void setCO2Emissions(PriceJsonHelper co2Emissions) {
		this.co2Emissions = co2Emissions;
	}
	
	public PriceJsonHelper getCO2Emissions() {
		return co2Emissions;
	}

}
