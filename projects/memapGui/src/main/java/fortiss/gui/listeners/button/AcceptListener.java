package fortiss.gui.listeners.button;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import fortiss.gui.LoadingScreen;
import fortiss.gui.listeners.helper.FileManager;
import fortiss.results.Reporter;
import fortiss.simulation.Simulation;

public class AcceptListener extends MouseAdapter {

	/** an instance of Reporter window */
	public static Reporter result;
	public static Simulation sim;
	public static LoadingScreen loadingScreen = new LoadingScreen();
	private Thread simt;

	/**
	 * Initializes the simulation. Creates a descriptor file for every building and
	 * a configuration file for the simulation parameters, disposes the interactive
	 * simulator window.
	 */
	@Override
	public void mouseClicked(MouseEvent e) {	
		FileManager fm = new FileManager();
		fm.writeMemapModel();
		fm.writeBuildingDescriptorFiles();
		fm.writeParameterConfigFile(); // Should be called after writeDescriptorFiles()
		
		sim = new Simulation();
		simt = new Thread(sim);
		simt.start();
		result = new Reporter();
	}
}
