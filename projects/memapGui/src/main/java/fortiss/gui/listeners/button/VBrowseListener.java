package fortiss.gui.listeners.button;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import fortiss.components.Volatile;
import fortiss.gui.Designer;
import fortiss.gui.listeners.helper.Chooser;

public class VBrowseListener extends MouseAdapter {

	@Override
	public void mouseClicked(MouseEvent e) {
		int building = Designer.currentBuilding;
		int component = Designer.currentComponent;
		Volatile v = Designer.buildings.get(building).getVolatile().get(component);

		// Update selection in text field
		Chooser c = new Chooser();
		String path = c.choosePath();
		Designer.volatilePanel.txtVForecastFile.setText(path);

		// SaveListener selection
		v.setForecastFile(path);
	}
}
