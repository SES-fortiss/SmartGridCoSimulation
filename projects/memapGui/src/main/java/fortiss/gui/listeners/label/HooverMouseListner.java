package fortiss.gui.listeners.label;

import java.awt.Cursor;
import java.awt.event.MouseAdapter;

import javax.swing.BorderFactory;
import javax.swing.JLabel;

import fortiss.gui.style.Colors;

public class HooverMouseListner extends MouseAdapter {
	
	public void mouseEntered(java.awt.event.MouseEvent e) {
		JLabel lb = (JLabel) e.getSource();
		lb.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lb.setBorder(BorderFactory.createLineBorder(Colors.accent1, 1, true));
    }

    public void mouseExited(java.awt.event.MouseEvent e) {
		JLabel lb = (JLabel) e.getSource();
    	lb.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    	lb.setBorder(BorderFactory.createEmptyBorder());
    }
}