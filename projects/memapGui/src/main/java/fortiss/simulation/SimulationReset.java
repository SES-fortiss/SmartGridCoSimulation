package fortiss.simulation;

import javax.swing.SwingUtilities;

import fortiss.simulation.helper.ProgressManager;
import memap.main.SimulationProgress;

public class SimulationReset extends SimulationState {

	@Override
	public void execute(ProgressManager pm) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				PlanningTool planningTool = PlanningTool.getInstance();
				planningTool.closeTracker();
				planningTool.showLog();
				// Restart progress counters
				SimulationProgress.getInstance().restart();
				planningTool.getTrackerPanel().restart();
			}
		});
	}
	
}
