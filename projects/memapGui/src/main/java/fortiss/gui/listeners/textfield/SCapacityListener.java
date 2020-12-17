package fortiss.gui.listeners.textfield;

import fortiss.components.Storage;

public class SCapacityListener extends NumberListener{

	public SCapacityListener() {
		super(false, true, 10);
	}

	@Override
	void update(String text) {
		((Storage) component).setCapacity(Double.parseDouble(text));	
	}

	@Override
	String getAttribute() {
		double capacity = ((Storage) component).getCapacity();
		return String.valueOf(capacity);
	}
	
}