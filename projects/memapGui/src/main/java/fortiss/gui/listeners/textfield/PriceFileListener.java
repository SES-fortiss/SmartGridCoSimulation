package fortiss.gui.listeners.textfield;

import fortiss.gui.PriceBoard;
import fortiss.gui.listeners.helper.PathVerifier;
import fortiss.gui.listeners.helper.Price;

public class PriceFileListener extends TextFieldListener {

	public PriceFileListener() {
		super("Invalid path!", new PathVerifier());
	}

	@Override
	public void update(String text) {
		PriceBoard priceBoard = (PriceBoard) source.getParent();
		Price price = priceBoard.getPrice();
		price.setPriceFilePath(text);
	}

	@Override
	public String getAttribute() {
		PriceBoard priceBoard = (PriceBoard) source.getParent();
		Price price = priceBoard.getPrice();
		return price.getPriceString();
	}
}
