package fortiss.simulation.helper;

import fortiss.simulation.SimulationInitialize;
import fortiss.simulation.SimulationState;

/** Manage the progress of the simulation and the actions to be performed according to the state */
public class ProgressManager {

	private final static ProgressManager pm = new ProgressManager();

	private SimulationState currentState;

	public ProgressManager() {
		setState(new SimulationInitialize());
	}

	/**
	 * Set {@link #currentState}
	 * 
	 * @param stateProgression an object of class SimulationState
	 */
	public void setState(SimulationState stateProgression) {
		currentState = stateProgression;
	}

	/**
	 * Execute tasks according to the {@link #currentState} of the application
	 */
	public void execute() {
		currentState.execute(this);
	}

	/**
	 * @return ProgressManager instance
	 */
	public static ProgressManager getInstance() {
		return pm;
	}

}
