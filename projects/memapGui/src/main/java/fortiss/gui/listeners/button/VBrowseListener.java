package fortiss.gui.listeners.button;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import fortiss.components.Volatile;
import fortiss.gui.DesignerPanel;
import fortiss.gui.listeners.helper.Chooser;

public class VBrowseListener extends MouseAdapter {

	@Override
	public void mouseClicked(MouseEvent e) {
		String buildingName = DesignerPanel.selectedBuilding;
		int component = DesignerPanel.currentComponent;
		Volatile v = DesignerPanel.buildings.get(buildingName).getVolatile().get(component);

		// Update selection in text field
		Chooser c = new Chooser();
		String path = c.choosePath();
		DesignerPanel.volatilePanel.txtVForecastFile.setText(path);

		// SaveListener selection
		v.setForecastFile(path);
	}
}
