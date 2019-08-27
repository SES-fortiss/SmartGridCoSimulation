package fortiss.gui.listeners.helper;

import javax.swing.JLabel;

import fortiss.gui.Designer;
import fortiss.media.Icon;

/**
 * Sets the icon according to the status of the object: Selected/Unselected
 */
public class FocusManager {
	// Building
	public static void focusBuilding(int building) {
		JLabel lb = (JLabel) Designer.buildingIcons.get(building);
		lb.setIcon(Icon.sBuilding);
		Designer.pl_ems.repaint();
	}

	public static void focusBuilding(JLabel lb) {
		lb.setIcon(Icon.sBuilding);
		Designer.pl_ems.repaint();
	}

	public static void focusLostBuilding(int building) {
		JLabel lb = (JLabel) Designer.buildingIcons.get(building);
		lb.setIcon(Icon.uBuilding);
		Designer.pl_ems.repaint();
	}

	public static void focusLostBuilding(JLabel lb) {
		lb.setIcon(Icon.uBuilding);
		Designer.pl_ems.repaint();
	}

	// Demand
	public static void focusDemand(int building, int component) {
		focusBuilding(building);
		JLabel lb = (JLabel) Designer.demandIcons.get(building).get(component);
		lb.setIcon(Icon.sDemand);
		Designer.pl_ems.repaint();
	}

	public static void focusDemand(int building, JLabel lb) {
		focusBuilding(building);
		lb.setIcon(Icon.sDemand);
		Designer.pl_ems.repaint();
	}

	public static void focusLostDemand(int building, int component) {
		focusLostBuilding(building);
		JLabel lb = (JLabel) Designer.demandIcons.get(building).get(component);
		lb.setIcon(Icon.uDemand);
		Designer.pl_ems.repaint();
	}

	public static void focusLostDemand(int building, JLabel lb) {
		focusLostBuilding(building);
		lb.setIcon(Icon.uDemand);
		Designer.pl_ems.repaint();
	}

	// Storage
	public static void focusStorage(int building, int component) {
		focusBuilding(building);
		JLabel lb = (JLabel) Designer.storageIcons.get(building).get(component);
		lb.setIcon(Icon.sStorage);
		Designer.pl_ems.repaint();
	}

	public static void focusStorage(int building, JLabel lb) {
		focusBuilding(building);
		lb.setIcon(Icon.sStorage);
		Designer.pl_ems.repaint();
	}

	public static void focusLostStorage(int building, int component) {
		focusLostBuilding(building);
		JLabel lb = (JLabel) Designer.storageIcons.get(building).get(component);
		lb.setIcon(Icon.uStorage);
		Designer.pl_ems.repaint();
	}

	public static void focusLostStorage(int building, JLabel lb) {
		focusLostBuilding(building);
		lb.setIcon(Icon.uStorage);
		Designer.pl_ems.repaint();
	}

	// Volatile
	public static void focusVolatile(int building, int component) {
		focusBuilding(building);
		JLabel lb = (JLabel) Designer.volatileIcons.get(building).get(component);
		lb.setIcon(Icon.sVolatile);
		Designer.pl_ems.repaint();
	}

	public static void focusVolatile(int building, JLabel lb) {
		focusBuilding(building);
		lb.setIcon(Icon.sVolatile);
		Designer.pl_ems.repaint();
	}

	public static void focusLostVolatile(int building, int component) {
		focusLostBuilding(building);
		JLabel lb = (JLabel) Designer.volatileIcons.get(building).get(component);
		lb.setIcon(Icon.uVolatile);
		Designer.pl_ems.repaint();
	}

	public static void focusLostVolatile(int building, JLabel lb) {
		focusLostBuilding(building);
		lb.setIcon(Icon.uVolatile);
		Designer.pl_ems.repaint();
	}

	// Controllable
	public static void focusControllable(int building, int component) {
		focusBuilding(building);
		JLabel lb = (JLabel) Designer.controllableIcons.get(building).get(component);
		lb.setIcon(Icon.sControllable);
		Designer.pl_ems.repaint();
	}

	public static void focusControllable(int building, JLabel lb) {
		focusBuilding(building);
		lb.setIcon(Icon.sControllable);
		Designer.pl_ems.repaint();
	}

	public static void focusLostControllable(int building, int component) {
		focusLostBuilding(building);
		JLabel lb = (JLabel) Designer.controllableIcons.get(building).get(component);
		lb.setIcon(Icon.uControllable);
		Designer.pl_ems.repaint();
	}

	public static void focusLostControllable(int building, JLabel lb) {
		focusLostBuilding(building);
		lb.setIcon(Icon.uControllable);
		Designer.pl_ems.repaint();
	}

	// Coupler
	public static void focusCoupler(int building, int component) {
		focusBuilding(building);
		JLabel lb = (JLabel) Designer.couplerIcons.get(building).get(component);
		lb.setIcon(Icon.sCoupler);
		Designer.pl_ems.repaint();
	}

	public static void focusCoupler(int building, JLabel lb) {
		focusBuilding(building);
		lb.setIcon(Icon.sCoupler);
		Designer.pl_ems.repaint();
	}

	public static void focusLostCoupler(int building, int component) {
		focusLostBuilding(building);
		JLabel lb = (JLabel) Designer.couplerIcons.get(building).get(component);
		lb.setIcon(Icon.uCoupler);
		Designer.pl_ems.repaint();
	}

	public static void focusLostCoupler(int building, JLabel lb) {
		focusLostBuilding(building);
		lb.setIcon(Icon.uCoupler);
		Designer.pl_ems.repaint();
	}
}
