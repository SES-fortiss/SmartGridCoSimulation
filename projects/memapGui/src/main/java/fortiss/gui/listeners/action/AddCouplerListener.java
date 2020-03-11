package fortiss.gui.listeners.action;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import fortiss.components.Coupler;
import fortiss.gui.DesignerPanel;
import fortiss.gui.listeners.helper.ComponentIcons;
import fortiss.gui.listeners.helper.DataUpdater;

public class AddCouplerListener extends MouseAdapter {

	/**
	 * Creates a new coupler object and a new coupler icon. Calls DataUpdater.
	 */
	public void mouseClicked(MouseEvent e) {
		// Update current_comp
		DesignerPanel.currentComponent = DesignerPanel.couplerIcons.get(DesignerPanel.currentBuilding).size();

		// Create coupler
		DesignerPanel.buildings.get(DesignerPanel.currentBuilding).addCoupler(new Coupler("Coupler" + DesignerPanel.currentComponent,
				"Heat", "Electricity", 0.0, 0.0, 1.0, 1.0, 0.0, 0.0));
		Coupler c = DesignerPanel.buildings.get(DesignerPanel.currentBuilding).getCoupler().get(DesignerPanel.currentComponent);

		// Create label
		ComponentIcons components = new ComponentIcons();
		components.createCouplerIcon(DesignerPanel.currentBuilding, DesignerPanel.currentComponent, true);

		// Show data
		DataUpdater up = new DataUpdater();
		up.updateCouplerData(c.getName(), c.getNetworkTypeP(), c.getNetworkTypeS(), c.getMinimumPower(),
				c.getMaximumPower(), c.getEfficiencyPrimary(), c.getEfficiencySecondary(), c.getCost(),
				c.getCOEmission());
	}
}