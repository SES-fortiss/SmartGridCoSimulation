package fortiss.simulation;

import fortiss.simulation.helper.ProgressManager;

/** A stage in the simulation */
public abstract class SimulationState {
	public abstract void execute(ProgressManager pm);
}
