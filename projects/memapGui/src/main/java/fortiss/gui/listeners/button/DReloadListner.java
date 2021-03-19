package fortiss.gui.listeners.button;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import fortiss.components.Demand;
import fortiss.gui.DesignerPanel;

public class DReloadListner extends MouseAdapter {

	@Override
	public void mouseClicked(MouseEvent e) {
		Demand d = (Demand) DesignerPanel.selectedComponent;
		String path = DesignerPanel.demandPanel.txtDConsumption.getText();
		
		// null check necessary to account for a cancelled attempt to change path
		if (path != null && path.length() > 2) {
			d.setConsumptionProfile(path);
		}
		
		// TODO, maybe redesign to call the function twice? 
		// Rational to use it twice: if plot is not visible, plot() paints it; if plot is visible plot() makes in invisible
		
		DesignerPanel.demandPanel.plot();
		DesignerPanel.demandPanel.plot();
	}
}
