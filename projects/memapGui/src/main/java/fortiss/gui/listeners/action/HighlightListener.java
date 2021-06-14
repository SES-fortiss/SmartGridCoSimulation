package fortiss.gui.listeners.action;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import fortiss.gui.icons.Icon;

/**
 * Sets the icon according to the status of the object: Selected/Unselected
 */
public class HighlightListener implements FocusListener {

	@Override
	public void focusGained(FocusEvent e) {
		if (e.getSource() instanceof Icon) {
			Icon icon = (Icon) e.getSource();
			icon.highlight();
		}
	}

	@Override
	public void focusLost(FocusEvent e) {
		if (e.getSource() instanceof Icon) {
			Icon icon = (Icon) e.getSource();
			icon.playDown();
		}
	}
}
