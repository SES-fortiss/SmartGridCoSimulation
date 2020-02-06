package memap.main;

import memap.helper.EnergyPrices;

/**
 * Stores topology configuration
 */

public abstract class TopologyConfig {

	/** Name of the simulation */
	public static String simulationName;

	/**
	 * MPC horizon. Equals N_STEPS for case of overall optimization, smaller for
	 * case of MPC
	 */
	public static int N_STEPS_MPC;

	/** Number of steps per day. Unit: minutes */
	public static int TIMESTEPS_PER_DAY;
	/** Number of days */
	public static int NR_DAYS;
	/** Number of iterations */
	public static int NR_OF_ITERATIONS;
	/** Total number of steps */
	public static int N_STEPS;
	
	/** Must be calculated before N_STEPS*/
	public static void calcNrIterations() {
		NR_OF_ITERATIONS = NR_DAYS * TIMESTEPS_PER_DAY;
	}
	
	public static void calcNrSteps() {
		N_STEPS = NR_OF_ITERATIONS + N_STEPS_MPC;
	}
	
	/** Port number */
	public static int PORT_UNDEFINED;
	
	/** Prediction uncertainty */
	public static int PREDICTION_UNCERTAINTY;
	
	/** Energy prices for simulation */
	public static EnergyPrices energyPrices;
}
