package fortiss.gui;

import java.awt.geom.Point2D;

import javax.swing.JLabel;

import fortiss.gui.listeners.action.RemoveListener;
import fortiss.gui.listeners.label.BuildingListener;
import fortiss.gui.listeners.label.ConnectorListener;
import fortiss.gui.listeners.label.HoverMouseListener;
import fortiss.gui.listeners.label.PositionListener;
import fortiss.gui.style.Fonts;
import fortiss.media.Icon;
import fortiss.simulation.helper.PositionManager;

public class BuildingIcon extends JLabel {

	private static final long serialVersionUID = 1L;

	public BuildingIcon(String buildingName, Point2D position) {
		super(buildingName);
		setName("building");
		setFont(Fonts.getOpenSans());
		setVerticalTextPosition(JLabel.BOTTOM);
		setHorizontalTextPosition(JLabel.CENTER);

		String toolTip = "<html>" + buildingName + "<br>- click to select building"
				+ "<br>- press DEL to delete selected building" + "<br>- right click and drag to create a connection "
				+ "<br>- double click on connection to modify it parameters </html>";

		setToolTipText(toolTip);
		setIcon(Icon.uBuilding);
		PositionManager pm = PositionManager.getInstance();
		Point2D upperLeftPosition = pm.getUpperLeftPoint(position);
		setLocation((int) upperLeftPosition.getX(), (int) upperLeftPosition.getY());
		
		pm.addPosition(buildingName, this);

		// Listeners
		addMouseListener(new BuildingListener());
		addFocusListener(new BuildingListener());
		addKeyListener(new RemoveListener());
		addMouseListener(new ConnectorListener());
		addMouseMotionListener(new ConnectorListener());
		addMouseListener(new PositionListener());
		addMouseMotionListener(new PositionListener());
		addMouseListener(new HoverMouseListener());
	}
}
