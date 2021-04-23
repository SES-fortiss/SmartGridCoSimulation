package fortiss.simulation.helper;

import java.awt.Rectangle;
import java.awt.geom.Point2D;

import javax.swing.JLabel;

import fortiss.components.Building;
import fortiss.gui.DesignerPanel;
import fortiss.gui.icons.BuildingIcon;
import fortiss.media.IconStore;

/**
 * Manages the centerPositions of building icons.
 */
public class PositionManager {

	private static PositionManager pm = new PositionManager();
	private ConnectionManager cm = ConnectionManager.getInstance();

	/**
	 * @return PositionManager instance
	 */
	public static PositionManager getInstance() {
		return pm;
	}

	/**
	 * Updates positions of a building label. Calls
	 * {@link fortiss.simulation.helper.ConnectionManager#updateLines()}
	 * 
	 * @param buildingName the name of a building
	 * @param icon         a building icon
	 */
	public void updateCenterPositionOf(BuildingIcon icon) {
		icon.setPosition(getCentralPoint(icon));
		cm.updateLines();
		DesignerPanel.pl_ems.repaint();
	}

	/**
	 * Returns the central point of an icon.
	 * 
	 * @param icon a building icon
	 */
	public Point2D getCentralPoint(JLabel icon) {
		Point2D p = new Point2D.Float(icon.getX() + IconStore.sBuilding.getIconWidth() / 2, icon.getY() + IconStore.sBuilding.getIconHeight() / 2);
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
		Point2D p = new Point2D.Float((int) centralPoint.getX() - IconStore.sBuilding.getIconWidth() / 2,
				(int) centralPoint.getY() - IconStore.sBuilding.getIconHeight() / 2);
		return p;
	}

	/**
	 * Returns the position of a building.
	 * 
	 * @param buildingName the name of a building
	 */
	/*
	 * public Point2D getPositionOf(String buildingName) { return
	 * getCenterPositions().get(buildingName); }
	 */

	/**
	 * Corrects the position of a building icon that has been dragged out of the
	 * visible area of the panel. Calls
	 * {@link PositionManager#updateBuildingPosition(JLabel)}.
	 */
	public void fixPosition(BuildingIcon icon) {
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
		updateCenterPositionOf(icon);
		DesignerPanel.pl_ems.repaint();
	}

	/**
	 * Corrects the building positions that are out of the visible area when the
	 * panel is resized. Calls {@link PositionManager#fixPosition(JLabel)}
	 */
	public void fixPositions() {
		for (Building building : DesignerPanel.buildings.values()) {
			BuildingIcon icon = building.getIcon();
			fixPosition(icon);
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
		visibleRec.x += IconStore.sBuilding.getIconWidth() / 3;
		visibleRec.y += IconStore.sBuilding.getIconHeight() / 3 ;
		visibleRec.width -= IconStore.sBuilding.getIconWidth() * 1.5;
		visibleRec.height -= IconStore.sBuilding.getIconHeight() * 1.5;
		return visibleRec;
	}

}
