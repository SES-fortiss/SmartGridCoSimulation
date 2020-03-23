package fortiss.simulation;

import fortiss.simulation.listeners.helper.ProgressManager;
import memap.main.SimulationProgress;

public class SimulationDone extends SimulationState {

	/**
	 * Show the results report
	 */
	@Override
	public void execute(ProgressManager pm) {
		PlanningTool.showReporter();
		// Restart progress counters 
		SimulationProgress.getInstance().restart();
		PlanningTool.getTrackerPanel().restart();
	}
}
