package fortiss.gui.listeners.action;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import fortiss.components.Demand;
import fortiss.gui.DesignerPanel;
import fortiss.gui.listeners.helper.ComponentIcons;
import fortiss.gui.listeners.helper.DataUpdater;

public class AddDemandListener extends MouseAdapter {

	/**
	 * Creates a new demand object and a new demand icon. Calls DataUpdater.
	 */
	public void mouseClicked(MouseEvent e) {

		// Update current_comp
		DesignerPanel.currentComponent = DesignerPanel.demandIcons.get(DesignerPanel.currentBuilding).size();

		// Create demand
		DesignerPanel.buildings.get(DesignerPanel.currentBuilding)
				.addDemand(new Demand("Demand" + DesignerPanel.currentComponent, ""));
		Demand d = DesignerPanel.buildings.get(DesignerPanel.currentBuilding).getDemand().get(DesignerPanel.currentComponent);

		// Create label
		ComponentIcons components = new ComponentIcons();
		components.createDemandIcon(DesignerPanel.currentBuilding, DesignerPanel.currentComponent, true);

		// Show data
		DataUpdater up = new DataUpdater();
		up.updateDemandData(d.getName(), d.getConsumptionProfile());
	}
}