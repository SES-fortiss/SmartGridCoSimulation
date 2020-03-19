package fortiss.simulation;

import javax.swing.SwingUtilities;

import fortiss.gui.TrackerPanel;
import fortiss.simulation.listeners.helper.ProgressManager;
import memap.controller.GuiController;
import memap.main.SimulationProgress;

public class SimulationOptimize extends SimulationState {

	/** Reference to the tracker panel */
	TrackerPanel trackerPanel;

	/** Reference to the simulation progress */
	private SimulationProgress sp;

	/**
	 * Start the optimization stage
	 * 
	 * @param pm the progress manager
	 */
	@Override
	public void execute(ProgressManager pm) {
		trackerPanel = PlanningTool.getTrackerPanel();
		sp = SimulationProgress.getInstance();
		trackerPanel.setMessage("Optimization in progress");
		trackerPanel.setIndeterminate(false);

		startOptimization(pm);

		trackOptimization();
	}

	/**
	 * Updates the trackerPanel according to the progress of the simulation
	 */
	private void trackOptimization() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (!trackerPanel.isDone()) {
					Runnable pb = new Runnable() {
						@Override
						public void run() {
							trackerPanel.setProgress((int) (sp.getProgress()));
						}
					};
					SwingUtilities.invokeLater(pb);
					try {
						Thread.sleep(20);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}

			}
		}).start();
	}

	/**
	 * Starts the optimization
	 */
	private void startOptimization(ProgressManager pm) {
		new Thread() {
			@Override
			public void run() {
				GuiController gc = PlanningTool.getGuiController();
				gc.startSimulation();
				pm.setState(new SimulationDone());
				pm.execute();
			}
		}.start();
	}
}
