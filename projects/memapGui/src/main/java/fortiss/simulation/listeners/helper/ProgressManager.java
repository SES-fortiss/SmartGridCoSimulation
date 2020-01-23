package fortiss.simulation.listeners.helper;

import javax.swing.SwingUtilities;

import akka.timeManagement.GlobalTime;
import fortiss.gui.Designer;
import fortiss.gui.listeners.button.AcceptListener;
import fortiss.simulation.Parameters;
import fortiss.simulation.Simulation;

public class ProgressManager implements Runnable {

	private Parameters pars = Designer.parameterPanel.pars;
	
	/**
	 * Calculates the progress in the simulation according with the number of steps executed.
	 * Updates the message in LoadingScreen. 
	 */
	@Override
	public void run() {
		
		AcceptListener.loadingScreen.progressBar.setIndeterminate(true);
		// Wait until topology is created
		while (!Simulation.ready) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
		}

		// Start progress computation
		int max = (pars.getDays() * pars.getLength() ) - 1;
		while (AcceptListener.loadingScreen.progressBar.getValue() < AcceptListener.loadingScreen.progressBar
				.getMaximum()) {
			Runnable pb = new Runnable() {
				@Override
				public void run() {
					// TODO Fix
					/*if (GlobalTime.getCurrentTimeStep() == 1) {
						AcceptListener.loadingScreen.lbMessage.setText("Optimization in progress");
						AcceptListener.loadingScreen.progressBar.setIndeterminate(false);
					}
					AcceptListener.loadingScreen.progressBar.setValue(GlobalTime.getCurrentTimeStep() * 100 / max);*/
				}
			};
			SwingUtilities.invokeLater(pb);
			try {
				Thread.sleep(20);
			} catch (Exception e) {
			}
		}
	}
}
