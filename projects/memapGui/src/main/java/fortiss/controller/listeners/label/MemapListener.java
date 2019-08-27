package fortiss.controller.listeners.label;

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
		if (Designer.control.pars.isMemapON() == true) {
			Designer.control.pars.setMemapON(false);
			Designer.control.lbMemap2.setIcon(Icon.offMemap);
		} else {
			Designer.control.pars.setMemapON(true);
			Designer.control.lbMemap2.setIcon(Icon.onMemap);
		}
	}
}
