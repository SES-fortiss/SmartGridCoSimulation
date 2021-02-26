package fortiss.gui.listeners.textfield;

import fortiss.components.Storage;

public class SLooses extends NumberListener{

	public SLooses() {
		super(false, true, 0, 1, 10);
	}

	@Override
	void update(String text) {
		((Storage) component).setLooses(Double.parseDouble(text));
	}

	@Override
	String getAttribute() {
		double soc = ((Storage) component).getLooses();
		return String.valueOf(soc);
	}
	
}