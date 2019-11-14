package fortiss.gui.listeners.label;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;

import fortiss.gui.Designer;
import fortiss.gui.listeners.helper.ComponentUpdater;
import fortiss.gui.listeners.helper.DataUpdater;
import fortiss.gui.listeners.helper.FocusManager;

public class BuildingListener extends MouseAdapter implements FocusListener {

	/**
	 * Manages the actions performed when the label is selected: Panels, data and
	 * components shown.
	 */
	public void mousePressed(MouseEvent e) {
		if (e.getButton() == MouseEvent.BUTTON1) {
			JLabel lb = (JLabel) e.getSource();
			lb.requestFocus(); // Required for removing buildings
			Designer.currentBuilding = Designer.buildingIcons.indexOf(lb);
			ComponentUpdater so = new ComponentUpdater();
			so.showComponents(e);
			DataUpdater up = new DataUpdater();
			up.updateEmsData(Designer.buildings.get(Designer.currentBuilding).getName(),
					Integer.toString(Designer.buildings.get(Designer.currentBuilding).getPort()));
			if (Designer.buildingCount > 0 && !Designer.pl_object.comp_box.isVisible()) {
				Designer.pl_object.showComponentBox();
			}
		}
	}

	/**
	 * Sets the selectedImage icon to the label when it gains focus.
	 */
	@Override
	public void focusGained(FocusEvent e) {
		JLabel lb = (JLabel) e.getSource();
		FocusManager.focusBuilding(lb);
	}

	/**
	 * Sets the unselectedImage icon to the label when it looses focus.
	 */
	@Override
	public void focusLost(FocusEvent e) {
		JLabel lb = (JLabel) e.getSource();
		FocusManager.focusLostBuilding(lb);
	}

}