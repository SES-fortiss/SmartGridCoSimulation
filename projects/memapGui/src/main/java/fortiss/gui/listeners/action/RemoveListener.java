package fortiss.gui.listeners.action;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JLabel;

import fortiss.gui.DesignerPanel;
import fortiss.gui.listeners.helper.PositionManager;

public class RemoveListener extends KeyAdapter {

	private static int building;
	private static int component;

	/**
	 * Remove the icon and the corresponding object data when the user press delete
	 * or back space.
	 */
	public void keyPressed(KeyEvent e) {
		building = DesignerPanel.currentBuilding;
		component = DesignerPanel.currentComponent;

		JLabel source = (JLabel) e.getSource();
		String name = source.getName();
		if (e.getKeyCode() == KeyEvent.VK_DELETE || e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {

			switch (name) {
			case "building":
				removeBuilding();
				break;

			case "demand":
				removeDemand(source);
				break;

			case "storage":
				removeStorage(source);
				break;

			case "volatile":
				removeVolatile(source);
				break;

			case "controllable":
				removeControllable(source);
				break;

			case "coupler":
				removeCoupler(source);
				break;
			}

		}
	}

	/**
	 * Removes building icon, corresponding component icons, building data,
	 * position, corresponding component data.
	 */
	private void removeBuilding() {
		// Remove currentBuilding from building list
		DesignerPanel.buildings.remove(building);
		
		// RDesignerPanelBuilding icon from panel
		DesignerPanel.pl_ems.remove(DesignerPanel.buildingIcons.get(building));
		DesignerPanel.pl_ems.repaint();
		
		// Remove position
		PositionManager.removePosition(DesignerPanel.buildingIcons.get(building));
		
		// Remove component icons of currentBuilding from lists
		DesignerPanel.demandIcons.remove(building);
		DesignerPanel.storageIcons.remove(building);
		DesignerPanel.volatileIcons.remove(building);
		DesignerPanel.controllableIcons.remove(building);
		DesignerPanel.couplerIcons.remove(building);
		
		// Remove EMS detail panel
		DesignerPanel.cl.show(DesignerPanel.pl_comp_detail, "initial");

		// Remove component icons from panel
		DesignerPanel.pl_comp.removeAll();
		DesignerPanel.pl_comp.revalidate();

		// Remove currentBuilding icon from icon list
		DesignerPanel.buildingIcons.remove(building);
		DesignerPanel.buildingCount = DesignerPanel.buildingCount - 1;

		hidePanels();
	}

	/**
	 * Removes demand icon and data.
	 */
	private void removeDemand(JLabel source) {
		DesignerPanel.buildings.get(building).getDemand().remove(component);
		DesignerPanel.demandIcons.get(building).remove(source);
		removeIcon(source);
		hidePanels();
	}

	/**
	 * Removes storage icon and data.
	 */
	private void removeStorage(JLabel source) {
		DesignerPanel.buildings.get(building).getStorage().remove(component);
		DesignerPanel.storageIcons.get(building).remove(source);
		removeIcon(source);
		hidePanels();
	}

	/**
	 * Removes volatile icon and data.
	 */
	private void removeVolatile(JLabel source) {
		DesignerPanel.buildings.get(building).getVolatile().remove(component);
		DesignerPanel.volatileIcons.get(building).remove(source);
		removeIcon(source);
		hidePanels();
	}

	/**
	 * Removes controllable icon and data.
	 */
	private void removeControllable(JLabel source) {
		DesignerPanel.buildings.get(building).getControllable().remove(component);
		DesignerPanel.controllableIcons.get(building).remove(source);
		removeIcon(source);
		hidePanels();
	}

	/**
	 * Removes coupler icon and data.
	 */
	private void removeCoupler(JLabel source) {
		DesignerPanel.buildings.get(building).getCoupler().remove(component);
		DesignerPanel.couplerIcons.get(building).remove(source);
		removeIcon(source);
		hidePanels();
	}

	/**
	 * Hides component panel if currentBuilding or all its components are deleted.
	 */
	private void hidePanels() {
		DesignerPanel.cl.show(DesignerPanel.pl_comp_detail, "initial");
		if (DesignerPanel.buildings.size() == 0) {
			DesignerPanel.pl_object.hideComponentBox();
		}
	}

	/**
	 * Removes the icon from the component panel.
	 */
	private void removeIcon(JLabel source) {
		DesignerPanel.pl_comp.remove(source);
		source.revalidate();
	}
}
