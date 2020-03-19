package fortiss.gui.listeners.button;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import fortiss.gui.DesignerPanel;
import fortiss.gui.listeners.helper.Chooser;

public class BrowseListener extends MouseAdapter {

	/**
	 * Allow selection of a file to describe market prices variation 
	 */
	@Override
	public void mouseClicked(MouseEvent e) {

		// Update selection in text field
		Chooser c = new Chooser();
		String path = c.choosePath();
		
		if (path != null) {
			DesignerPanel.parameterPanel.txtMarketPriceFile.setText(path);
			DesignerPanel.parameterPanel.pars.setMarketPriceFile(path);
		}
	}
}