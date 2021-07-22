package fortiss.gui.listeners.textfield;

import fortiss.components.Storage;
import fortiss.gui.listeners.helper.NumberVerifier;

public class SEffOUTListener extends ComponentFieldListener {

	public SEffOUTListener() {
		super("Invalid number!", new NumberVerifier().withNegativeAllowed().withDecimalAllowed().withMin(0).withMax(1).withMaxLength(10));
	}

	@Override
	public void update(String text) {
		((Storage) component).setEffOUT(Double.parseDouble(text));	
	}

	@Override
	public String getAttribute() {
		double efficiency = ((Storage) component).getEffOUT();
		return String.valueOf(efficiency);
	}
	
}