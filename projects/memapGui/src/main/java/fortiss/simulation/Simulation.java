package fortiss.simulation;

import java.io.FileNotFoundException;

import fortiss.controller.listeners.button.AcceptListener;
import fortiss.results.Reporter;
import fortiss.simulation.listeners.helper.ProgressManager;
import linprogMPC.controller.GuiController;
import linprogMPC.helper.DirectoryConfiguration;

/**
 * Based on class MemapTopology ( @author andreas.thut)
 */
public class Simulation implements Runnable {

	/**
	 * @par topology
	 * @par result an instance of Reporter
	 * @par pm an instance of progress manager
	 * @par pmt a thread for progress manager
	 * @par ready a flag for class ProgressManager
	 */
	private GuiController gc;
	public static Reporter result;
	private ProgressManager pm = new ProgressManager();
	private Thread pmt;
	public static boolean ready = false;

	private void execute() throws InterruptedException, FileNotFoundException {

		System.out.println(">> Interactive simulator: Setting up the topology.");
		AcceptListener.loadingScreen.lbMessage.setText("Setting up the topology");
		
		String location = System.getProperty("user.dir") + "/" + DirectoryConfiguration.mainDir + "/" + DirectoryConfiguration.configDir + "/parameterConfig.json";
		gc = new GuiController(location);
		
		System.out.println(">> Interactive simulator: Starting simulation.");
		ready = true;
		gc.startSimulation();
	}

	public static void createAndRun() {
		try {
			try {
				new Simulation().execute();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		AcceptListener.loadingScreen.setVisible(true);
		AcceptListener.loadingScreen.lbMessage.setText("Interactive Simulator is initializing");
		pmt = new Thread(pm);
		pmt.start();

		createAndRun();

		AcceptListener.loadingScreen.dispose();
		result = new Reporter();
		result.setVisible(true);
	}
}
