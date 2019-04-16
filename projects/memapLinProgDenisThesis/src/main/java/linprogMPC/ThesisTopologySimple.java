package linprogMPC;

/**
 *
 * Topology for example with 5 buildings with Linear Programming
 * 
 * @author andreas.thut
 *
 */
public abstract class ThesisTopologySimple {
    public static String simulationName;

    // ================= Model Predictive Control (MPC) =================
    public static int N_STEPS_MPC; // equals N_STEPS for case of overall optimization, smaller for case of MPC
    public static int PREDICTION_UNCERTAINTY;

    public static int TIMESTEPS_PER_DAY; // Timesteps muss ganze Minuten ergeben.
    public static int NR_DAYS;
    public static int NR_OF_ITERATIONS; // X Days
    public static int N_STEPS; // benötigt man damit der Optimierer funktioniert.

    public static boolean MEMAP_ON = true;

    @SuppressWarnings("unused")
    private static int port = 9999;

    public static boolean MEMAP_LDHeating;
    public static double HEAT_LOSSES;

    protected static void setStepsMPC(int stepsMPC) {
	N_STEPS_MPC = stepsMPC;
    }

    protected static void setPredUncertainty(int predUncertainty) {
	PREDICTION_UNCERTAINTY = predUncertainty;
    }

    protected static void setTimeStepsPerDay(int timeStepsPerDay) {
	TIMESTEPS_PER_DAY = timeStepsPerDay;
    }

    protected static void setMemapOn(boolean memapOn) {
	MEMAP_ON = memapOn;
    }

    protected static void setMemapLDHeating(boolean hasLDHeating) {
	MEMAP_LDHeating = hasLDHeating;
    }

    protected static void setHeatLoss(double HeatLoss) {
	HEAT_LOSSES = HeatLoss;
    }

    protected static void setNrOfDays(int nrDays) {
	NR_DAYS = nrDays;
    }

    protected static void calcNrIterations() {
	NR_OF_ITERATIONS = NR_DAYS * TIMESTEPS_PER_DAY;
    }

    protected static void calcNrSteps() {
	N_STEPS = NR_OF_ITERATIONS + N_STEPS_MPC;
    }
}
