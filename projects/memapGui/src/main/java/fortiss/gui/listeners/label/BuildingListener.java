package fortiss.gui.listeners.label;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;

import fortiss.components.Building;
import fortiss.gui.DesignerPanel;
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

			String buildingName = lb.getText();
			DesignerPanel.selectedBuilding = buildingName;
			ComponentUpdater so = new ComponentUpdater();
			so.showComponents(e);
			DataUpdater up = new DataUpdater();

			Building building = DesignerPanel.buildings.get(buildingName);
			up.updateEmsData(building.getName(), Integer.toString(building.getPort()));
			if (DesignerPanel.buildingCount > 0 && !DesignerPanel.pl_object.comp_box.isVisible()) {
				DesignerPanel.pl_object.showComponentBox();
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