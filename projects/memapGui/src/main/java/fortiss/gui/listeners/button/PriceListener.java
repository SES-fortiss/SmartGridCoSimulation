package fortiss.gui.listeners.button;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JRadioButton;

import fortiss.gui.Designer;

public class PriceListener extends MouseAdapter {

	/**
	 * SaveListener the user selection in @param price of the class parameters.
	 * Prevents null selection.
	 */
	@Override
	public void mouseReleased(MouseEvent e) {
		JRadioButton source = (JRadioButton) e.getSource();
		if (source.getName() == "fixed") {
			if (source.isSelected()) {
				Designer.parameterPanel.pars.setPrice(true);
				Designer.parameterPanel.btVolatile.setSelected(false);
			} else {
				source.setSelected(true);
			}
		}

		if (source.getName() == "volatile") {
			if (source.isSelected()) {
				Designer.parameterPanel.pars.setPrice(false);
				Designer.parameterPanel.btFixed.setSelected(false);
			} else {
				source.setSelected(true);
			}
		}
	}
}
