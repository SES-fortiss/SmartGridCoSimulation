package fortiss.gui.listeners.button;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import fortiss.gui.DesignerPanel;

/** Plot listener for the Parameter class*/
public class PPlotListener extends MouseAdapter {
	@Override
	public void mouseClicked(MouseEvent e) {
		DesignerPanel.parameterPanel.plot();
	}
}
