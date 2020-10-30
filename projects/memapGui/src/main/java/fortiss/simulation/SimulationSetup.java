package fortiss.simulation;

import java.io.FileNotFoundException;

import fortiss.gui.TrackerPanel;
import fortiss.simulation.helper.ProgressManager;
import memap.controller.GuiController;

public class SimulationSetup extends SimulationState {

	/**
	 * Start the setup stage
	 * 
	 * @param pm the progress manager
	 */
	@Override
	public void execute(ProgressManager pm) {
		PlanningTool planningTool = PlanningTool.getInstance();
		planningTool.closeReporter();
		planningTool.showTracker();

		TrackerPanel loadingScreen = planningTool.getTrackerPanel();
		loadingScreen.setIndeterminate(true);
		loadingScreen.setMessage("Setting up the topology");
		loadingScreen.repaint();

		GuiController gc = new GuiController(planningTool.getWorkingFile());
		planningTool.setGuiController(gc);

		try {
			gc.setUp();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		pm.setState(new SimulationOptimize());
		pm.execute();

	}
}