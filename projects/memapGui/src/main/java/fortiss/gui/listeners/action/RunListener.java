package fortiss.gui.listeners.action;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import fortiss.gui.Designer;

public class RunListener extends MouseAdapter {

	/**
	 * Set visible <code>true</code> for the
	 * {@linkplain fortiss.controller.Controller}
	 */
	@Override
	public void mouseClicked(MouseEvent e) {
		Designer.control.setVisible(true);
	}
}
