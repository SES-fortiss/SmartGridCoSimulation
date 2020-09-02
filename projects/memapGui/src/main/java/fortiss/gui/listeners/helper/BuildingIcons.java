package fortiss.gui.listeners.helper;

import java.awt.geom.Point2D;
import java.util.TreeMap;

import javax.swing.JLabel;

import fortiss.gui.DesignerPanel;
import fortiss.gui.listeners.action.RemoveListener;
import fortiss.gui.listeners.label.BuildingListener;
import fortiss.gui.listeners.label.ConnectorListener;
import fortiss.gui.listeners.label.PositionListener;
import fortiss.gui.style.Fonts;
import fortiss.media.Icon;
import fortiss.simulation.helper.PositionManager;

/**
 * Contains methods to create building icons
 */
public class BuildingIcons {
	/**
	 * Creates as many building icons as specified in the Json file loaded.
	 * 
	 * @see fortiss.gui.listeners.action.LoadListener
	 */
	public void createBuildingIcons(TreeMap<String, Point2D> positionsList) {

		for (String buildingName : DesignerPanel.buildings.keySet()) {
			createBuildingIcon(buildingName, positionsList.get(buildingName));
		}
	}

	/**
	 * Creates one building icon. Calls
	 * {@link fortiss.simulation.helper.PositionManager#addPosition(JLabel)}.
	 * Calls
	 * {@link fortiss.simulation.helper.PositionManager#fixPosition(JLabel)} if
	 * the icon is outside the visible area.
	 */
	public void createBuildingIcon(String buildingName, Point2D p) {
		
		JLabel icon = new JLabel(buildingName);
		icon.setName("building");
		icon.setFont(Fonts.getOpenSans());
		DesignerPanel.buildingIcons.put(  DesignerPanel.buildings.get(buildingName), icon);
		icon.setVerticalTextPosition(JLabel.BOTTOM);
		icon.setHorizontalTextPosition(JLabel.CENTER);
		
		String toolTip = "<html>" + buildingName
				+ "<br>- click to select building"
				+ "<br>- press DEL to delete selected building"
				+ "<br>- right click and drag to create a connection "
				+ "<br>- double click on connection to modify it parameters </html>";
		
		icon.setToolTipText(toolTip);
		icon.setIcon(Icon.uBuilding);
		icon.setLocation((int) p.getX(), (int) p.getY());

		// Create position. Fix position if the icon is outside visible area
		PositionManager pm = PositionManager.getInstance();
		pm.addPosition(buildingName, icon);
		if (!pm.getVisibleArea().contains(p)) {
			pm.fixPosition(buildingName, icon);
		}

		// Listeners
		icon.addMouseListener(new BuildingListener());
		icon.addFocusListener(new BuildingListener());
		icon.addKeyListener(new RemoveListener());
		icon.addMouseListener(new ConnectorListener());
		icon.addMouseMotionListener(new ConnectorListener());
		icon.addMouseListener(new PositionListener());
		icon.addMouseMotionListener(new PositionListener());
		DesignerPanel.pl_ems.add(icon);
		DesignerPanel.pl_ems.doLayout();

		icon.requestFocus();

		// Clear component panel
		DesignerPanel.pl_comp.removeAll();
	}
}