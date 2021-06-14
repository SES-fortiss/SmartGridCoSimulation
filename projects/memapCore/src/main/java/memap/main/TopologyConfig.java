package memap.main;

import memap.helper.EnergyPrices;

/**
 * Stores simulation parameters for a given topology
 * 
 * Note: Any parameter that gets its value or dimension from a parameter of
 * class {@link TopologyConfig} must delay its initialization until after the
 * {@link #init(int, int, int, EnergyPrices, int, int)} is called. Otherwise,
 * the behavior is undefined.
 */
public final class TopologyConfig {
	/**
	 * Model predictive control (MPC) horizon. Equals N_STEPS for case of overall
	 * optimization, smaller for case of MPC
	 */
	private int nrStepsMPC;
	/** Number of steps per day. Unit: minutes */
	private int timeStepsPerDay;
	/** Number of days */
	private int nrDays;
	/** Number of iterations */
	private int nrOfIterations;
	/** Total number of steps */
	private int nrSteps;

	/** Port number */
	private int portUndefined;

	/** Prediction uncertainty */
	private int predictionUncertainty;

	/** Singular instance of {@link TopologyConfig} */
	private static TopologyConfig instance = new TopologyConfig();

	/** Set values to the parameters of {@link TopologyConfig} */
	public void init(int nrStepsMPC, int timeStepsPerDay, int nrDays, int portUndefined, int predictionUncertainty) {
		this.nrStepsMPC = nrStepsMPC;
		this.timeStepsPerDay = timeStepsPerDay;
		this.nrDays = nrDays;
		nrOfIterations = nrDays * timeStepsPerDay; // requires previous parameters
		nrSteps = getNrOfIterations() + nrStepsMPC; // requires previous parameters
		this.portUndefined = portUndefined;
		this.predictionUncertainty = predictionUncertainty;
	}

	/** @return the instance of {@link TopologyConfig} */
	public static TopologyConfig getInstance() {
		return instance;
	}

	/** @return number of model predictive control (MPC) steps */
	public int getNrStepsMPC() {
		return nrStepsMPC;
	}

	/** @return time steps per day */
	public int getTimeStepsPerDay() {
		return timeStepsPerDay;
	}

	/** @return number of days */
	public int getNrDays() {
		return nrDays;
	}

	/** @return number of iterations */
	public int getNrOfIterations() {
		return nrOfIterations;
	}

	/** @return number of simulation steps */
	public int getNrSteps() {
		return nrSteps;
	}

	/** @return undefined port number */
	public int getPortUndefined() {
		return portUndefined;
	}

	/** Increases the undefined port number by one */
	public void increasePortUndefined() {
		portUndefined++;
	}

	/** @return prediction uncertainty */
	public int getPredictionUncertainty() {
		return predictionUncertainty;
	}

	/** @return step length in hours */
	public double getStepLengthInHours() {
		// Decimal point is important to avoid automatic data type conversion
		return 24.0 / timeStepsPerDay;
	}

	/** @return step length in minutes */
	public double getStepLengthInMinutes() {
		// Decimal point is important to avoid automatic data type conversion
		return 24.0 * 60.0 / timeStepsPerDay;
	}

	/** @return step length in seconds */
	public double getStepLengthInSeconds() {
		// Decimal point is important to avoid automatic data type conversion
		return 24.0 * 3600.0 / timeStepsPerDay;
	}
}
