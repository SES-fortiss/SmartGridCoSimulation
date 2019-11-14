package fortiss.gui.listeners.action;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import fortiss.components.Building;
import fortiss.gui.Designer;
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
		Designer.buildings.add(new Building("building" + Designer.buildingCount, 0, false, 0));
		Designer.currentBuilding = Designer.buildingCount;

		// create label
		BuildingIcons bi = new BuildingIcons();
		bi.createBuildingIcon(Designer.buildingCount, new Point(0, 0));

		// Create list of icons for current building and add it to the general icon
		// lists
		ComponentIcons components = new ComponentIcons();
		components.createComponentLists(Designer.currentBuilding);

		// Show information in pl_ems_details
		DataUpdater du = new DataUpdater();
		du.updateEmsData(Designer.buildings.get(Designer.currentBuilding).getName(),
				Integer.toString(Designer.buildings.get(Designer.currentBuilding).getPort()));
		Designer.buildingCount = Designer.buildingCount + 1;
	}
}
