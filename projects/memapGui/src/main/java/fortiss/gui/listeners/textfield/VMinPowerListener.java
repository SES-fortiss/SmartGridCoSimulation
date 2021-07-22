package fortiss.gui.listeners.textfield;

import fortiss.components.Volatile;
import fortiss.gui.listeners.helper.NumberVerifier;

public class VMinPowerListener extends ComponentFieldListener {

	public VMinPowerListener() {
		super("Invalid number!", new NumberVerifier().withDecimalAllowed().withMaxLength(10));
	}

	@Override
	public void update(String text) {
		((Volatile) component).setMinimumPower(Double.parseDouble(text));
	}

	@Override
	public String getAttribute() {
		double power = ((Volatile) component).getMinimumPower();
		return Double.toString(power);
	}

}