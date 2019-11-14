package fortiss.gui.listeners.helper;

import javax.swing.JLabel;

/** 
 * Updates icon text according to input 
 */
public class LabelUpdater {

	/**
	 * Updates the label text to the input string.
	 */
	public void updateLabel(JLabel label, String name) {
		label.setText(name);
	}
}
