package fortiss.gui.listeners.action;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import fortiss.components.Volatile;
import fortiss.gui.DesignerPanel;
import fortiss.gui.listeners.helper.ComponentIcons;
import fortiss.gui.listeners.helper.DataUpdater;

public class AddVolatileListener extends MouseAdapter {

	/**
	 * Creates a new volatile object and a new volatile icon. Calls DataUpdater.
	 */
	public void mouseClicked(MouseEvent arg0) {
		// Update current_comp
		DesignerPanel.currentComponent = DesignerPanel.volatileIcons.get(DesignerPanel.currentBuilding).size();

		// Create Volatile
		DesignerPanel.buildings.get(DesignerPanel.currentBuilding)
				.addVolProduction(new Volatile("Volatile" + DesignerPanel.currentComponent, "Heat", 0.0, 0.0, "", 0.0, 0.0));
		Volatile v = DesignerPanel.buildings.get(DesignerPanel.currentBuilding).getVolatile().get(DesignerPanel.currentComponent);

		// Create label
		ComponentIcons components = new ComponentIcons();
		components.createVolProductionIcon(DesignerPanel.currentBuilding, DesignerPanel.currentComponent, true);

		// Show data
		DataUpdater up = new DataUpdater();
		up.updateVolProductionData(v.getName(), v.getNetworkType(), v.getMinimumPower(), v.getMaximumPower(),
				v.getForecastFile(), v.getCost(), v.getCOEmission());
	}
}
