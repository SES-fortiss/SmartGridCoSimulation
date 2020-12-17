package fortiss.gui.listeners.textfield;

import fortiss.components.Storage;

public class SStateOfChargeListener extends NumberListener{

	public SStateOfChargeListener() {
		super(false, true, 10);
	}

	@Override
	void update(String text) {
		((Storage) component).setSoc(Double.parseDouble(text));
	}

	@Override
	String getAttribute() {
		double soc = ((Storage) component).getSoc();
		return String.valueOf(soc);
	}
	
}