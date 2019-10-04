package fortiss.gui.listeners.selectionitem;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;

import fortiss.gui.Designer;

public class DaysListener implements ItemListener{

	/**
	 * Set days to the user selection
	 */
	@Override
	public void itemStateChanged(ItemEvent e) {
		JComboBox<?> o = (JComboBox<?>) e.getSource();
		Integer sel = (Integer) o.getSelectedItem();
		Designer.parameterPanel.pars.setDays(sel);
	}

}
