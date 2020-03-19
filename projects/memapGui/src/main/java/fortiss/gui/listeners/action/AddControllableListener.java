package fortiss.gui.listeners.action;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import fortiss.components.Controllable;
import fortiss.gui.DesignerPanel;
import fortiss.gui.listeners.helper.ComponentIcons;
import fortiss.gui.listeners.helper.DataUpdater;

public class AddControllableListener extends MouseAdapter {

	/**
	 * Creates a new controllable object and a new controllable icon. Calls
	 * DataUpdater.
	 */
	public void mouseClicked(MouseEvent e) {
		// Update current_comp
		DesignerPanel.currentComponent = DesignerPanel.controllableIcons.get(DesignerPanel.currentBuilding).size();

		// Create contProduction
		DesignerPanel.buildings.get(DesignerPanel.currentBuilding).addContProduction(
				new Controllable("Controllable" + DesignerPanel.currentComponent, "Heat", 0.0, 0.0, 1.0, 0.0, 0.0));
		Controllable cp = DesignerPanel.buildings.get(DesignerPanel.currentBuilding).getControllable()
				.get(DesignerPanel.currentComponent);

		// Create label
		ComponentIcons components = new ComponentIcons();
		components.createContProductionIcon(DesignerPanel.currentBuilding, DesignerPanel.currentComponent, true);

		// Show data
		DataUpdater up = new DataUpdater();
		up.updateContProductionData(cp.getName(), cp.getNetworkType(), cp.getMinimumPower(), cp.getMaximumPower(),
				cp.getEfficiency(), cp.getCost(), cp.getCOEmission());
	}
}