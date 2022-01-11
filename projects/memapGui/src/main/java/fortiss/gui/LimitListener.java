package fortiss.gui;

import fortiss.gui.listeners.helper.MaxBuyLimit;
import fortiss.gui.listeners.helper.NumberVerifier;
import fortiss.gui.listeners.textfield.TextFieldListener;
import fortiss.simulation.Parameters;
import fortiss.simulation.PlanningTool;

public class LimitListener extends TextFieldListener {

	public LimitListener() {
		super("Invalid number!", new NumberVerifier().withDecimalAllowed().withNegativeAllowed().withMaxLength(10));
	}

	@Override
	public void update(String text) {
		Parameters parameters = PlanningTool.getInstance().getParameters();
		MaxBuyLimitBoard board = (MaxBuyLimitBoard) source.getParent();
		MaxBuyLimit limit = board.getLimit();
		limit.setLimit(Double.parseDouble(text), parameters.getMPCHorizon());
	}

	@Override
	public String getAttribute() {
		MaxBuyLimitBoard board = (MaxBuyLimitBoard) source.getParent();
		MaxBuyLimit limit = board.getLimit();
		return limit.getLimitString();
	}

}
