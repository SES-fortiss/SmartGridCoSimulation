package fortiss.simulation;

import java.io.File;
import java.io.FileNotFoundException;

import fortiss.gui.listeners.button.AcceptListener;
import fortiss.results.Reporter;
import fortiss.simulation.listeners.helper.ProgressManager;
import memap.controller.GuiController;
import memap.helper.DirectoryConfiguration;

public class Simulation implements Runnable {

	/** Controller for the GUI */
	private GuiController gc;
	/** an instance of Reporter window */
	public static Reporter result;
	/** an instance of progress manager */
	private ProgressManager pm = new ProgressManager();
	/** a thread for progress manager */
	private Thread pmt;
	/** a flag for class ProgressManager */
	public static boolean ready = false;

	private void execute() throws InterruptedException, FileNotFoundException {
		String fs = File.separator;

		System.out.println(">> Interactive simulator: Setting up the topology.");
		AcceptListener.loadingScreen.lbMessage.setText("Setting up the topology");

		String location = System.getProperty("user.dir") + fs + DirectoryConfiguration.mainDir + fs
				+ DirectoryConfiguration.configDir + fs + "parameterConfig.json";

		gc = new GuiController(location);

		System.out.println(">> Interactive simulator: Starting simulation.");
		ready = true;
		gc.startSimulation();
	}

	public static void createAndRun() {
		try {

			Simulation sim = new Simulation();
			sim.execute();

		} catch (FileNotFoundException | InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {

		AcceptListener.loadingScreen.setVisible(true);
		AcceptListener.loadingScreen.lbMessage.setText("Simulator is initializing");
		pmt = new Thread(pm);
		pmt.start();

		createAndRun();

		AcceptListener.loadingScreen.dispose();
		result = new Reporter();
		result.setVisible(true);
	}
}
