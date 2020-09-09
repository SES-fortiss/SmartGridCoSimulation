package fortiss.gui.listeners.action;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import fortiss.gui.DesignerPanel;
import fortiss.gui.icons.BuildingIcon;
import fortiss.gui.icons.ComponentIcon;
import fortiss.gui.icons.Icon;
import fortiss.simulation.helper.PositionManager;

public class RemoveListener extends KeyAdapter {

	/**
	 * Remove the icon and the corresponding object data when the user press delete
	 * or back space.
	 */
	public void keyPressed(KeyEvent e) {

		Icon source = (Icon) e.getSource();

		if (e.getKeyCode() == KeyEvent.VK_DELETE || e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {

			if (source instanceof BuildingIcon) {
				BuildingIcon buildingIcon = (BuildingIcon) source;
				removeBuilding(buildingIcon);
			} else {
				ComponentIcon componentIcon = (ComponentIcon) source;
				String type = source.getType();

				switch (type) {
				case "demand":
					DesignerPanel.selectedBuilding.getDemand().remove(componentIcon.getComponent());
					break;

				case "storage":
					DesignerPanel.selectedBuilding.getStorage().remove(componentIcon.getComponent());
					break;

				case "volatile":
					DesignerPanel.selectedBuilding.getVolatile().remove(componentIcon.getComponent());
					break;

				case "controllable":
					DesignerPanel.selectedBuilding.getControllable().remove(componentIcon.getComponent());
					break;

				case "coupler":
					DesignerPanel.selectedBuilding.getCoupler().remove(componentIcon.getComponent());
					break;
				}
				removeComponentIcon(componentIcon);
				hidePanels();

			}
		}
	}

	/**
	 * Removes building icon, corresponding component icons, building data,
	 * position, corresponding component data.
	 */
	private void removeBuilding(BuildingIcon buildingIcon) {

		String buildingName = buildingIcon.getBuilding().getName();

		// Remove building icon from panel
		DesignerPanel.pl_ems.remove(buildingIcon);
		DesignerPanel.pl_ems.repaint();

		// Remove component icons from panel
		DesignerPanel.pl_comp.removeAll();
		DesignerPanel.pl_comp.repaint();

		// Remove currentBuilding from building list
		DesignerPanel.buildings.remove(buildingName);

		// Remove position
		PositionManager pm = PositionManager.getInstance();
		pm.removePosition(buildingName);

		// Remove EMS detail panel
		DesignerPanel.showInformationPanel("initial");

		DesignerPanel.buildingCount = DesignerPanel.buildingCount - 1;

		hidePanels();
	}

	/**
	 * Hides component panel if currentBuilding or all its components are deleted.
	 */
	private void hidePanels() {
		DesignerPanel.showInformationPanel("initial");
		if (DesignerPanel.buildings.size() == 0) {
			DesignerPanel.pl_object.hideComponentBox();
		}
	}

	/**
	 * Removes the icon from the component panel.
	 */
	private void removeComponentIcon(ComponentIcon componentIcon) {
		DesignerPanel.pl_comp.remove(componentIcon);
		DesignerPanel.pl_comp.repaint();
	}
}
