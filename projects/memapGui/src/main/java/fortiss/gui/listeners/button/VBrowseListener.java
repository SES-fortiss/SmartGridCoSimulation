package fortiss.gui.listeners.button;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import fortiss.components.Volatile;
import fortiss.gui.DesignerPanel;
import fortiss.gui.listeners.helper.Chooser;
import fortiss.gui.listeners.helper.FileType;

public class VBrowseListener extends MouseAdapter {

	@Override
	public void mouseClicked(MouseEvent e) {

		Volatile v = (Volatile) DesignerPanel.selectedComponent;

		// Update selection in text field
		Chooser c = new Chooser(FileType.CSV);
		File file = c.showOpenDialog();

		if (file != null) {
			String path = file.getPath();
			DesignerPanel.volatilePanel.txtVForecastFile.setText(path);
			v.setForecastFile(path);
		}
	}
}
