package fortiss.gui.listeners.textfield;

import fortiss.components.Controllable;

public class CPMinPowerListener extends NumberListener{

	public CPMinPowerListener() {
		super(false, true, 10);
	}

	@Override
	void update(String text) {
		((Controllable) component).setMinimumPower(Double.parseDouble(text));
	}

	@Override
	String getAttribute() {
		double power = ((Controllable) component).getMinimumPower();
		return String.valueOf(power);
	}
	
}