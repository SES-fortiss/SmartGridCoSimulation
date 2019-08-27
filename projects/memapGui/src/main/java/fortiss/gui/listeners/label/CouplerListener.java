package fortiss.gui.listeners.label;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;

import fortiss.components.Coupler;
import fortiss.gui.Designer;
import fortiss.gui.listeners.helper.DataUpdater;
import fortiss.gui.listeners.helper.FocusManager;

public class CouplerListener extends MouseAdapter implements FocusListener {

	private static int building;

	/**
	 * Manages the actions performed when the label is selected: Panels, data shown.
	 */
	@Override
	public void mousePressed(MouseEvent e) {
		building = Designer.currentBuilding;

		JLabel lb = (JLabel) e.getSource();
		lb.requestFocus(); // Required for removing components

		Designer.currentComponent = Designer.couplerIcons.get(building).indexOf(lb);
		Coupler c = Designer.buildings.get(building).getCoupler().get(Designer.currentComponent);

		DataUpdater up = new DataUpdater();
		up.updateCouplerData(c.getName(), c.getNetworkTypeP(), c.getNetworkTypeS(), c.getPower(),
				c.getEfficiencyPrimary(), c.getEfficiencySecondary(), c.getCost(), c.getCOEmission());
	}

	/**
	 * Sets the selectedImage icon to the label when it gains focus.
	 */
	@Override
	public void focusGained(FocusEvent e) {
		building = Designer.currentBuilding;
		JLabel lb = (JLabel) e.getSource();
		FocusManager.focusCoupler(building, lb);
	}

	/**
	 * Sets the unselectedImage icon to the label when it looses focus.
	 */
	@Override
	public void focusLost(FocusEvent e) {
		JLabel lb = (JLabel) e.getSource();
		FocusManager.focusLostCoupler(building, lb);
	}
}
