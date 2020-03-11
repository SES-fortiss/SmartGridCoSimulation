package fortiss.gui.listeners.helper;

import javax.swing.JLabel;

import fortiss.gui.DesignerPanel;
import fortiss.media.Icon;

/**
 * Sets the icon according to the status of the object: Selected/Unselected
 */
public class FocusManager {
	// Building
	public static void focusBuilding(int building) {
		JLabel lb = (JLabel) DesignerPanel.buildingIcons.get(building);
		lb.setIcon(Icon.sBuilding);
		lb.revalidate();
		DesignerPanel.pl_comp.repaint();
	}

	public static void focusBuilding(JLabel lb) {
		lb.setIcon(Icon.sBuilding);
		lb.revalidate();
		DesignerPanel.pl_comp.repaint();
	}

	public static void focusLostBuilding(int building) {
		JLabel lb = (JLabel) DesignerPanel.buildingIcons.get(building);
		lb.setIcon(Icon.uBuilding);
		lb.revalidate();
		DesignerPanel.pl_comp.repaint();
	}

	public static void focusLostBuilding(JLabel lb) {
		lb.setIcon(Icon.uBuilding);
		lb.revalidate();
		DesignerPanel.pl_comp.repaint();
	}

	// Demand
	public static void focusDemand(int building, int component) {
		focusBuilding(building);
		JLabel lb = (JLabel) DesignerPanel.demandIcons.get(building).get(component);
		lb.setIcon(Icon.sDemand);
		lb.revalidate();
	}

	public static void focusDemand(int building, JLabel lb) {
		focusBuilding(building);
		lb.setIcon(Icon.sDemand);
		lb.revalidate();
	}

	public static void focusLostDemand(int building, int component) {
		focusLostBuilding(building);
		JLabel lb = (JLabel) DesignerPanel.demandIcons.get(building).get(component);
		lb.setIcon(Icon.uDemand);
		lb.revalidate();
	}

	public static void focusLostDemand(int building, JLabel lb) {
		focusLostBuilding(building);
		lb.setIcon(Icon.uDemand);
		lb.revalidate();
	}

	// Storage
	public static void focusStorage(int building, int component) {
		focusBuilding(building);
		JLabel lb = (JLabel) DesignerPanel.storageIcons.get(building).get(component);
		lb.setIcon(Icon.sStorage);
		lb.revalidate();
	}

	public static void focusStorage(int building, JLabel lb) {
		focusBuilding(building);
		lb.setIcon(Icon.sStorage);
		lb.revalidate();
	}

	public static void focusLostStorage(int building, int component) {
		focusLostBuilding(building);
		JLabel lb = (JLabel) DesignerPanel.storageIcons.get(building).get(component);
		lb.setIcon(Icon.uStorage);
		lb.revalidate();
	}

	public static void focusLostStorage(int building, JLabel lb) {
		focusLostBuilding(building);
		lb.setIcon(Icon.uStorage);
		lb.revalidate();
	}

	// Volatile
	public static void focusVolatile(int building, int component) {
		focusBuilding(building);
		JLabel lb = (JLabel) DesignerPanel.volatileIcons.get(building).get(component);
		lb.setIcon(Icon.sVolatile);
		lb.revalidate();
	}

	public static void focusVolatile(int building, JLabel lb) {
		focusBuilding(building);
		lb.setIcon(Icon.sVolatile);
		lb.revalidate();
	}

	public static void focusLostVolatile(int building, int component) {
		focusLostBuilding(building);
		JLabel lb = (JLabel) DesignerPanel.volatileIcons.get(building).get(component);
		lb.setIcon(Icon.uVolatile);
		lb.revalidate();
	}

	public static void focusLostVolatile(int building, JLabel lb) {
		focusLostBuilding(building);
		lb.setIcon(Icon.uVolatile);
		lb.revalidate();
	}

	// Controllable
	public static void focusControllable(int building, int component) {
		focusBuilding(building);
		JLabel lb = (JLabel) DesignerPanel.controllableIcons.get(building).get(component);
		lb.setIcon(Icon.sControllable);
		lb.revalidate();
	}

	public static void focusControllable(int building, JLabel lb) {
		focusBuilding(building);
		lb.setIcon(Icon.sControllable);
		lb.revalidate();
	}

	public static void focusLostControllable(int building, int component) {
		focusLostBuilding(building);
		JLabel lb = (JLabel) DesignerPanel.controllableIcons.get(building).get(component);
		lb.setIcon(Icon.uControllable);
		lb.revalidate();
	}

	public static void focusLostControllable(int building, JLabel lb) {
		focusLostBuilding(building);
		lb.setIcon(Icon.uControllable);
		lb.revalidate();
	}

	// Coupler
	public static void focusCoupler(int building, int component) {
		focusBuilding(building);
		JLabel lb = (JLabel) DesignerPanel.couplerIcons.get(building).get(component);
		lb.setIcon(Icon.sCoupler);
		lb.revalidate();
	}

	public static void focusCoupler(int building, JLabel lb) {
		focusBuilding(building);
		lb.setIcon(Icon.sCoupler);
		lb.revalidate();
	}

	public static void focusLostCoupler(int building, int component) {
		focusLostBuilding(building);
		JLabel lb = (JLabel) DesignerPanel.couplerIcons.get(building).get(component);
		lb.setIcon(Icon.uCoupler);
		lb.revalidate();
	}

	public static void focusLostCoupler(int building, JLabel lb) {
		focusLostBuilding(building);
		lb.setIcon(Icon.uCoupler);
		lb.revalidate();
	}
}
