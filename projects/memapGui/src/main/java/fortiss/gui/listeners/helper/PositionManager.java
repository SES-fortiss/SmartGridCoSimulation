package fortiss.gui.listeners.helper;

import java.awt.Rectangle;
import java.awt.geom.Point2D;
import java.util.Map.Entry;
import java.util.TreeMap;

import javax.swing.JLabel;

import fortiss.gui.DesignerPanel;
import fortiss.media.Icon;

/**
 * Manages the position of building icons.
 */
public abstract class PositionManager {

	public static TreeMap<String, Point2D> position = new TreeMap<String, Point2D>();

	/**
	 * Adds the position of a building icon.
	 * 
	 * @param buildingName the name of a building
	 * @param icon a building label
	 */
	public static void addPosition(String buildingName, JLabel icon) {
		position.put(buildingName, getCentralPoint(icon));
	}

	/**
	 * Removes the position of a building icon.
	 * 
	 * @param icon a building label
	 */
	public static void removePosition(String buildingName) {
		position.remove(buildingName);
		ConnectionManager.removeConnectionsOf(buildingName);
	}

	/**
	 * Clears the position list. Calls
	 * {@link fortiss.gui.listeners.helper.ConnectionManager#resetConnections()}
	 */
	public static void clearPositions() {
		position.clear();
		ConnectionManager.resetConnections();
	}

	/**
	 * Updates position of a building label. Calls
	 * {@link fortiss.gui.listeners.helper.ConnectionManager#updateLines()}
	 * 
	 * @param buildingName the name of a building
	 * @param icon a building icon
	 */
	public static void updateBuildingPosition(String buildingName, JLabel icon) {
		position.replace(buildingName, getCentralPoint(icon));
		ConnectionManager.updateLines();
		DesignerPanel.pl_ems.repaint();
	}

	/**
	 * Returns the central point of an icon.
	 * 
	 * @param icon a building icon
	 */
	public static Point2D getCentralPoint(JLabel icon) {
		Point2D p = new Point2D.Float(icon.getX() + icon.getWidth() / 2, icon.getY() + icon.getHeight() / 2);
		return p;
	}

	/**
	 * Returns the position of a building.
	 * 
	 * @param buildingName the name of a building
	 */
	public static Point2D getPositionOf(String buildingName) {
		return position.get(buildingName);
	}

	/**
	 * Corrects the position of a building icon that has been dragged out of the
	 * visible area of the panel. Calls
	 * {@link PositionManager#updateBuildingPosition(JLabel)}.
	 */
	public static void fixPosition(String buildingName, JLabel icon) {
		int x = icon.getX();
		int y = icon.getY();

		if (x < getVisibleArea().x) {
			x = getVisibleArea().x;
		}
		if (x > getVisibleArea().width) {
			x = getVisibleArea().width;
		}
		if (y < getVisibleArea().y) {
			y = getVisibleArea().y;
		}
		if (y > getVisibleArea().height) {
			y = getVisibleArea().height;
		}
		icon.setLocation(x, y);
		PositionManager.updateBuildingPosition(buildingName, icon);
		DesignerPanel.pl_ems.repaint();
	}

	/**
	 * Corrects the building positions that are out of the visible area when the
	 * panel is resized. Calls {@link PositionManager#fixPosition(JLabel)}
	 */
	public static void fixPositions() {
		for (Entry<String, JLabel> entry : DesignerPanel.buildingIcons.entrySet()) {
			String buildingName = entry.getKey();
			JLabel icon = entry.getValue();
			fixPosition(buildingName, icon);
		}
	}

	/**
	 * Calculates the visible area of the panel, considering the width and height of
	 * the icons.
	 * 
	 * @return visibleRec area in which an icon is fully visible
	 */
	public static Rectangle getVisibleArea() {
		Rectangle visibleRec = DesignerPanel.pl_ems.getVisibleRect();
		visibleRec.width -= Icon.sBuilding.getIconWidth();
		visibleRec.height -= Icon.sBuilding.getIconHeight() * (1.3);
		return visibleRec;
	}

}
