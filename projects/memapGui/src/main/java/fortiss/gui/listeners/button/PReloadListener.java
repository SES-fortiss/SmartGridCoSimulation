package fortiss.gui.listeners.button;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;

import fortiss.gui.PriceBoard;
import fortiss.gui.MaxBuyLimitBoard;

public class PReloadListener extends MouseAdapter {

	@Override
	public void mouseClicked(MouseEvent e) {
		
		JLabel button = (JLabel) e.getSource();

		if ( button.getParent() instanceof MaxBuyLimitBoard )
		{	
			MaxBuyLimitBoard board = (MaxBuyLimitBoard) button.getParent();
			board.getLimit().setDataFromFile();
			board.plot();
			board.plot();
			
		} else {
			PriceBoard priceBoard = (PriceBoard) button.getParent();
			priceBoard.getPrice().setDataFromFile();
			priceBoard.plot();
			priceBoard.plot();
		}
	}
}
