package fortiss.gui.listeners.action;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import fortiss.components.Building;
import fortiss.gui.DesignerPanel;
import fortiss.gui.listeners.helper.BuildingIcons;
import fortiss.gui.listeners.helper.ComponentIcons;
import fortiss.gui.listeners.helper.DataUpdater;

public class AddBuildingListener extends MouseAdapter {

	/**
	 * Creates a building object and a building icon. Calls
	 * {@link fortiss.gui.listeners.helper.BuildingIcons#createBuildingIcon(int, Point)}
	 * {@link fortiss.gui.listeners.helper.ComponentIcons#createComponentLists(int)},
	 * {@link fortiss.gui.listeners.helper.DataUpdater#updateEmsData(String, String)}.
	 */
	@Override
	public void mouseClicked(MouseEvent e) {

		// create building
		DesignerPanel.buildings.add(new Building("building" + DesignerPanel.buildingCount, 0, false, 0));
		DesignerPanel.currentBuilding = DesignerPanel.buildingCount;

		// create label
		BuildingIcons bi = new BuildingIcons();
		bi.createBuildingIcon(DesignerPanel.buildingCount, new Point(0, 0));

		// Create list of icons for current building and add it to the general icon
		// lists
		ComponentIcons components = new ComponentIcons();
		components.createComponentLists(DesignerPanel.currentBuilding);

		// Show information in pl_ems_details
		DataUpdater du = new DataUpdater();
		du.updateEmsData(DesignerPanel.buildings.get(DesignerPanel.currentBuilding).getName(),
				Integer.toString(DesignerPanel.buildings.get(DesignerPanel.currentBuilding).getPort()));
		DesignerPanel.buildingCount = DesignerPanel.buildingCount + 1;
	}
}
