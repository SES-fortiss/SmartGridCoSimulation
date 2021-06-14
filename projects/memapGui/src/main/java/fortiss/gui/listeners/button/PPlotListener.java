package fortiss.gui.listeners.button;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;

import fortiss.gui.PriceBoard;

/** Plot listener for the Parameter class*/
public class PPlotListener extends MouseAdapter {
	@Override
	public void mouseClicked(MouseEvent e) {
		JLabel button = (JLabel) e.getSource();
		PriceBoard priceBoard = (PriceBoard) button.getParent();
		
		priceBoard.plot();
	}
}
