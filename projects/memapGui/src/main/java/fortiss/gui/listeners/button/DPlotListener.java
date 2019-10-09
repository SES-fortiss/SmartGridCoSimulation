package fortiss.gui.listeners.button;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import fortiss.gui.Designer;

public class DPlotListener extends MouseAdapter {

	@Override
	public void mouseClicked(MouseEvent e) {
		if (Designer.demandPanel.plotPanel.isPlotted()) {
			Designer.demandPanel.plotPanel.clearPlot();
			Designer.demandPanel.plotPanel.setPlotted(false);
		} else {
			Designer.demandPanel.plotPanel.paintSeries();
		}
	}
}