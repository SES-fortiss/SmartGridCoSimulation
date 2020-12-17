package fortiss.gui.listeners.textfield;

import fortiss.components.Volatile;

public class VMinPowerListener extends NumberListener {
	
	public VMinPowerListener() {
		super(false, true, 10);
	}

	@Override
	void update(String text) {
		((Volatile) component).setMinimumPower(Double.parseDouble(text));
	}

	@Override
	String getAttribute() {
		double power = ((Volatile) component).getMinimumPower();
		return Double.toString(power);
	}

}