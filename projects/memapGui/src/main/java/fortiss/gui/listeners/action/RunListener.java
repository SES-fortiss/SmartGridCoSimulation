package fortiss.gui.listeners.action;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import fortiss.gui.DesignerPanel;

public class RunListener extends MouseAdapter {

	/**
	 * Set visible <code>true</code> for the
	 * {@linkplain fortiss.gui.ParameterInputPanel}
	 */
	@Override
	public void mouseClicked(MouseEvent e) {
		DesignerPanel.cl.show(DesignerPanel.pl_comp_detail, "parameter");		
	}
}
