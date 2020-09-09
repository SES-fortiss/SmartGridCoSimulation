package fortiss.gui.listeners.textfield;

import fortiss.components.Storage;

public class SNameListener extends NameListener {

	@Override
	void update(String text) {
		((Storage) component).setName(text);
	}

	@Override
	String getAttribute() {
		return ((Storage) component).getName();
	}
	
}