package fortiss.gui.listeners.textfield;

import fortiss.components.Coupler;

public class CMaxPowerListener extends NumberListener {

	public CMaxPowerListener() {
		super(false, true, 10);
	}

	@Override
	void update(String text) {
		((Coupler) component).setMaximumPower(Double.parseDouble(text));
	}

	@Override
	String getAttribute() {
		double power = ((Coupler) component).getMaximumPower();
		return String.valueOf(power);
	}
}
