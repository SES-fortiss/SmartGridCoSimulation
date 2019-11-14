package fortiss.gui.listeners.action;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;

import fortiss.gui.style.Colors;
import fortiss.gui.Designer;
import fortiss.media.Icon;

public class DarkModeListener extends MouseAdapter {

	@Override
	public void mouseClicked(MouseEvent e) {
		JLabel icon = (JLabel) e.getSource();
		if(icon.getIcon().equals(Icon.onDarkMode)) {
			icon.setIcon(Icon.offDarkMode);
			Colors.setDarkModeOff();
		} else {
			icon.setIcon(Icon.onDarkMode);
			Colors.setDarkModeOn();
		}
		Designer.frame.repaint();
	}
	
}
