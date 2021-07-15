package fortiss.gui.listeners.textfield;

import fortiss.components.Storage;
import fortiss.gui.listeners.helper.NumberVerifier;

public class SStateOfChargeListener extends ComponentFieldListener{

	public SStateOfChargeListener() {
		super("Invalid number!", new NumberVerifier().withDecimalAllowed().withMin(0).withMax(1).withMaxLength(10));
	}

	@Override
	public void update(String text) {
		((Storage) component).setSoc(Double.parseDouble(text));
	}

	@Override
	public String getAttribute() {
		double soc = ((Storage) component).getSoc();
		return String.valueOf(soc);
	}
	
}