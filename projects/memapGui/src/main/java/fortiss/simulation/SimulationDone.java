package fortiss.simulation;

import javax.swing.SwingUtilities;

import fortiss.simulation.helper.ProgressManager;
import memap.main.SimulationProgress;

public class SimulationDone extends SimulationState {

	/**
	 * Show the results report
	 */
	@Override
	public void execute(ProgressManager pm) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				PlanningTool planningTool = PlanningTool.getInstance();
				planningTool.showReporter();
				planningTool.closeTracker();
				// Restart progress counters
				SimulationProgress.getInstance().restart();
				planningTool.getTrackerPanel().restart();
			}
		});
	}
}
