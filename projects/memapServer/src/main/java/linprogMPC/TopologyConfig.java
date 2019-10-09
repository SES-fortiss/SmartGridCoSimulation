package linprogMPC;

/**
 * Stores topology configuration
 */

public abstract class TopologyConfig {

	/** Name of the simulation */
	public static String simulationName;

	/** Prediction uncertainty */
	public static int PREDICTION_UNCERTAINTY;

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

	/**
	 * Simulation mode: global (<code>true</code>) or individual
	 * (<code>false</code>)
	 */
	public static boolean MEMAP_ON = false;

	/** Port number */
	public static int PORT_UNDEFINED;
	
	/** Long distance heating. Available if <code>true</code> */
	public static boolean MEMAP_LDHeating;
	/** Losses due to heat */
	public static double HEAT_LOSSES;
	
	public static void calcNrSteps() {
		N_STEPS = NR_OF_ITERATIONS + N_STEPS_MPC;
	}
	
	public static void calcNrIterations() {
		NR_OF_ITERATIONS = NR_DAYS * TIMESTEPS_PER_DAY;
	}
}
