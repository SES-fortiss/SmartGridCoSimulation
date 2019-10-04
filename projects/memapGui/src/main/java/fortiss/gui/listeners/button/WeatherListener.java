package fortiss.gui.listeners.button;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JRadioButton;

import fortiss.gui.Designer;

public class WeatherListener extends MouseAdapter {

	/**
	 * SaveListener the user selection in @param weather of the class parameters.
	 * Prevents null selection.
	 */
	@Override
	public void mouseReleased(MouseEvent e) {
		JRadioButton source = (JRadioButton) e.getSource();

		if (source.getName() == "good") {
			if (source.isSelected()) {
				Designer.parameterPanel.pars.setWeather(true);
				Designer.parameterPanel.btBad.setSelected(false);
			} else {
				source.setSelected(true);
			}
		}

		if (source.getName() == "bad") {
			if (source.isSelected()) {
				Designer.parameterPanel.pars.setWeather(false);
				Designer.parameterPanel.btGood.setSelected(false);
			} else {
				source.setSelected(true);
			}
		}
	}
}
