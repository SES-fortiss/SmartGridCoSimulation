package fortiss.gui.listeners.textfield;

import fortiss.components.Coupler;
import fortiss.gui.listeners.helper.NumberVerifier;

public class CMinPowerListener extends ComponentFieldListener {

	public CMinPowerListener() {
		super("Invalid number!", new NumberVerifier().withDecimalAllowed().withMaxLength(10));
	}

	@Override
	public void update(String text) {
		((Coupler) component).setMinimumPower(Double.parseDouble(text));
	}

	@Override
	public String getAttribute() {
		double power = ((Coupler) component).getMinimumPower();
		return String.valueOf(power);
	}
}