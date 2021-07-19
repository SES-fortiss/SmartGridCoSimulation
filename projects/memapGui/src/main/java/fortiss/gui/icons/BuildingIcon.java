package fortiss.gui.icons;

import java.awt.Point;
import java.awt.geom.Point2D;

import javax.swing.ImageIcon;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import fortiss.components.Building;
import fortiss.gui.DesignerPanel;
import fortiss.gui.listeners.action.BuildingListener;
import fortiss.gui.listeners.label.ConnectorListener;
import fortiss.gui.listeners.label.PositionListener;
import fortiss.gui.style.Fonts;
import fortiss.media.IconStore;
import fortiss.simulation.PlanningTool;
import fortiss.simulation.helper.ConnectionManager;
import fortiss.simulation.helper.PositionManager;

public class BuildingIcon extends Icon {

	private static final long serialVersionUID = 1L;
	/** The building this icon represents, if any */
	private Building building;

	@SerializedName("position")
	@Expose
	private Point2D centralPosition;

	/**
	 * Creates a building icon that represent a new building
	 */
	public BuildingIcon(Building building, Point2D centralPosition) {
		super(building.getName(), "building", IconStore.sBuilding, IconStore.uBuilding);
		setBuilding(building);
		setCentralPosition(centralPosition);

		String toolTip = "<html>" + building.getName() + "<br>- click to select building"
				+ "<br>- press DEL to delete selected building" + "<br>- right click and drag to create a connection "
				+ "<br>- double click on connection to modify it parameters </html>";

		setToolTipText(toolTip);

		DesignerPanel.pl_ems.add(this);
		DesignerPanel.pl_ems.doLayout();
		requestFocus();

		// Clear component panel
		DesignerPanel.pl_comp.removeAll();

		// Listeners
		addMouseListener(new BuildingListener());
		addMouseListener(new ConnectorListener());
		addMouseMotionListener(new ConnectorListener());
		addMouseListener(new PositionListener());
		addMouseMotionListener(new PositionListener());
	}

	/**
	 * Creates a building icon that DOES NOT represent a new building. Used in the
	 * object panel to show which objects can be used by the user.
	 */
	public BuildingIcon(String name, ImageIcon icon, String toolTip) {
		super(name, icon, toolTip);
		setBuilding(null);
	}

	@Override
	public void setName(String name) {
		setText(name);
		updateCentralPosition();
		ConnectionManager.getInstance().updateLines();
		// If the icon is moved out of the visible region
		PositionManager.getInstance().fixPosition(this);
	}

	@Override
	public void showComponent(boolean focus) {
		DesignerPanel.pl_ems.add(this);
		if (focus)
			requestFocus();
	}

	/**
	 * @return the building
	 */
	public Building getBuilding() {
		return building;
	}

	/**
	 * @param building the building to set
	 */
	private void setBuilding(Building building) {
		this.building = building;
	}

	/**
	 * @return the central position
	 */
	public Point2D getCentralPosition() {
		return centralPosition;
	}

	/**
	 * @return the top left position
	 */
	public Point2D getTopLeftPosition() {
		return getLocation();
	}

	/**
	 * @param centralPosition the central position of the icon to be set
	 */
	public void setCentralPosition(Point2D centralPosition) {
		this.centralPosition = centralPosition;
		updateTopLeftPosition();
		ConnectionManager.getInstance().updateLines();
		PlanningTool.getInstance().setSaved(false);
	}

	/**
	 * @param topLeftPosition the top left position of the icon to be set
	 */
	public void setTopLeftPosition(Point topLeftPosition) {
		setLocation(topLeftPosition);
		updateCentralPosition();
		ConnectionManager.getInstance().updateLines();
		PlanningTool.getInstance().setSaved(false);
	}

	/**
	 * Updates the top left position using the central position
	 */
	public void updateTopLeftPosition() {
		int width = getWidth();
		int height = getHeight();
		if (width == 0 && height == 0) {
			// Estimate width and height before rendering
			width = Math.max(getFontMetrics(Fonts.getOpenSans()).stringWidth(building.getName()),
					selectedIcon.getIconWidth());
			height = getFontMetrics(Fonts.getOpenSans()).getHeight() + selectedIcon.getIconHeight();
		}
		Point topLeftPosition = new Point((int) centralPosition.getX() - width / 2,
				(int) centralPosition.getY() - height / 2);
		setLocation(topLeftPosition);
	}

	/**
	 * Updates the central position using the top left position
	 */
	public void updateCentralPosition() {
		int width = getWidth();
		int height = getHeight();
		if (width == 0 && height == 0) {
			// Estimate width and height before rendering
			width = Math.min(getFontMetrics(Fonts.getOpenSans()).stringWidth(building.getName()),
					selectedIcon.getIconWidth());
			height = getFontMetrics(Fonts.getOpenSans()).getHeight() + selectedIcon.getIconHeight();
		}
		centralPosition = new Point2D.Double(getX() + width / 2, getY() + height / 2);
	}

	@Override
	public void highlight() {
		setSelectedIcon();
		repaint();
	}

	@Override
	public void playDown() {
		setUnselectedIcon();
		repaint();
	}
}
