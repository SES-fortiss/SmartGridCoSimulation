package fortiss.gui.listeners.textfield;

import fortiss.components.Coupler;
import fortiss.gui.listeners.helper.NumberVerifier;

public class CCostListener extends ComponentFieldListener {

	public CCostListener() {
		super("Invalid number!", new NumberVerifier().withNegativeAllowed().withDecimalAllowed().withMaxLength(10));
	}

	@Override
	public String getAttribute() {
		double cost = ((Coupler) component).getCost();
		return String.valueOf(cost);
	}

	@Override
	public void update(String text) {
		((Coupler) component).setCost(Double.parseDouble(text));		
	}
}
