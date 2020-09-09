package fortiss.gui.listeners.button;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
		String path = c.showOpenDialog().getPath();

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
