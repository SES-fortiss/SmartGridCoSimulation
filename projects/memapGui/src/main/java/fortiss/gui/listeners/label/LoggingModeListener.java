package fortiss.gui.listeners.label;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import fortiss.simulation.Parameters;
import fortiss.simulation.PlanningTool;

public class LoggingModeListener extends MouseAdapter {

	/**
	 * Set optimizer to the user selection
	 */
	@Override
	public void mouseClicked(MouseEvent e) {
		Parameters parameters = PlanningTool.getInstance().getParameters();
		parameters.nextLoggingMode();
	}
}
