package fortiss.gui.listeners.textfield;

import fortiss.components.Volatile;
import fortiss.gui.listeners.helper.NumberVerifier;

public class VCostListener extends ComponentFieldListener {

	public VCostListener() {
		super("Invalid number!", new NumberVerifier().withNegativeAllowed().withDecimalAllowed().withMaxLength(10));
	}

	@Override
	public String getAttribute() {
		double cost = ((Volatile) component).getCost();
		return String.valueOf(cost);
	}

	@Override
	public void update(String text) {
		((Volatile) component).setCost(Double.parseDouble(text));
	}
}
