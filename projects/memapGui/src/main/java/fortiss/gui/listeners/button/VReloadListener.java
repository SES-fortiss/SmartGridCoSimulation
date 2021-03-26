package fortiss.gui.listeners.button;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import fortiss.components.Volatile;
import fortiss.gui.DesignerPanel;

public class VReloadListener extends MouseAdapter {

	@Override
	public void mouseClicked(MouseEvent e) {
		
		Volatile v = (Volatile) DesignerPanel.selectedComponent;
		String path = DesignerPanel.volatilePanel.txtVForecastFile.getText();

		// null check necessary to account for a cancelled attempt to change path
		if (path != null && path.length() > 2) {
			v.setForecastFile(path);
		}
		
		// TODO, maybe redesign? 
		// Rational: if plot is not visible, plot() paints it; if plot is visible plot() makes in invisible
		
		DesignerPanel.volatilePanel.plot();
		DesignerPanel.volatilePanel.plot();
	}
}
