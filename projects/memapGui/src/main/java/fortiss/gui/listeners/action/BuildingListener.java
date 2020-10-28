package fortiss.gui.listeners.action;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import fortiss.components.Building;
import fortiss.gui.DesignerPanel;
import fortiss.gui.icons.BuildingIcon;

public class BuildingListener extends MouseAdapter {

	/**
	 * Manages the actions performed when the label is selected: Panels, data and
	 * components shown.
	 */
	public void mousePressed(MouseEvent e) {
		if (e.getButton() == MouseEvent.BUTTON1) {
			BuildingIcon buildingIcon = (BuildingIcon) e.getSource();

			Building building = buildingIcon.getBuilding();
			DesignerPanel.selectedBuilding = building;
			DesignerPanel.selectedComponent = null;
			
			// Show components after selected component is set to null
			building.showComponents();		

			DesignerPanel.showInformationPanel("building");
			
			if (DesignerPanel.buildingCount > 0) {
				DesignerPanel.pl_object.showComponentBox();
			}
		}
	}

}