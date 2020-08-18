package fortiss.gui.listeners.label;

import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JLabel;

import fortiss.gui.style.Colors;

public class HoverMouseListener extends MouseAdapter {
	
	public void mouseEntered(MouseEvent e) {
		JLabel lb = (JLabel) e.getSource();
		lb.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lb.setBorder(BorderFactory.createLineBorder(Colors.accent1, 1, true));
    }

    public void mouseExited(MouseEvent e) {
		JLabel lb = (JLabel) e.getSource();
    	lb.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    	lb.setBorder(BorderFactory.createEmptyBorder());
    }
    
}