package fortiss.gui.listeners.button;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import fortiss.gui.DesignerPanel;
import fortiss.simulation.Parameters;
import fortiss.simulation.PlanningTool;

public class PReloadListner extends MouseAdapter {

	@Override
	public void mouseClicked(MouseEvent e) {
		
		System.out.println(PReloadListner.class + " active" );
		
		String path = DesignerPanel.parameterPanel.txtMarketPriceFile.getText();

		// null check necessary to account for a cancelled attempt to change path
		if (path != null && path.length() > 2) {
			Parameters pars = PlanningTool.getInstance().getParameters();						
			pars.setMarketPriceFile(path);			
		}
		
		// TODO, maybe redesign? 
		// Rational: if plot is not visible, plot() paints it; if plot is visible plot() makes in invisible
		
		DesignerPanel.parameterPanel.plot();
		DesignerPanel.parameterPanel.plot();
	}
}
