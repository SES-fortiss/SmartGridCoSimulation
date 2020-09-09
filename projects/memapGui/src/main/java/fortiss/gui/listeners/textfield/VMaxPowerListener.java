package fortiss.gui.listeners.textfield;

import fortiss.components.Volatile;

public class VMaxPowerListener extends NumberListener {
	
	public VMaxPowerListener() {
		super(false, true, 10);
	}

	@Override
	void update(String text) {
		((Volatile) component).setMaximumPower(Double.parseDouble(text));
	}

	@Override
	String getAttribute() {
		double power = ((Volatile) component).getMaximumPower();
		return Double.toString(power);
	}

}
