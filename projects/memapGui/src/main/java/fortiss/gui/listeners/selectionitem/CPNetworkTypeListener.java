package fortiss.gui.listeners.selectionitem;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JComboBox;

import fortiss.components.Component;
import fortiss.components.Controllable;
import fortiss.gui.DesignerPanel;

public class CPNetworkTypeListener extends MouseAdapter implements ItemListener {
	
	private static boolean userSelection;

	/**
	 * Saves the network type selected by the user.
	 */
	@Override
	public void itemStateChanged(ItemEvent e) {
		Component component = DesignerPanel.selectedComponent;
		
		// Event fired once: When SELECTED. (Not fired when DESELECTED)
		if (e.getStateChange() == ItemEvent.SELECTED) {
			// Event fired only when change occurs in the GUI (Not programmatically)
			if (userSelection) {
				JComboBox<?> o = (JComboBox<?>) e.getSource();
				String sel = (String) o.getSelectedItem();
				((Controllable) component).setNetworkType(sel);
			}
			userSelection = false;
		}
	}

	/**
	 * Set parameter values and calls FocusManager function.
	 * 
	 * @par buildingName name of current building.
	 * @par component index of current component.
	 * @par userSelection TRUE if listener is triggered after user select the item
	 *      on screen.
	 */
	@Override
	public void mousePressed(MouseEvent e) {
		userSelection = true;
	}

}
