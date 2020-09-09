package fortiss.gui.listeners.button;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import fortiss.components.Volatile;
import fortiss.gui.DesignerPanel;
import fortiss.gui.listeners.helper.Chooser;
import fortiss.gui.listeners.helper.FileType;

public class VBrowseListener extends MouseAdapter {

	@Override
	public void mouseClicked(MouseEvent e) {
		int component = DesignerPanel.currentComponent;
		Volatile v = DesignerPanel.selectedBuilding.getVolatile().get(component);

		// Update selection in text field
		Chooser c = new Chooser(FileType.CSV);
		String path = c.showOpenDialog().getPath();
		DesignerPanel.volatilePanel.txtVForecastFile.setText(path);

		// SaveListener selection
		v.setForecastFile(path);
	}
}
