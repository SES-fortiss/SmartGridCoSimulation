package fortiss.gui.listeners.textfield;

import fortiss.components.Storage;

public class SMaxChargeListener extends NumberListener{

	public SMaxChargeListener() {
		super(false, true, 10);
	}

	@Override
	void update(String text) {
		((Storage) component).setMaxCharging(Double.parseDouble(text));
	}

	@Override
	String getAttribute() {
		double charge = ((Storage) component).getMaxCharging();
		return String.valueOf(charge);
	}
	
}