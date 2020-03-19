package fortiss.gui.listeners.label;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import fortiss.gui.DesignerPanel;

public class OptimizerListener extends MouseAdapter {

	/**
	 * Set optimizer to the user selection
	 */
	@Override
	public void mouseClicked(MouseEvent e) {
		DesignerPanel.parameterPanel.pars.nextOptimizer();
	}
}
