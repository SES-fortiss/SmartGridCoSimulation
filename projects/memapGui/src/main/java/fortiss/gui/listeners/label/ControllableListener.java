package fortiss.gui.listeners.label;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;

import fortiss.components.Controllable;
import fortiss.gui.DesignerPanel;
import fortiss.gui.listeners.helper.DataUpdater;
import fortiss.gui.listeners.helper.FocusManager;

public class ControllableListener extends MouseAdapter implements FocusListener {

	private static String buildingName;

	/**
	 * Manages the actions performed when the label is selected: Panels, data shown.
	 */
	@Override
	public void mousePressed(MouseEvent e) {
		buildingName = DesignerPanel.selectedBuilding;

		JLabel lb = (JLabel) e.getSource();
		lb.requestFocus(); // Required for removing components

		DesignerPanel.currentComponent = DesignerPanel.controllableIcons.get(buildingName).indexOf(lb);
		Controllable cp = DesignerPanel.buildings.get(buildingName).getControllable().get(DesignerPanel.currentComponent);

		DataUpdater up = new DataUpdater();
		up.updateContProductionData(cp.getName(), cp.getNetworkType(), cp.getMinimumPower(), cp.getMaximumPower(),
				cp.getEfficiency(), cp.getCost(), cp.getCOEmission());
	}

	/**
	 * Sets the selectedImage icon to the label when it gains focus.
	 */
	@Override
	public void focusGained(FocusEvent e) {
		buildingName = DesignerPanel.selectedBuilding;
		JLabel lb = (JLabel) e.getSource();
		FocusManager.focusControllable(buildingName, lb);
	}

	/**
	 * Sets the unselectedImage icon to the label when it looses focus.
	 */
	@Override
	public void focusLost(FocusEvent e) {
		JLabel lb = (JLabel) e.getSource();
		FocusManager.focusLostControllable(buildingName, lb);
	}

}
