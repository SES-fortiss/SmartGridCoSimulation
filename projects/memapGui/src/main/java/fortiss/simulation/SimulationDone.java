package fortiss.simulation;

import fortiss.simulation.listeners.helper.ProgressManager;

public class SimulationDone extends SimulationState {

	/**
	 * Show the results report
	 */
	@Override
	public void execute(ProgressManager pm) {
		PlanningTool.showReporter();
	}
}
