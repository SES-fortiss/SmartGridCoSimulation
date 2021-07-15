package fortiss.gui.listeners.textfield;

import fortiss.components.Storage;
import fortiss.gui.listeners.helper.NumberVerifier;

public class SEffINListener extends ComponentFieldListener {

	public SEffINListener() {
		super("Invalid number!", new NumberVerifier().withNegativeAllowed().withDecimalAllowed().withMin(0).withMax(1).withMaxLength(10));
	}

	@Override
	public void update(String text) {
		((Storage) component).setEffIN(Double.parseDouble(text));
	}

	@Override
	public String getAttribute() {
		double efficiency = ((Storage) component).getEffIN();
		return String.valueOf(efficiency);
	}
	
}