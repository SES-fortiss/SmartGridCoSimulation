package fortiss.gui.listeners.action;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import fortiss.components.Demand;
import fortiss.gui.Designer;
import fortiss.gui.listeners.helper.ComponentIcons;
import fortiss.gui.listeners.helper.DataUpdater;

public class AddDemandListener extends MouseAdapter {

	/**
	 * Creates a new demand object and a new demand icon. Calls DataUpdater.
	 */
	public void mouseClicked(MouseEvent e) {

		// Update current_comp
		Designer.currentComponent = Designer.demandIcons.get(Designer.currentBuilding).size();

		// Create demand
		Designer.buildings.get(Designer.currentBuilding)
				.addDemand(new Demand("Demand" + Designer.currentComponent, 0, "", "Heat"));
		Demand d = Designer.buildings.get(Designer.currentBuilding).getDemand().get(Designer.currentComponent);

		// Create label
		ComponentIcons components = new ComponentIcons();
		components.createDemandIcon(Designer.currentBuilding, Designer.currentComponent, true);

		// Show data
		DataUpdater up = new DataUpdater();
		up.updateDemandData(d.getName(), d.getIndex(), d.getConsumptionProfile(), d.getNetworkType());
	}
}