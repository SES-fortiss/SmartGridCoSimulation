package fortiss.gui.listeners.label;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import fortiss.gui.Designer;
import fortiss.media.Icon;

public class MarketPriceListener extends MouseAdapter {

	/**
	 * Set Market price to the user selection: fixed or variable
	 */
	@Override
	public void mouseClicked(MouseEvent e) {
		if (Designer.parameterPanel.pars.isFixedPrice() == true) {
			// If Market price is fixed
			Designer.parameterPanel.pars.setFixedPrice(false);
			Designer.parameterPanel.lbMarketPrice.setIcon(Icon.variableMarket);
		} else {
			// If Market price is variable
			Designer.parameterPanel.pars.setFixedPrice(true);
			Designer.parameterPanel.lbMarketPrice.setIcon(Icon.fixedMarket);	
		}
		Designer.parameterPanel.updateMarketPriceOptions();
	}
}
