package fortiss.gui.listeners.action;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;

import fortiss.gui.style.Colors;
import fortiss.media.IconStore;
import fortiss.simulation.PlanningTool;

public class DarkModeListener extends MouseAdapter {

	@Override
	public void mouseClicked(MouseEvent e) {
		JLabel icon = (JLabel) e.getSource();
		if(icon.getIcon().equals(IconStore.onDarkMode)) {
			icon.setIcon(IconStore.offDarkMode);
			Colors.setDarkModeOff();
		} else {
			icon.setIcon(IconStore.onDarkMode);
			Colors.setDarkModeOn();
		}
		PlanningTool.getInstance().repaintAll();
	}
	
}
