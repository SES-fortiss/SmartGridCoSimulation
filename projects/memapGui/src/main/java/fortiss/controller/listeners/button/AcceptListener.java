package fortiss.controller.listeners.button;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import fortiss.gui.Designer;
import fortiss.gui.listeners.helper.FileManager;
import fortiss.simulation.LoadingScreen;
import fortiss.simulation.Simulation;

public class AcceptListener extends MouseAdapter {

	public static Simulation sim = new Simulation();
	public static LoadingScreen loadingScreen = new LoadingScreen();
	private Thread simt;

	/**
	 * Initializes the simulation. Disposes the interactive simulator window and
	 * creates the reporter window, if
	 * {@link fortiss.controller.Parameters#getRunInServer} is <code>true</code>.
	 * Otherwise, descriptor files for every building are created in order to run
	 * the simulation on the server.
	 */
	@Override
	public void mouseClicked(MouseEvent e) {

		Designer.control.dispose();
		if (Designer.control.pars.getRunInServer() == false) {
			simt = new Thread(sim);
			simt.start();
		} else {
			FileManager.writeDescriptorFiles();
			FileManager.writeParameterConfigFile();
		}
		Designer.frame.dispose();
	}
}
