package fortiss.gui.listeners.action;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import fortiss.components.Controllable;
import fortiss.gui.Designer;
import fortiss.gui.listeners.helper.ComponentIcons;
import fortiss.gui.listeners.helper.DataUpdater;

public class AddControllableListener extends MouseAdapter {

	/**
	 * Creates a new controllable object and a new controllable icon. Calls
	 * DataUpdater.
	 */
	public void mouseClicked(MouseEvent e) {
		// Update current_comp
		Designer.currentComponent = Designer.controllableIcons.get(Designer.currentBuilding).size();

		// Create contProduction
		Designer.buildings.get(Designer.currentBuilding).addContProduction(
				new Controllable("Controllable" + Designer.currentComponent, "Heat", 0.0, 0.0, 1.0, 0.0, 0.0));
		Controllable cp = Designer.buildings.get(Designer.currentBuilding).getControllable()
				.get(Designer.currentComponent);

		// Create label
		ComponentIcons components = new ComponentIcons();
		components.createContProductionIcon(Designer.currentBuilding, Designer.currentComponent, true);

		// Show data
		DataUpdater up = new DataUpdater();
		up.updateContProductionData(cp.getName(), cp.getNetworkType(), cp.getMinimumPower(), cp.getMaximumPower(),
				cp.getEfficiency(), cp.getCost(), cp.getCOEmission());
	}
}