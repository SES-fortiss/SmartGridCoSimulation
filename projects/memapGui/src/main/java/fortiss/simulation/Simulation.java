package fortiss.simulation;

import java.util.ArrayList;

import akka.actor.ActorSystem;
import fortiss.components.Building;
import fortiss.controller.listeners.button.AcceptListener;
import fortiss.gui.Designer;
import fortiss.results.Reporter;
import fortiss.simulation.listeners.helper.ProgressManager;
import memap.MemapConfig;
import simulation.SimulationStarter;
import topology.ActorTopology;

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
	private ActorTopology topology;
	public static Reporter result;
	private ProgressManager pm = new ProgressManager();
	private Thread pmt;
	public static boolean ready = false;

	private void execute() throws InterruptedException {

		int mpcLength = Designer.control.pars.getSteps();
		boolean memapOn = Designer.control.pars.isMemapON();

		System.out.println(">> Interactive simulator: Creating topology.");
		AcceptListener.loadingScreen.lbMessage.setText("Creating the buildings");
		ArrayList<Building> buildings = Designer.buildings;
		topology = Topology.createTopology(mpcLength, memapOn, buildings);

		AcceptListener.loadingScreen.lbMessage.setText("Setting up the topology");
		ActorSystem actorSystem = SimulationStarter.initialiseActorSystem(topology);

		System.out.println(">> Interactive simulator: Starting simulation.");
		AcceptListener.loadingScreen.lbMessage.setText("Starting simulation");
		ready = true;
		SimulationStarter.startSimulation(actorSystem, 0, MemapConfig.NR_OF_ITERATIONS);
	}

	public static void createAndRun() {
		try {
			new Simulation().execute();
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
