package fortiss.gui.listeners.label;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import fortiss.gui.OptionLabel;

public class PriceTypeListener extends MouseAdapter {

	/**
	 * Set Market price to the user selection: fixed or variable
	 */
	@Override
	public void mouseClicked(MouseEvent e) {
		OptionLabel label = (OptionLabel) e.getSource();
		label.nextOption();
	}
}
