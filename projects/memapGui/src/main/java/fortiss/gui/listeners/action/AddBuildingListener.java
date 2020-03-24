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
	 * {@link fortiss.gui.listeners.helper.ComponentIcons#createComponentLists(String)},
	 * {@link fortiss.gui.listeners.helper.DataUpdater#updateEmsData(String, String)}.
	 */
	@Override
	public void mouseClicked(MouseEvent e) {

		// create building
		String buildingName = "building" + DesignerPanel.buildingCount;
		Building building = new Building(buildingName, 0);

		DesignerPanel.buildings.put(buildingName, building);
		DesignerPanel.selectedBuilding = buildingName;

		// Create building icon
		BuildingIcons bi = new BuildingIcons();
		bi.createBuildingIcon(buildingName, new Point(0, 0));

		// Create component icons
		ComponentIcons components = new ComponentIcons();
		components.createComponentLists(buildingName);

		// Show information in pl_ems_details
		DataUpdater du = new DataUpdater();
		du.updateEmsData(building.getName(), Integer.toString(building.getPort()));
		DesignerPanel.buildingCount = DesignerPanel.buildingCount + 1;
	}
}
