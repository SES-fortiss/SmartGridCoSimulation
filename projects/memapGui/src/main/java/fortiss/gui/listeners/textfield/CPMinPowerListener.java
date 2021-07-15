package fortiss.gui.listeners.textfield;

import fortiss.components.Controllable;
import fortiss.gui.listeners.helper.NumberVerifier;

public class CPMinPowerListener extends ComponentFieldListener{

	public CPMinPowerListener() {
		super("Invalid number!", new NumberVerifier().withDecimalAllowed().withMaxLength(10));
	}

	@Override
	public void update(String text) {
		((Controllable) component).setMinimumPower(Double.parseDouble(text));
	}

	@Override
	public String getAttribute() {
		double power = ((Controllable) component).getMinimumPower();
		return String.valueOf(power);
	}
	
}