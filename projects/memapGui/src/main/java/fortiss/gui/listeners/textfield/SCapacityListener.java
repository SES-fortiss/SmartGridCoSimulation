package fortiss.gui.listeners.textfield;

import fortiss.components.Storage;
import fortiss.gui.listeners.helper.NumberVerifier;

public class SCapacityListener extends ComponentFieldListener {

	public SCapacityListener() {
		super("Invalid number!", new NumberVerifier().withDecimalAllowed().withMaxLength(10));
	}

	@Override
	public void update(String text) {
		((Storage) component).setCapacity(Double.parseDouble(text));
	}

	@Override
	public String getAttribute() {
		double capacity = ((Storage) component).getCapacity();
		return String.valueOf(capacity);
	}

}