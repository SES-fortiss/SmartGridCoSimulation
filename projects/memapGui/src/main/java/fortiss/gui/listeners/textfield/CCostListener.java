package fortiss.gui.listeners.textfield;

import fortiss.components.Coupler;

public class CCostListener extends NumberListener {

	public CCostListener() {
		super(true, true, 10);
	}

	@Override
	String getAttribute() {
		double cost = ((Coupler) component).getCost();
		return String.valueOf(cost);
	}

	@Override
	void update(String text) {
		((Coupler) component).setCost(Double.parseDouble(text));		
	}
}
