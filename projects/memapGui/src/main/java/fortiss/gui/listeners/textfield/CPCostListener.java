package fortiss.gui.listeners.textfield;

import fortiss.components.Controllable;

public class CPCostListener extends NumberListener {

	public CPCostListener() {
		super(true, true, 10);
	}

	@Override
	String getAttribute() {
		double cost = ((Controllable) component).getCost();
		return String.valueOf(cost);
	}

	@Override
	void update(String text) {
		((Controllable) component).setCost(Double.parseDouble(text));
	}

	
}
