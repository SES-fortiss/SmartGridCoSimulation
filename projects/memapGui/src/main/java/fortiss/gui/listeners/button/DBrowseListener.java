package fortiss.gui.listeners.button;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import fortiss.components.Demand;
import fortiss.gui.DesignerPanel;
import fortiss.gui.listeners.helper.Chooser;

public class DBrowseListener extends MouseAdapter {

	@Override
	public void mouseClicked(MouseEvent e) {
		String buildingName = DesignerPanel.selectedBuilding;
		int component = DesignerPanel.currentComponent;
		Demand d = DesignerPanel.buildings.get(buildingName).getDemand().get(component);

		// Update selection in text field
		Chooser c = new Chooser();
		String path = c.choosePath();

		if (path != null) {
			DesignerPanel.demandPanel.txtDConsumption.setText(path);
			d.setConsumptionProfile(path);
		}

		// null check necessary to account for a cancelled attempt to change path
		if (path != null) {
			DesignerPanel.demandPanel.setData(path);
		}
	}
}
