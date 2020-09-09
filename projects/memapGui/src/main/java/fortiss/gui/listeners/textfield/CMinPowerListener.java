package fortiss.gui.listeners.textfield;

import fortiss.components.Coupler;

public class CMinPowerListener extends NumberListener {

	public CMinPowerListener() {
		super(false, true, 10);
	}

	@Override
	void update(String text) {
		((Coupler) component).setMinimumPower(Double.parseDouble(text));
	}

	@Override
	String getAttribute() {
		double power = ((Coupler) component).getMinimumPower();
		return String.valueOf(power);
	}
}