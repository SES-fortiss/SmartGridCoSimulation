package fortiss.gui.listeners.helper;

import java.awt.Point;

import javax.swing.JLabel;

import fortiss.gui.DesignerPanel;
import fortiss.gui.listeners.action.RemoveListener;
import fortiss.gui.listeners.label.BuildingListener;
import fortiss.gui.listeners.label.ConnectorListener;
import fortiss.gui.listeners.label.PositionListener;
import fortiss.gui.style.Fonts;
import fortiss.media.Icon;

/**
 * Contains methods to create building icons
 */
public class BuildingIcons {
	/**
	 * Creates as many building icons as specified in the Json file loaded.
	 * 
	 * @see fortiss.gui.listeners.action.LoadListener
	 */
	public void createBuildingIcons() {
		for (int i = 0; i < DesignerPanel.buildings.size(); i++) {

			createBuildingIcon(i, new Point(0, 0));
		}
	}

	/**
	 * Creates one building icon. Calls
	 * {@link fortiss.gui.listeners.helper.PositionManager#addPosition(JLabel)}.
	 * Calls
	 * {@link fortiss.gui.listeners.helper.PositionManager#fixPosition(JLabel)} if
	 * the icon is outside the visible area.
	 */
	public void createBuildingIcon(int index, Point p) {

		JLabel icon = new JLabel(DesignerPanel.buildings.get(index).getName());
		icon.setName("building");
		icon.setFont(Fonts.getOpenSans());
		DesignerPanel.buildingIcons.add(index, icon);
		icon.setVerticalTextPosition(JLabel.BOTTOM);
		icon.setHorizontalTextPosition(JLabel.CENTER);
		icon.setToolTipText("Building " + index);
		icon.setIcon(Icon.uBuilding);
		icon.setLocation(p);

		// Create position. Fix position if the icon is outside visible area
		PositionManager.addPosition(icon);
		if (!PositionManager.getVisibleArea().contains(p)) {
			PositionManager.fixPosition(icon);
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
		// repaint of component panel is triggered by the FocusManager
	}
}