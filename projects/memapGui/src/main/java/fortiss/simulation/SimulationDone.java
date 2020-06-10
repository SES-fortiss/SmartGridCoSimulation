package fortiss.simulation;

import javax.swing.SwingUtilities;

import fortiss.simulation.listeners.helper.ProgressManager;
import memap.main.SimulationProgress;

public class SimulationDone extends SimulationState {

	/**
	 * Show the results report
	 */
	@Override
	public void execute(ProgressManager pm) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				PlanningTool.showReporter();
				// Restart progress counters
				SimulationProgress.getInstance().restart();
				PlanningTool.getTrackerPanel().restart();
			}
		});
	}
}
