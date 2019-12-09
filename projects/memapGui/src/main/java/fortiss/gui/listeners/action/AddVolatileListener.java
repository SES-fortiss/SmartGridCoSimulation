package fortiss.gui.listeners.action;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import fortiss.components.Volatile;
import fortiss.gui.Designer;
import fortiss.gui.listeners.helper.ComponentIcons;
import fortiss.gui.listeners.helper.DataUpdater;

public class AddVolatileListener extends MouseAdapter {

	/**
	 * Creates a new volatile object and a new volatile icon. Calls DataUpdater.
	 */
	public void mouseClicked(MouseEvent arg0) {
		// Update current_comp
		Designer.currentComponent = Designer.volatileIcons.get(Designer.currentBuilding).size();

		// Create Volatile
		Designer.buildings.get(Designer.currentBuilding)
				.addVolProduction(new Volatile("Volatile" + Designer.currentComponent, "Heat", 0.0, "", 0.0, 0.0));
		Volatile v = Designer.buildings.get(Designer.currentBuilding).getVolatile().get(Designer.currentComponent);

		// Create label
		ComponentIcons components = new ComponentIcons();
		components.createVolProductionIcon(Designer.currentBuilding, Designer.currentComponent, true);

		// Show data
		DataUpdater up = new DataUpdater();
		up.updateVolProductionData(v.getName(), v.getNetworkType(), v.getPower(), v.getForecastFile(), v.getCost(),
				v.getCOEmission());
	}
}
