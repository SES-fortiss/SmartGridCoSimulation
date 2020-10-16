package fortiss.gui.listeners.button;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import fortiss.gui.DesignerPanel;
import fortiss.gui.listeners.helper.Chooser;
import fortiss.gui.listeners.helper.FileType;
import fortiss.simulation.Parameters;
import fortiss.simulation.PlanningTool;

public class BrowseListener extends MouseAdapter {

	/**
	 * Allow selection of a file to describe market prices variation 
	 */
	@Override
	public void mouseClicked(MouseEvent e) {

		// Update selection in text field
		Chooser c = new Chooser(FileType.CSV);
		File file = c.showOpenDialog();
		
		if (file != null) {
			String path = file.getPath();
			Parameters pars = PlanningTool.getInstance().getParameters();
			DesignerPanel.parameterPanel.txtMarketPriceFile.setText(path);
			pars.setMarketPriceFile(path);
		}
	}
}