package fortiss.gui.listeners.selectionitem;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JComboBox;

import fortiss.components.Component;
import fortiss.components.Coupler;
import fortiss.gui.DesignerPanel;

public class CNewtworkTypePListener extends MouseAdapter implements ItemListener {

	private static boolean userSelection;

	/**
	 * Saves the primary network type selected by the user, and sets the secondary
	 * network type accordingly.
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
				String opt = "Electricity";

				((Coupler) component).setNetworkTypeP(sel);
				if (sel == "Heat") {
					((Coupler) component).setNetworkTypeS(opt);
				} else {
					opt = "Heat";
					((Coupler) component).setNetworkTypeS(opt);
				}
				DesignerPanel.couplerPanel.txtCSecondaryNetworkType.setText(opt);
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
