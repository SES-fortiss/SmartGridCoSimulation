package fortiss.gui.listeners.button;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import fortiss.gui.Designer;
import fortiss.gui.LoadingScreen;
import fortiss.gui.listeners.helper.FileManager;
import fortiss.simulation.Simulation;

public class AcceptListener extends MouseAdapter {

	public static Simulation sim = new Simulation();
	public static LoadingScreen loadingScreen = new LoadingScreen();
	private Thread simt;

	/**
	 * Initializes the simulation. Creates a descriptor file for every building and
	 * a configuration file for the simulation parameters, disposes the interactive
	 * simulator window.
	 */
	@Override
	public void mouseClicked(MouseEvent e) {
		simt = new Thread(sim);
		FileManager.writeDescriptorFiles();
		FileManager.writeParameterConfigFile(); // Should be called after writeDescriptorFiles()
		simt.start();
		Designer.frame.dispose();
	}
}
