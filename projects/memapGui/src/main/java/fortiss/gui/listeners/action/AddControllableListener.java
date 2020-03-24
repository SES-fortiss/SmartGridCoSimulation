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
		
		String selectedBuilding = DesignerPanel.selectedBuilding;
		// Update current_comp
		DesignerPanel.currentComponent = DesignerPanel.controllableIcons.get(selectedBuilding).size();

		// Create contProduction
		DesignerPanel.buildings.get(selectedBuilding).addContProduction(
				new Controllable("Controllable" + DesignerPanel.currentComponent, "Heat", 0.0, 0.0, 1.0, 0.0, 0.0));
		Controllable cp = DesignerPanel.buildings.get(selectedBuilding).getControllable()
				.get(DesignerPanel.currentComponent);

		// Create label
		ComponentIcons components = new ComponentIcons();
		components.createContProductionIcon(selectedBuilding, DesignerPanel.currentComponent, true);

		// Show data
		DataUpdater up = new DataUpdater();
		up.updateContProductionData(cp.getName(), cp.getNetworkType(), cp.getMinimumPower(), cp.getMaximumPower(),
				cp.getEfficiency(), cp.getCost(), cp.getCOEmission());
	}
}