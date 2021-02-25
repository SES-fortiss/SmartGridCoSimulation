package fortiss.simulation;

import javax.swing.SwingUtilities;

import fortiss.gui.TrackerPanel;
import fortiss.simulation.helper.Logger;
import fortiss.simulation.helper.ProgressManager;
import memap.controller.GuiController;
import memap.main.SimulationProgress;
import memap.main.Status;

public class SimulationOptimize extends SimulationState {

	/** Reference to the tracker panel */
	TrackerPanel trackerPanel;

	/**
	 * Start the optimization stage
	 * 
	 * @param pm the progress manager
	 */
	@Override
	public void execute(ProgressManager pm) {
		PlanningTool planningTool = PlanningTool.getInstance();
		trackerPanel = planningTool.getTrackerPanel();
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
							if (SimulationProgress.getStatus().equals(Status.ERROR)) {
								Logger.getInstance().writeError(SimulationProgress.getError());
							}
							trackerPanel.setProgress((int) (SimulationProgress.getProgress()));
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
				PlanningTool planningTool = PlanningTool.getInstance();
				GuiController gc = planningTool.getGuiController();				
				
				try {
					gc.startSimulation();
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}				
				
				pm.setState(new SimulationDone());

				if (SimulationProgress.getStatus().equals(Status.ERROR)) {
					Logger.getInstance().writeError(SimulationProgress.getError());
					pm.setState(new SimulationReset());
				}
				pm.execute();
			}
		}.start();
	}
}