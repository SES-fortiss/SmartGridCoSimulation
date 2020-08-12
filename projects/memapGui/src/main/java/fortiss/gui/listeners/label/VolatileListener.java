package fortiss.gui.listeners.label;

import java.awt.Cursor;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JLabel;

import fortiss.components.Building;
import fortiss.components.Volatile;
import fortiss.gui.DesignerPanel;
import fortiss.gui.listeners.helper.DataUpdater;
import fortiss.gui.listeners.helper.FocusManager;
import fortiss.gui.style.Colors;

public class VolatileListener extends MouseAdapter implements FocusListener {

	private static Building building;

	/**
	 * Manages the actions performed when the label is selected: Panels, data shown.
	 */
	@Override
	public void mousePressed(MouseEvent e) {
		building = DesignerPanel.selectedBuilding;

		JLabel lb = (JLabel) e.getSource();
		lb.requestFocus(); // Required for removing components

		DesignerPanel.currentComponent = DesignerPanel.volatileIcons.get(building).indexOf(lb);
		Volatile v = building.getVolatile().get(DesignerPanel.currentComponent);

		DataUpdater up = new DataUpdater();
		up.updateVolProductionData(v.getName(), v.getNetworkType(), v.getMinimumPower(), v.getMaximumPower(),
				v.getForecastFile(), v.getCost(), v.getCOEmission());
	}

	/**
	 * Sets the selectedImage icon to the label when it gains focus.
	 */
	@Override
	public void focusGained(FocusEvent e) {
		building = DesignerPanel.selectedBuilding;
		JLabel lb = (JLabel) e.getSource();
		FocusManager.focusVolatile(building, lb);
	}

	/**
	 * Sets the unselectedImage icon to the label when it looses focus.
	 */
	@Override
	public void focusLost(FocusEvent e) {
		JLabel lb = (JLabel) e.getSource();
		FocusManager.focusLostVolatile(building, lb);
	}
	
	// TODO - sorry but the following two methods are a clones taken from BuildingListner	
	public void mouseEntered(java.awt.event.MouseEvent e) {
		JLabel lb = (JLabel) e.getSource();
		lb.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lb.setBorder(BorderFactory.createLineBorder(Colors.accent1, 1, true));
    }

    public void mouseExited(java.awt.event.MouseEvent e) {
		JLabel lb = (JLabel) e.getSource();
    	lb.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    	lb.setBorder(BorderFactory.createEmptyBorder());
    }

}
