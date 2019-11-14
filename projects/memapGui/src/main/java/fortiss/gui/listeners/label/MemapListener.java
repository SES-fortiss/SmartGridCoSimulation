package fortiss.gui.listeners.label;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import fortiss.gui.Designer;
import fortiss.media.Icon;

public class MemapListener extends MouseAdapter {

	/**
	 * Set memapON to the user selection
	 */
	@Override
	public void mouseClicked(MouseEvent e) {
		if (Designer.parameterPanel.pars.isMemapON() == true) {
			Designer.parameterPanel.pars.setMemapON(false);
			Designer.parameterPanel.lbMemap2.setIcon(Icon.offMemap);
		} else {
			Designer.parameterPanel.pars.setMemapON(true);
			Designer.parameterPanel.lbMemap2.setIcon(Icon.onMemap);
		}
	}
}
