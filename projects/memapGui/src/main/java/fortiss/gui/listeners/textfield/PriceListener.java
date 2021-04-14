package fortiss.gui.listeners.textfield;

import fortiss.gui.PriceBoard;
import fortiss.gui.listeners.helper.Price;
import fortiss.simulation.Parameters;
import fortiss.simulation.PlanningTool;

public class PriceListener extends NumberListener{

	public PriceListener() {
		super(true, true, 10);
	}

	@Override
	void update(String text) {
		Parameters parameters = PlanningTool.getInstance().getParameters();
		PriceBoard priceBoard = (PriceBoard) source.getParent();
		Price price = priceBoard.getPrice();
		price.setPrice(Double.parseDouble(text), parameters.getMPCHorizon());
	}

	@Override
	String getAttribute() {
		PriceBoard priceBoard = (PriceBoard) source.getParent();
		Price price = priceBoard.getPrice();
		return price.getPriceString();
	}
	
}