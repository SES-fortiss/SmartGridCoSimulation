package fortiss.gui.listeners.textfield;

import fortiss.components.Controllable;
import fortiss.gui.listeners.helper.NumberVerifier;

public class CPMaxPowerListener extends ComponentFieldListener {

	public CPMaxPowerListener() {
		super("Invalid number!", new NumberVerifier().withDecimalAllowed().withMaxLength(10));
	}

	@Override
	public void update(String text) {
		((Controllable) component).setMaximumPower(Double.parseDouble(text));
	}

	@Override
	public String getAttribute() {
		double power = ((Controllable) component).getMaximumPower();
		return String.valueOf(power);
	}

}