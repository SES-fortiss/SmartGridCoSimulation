package fortiss.gui.listeners.textfield;

import fortiss.components.Controllable;

public class CPNameListener extends NameListener {

	@Override
	void update(String text) {
		((Controllable) component).setName(text);
		
	}

	@Override
	String getAttribute() {
		return ((Controllable) component).getName();
	}
	
}