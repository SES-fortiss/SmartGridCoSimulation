package fortiss.gui.listeners.action;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import fortiss.components.Storage;
import fortiss.gui.DesignerPanel;
import fortiss.gui.listeners.helper.ComponentIcons;
import fortiss.gui.listeners.helper.DataUpdater;

public class AddStorageListener extends MouseAdapter {

	/**
	 * Creates a new storage object and a new storage icon. Calls DataUpdater.
	 */
	public void mouseClicked(MouseEvent e) {
		// Update current_comp
		DesignerPanel.currentComponent = DesignerPanel.storageIcons.get(DesignerPanel.selectedBuilding).size();

		// Create storage
		DesignerPanel.buildings.get(DesignerPanel.selectedBuilding)
				.addStorage(new Storage("Storage" + DesignerPanel.currentComponent, "Heat", 0.0, 0.0, 0.0, 0.0, 1.0, 1.0));
		Storage s = DesignerPanel.buildings.get(DesignerPanel.selectedBuilding).getStorage().get(DesignerPanel.currentComponent);

		// Create label
		ComponentIcons components = new ComponentIcons();
		components.createStorageIcon(DesignerPanel.selectedBuilding, DesignerPanel.currentComponent, true);

		// Show data
		DataUpdater up = new DataUpdater();
		up.updateStorageData(s.getName(), s.getNetworkType(), s.getCapacity(), s.getSoc(), s.getMaxCharging(),
				s.getMaxDischarging(), s.getEffIN(), s.getEffOUT());
	}
}