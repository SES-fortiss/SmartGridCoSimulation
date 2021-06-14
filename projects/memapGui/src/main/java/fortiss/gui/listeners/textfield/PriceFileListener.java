package fortiss.gui.listeners.textfield;

import fortiss.gui.PriceBoard;
import fortiss.gui.listeners.helper.Price;

public class PriceFileListener extends PathListener {

	@Override
	void update(String text) {
		PriceBoard priceBoard = (PriceBoard) source.getParent();
		Price price = priceBoard.getPrice();
		price.setPriceFilePath(text);
	}

	@Override
	String getAttribute() {
		PriceBoard priceBoard = (PriceBoard) source.getParent();
		Price price = priceBoard.getPrice();
		return price.getPriceString();
	}
}
