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

	/** Reference to the simulation progress */
	private SimulationProgress sp;

	/**
	 * Start the optimization stage
	 * 
	 * @param pm the progress manager
	 */
	@Override
	public void execute(ProgressManager pm) {
		PlanningTool planningTool = PlanningTool.getInstance();
		trackerPanel = planningTool.getTrackerPanel();
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
							if (sp.getStatus().equals(Status.ERROR)) {
								Logger.getInstance().writeError(sp.getError());
							}
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
				PlanningTool planningTool = PlanningTool.getInstance();
				GuiController gc = planningTool.getGuiController();
				gc.startSimulation();
				
				while (sp.getProgress() <= 99.999 && sp.getStatus().equals(Status.OK)) {
					double currentProgress = sp.getProgress();
					System.out.println("One Simulation stopped, but second still running. Progress: " + currentProgress);
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				 				
				pm.setState(new SimulationDone());

				if (sp.getStatus().equals(Status.ERROR)) {
					Logger.getInstance().writeError(sp.getError());
					pm.setState(new SimulationReset());
				}
				pm.execute();
			}
		}.start();
	}
}