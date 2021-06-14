package memap.main;

import akka.timeManagement.CurrentTimeStepSubscriber;

/**
 * Tracks the simulation progress, considering both global and per building
 * optimization
 */
public class SimulationProgress implements CurrentTimeStepSubscriber {
	private static final SimulationProgress sp = new SimulationProgress();

	/** Simulation status */
	private static Status status;
	/** Error to be printed in the gui */
	private static String error;

	private static double progress = 1.1;
	private static final int max = (TopologyConfig.getInstance().getNrDays()
			* TopologyConfig.getInstance().getTimeStepsPerDay());

	private SimulationProgress() {
		setStatus(Status.OK, "");
	}

	public void restart() {
		progress = 1.1;
		setStatus(Status.OK, "");
	}

	public static SimulationProgress getInstance() {
		return sp;
	}

	public static double getProgress() {
		return progress * 100 / (max);
	}

	/**
	 * Update the simulation progress considering the individual progress on each
	 * simulation thread
	 */
	@Override
	public void update(int currentTimeStep) {
		// The progress of the slowest progress is determines the speed		
		if (currentTimeStep < progress) {
			progress = currentTimeStep+1.01;
		}		
	}

	/**
	 * @return the status
	 */
	public static Status getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Status status, String error) {
		SimulationProgress.status = status;
		setError(error);
	}

	/**
	 * @return the error
	 */
	public static String getError() {
		return error;
	}

	/**
	 * @param error the error to set
	 */
	private void setError(String error) {
		SimulationProgress.error = error;
	}

}
