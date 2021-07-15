package fortiss.gui.listeners.textfield;

import fortiss.components.Coupler;
import fortiss.gui.listeners.helper.NumberVerifier;

public class CMaxPowerListener extends ComponentFieldListener {

	public CMaxPowerListener() {
		super("Invalid number!", new NumberVerifier().withDecimalAllowed().withMaxLength(10));
	}

	@Override
	public void update(String text) {
		((Coupler) component).setMaximumPower(Double.parseDouble(text));
	}

	@Override
	public String getAttribute() {
		double power = ((Coupler) component).getMaximumPower();
		return String.valueOf(power);
	}
}
