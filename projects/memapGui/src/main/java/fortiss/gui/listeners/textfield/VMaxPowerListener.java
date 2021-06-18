package fortiss.gui.listeners.textfield;

import fortiss.components.Volatile;
import fortiss.gui.listeners.helper.NumberVerifier;

public class VMaxPowerListener extends ComponentFieldListener {

	public VMaxPowerListener() {
		super("Invalid number!", new NumberVerifier().withDecimalAllowed().withMaxLength(10));
	}

	@Override
	public void update(String text) {
		((Volatile) component).setMaximumPower(Double.parseDouble(text));
	}

	@Override
	public String getAttribute() {
		double power = ((Volatile) component).getMaximumPower();
		return Double.toString(power);
	}

}
