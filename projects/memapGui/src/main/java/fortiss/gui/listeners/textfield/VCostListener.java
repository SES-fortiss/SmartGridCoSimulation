package fortiss.gui.listeners.textfield;

import fortiss.components.Volatile;

public class VCostListener extends NumberListener {

	public VCostListener() {
		super(true, true, 10);
	}

	@Override
	String getAttribute() {
		double cost = ((Volatile) component).getCost();
		return String.valueOf(cost);
	}

	@Override
	void update(String text) {
		((Volatile) component).setCost(Double.parseDouble(text));		
	}
}
