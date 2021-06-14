package fortiss.gui.listeners.button;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import fortiss.components.Demand;
import fortiss.gui.DesignerPanel;
import fortiss.gui.listeners.helper.Chooser;
import fortiss.gui.listeners.helper.FileType;

public class DBrowseListener extends MouseAdapter {

	@Override
	public void mouseClicked(MouseEvent e) {
		Demand d = (Demand) DesignerPanel.selectedComponent;

		// Update selection in text field
		Chooser c = new Chooser(FileType.CSV);
		File file = c.showOpenDialog();

		// null check necessary to account for a cancelled attempt to change path
		if (file != null) {
			String path = file.getPath();
			DesignerPanel.demandPanel.txtDConsumption.setText(path);
			d.setConsumptionProfile(path);
			
			// TODO may be the plot should be visible by default.
			DesignerPanel.demandPanel.plot();
		}		
	}
}
