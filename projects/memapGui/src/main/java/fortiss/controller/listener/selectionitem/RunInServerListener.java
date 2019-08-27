package fortiss.controller.listener.selectionitem;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import fortiss.gui.Designer;

public class RunInServerListener implements ItemListener {

	/**
	 * Assign <code>true</code> or <code>false</code> to a parameter through
	 * {@linkplain fortiss.controller.Parameters#setRunInServer(boolean)} according
	 * to user input
	 */
	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED) {
			Designer.control.pars.setRunInServer(true);
		} else {
			Designer.control.pars.setRunInServer(false);
		}
	}

}
