package fortiss.gui.listeners.textfield;

import fortiss.components.Storage;

public class SEffINListener extends NumberListener {

	public SEffINListener() {
		super(false, true, 0, 1, 10);
	}

	@Override
	void update(String text) {
		((Storage) component).setEffIN(Double.parseDouble(text));
	}

	@Override
	String getAttribute() {
		double efficiency = ((Storage) component).getEffIN();
		return String.valueOf(efficiency);
	}
	
}