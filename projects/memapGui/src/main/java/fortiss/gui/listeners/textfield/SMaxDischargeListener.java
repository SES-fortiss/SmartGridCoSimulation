package fortiss.gui.listeners.textfield;

import fortiss.components.Storage;
import fortiss.gui.listeners.helper.NumberVerifier;

public class SMaxDischargeListener extends ComponentFieldListener{

	public SMaxDischargeListener() {
		super("Invalid number!", new NumberVerifier().withDecimalAllowed().withMaxLength(10));
	}

	@Override
	public void update(String text) {
		((Storage) component).setMaxDischarging(Double.parseDouble(text));
	}

	@Override
	public String getAttribute() {
		double charge = ((Storage) component).getMaxDischarging();
		return String.valueOf(charge);
	}
	
}