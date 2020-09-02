package fortiss.simulation.helper;

import java.awt.Rectangle;
import java.awt.geom.Point2D;
import java.util.Map.Entry;
import java.util.TreeMap;

import javax.swing.JLabel;

import com.google.gson.annotations.Expose;

import fortiss.components.Building;
import fortiss.gui.DesignerPanel;
import fortiss.media.Icon;

/**
 * Manages the positions of building icons.
 */
public class PositionManager {

	private static PositionManager pm = new PositionManager();
	private ConnectionManager cm = ConnectionManager.getInstance();

	@Expose
	private TreeMap<String, Point2D> positions = new TreeMap<String, Point2D>();

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
	public void addPosition(String buildingName, JLabel icon) {
		getPositions().put(buildingName, getCentralPoint(icon));
	}

	/**
	 * Removes the positions of a building icon.
	 * 
	 * @param icon a building label
	 */
	public void removePosition(String buildingName) {
		getPositions().remove(buildingName);
		cm.removeConnectionsOf(buildingName);
	}

	/**
	 * Clears the positions list. Calls
	 * {@link fortiss.simulation.helper.ConnectionManager#resetConnections()}
	 */
	public void clearPositions() {
		getPositions().clear();
		cm.resetConnections();
	}

	/**
	 * Updates positions of a building label. Calls
	 * {@link fortiss.simulation.helper.ConnectionManager#updateLines()}
	 * 
	 * @param buildingName the name of a building
	 * @param icon         a building icon
	 */
	public void updateBuildingPosition(String buildingName, JLabel icon) {
		getPositions().replace(buildingName, getCentralPoint(icon));
		cm.updateLines();
		DesignerPanel.pl_ems.repaint();
	}

	/**
	 * Assign a position to a building icon. Intended for the deserialization
	 * process, only.
	 * 
	 * @param buildingName the name of a building
	 * @param icon         the icon of a building
	 */
	private void assignPosition(String buildingName, JLabel icon) {
		Point2D position = getUpperLeftPoint(icon, getPositionOf(buildingName));
		icon.setLocation((int) position.getX(), (int) position.getY());
	}

	/**
	 * Assign {@link #getPositions()} to all the building icons. Calls
	 * {@link #updatePositions(String, JLabel)}. Intended for the deserialization
	 * process, only.
	 */
	public void updatePositions() {
		for (Entry<Building, JLabel> entry : DesignerPanel.buildingIcons.entrySet()) {
			String buildingName = entry.getKey().getName();
			JLabel icon = entry.getValue();
			assignPosition(buildingName, icon);
		}
	}

	/**
	 * Returns the central point of an icon.
	 * 
	 * @param icon a building icon
	 */
	public Point2D getCentralPoint(JLabel icon) {
		Point2D p = new Point2D.Float(icon.getX() + icon.getWidth() / 2, icon.getY() + icon.getHeight() / 2);
		return p;
	}

	/**
	 * Returns the upper left point of an icon. Intended for the deserialization
	 * process
	 * 
	 * @param icon         a building icon
	 * @param centralPoint the central point where the icon is to be located.
	 */
	private Point2D getUpperLeftPoint(JLabel icon, Point2D centralPoint) {
		Point2D p = new Point2D.Float((int) centralPoint.getX() - icon.getWidth() / 2,
				(int) centralPoint.getY() - icon.getHeight() / 2);
		return p;
	}

	/**
	 * Returns the position of a building.
	 * 
	 * @param buildingName the name of a building
	 */
	public Point2D getPositionOf(String buildingName) {
		return getPositions().get(buildingName);
	}

	/**
	 * Corrects the position of a building icon that has been dragged out of the
	 * visible area of the panel. Calls
	 * {@link PositionManager#updateBuildingPosition(JLabel)}.
	 */
	public void fixPosition(String buildingName, JLabel icon) {
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
		updateBuildingPosition(buildingName, icon);
		DesignerPanel.pl_ems.repaint();
	}

	/**
	 * Corrects the building positions that are out of the visible area when the
	 * panel is resized. Calls {@link PositionManager#fixPosition(JLabel)}
	 */
	public void fixPositions() {
		for (Entry<Building, JLabel> entry : DesignerPanel.buildingIcons.entrySet()) {
			String buildingName = entry.getKey().getName();
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
	public Rectangle getVisibleArea() {
		Rectangle visibleRec = DesignerPanel.pl_ems.getVisibleRect();
		visibleRec.width -= Icon.sBuilding.getIconWidth();
		visibleRec.height -= Icon.sBuilding.getIconHeight() * (1.3);
		return visibleRec;
	}

	/**
	 * @return the position map for building icons
	 */
	public TreeMap<String, Point2D> getPositions() {
		return positions;
	}

	/**
	 * Set the positions map to the value passed. Calls
	 * {@link PositionManager#updatePositions()} and repaints the panel
	 * 
	 * @param positions
	 */
	public void setPositions(TreeMap<String, Point2D> positions) {
		this.positions = positions;
		updatePositions();
		DesignerPanel.pl_ems.repaint();
	}

	/**
	 * Update a building name. Calls {@link ConnectionManager#updateBuildingsName(String, String)}
	 * 
	 * @param oldName
	 * @param newName
	 */
	public void updateBuildingsName(String oldName, String newName) {
		Point2D point = positions.get(oldName);
		positions.remove(oldName);
		positions.put(newName, point);
		cm.updateBuildingsName(oldName, newName);
	}
}
