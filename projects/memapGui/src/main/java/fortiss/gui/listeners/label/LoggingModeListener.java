package fortiss.gui.listeners.label;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import fortiss.gui.Designer;

public class LoggingModeListener extends MouseAdapter {

	/**
	 * Set optimizer to the user selection
	 */
	@Override
	public void mouseClicked(MouseEvent e) {
		Designer.parameterPanel.pars.nextLoggingMode();
	}
}
