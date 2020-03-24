package fortiss.gui.listeners.helper;

import javax.swing.JLabel;

import fortiss.gui.DesignerPanel;
import fortiss.media.Icon;

/**
 * Sets the icon according to the status of the object: Selected/Unselected
 */
public class FocusManager {
	// Building
	public static void focusBuilding(String buildingName) {
		JLabel lb = (JLabel) DesignerPanel.buildingIcons.get(buildingName);
		lb.setIcon(Icon.sBuilding);
		lb.revalidate();
		DesignerPanel.pl_comp.repaint();
	}

	public static void focusBuilding(JLabel lb) {
		lb.setIcon(Icon.sBuilding);
		lb.revalidate();
		DesignerPanel.pl_comp.repaint();
	}

	public static void focusLostBuilding(String buildingName) {
		JLabel lb = (JLabel) DesignerPanel.buildingIcons.get(buildingName);
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
	public static void focusDemand(String buildingName, int component) {
		focusBuilding(buildingName);
		JLabel lb = (JLabel) DesignerPanel.demandIcons.get(buildingName).get(component);
		lb.setIcon(Icon.sDemand);
		lb.revalidate();
	}

	public static void focusDemand(String buildingName, JLabel lb) {
		focusBuilding(buildingName);
		lb.setIcon(Icon.sDemand);
		lb.revalidate();
	}

	public static void focusLostDemand(String buildingName, int component) {
		focusLostBuilding(buildingName);
		JLabel lb = (JLabel) DesignerPanel.demandIcons.get(buildingName).get(component);
		lb.setIcon(Icon.uDemand);
		lb.revalidate();
	}

	public static void focusLostDemand(String buildingName, JLabel lb) {
		focusLostBuilding(buildingName);
		lb.setIcon(Icon.uDemand);
		lb.revalidate();
	}

	// Storage
	public static void focusStorage(String buildingName, int component) {
		focusBuilding(buildingName);
		JLabel lb = (JLabel) DesignerPanel.storageIcons.get(buildingName).get(component);
		lb.setIcon(Icon.sStorage);
		lb.revalidate();
	}

	public static void focusStorage(String buildingName, JLabel lb) {
		focusBuilding(buildingName);
		lb.setIcon(Icon.sStorage);
		lb.revalidate();
	}

	public static void focusLostStorage(String buildingName, int component) {
		focusLostBuilding(buildingName);
		JLabel lb = (JLabel) DesignerPanel.storageIcons.get(buildingName).get(component);
		lb.setIcon(Icon.uStorage);
		lb.revalidate();
	}

	public static void focusLostStorage(String buildingName, JLabel lb) {
		focusLostBuilding(buildingName);
		lb.setIcon(Icon.uStorage);
		lb.revalidate();
	}

	// Volatile
	public static void focusVolatile(String buildingName, int component) {
		focusBuilding(buildingName);
		JLabel lb = (JLabel) DesignerPanel.volatileIcons.get(buildingName).get(component);
		lb.setIcon(Icon.sVolatile);
		lb.revalidate();
	}

	public static void focusVolatile(String buildingName, JLabel lb) {
		focusBuilding(buildingName);
		lb.setIcon(Icon.sVolatile);
		lb.revalidate();
	}

	public static void focusLostVolatile(String buildingName, int component) {
		focusLostBuilding(buildingName);
		JLabel lb = (JLabel) DesignerPanel.volatileIcons.get(buildingName).get(component);
		lb.setIcon(Icon.uVolatile);
		lb.revalidate();
	}

	public static void focusLostVolatile(String buildingName, JLabel lb) {
		focusLostBuilding(buildingName);
		lb.setIcon(Icon.uVolatile);
		lb.revalidate();
	}

	// Controllable
	public static void focusControllable(String buildingName, int component) {
		focusBuilding(buildingName);
		JLabel lb = (JLabel) DesignerPanel.controllableIcons.get(buildingName).get(component);
		lb.setIcon(Icon.sControllable);
		lb.revalidate();
	}

	public static void focusControllable(String buildingName, JLabel lb) {
		focusBuilding(buildingName);
		lb.setIcon(Icon.sControllable);
		lb.revalidate();
	}

	public static void focusLostControllable(String buildingName, int component) {
		focusLostBuilding(buildingName);
		JLabel lb = (JLabel) DesignerPanel.controllableIcons.get(buildingName).get(component);
		lb.setIcon(Icon.uControllable);
		lb.revalidate();
	}

	public static void focusLostControllable(String buildingName, JLabel lb) {
		focusLostBuilding(buildingName);
		lb.setIcon(Icon.uControllable);
		lb.revalidate();
	}

	// Coupler
	public static void focusCoupler(String buildingName, int component) {
		focusBuilding(buildingName);
		JLabel lb = (JLabel) DesignerPanel.couplerIcons.get(buildingName).get(component);
		lb.setIcon(Icon.sCoupler);
		lb.revalidate();
	}

	public static void focusCoupler(String buildingName, JLabel lb) {
		focusBuilding(buildingName);
		lb.setIcon(Icon.sCoupler);
		lb.revalidate();
	}

	public static void focusLostCoupler(String buildingName, int component) {
		focusLostBuilding(buildingName);
		JLabel lb = (JLabel) DesignerPanel.couplerIcons.get(buildingName).get(component);
		lb.setIcon(Icon.uCoupler);
		lb.revalidate();
	}

	public static void focusLostCoupler(String buildingName, JLabel lb) {
		focusLostBuilding(buildingName);
		lb.setIcon(Icon.uCoupler);
		lb.revalidate();
	}
}
