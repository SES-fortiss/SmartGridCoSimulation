package memap;

/**
 * Define simulation parameters.
 */
public class MemapConfig {
	/*
	 * Model Predictive Control (MPC)
	 * 
	 * @par N_STEPS_MPC MPC horizon. Equals N_STEPS for case of overall
	 * optimization, smaller for case of MPC.
	 * 
	 * @par TIMESTEPS_PER_DAY an integer. Unit: minutes.
	 * 
	 * @par DAYS an integer.
	 * 
	 * @par NR_OF_ITERATIONS Total time steps.
	 * 
	 * @par N_STEPS Total number of steps
	 * 
	 * @par MEMAP_ON Optimization mode
	 */

	public static int PREDICTION_UNCERTAINTY;
	public static int N_STEPS_MPC;
	public static int TIMESTEPS_PER_DAY;
	public static int DAYS;
	public static int NR_OF_ITERATIONS;
	public static int N_STEPS;
	public static boolean MEMAP_ON;

	/*
	 * Components
	 * 
	 * @par NR_OF_CONSUMERS Agents with demand objects? demand objects?
	 * 
	 * @par PORT_UNDEFINED
	 * 
	 * @par HEAT_LOSSES Losses due to heat.
	 */
	public static int NR_OF_CONSUMERS;
	public static boolean MEMAP_LDHeating;
	public static double HEAT_LOSSES;
}
