package fortiss.gui.icons;

import java.awt.geom.Point2D;

import javax.swing.ImageIcon;

import com.google.gson.annotations.Expose;

import fortiss.components.Building;
import fortiss.gui.DesignerPanel;
import fortiss.gui.listeners.action.BuildingListener;
import fortiss.gui.listeners.label.ConnectorListener;
import fortiss.gui.listeners.label.PositionListener;
import fortiss.media.IconStore;
import fortiss.simulation.helper.PositionManager;

public class BuildingIcon extends Icon {

	private static final long serialVersionUID = 1L;
	/** The building this icon represents, if any */
	private Building building;
	@Expose
	private Point2D position;

	/**
	 * Creates a building icon that represent a new building
	 */
	public BuildingIcon(Building building, Point2D position) {
		super(building.getName(), "building", IconStore.sBuilding, IconStore.uBuilding);
		setBuilding(building);
		setPosition(position);

		String toolTip = "<html>" + building.getName() + "<br>- click to select building"
				+ "<br>- press DEL to delete selected building" + "<br>- right click and drag to create a connection "
				+ "<br>- double click on connection to modify it parameters </html>";

		setToolTipText(toolTip);

		PositionManager pm = PositionManager.getInstance();
		Point2D upperLeftPosition = pm.getUpperLeftPoint(position);
		setLocation((int) upperLeftPosition.getX(), (int) upperLeftPosition.getY());

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
	 * @return the position
	 */
	public Point2D getPosition() {
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(Point2D position) {
		this.position = position;
	}

	@Override
	public void highlight() {
		setSelectedIcon();
		revalidate();
	}

	@Override
	public void playDown() {
		setUnselectedIcon();
		revalidate();
	}
}
