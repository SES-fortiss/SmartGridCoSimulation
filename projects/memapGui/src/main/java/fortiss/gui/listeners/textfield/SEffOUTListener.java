package fortiss.gui.listeners.textfield;

import fortiss.components.Storage;

public class SEffOUTListener extends NumberListener {

	public SEffOUTListener() {
		super(false, true, 0, 1, 10);
	}

	@Override
	void update(String text) {
		((Storage) component).setEffOUT(Double.parseDouble(text));	
	}

	@Override
	String getAttribute() {
		double efficiency = ((Storage) component).getEffOUT();
		return String.valueOf(efficiency);
	}
	
}