package fortiss.gui.listeners.label;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import fortiss.gui.DesignerPanel;
import fortiss.media.Icon;

public class MemapListener extends MouseAdapter {

	/**
	 * Set memapON to the user selection
	 */
	@Override
	public void mouseClicked(MouseEvent e) {
		if (DesignerPanel.parameterPanel.pars.isMemapON() == true) {
			DesignerPanel.parameterPanel.pars.setMemapON(false);
			DesignerPanel.parameterPanel.lbMemap2.setIcon(Icon.offMemap);
		} else {
			DesignerPanel.parameterPanel.pars.setMemapON(true);
			DesignerPanel.parameterPanel.lbMemap2.setIcon(Icon.onMemap);
		}
	}
}
