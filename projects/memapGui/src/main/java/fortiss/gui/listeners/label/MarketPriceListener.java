package fortiss.gui.listeners.label;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import fortiss.gui.DesignerPanel;
import fortiss.simulation.Parameters;
import fortiss.simulation.PlanningTool;

public class MarketPriceListener extends MouseAdapter {

	/**
	 * Set Market price to the user selection: fixed or variable
	 */
	@Override
	public void mouseClicked(MouseEvent e) {
		Parameters pars = PlanningTool.getInstance().getParameters();
		if (pars.isFixedPrice()) {
			// If Market price is fixed
			pars.setFixedPrice(false);
		} else {
			// If Market price is variable
			pars.setFixedPrice(true);
		}
		DesignerPanel.parameterPanel.updateMarketPriceOptions(pars);
	}
}
