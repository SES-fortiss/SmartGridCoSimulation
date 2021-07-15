package fortiss.gui.listeners.textfield;

import fortiss.components.Controllable;
import fortiss.gui.listeners.helper.NumberVerifier;

public class CPCostListener extends ComponentFieldListener {

	public CPCostListener() {
		super("Invalid number!", new NumberVerifier().withNegativeAllowed().withDecimalAllowed().withMaxLength(10));
	}

	@Override
	public String getAttribute() {
		double cost = ((Controllable) component).getCost();
		return String.valueOf(cost);
	}

	@Override
	public void update(String text) {
		((Controllable) component).setCost(Double.parseDouble(text));
	}

}
