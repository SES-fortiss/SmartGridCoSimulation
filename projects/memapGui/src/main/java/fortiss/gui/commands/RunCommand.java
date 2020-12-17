package fortiss.gui.commands;

import fortiss.gui.listeners.helper.WindowSnipper;
import fortiss.simulation.SimulationSetup;
import fortiss.simulation.helper.ProgressManager;

/**
 * Creates a descriptor file for every building and a configuration file for the
 * simulation parameters, calls
 * {@link ProgressManager#setState(fortiss.simulation.SimulationState)} and
 * {@link ProgressManager#execute()}
 */
public class RunCommand implements Command {

	@Override
	public void execute() {
		new SaveCommand().execute();

		WindowSnipper ws = new WindowSnipper();
		ws.createTopologySnip();

		ProgressManager pm = ProgressManager.getInstance();
		pm.setState(new SimulationSetup());
		pm.execute();
	}

}
