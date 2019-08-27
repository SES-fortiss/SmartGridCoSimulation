package fortiss.gui.listeners.selectionitem;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JComboBox;

import fortiss.gui.Designer;

public class CNewtworkTypePListener extends MouseAdapter implements ItemListener {

	private static int building;
	private static int component;
	private static boolean userSelection;

	/**
	 * Saves the primary network type selected by the user, and sets the secondary
	 * network type accordingly.
	 */
	@Override
	public void itemStateChanged(ItemEvent e) {

		// Event fired once: When SELECTED. (Not fired when DESELECTED)
		if (e.getStateChange() == ItemEvent.SELECTED) {
			// Event fired only when change occurs in the GUI (Not programmatically)
			if (userSelection) {
				JComboBox<?> o = (JComboBox<?>) e.getSource();
				String sel = (String) o.getSelectedItem();
				String opt = "Electricity";

				Designer.buildings.get(building).getCoupler().get(component).setNetworkTypeP(sel);
				if (sel == "Heat") {
					Designer.buildings.get(building).getCoupler().get(component).setNetworkTypeS(opt);
				} else {
					opt = "Heat";
					Designer.buildings.get(building).getCoupler().get(component).setNetworkTypeS(opt);
				}
				Designer.couplerPanel.txtCSecondaryNetworkType.setText(opt);
				Designer.cl.show(Designer.pl_comp_detail, "coupler");
				Designer.pl_comp_detail.repaint();
			}
			userSelection = false;
		}
	}

	/**
	 * Set parameter values and calls FocusManager function.
	 * 
	 * @par building index of current building.
	 * @par component index of current component.
	 * @par userSelection TRUE if listener is triggered after user select the item
	 *      on screen.
	 */
	@Override
	public void mousePressed(MouseEvent e) {
		userSelection = true;
		building = Designer.currentBuilding;
		component = Designer.currentComponent;
	}

}
