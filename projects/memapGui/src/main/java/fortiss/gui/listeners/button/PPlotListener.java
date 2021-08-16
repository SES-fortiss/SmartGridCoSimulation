package fortiss.gui.listeners.button;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;

import fortiss.gui.PriceBoard;
import fortiss.gui.MaxBuyLimitBoard;

/** Plot listener for the Parameter class*/
public class PPlotListener extends MouseAdapter {
	@Override
	public void mouseClicked(MouseEvent e) {
		JLabel button = (JLabel) e.getSource();
				
		if (button.getParent() instanceof PriceBoard) {
			PriceBoard board = (PriceBoard) button.getParent();		
			board.plot();
		}
		
		if (button.getParent() instanceof MaxBuyLimitBoard) {
			MaxBuyLimitBoard board = (MaxBuyLimitBoard) button.getParent();		
			board.plot();
		}
		
	}
}
