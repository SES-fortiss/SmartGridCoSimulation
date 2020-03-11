package fortiss.gui.listeners.label;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import fortiss.gui.DesignerPanel;

public class MarketPriceListener extends MouseAdapter {

	/**
	 * Set Market price to the user selection: fixed or variable
	 */
	@Override
	public void mouseClicked(MouseEvent e) {
		if (DesignerPanel.parameterPanel.pars.isFixedPrice()) {
			// If Market price is fixed
			DesignerPanel.parameterPanel.pars.setFixedPrice(false);
		} else {
			// If Market price is variable
			DesignerPanel.parameterPanel.pars.setFixedPrice(true);
		}
		DesignerPanel.parameterPanel.updateMarketPriceOptions();
	}
}
