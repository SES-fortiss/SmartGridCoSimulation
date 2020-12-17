package fortiss.gui.listeners.textfield;

import fortiss.components.Coupler;

public class CNameListener extends NameListener {

	@Override
	void update(String text) {
		((Coupler) component).setName(text);
	}

	@Override
	String getAttribute() {
		return ((Coupler) component).getName();
	}
	
} 