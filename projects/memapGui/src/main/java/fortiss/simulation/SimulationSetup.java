package fortiss.simulation;

import java.io.File;
import java.io.FileNotFoundException;

import fortiss.gui.TrackerPanel;
import fortiss.simulation.listeners.helper.ProgressManager;
import memap.controller.GuiController;
import memap.helper.DirectoryConfiguration;

public class SimulationSetup extends SimulationState {

	/**
	 * Start the setup stage
	 * 
	 * @param pm the progress manager
	 */
	@Override
	public void execute(ProgressManager pm) {

		PlanningTool.showTracker();

		TrackerPanel loadingScreen = PlanningTool.getTrackerPanel();
		loadingScreen.setIndeterminate(true);
		loadingScreen.setMessage("Setting up the topology");
		loadingScreen.repaint();

		String fs = File.separator;
		String location = System.getProperty("user.dir") + fs + DirectoryConfiguration.mainDir + fs
				+ DirectoryConfiguration.configDir + fs + "parameterConfig.json";
		GuiController gc = new GuiController(location);
		PlanningTool.setGuiController(gc);

		try {
			gc.setUp();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		pm.setState(new SimulationOptimize());
		pm.execute();

	}

}
