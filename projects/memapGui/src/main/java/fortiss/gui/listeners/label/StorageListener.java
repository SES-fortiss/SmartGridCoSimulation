package fortiss.gui.listeners.label;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;

import fortiss.components.Storage;
import fortiss.gui.DesignerPanel;
import fortiss.gui.listeners.helper.DataUpdater;
import fortiss.gui.listeners.helper.FocusManager;

public class StorageListener extends MouseAdapter implements FocusListener {

	private static String buildingName;

	/**
	 * Manages the actions performed when the label is selected: Panels, data shown.
	 */
	@Override
	public void mousePressed(MouseEvent e) {
		buildingName = DesignerPanel.selectedBuilding;

		JLabel lb = (JLabel) e.getSource();
		lb.requestFocus(); // Required for removing components

		DesignerPanel.currentComponent = DesignerPanel.storageIcons.get(buildingName).indexOf(lb);
		Storage s = DesignerPanel.buildings.get(buildingName).getStorage().get(DesignerPanel.currentComponent);

		DataUpdater up = new DataUpdater();
		up.updateStorageData(s.getName(), s.getNetworkType(), s.getCapacity(), s.getSoc(), s.getMaxCharging(),
				s.getMaxDischarging(), s.getEffIN(), s.getEffOUT());
	}

	/**
	 * Sets the selectedImage icon to the label when it gains focus.
	 */
	@Override
	public void focusGained(FocusEvent e) {
		buildingName = DesignerPanel.selectedBuilding;
		JLabel lb = (JLabel) e.getSource();
		FocusManager.focusStorage(buildingName, lb);
	}

	/**
	 * Sets the unselectedImage icon to the label when it looses focus.
	 */
	@Override
	public void focusLost(FocusEvent e) {
		JLabel lb = (JLabel) e.getSource();
		FocusManager.focusLostStorage(buildingName, lb);
	}

}
