package fortiss.gui.listeners.textfield;

import fortiss.components.Controllable;

public class CPMaxPowerListener extends NumberListener{

	public CPMaxPowerListener() {
		super(false, true, 10);
	}

	@Override
	void update(String text) {
		((Controllable) component).setMaximumPower(Double.parseDouble(text));
	}

	@Override
	String getAttribute() {
		double power = ((Controllable) component).getMaximumPower();
		return String.valueOf(power);
	}
	
}