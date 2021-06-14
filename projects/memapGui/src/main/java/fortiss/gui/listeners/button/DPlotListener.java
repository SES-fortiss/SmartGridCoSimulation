package fortiss.gui.listeners.button;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import fortiss.gui.DesignerPanel;

public class DPlotListener extends MouseAdapter {

	@Override
	public void mouseClicked(MouseEvent e) {
		DesignerPanel.demandPanel.plot();
	}
}
