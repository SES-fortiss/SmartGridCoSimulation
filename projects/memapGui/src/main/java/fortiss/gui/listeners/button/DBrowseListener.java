package fortiss.gui.listeners.button;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import fortiss.components.Demand;
import fortiss.gui.Designer;
import fortiss.gui.listeners.helper.Chooser;

public class DBrowseListener extends MouseAdapter {

	@Override
	public void mouseClicked(MouseEvent e) {
		int building = Designer.currentBuilding;
		int component = Designer.currentComponent;
		Demand d = Designer.buildings.get(building).getDemand().get(component);

		// Update selection in text field
		Chooser c = new Chooser();
		String path = c.choosePath();
		Designer.demandPanel.txtDConsumption.setText(path);

		// SaveListener selection
		d.setConsumptionProfile(path);
	}
}