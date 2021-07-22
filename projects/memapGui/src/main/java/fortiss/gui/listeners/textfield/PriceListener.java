package fortiss.gui.listeners.textfield;

import fortiss.gui.PriceBoard;
import fortiss.gui.listeners.helper.NumberVerifier;
import fortiss.gui.listeners.helper.Price;
import fortiss.simulation.Parameters;
import fortiss.simulation.PlanningTool;

public class PriceListener extends TextFieldListener {

	public PriceListener() {
		super("Invalid number!", new NumberVerifier().withDecimalAllowed().withNegativeAllowed().withMaxLength(10));
	}

	@Override
	public void update(String text) {
		Parameters parameters = PlanningTool.getInstance().getParameters();
		PriceBoard priceBoard = (PriceBoard) source.getParent();
		Price price = priceBoard.getPrice();
		price.setPrice(Double.parseDouble(text), parameters.getMPCHorizon());
	}

	@Override
	public String getAttribute() {
		PriceBoard priceBoard = (PriceBoard) source.getParent();
		Price price = priceBoard.getPrice();
		return price.getPriceString();
	}

}