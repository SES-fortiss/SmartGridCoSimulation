package fortiss.gui.listeners.action;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import fortiss.components.Component;
import fortiss.components.Controllable;
import fortiss.components.Coupler;
import fortiss.components.Demand;
import fortiss.components.Storage;
import fortiss.components.Volatile;
import fortiss.gui.DesignerPanel;
import fortiss.gui.icons.ComponentIcon;
import fortiss.gui.listeners.helper.DataUpdater;

public class AddComponentListener extends MouseAdapter {

	/**
	 * Creates a new component. Calls {@link DataUpdater}
	 */
	public void mouseClicked(MouseEvent e) {

		ComponentIcon componentIcon = (ComponentIcon) e.getSource();

		Component component = null;

		switch (componentIcon.getType()) {
		case "demand":
			component = new Demand(DesignerPanel.selectedBuilding,
					"Demand" + DesignerPanel.selectedBuilding.getDemandCount(), "");
			DesignerPanel.selectedBuilding.addDemand((Demand) component);
			break;
		case "storage":
			component = new Storage(DesignerPanel.selectedBuilding,
					"Storage" + DesignerPanel.selectedBuilding.getStorageCount(), "Heat", 0.0, 0.0, 0.0, 0.0, 0.0, 1.0,
					1.0);
			DesignerPanel.selectedBuilding.addStorage((Storage) component);
			break;
		case "volatile":
			component = new Volatile(DesignerPanel.selectedBuilding,
					"Volatile" + DesignerPanel.selectedBuilding.getVolatileCount(), "Heat", 0.0, 0.0, "", 0.0, 0.0);
			DesignerPanel.selectedBuilding.addVolProduction((Volatile) component);
			break;
		case "controllable":
			component = new Controllable(DesignerPanel.selectedBuilding,
					"Controllable" + DesignerPanel.selectedBuilding.getControllableCount(), "Heat", 0.0, 0.0, 1.0, 0.0,
					0.0);
			DesignerPanel.selectedBuilding.addContProduction((Controllable) component);
			break;
		case "coupler":
			component = new Coupler(DesignerPanel.selectedBuilding,
					"Coupler" + DesignerPanel.selectedBuilding.getCouplerCount(), "Heat", "Electricity", 0.0, 0.0, 1.0,
					1.0, 0.0, 0.0);
			DesignerPanel.selectedBuilding.addCoupler((Coupler) component);
			break;
		}

		DesignerPanel.selectedComponent = component;
		component.showComponent(true);

		// Show data
		DataUpdater up = new DataUpdater();
		up.showComponentInformation(component);
	}
}
