package fortiss.gui.listeners.label;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import fortiss.gui.Designer;

public class MarketPriceListener extends MouseAdapter {

	/**
	 * Set Market price to the user selection: fixed or variable
	 */
	@Override
	public void mouseClicked(MouseEvent e) {
		if (Designer.parameterPanel.pars.isFixedPrice()) {
			// If Market price is fixed
			Designer.parameterPanel.pars.setFixedPrice(false);
		} else {
			// If Market price is variable
			Designer.parameterPanel.pars.setFixedPrice(true);
		}
		Designer.parameterPanel.updateMarketPriceOptions();
	}
}
