package fortiss.gui.listeners.action;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JLabel;

import fortiss.gui.Designer;
import fortiss.gui.listeners.helper.PositionManager;

public class RemoveListener extends KeyAdapter {

	private static int building;
	private static int component;

	/**
	 * Remove the icon and the corresponding object data when the user press delete
	 * or back space.
	 */
	public void keyPressed(KeyEvent e) {
		building = Designer.currentBuilding;
		component = Designer.currentComponent;

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
		Designer.buildings.remove(building);
		
		// Remove currentBuilding icon from panel
		Designer.pl_ems.remove(Designer.buildingIcons.get(building));
		Designer.pl_ems.repaint();
		
		// Remove position
		PositionManager.removePosition(Designer.buildingIcons.get(building));
		
		// Remove component icons of currentBuilding from lists
		Designer.demandIcons.remove(building);
		Designer.storageIcons.remove(building);
		Designer.volatileIcons.remove(building);
		Designer.controllableIcons.remove(building);
		Designer.couplerIcons.remove(building);
		
		// Remove EMS detail panel
		Designer.cl.show(Designer.pl_comp_detail, "initial");

		// Remove component icons from panel
		Designer.pl_comp.removeAll();
		Designer.pl_comp.repaint();

		// Remove currentBuilding icon from icon list
		Designer.buildingIcons.remove(building);
		Designer.buildingCount = Designer.buildingCount - 1;

		hidePanels();
	}

	/**
	 * Removes demand icon and data.
	 */
	private void removeDemand(JLabel source) {
		Designer.buildings.get(building).getDemand().remove(component);
		Designer.demandIcons.get(building).remove(source);
		removeIcon(source);
		hidePanels();
	}

	/**
	 * Removes storage icon and data.
	 */
	private void removeStorage(JLabel source) {
		Designer.buildings.get(building).getStorage().remove(component);
		Designer.storageIcons.get(building).remove(source);
		removeIcon(source);
		hidePanels();
	}

	/**
	 * Removes volatile icon and data.
	 */
	private void removeVolatile(JLabel source) {
		Designer.buildings.get(building).getVolatile().remove(component);
		Designer.volatileIcons.get(building).remove(source);
		removeIcon(source);
		hidePanels();
	}

	/**
	 * Removes controllable icon and data.
	 */
	private void removeControllable(JLabel source) {
		Designer.buildings.get(building).getControllable().remove(component);
		Designer.controllableIcons.get(building).remove(source);
		removeIcon(source);
		hidePanels();
	}

	/**
	 * Removes coupler icon and data.
	 */
	private void removeCoupler(JLabel source) {
		Designer.buildings.get(building).getCoupler().remove(component);
		Designer.couplerIcons.get(building).remove(source);
		removeIcon(source);
		hidePanels();
	}

	/**
	 * Hides component panel if currentBuilding or all its components are deleted.
	 */
	private void hidePanels() {
		Designer.cl.show(Designer.pl_comp_detail, "initial");
		if (Designer.buildings.size() == 0) {
			Designer.pl_object.hideComponentBox();
		}
	}

	/**
	 * Removes the icon from the component panel.
	 */
	private void removeIcon(JLabel source) {
		Designer.pl_comp.remove(source);
		Designer.pl_comp.repaint();
	}
}
