package fortiss.gui.listeners.textfield;

import fortiss.components.Storage;

public class SMaxDischargeListener extends NumberListener{

	public SMaxDischargeListener() {
		super(false, true, 10);
	}

	@Override
	void update(String text) {
		((Storage) component).setMaxDischarging(Double.parseDouble(text));
	}

	@Override
	String getAttribute() {
		double charge = ((Storage) component).getMaxDischarging();
		return String.valueOf(charge);
	}
	
}