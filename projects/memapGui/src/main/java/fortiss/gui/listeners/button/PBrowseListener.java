package fortiss.gui.listeners.button;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import javax.swing.JLabel;

import fortiss.gui.MaxBuyLimitBoard;
import fortiss.gui.PriceBoard;
import fortiss.gui.listeners.helper.Chooser;
import fortiss.gui.listeners.helper.FileType;
import fortiss.gui.listeners.helper.MaxBuyLimit;
import fortiss.gui.listeners.helper.Price;

public class PBrowseListener extends MouseAdapter {

	/**
	 * Allow selection of a file to describe market prices variation 
	 */
	@Override
	public void mouseClicked(MouseEvent e) {

		JLabel button = (JLabel) e.getSource();
		
		// Update selection in text field
		Chooser c = new Chooser(FileType.CSV);
		File file = c.showOpenDialog();
		
		if (file != null) {
			String path = file.getPath();
			
			if (button.getParent() instanceof PriceBoard) {
				PriceBoard priceBoard = (PriceBoard) button.getParent();
				Price price = priceBoard.getPrice();			
				price.setPriceFilePath(path);
				priceBoard.update();
			}
			
			if (button.getParent() instanceof MaxBuyLimitBoard) {
				MaxBuyLimitBoard board = (MaxBuyLimitBoard) button.getParent();
				MaxBuyLimit limit = board.getLimit();			
				limit.setDataFilePath(path);
				board.update();
			}
		}
	}
}