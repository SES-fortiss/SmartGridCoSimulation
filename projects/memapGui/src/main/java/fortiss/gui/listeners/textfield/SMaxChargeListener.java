package fortiss.gui.listeners.textfield;

import fortiss.components.Storage;
import fortiss.gui.listeners.helper.NumberVerifier;

public class SMaxChargeListener extends ComponentFieldListener {

	public SMaxChargeListener() {
		super("Invalid number!", new NumberVerifier().withDecimalAllowed().withMaxLength(10));
	}

	@Override
	public void update(String text) {
		((Storage) component).setMaxCharging(Double.parseDouble(text));
	}

	@Override
	public String getAttribute() {
		double charge = ((Storage) component).getMaxCharging();
		return String.valueOf(charge);
	}

}