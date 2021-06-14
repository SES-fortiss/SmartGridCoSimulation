package fortiss.gui.listeners.textfield;

import fortiss.components.Volatile;

public class VNameListener extends NameListener {

	@Override
	void update(String text) {
		((Volatile) component).setName(text);
	}

	@Override
	String getAttribute() {
		return ((Volatile) component).getName();
	}
	
}