package fortiss.simulation.helper;

import java.awt.Rectangle;
import java.awt.geom.Point2D;
import java.util.Map.Entry;
import java.util.TreeMap;

import javax.swing.JLabel;

import com.google.gson.annotations.Expose;

import fortiss.components.Building;
import fortiss.gui.BuildingIcon;
import fortiss.gui.DesignerPanel;
import fortiss.media.Icon;

/**
 * Manages the centerPositions of building icons.
 */
public class PositionManager {

	private static PositionManager pm = new PositionManager();
	private ConnectionManager cm = ConnectionManager.getInstance();

	@Expose
	private TreeMap<String, Point2D> centerPositions = new TreeMap<String, Point2D>();

	/**
	 * @return PositionManager instance
	 */
	public static PositionManager getInstance() {
		return pm;
	}

	/**
	 * Adds the positions of a building icon.
	 * 
	 * @param buildingName the name of a building
	 * @param icon         a building label
	 */
	public void addPosition(String buildingName, BuildingIcon icon) {
		getCenterPositions().put(buildingName, getCentralPoint(icon));
	}

	/**
	 * Removes the positions of a building icon.
	 * 
	 * @param icon a building label
	 */
	public void removePosition(String buildingName) {
		getCenterPositions().remove(buildingName);
		cm.removeConnectionsOf(buildingName);
	}

	/**
	 * Clears the positions list. Calls
	 * {@link fortiss.simulation.helper.ConnectionManager#resetConnections()}
	 */
	public void clearPositions() {
		getCenterPositions().clear();
		cm.resetConnections();
	}

	/**
	 * Updates positions of a building label. Calls
	 * {@link fortiss.simulation.helper.ConnectionManager#updateLines()}
	 * 
	 * @param buildingName the name of a building
	 * @param icon         a building icon
	 */
	public void updateCenterPositionOf(String buildingName, BuildingIcon icon) {
		getCenterPositions().replace(buildingName, getCentralPoint(icon));
		cm.updateLines();
		DesignerPanel.pl_ems.repaint();
	}

	/**
	 * Returns the central point of an icon.
	 * 
	 * @param icon a building icon
	 */
	public Point2D getCentralPoint(JLabel icon) {
		Point2D p = new Point2D.Float(icon.getX() + Icon.sBuilding.getIconWidth() / 2, icon.getY() + Icon.sBuilding.getIconHeight() / 2);
		return p;
	}

	/**
	 * Returns the upper left point of an icon. Intended for the deserialization
	 * process
	 * 
	 * @param icon         a building icon
	 * @param centralPoint the central point where the icon is to be located.
	 */
	public Point2D getUpperLeftPoint(Point2D centralPoint) {
		Point2D p = new Point2D.Float((int) centralPoint.getX() - Icon.sBuilding.getIconWidth() / 2,
				(int) centralPoint.getY() - Icon.sBuilding.getIconHeight() / 2);
		return p;
	}

	/**
	 * Returns the position of a building.
	 * 
	 * @param buildingName the name of a building
	 */
	public Point2D getPositionOf(String buildingName) {
		return getCenterPositions().get(buildingName);
	}

	/**
	 * Corrects the position of a building icon that has been dragged out of the
	 * visible area of the panel. Calls
	 * {@link PositionManager#updateBuildingPosition(JLabel)}.
	 */
	public void fixPosition(String buildingName, BuildingIcon icon) {
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
		updateCenterPositionOf(buildingName, icon);
		DesignerPanel.pl_ems.repaint();
	}

	/**
	 * Corrects the building positions that are out of the visible area when the
	 * panel is resized. Calls {@link PositionManager#fixPosition(JLabel)}
	 */
	public void fixPositions() {
		for (Entry<Building, BuildingIcon> entry : DesignerPanel.buildingIcons.entrySet()) {
			String buildingName = entry.getKey().getName();
			BuildingIcon icon = entry.getValue();
			fixPosition(buildingName, icon);
		}
	}

	/**
	 * Calculates the visible area of the panel, considering the width and height of
	 * the icons.
	 * 
	 * @return visibleRec area in which an icon is fully visible
	 */
	public Rectangle getVisibleArea() {
		Rectangle visibleRec = DesignerPanel.pl_ems.getVisibleRect();
		visibleRec.x += Icon.sBuilding.getIconWidth() / 3;
		visibleRec.y += Icon.sBuilding.getIconHeight() / 3 ;
		visibleRec.width -= Icon.sBuilding.getIconWidth() * 1.5;
		visibleRec.height -= Icon.sBuilding.getIconHeight() * 1.5;
		return visibleRec;
	}

	/**
	 * @return the position map for the center of building icons
	 */
	public TreeMap<String, Point2D> getCenterPositions() {
		return centerPositions;
	}

	/**
	 * Update a building name. Calls
	 * {@link ConnectionManager#updateBuildingsName(String, String)}
	 * 
	 * @param oldName
	 * @param newName
	 */
	public void updateBuildingsName(String oldName, String newName) {
		Point2D point = centerPositions.get(oldName);
		centerPositions.remove(oldName);
		centerPositions.put(newName, point);
		cm.updateBuildingsName(oldName, newName);
	}
}
