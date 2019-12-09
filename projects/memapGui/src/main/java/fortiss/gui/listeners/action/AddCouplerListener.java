package fortiss.gui.listeners.action;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import fortiss.components.Coupler;
import fortiss.gui.Designer;
import fortiss.gui.listeners.helper.ComponentIcons;
import fortiss.gui.listeners.helper.DataUpdater;

public class AddCouplerListener extends MouseAdapter {

	/**
	 * Creates a new coupler object and a new coupler icon. Calls DataUpdater.
	 */
	public void mouseClicked(MouseEvent e) {
		// Update current_comp
		Designer.currentComponent = Designer.couplerIcons.get(Designer.currentBuilding).size();

		// Create coupler
		Designer.buildings.get(Designer.currentBuilding).addCoupler(new Coupler("Coupler" + Designer.currentComponent,
				"Heat", "Electricity", 0.0, 0.0, 1.0, 1.0, 0.0, 0.0));
		Coupler c = Designer.buildings.get(Designer.currentBuilding).getCoupler().get(Designer.currentComponent);

		// Create label
		ComponentIcons components = new ComponentIcons();
		components.createCouplerIcon(Designer.currentBuilding, Designer.currentComponent, true);

		// Show data
		DataUpdater up = new DataUpdater();
		up.updateCouplerData(c.getName(), c.getNetworkTypeP(), c.getNetworkTypeS(), c.getMinimumPower(),
				c.getMaximumPower(), c.getEfficiencyPrimary(), c.getEfficiencySecondary(), c.getCost(),
				c.getCOEmission());
	}
}