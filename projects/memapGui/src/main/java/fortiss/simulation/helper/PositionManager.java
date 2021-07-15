package fortiss.simulation.helper;

import java.awt.Point;
import java.awt.Rectangle;

import javax.swing.JLabel;

import fortiss.components.Building;
import fortiss.gui.DesignerPanel;
import fortiss.gui.icons.BuildingIcon;
import fortiss.gui.icons.Icon;

/**
 * Manages the positions of building icons.
 */
public class PositionManager {

	private static PositionManager pm = new PositionManager();

	/**
	 * @return PositionManager instance
	 */
	public static PositionManager getInstance() {
		return pm;
	}

	/**
	 * Corrects the position of a building icon that has been dragged out of the
	 * visible area of the panel. Calls
	 * {@link PositionManager#updateBuildingPosition(JLabel)}.
	 */
	public void fixPosition(BuildingIcon icon) {
		int x = icon.getX();
		int y = icon.getY();
		
		Rectangle visibleArea = getVisibleArea(icon);
		
		if (x < visibleArea.x) {
			x = visibleArea.x;
		}
		if (x > visibleArea.width) {
			x = visibleArea.width;
		}
		if (y < visibleArea.y) {
			y = visibleArea.y;
		}
		if (y > visibleArea.height) {
			y = visibleArea.height;
		}

		icon.setTopLeftPosition(new Point(x, y));
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
	public Rectangle getVisibleArea(Icon icon) {
		Rectangle visibleRec = DesignerPanel.pl_ems.getVisibleRect();
		visibleRec.x += icon.getWidth() / 3;
		visibleRec.y += icon.getHeight() / 3 ;
		visibleRec.width -= icon.getWidth() * 1.5;
		visibleRec.height -= icon.getHeight() * 1.5;
		return visibleRec;
	}

}
