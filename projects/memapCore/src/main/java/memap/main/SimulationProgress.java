package memap.main;

import akka.timeManagement.CurrentTimeStepSubscriber;

/**
 * Tracks the simulation progress, considering both global and
 * per building optimization
 */
public class SimulationProgress implements CurrentTimeStepSubscriber {
	private static final SimulationProgress sp = new SimulationProgress();

	/** Simulation status*/
	private Status status;
	/** Error to be printed in the gui */
	private String error;
	
	private double progress = 0;
	private final int max = (TopologyConfig.getInstance().getNrDays()
			* TopologyConfig.getInstance().getTimeStepsPerDay());

	private SimulationProgress() {
		setStatus(Status.OK, "");
	}
	
	public void restart() {
		progress = 0;
		setStatus(Status.OK, "");
	}
	
	public static SimulationProgress getInstance() {
		return sp;
	}

	public double getProgress() {
		return progress * 100 / max;
	}

	@Override
	public void update(int currentTimeStep) {
		if (currentTimeStep > progress) {
			progress = currentTimeStep;
		}
	}

	/**
	 * @return the status
	 */
	public Status getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Status status, String error) {
		this.status = status;
		setError(error);
	}

	/**
	 * @return the error
	 */
	public String getError() {
		return error;
	}

	/**
	 * @param error the error to set
	 */
	private void setError(String error) {
		this.error = error;
	}

}
