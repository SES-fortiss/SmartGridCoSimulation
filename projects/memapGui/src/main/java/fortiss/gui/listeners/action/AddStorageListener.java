package fortiss.gui.listeners.action;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import fortiss.components.Storage;
import fortiss.gui.Designer;
import fortiss.gui.listeners.helper.ComponentIcons;
import fortiss.gui.listeners.helper.DataUpdater;

public class AddStorageListener extends MouseAdapter {

	/**
	 * Creates a new storage object and a new storage icon. Calls DataUpdater.
	 */
	public void mouseClicked(MouseEvent e) {
		// Update current_comp
		Designer.currentComponent = Designer.storageIcons.get(Designer.currentBuilding).size();

		// Create storage
		Designer.buildings.get(Designer.currentBuilding)
				.addStorage(new Storage("Storage" + Designer.currentComponent, "Heat", 0.0, 0.0, 0.0, 0.0, 1.0, 1.0));
		Storage s = Designer.buildings.get(Designer.currentBuilding).getStorage().get(Designer.currentComponent);

		// Create label
		ComponentIcons components = new ComponentIcons();
		components.createStorageIcon(Designer.currentBuilding, Designer.currentComponent, true);

		// Show data
		DataUpdater up = new DataUpdater();
		up.updateStorageData(s.getName(), s.getNetworkType(), s.getCapacity(), s.getSoc(), s.getMaxCharging(),
				s.getMaxDischarging(), s.getEffIN(), s.getEffOUT());
	}
}