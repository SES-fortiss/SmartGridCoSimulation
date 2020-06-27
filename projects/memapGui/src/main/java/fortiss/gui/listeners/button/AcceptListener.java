package fortiss.gui.listeners.button;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import fortiss.gui.listeners.helper.FileManager;
import fortiss.simulation.SimulationSetup;
import fortiss.simulation.helper.ProgressManager;

public class AcceptListener extends MouseAdapter {

	/**
	 * Creates a descriptor file for every building and a configuration file for the
	 * simulation parameters, calls
	 * {@link ProgressManager#setState(fortiss.simulation.SimulationState)} and
	 * {@link ProgressManager#execute()}
	 */
	@Override
	public void mouseClicked(MouseEvent e) {
		FileManager fm = new FileManager();
		fm.writeMemapModel();
		fm.writeBuildingDescriptorFiles();
		fm.writeParameterConfigFile(); // Should be called after writeDescriptorFiles()

		ProgressManager pm = ProgressManager.getInstance();
		pm.setState(new SimulationSetup());
		pm.execute();
	}
}
