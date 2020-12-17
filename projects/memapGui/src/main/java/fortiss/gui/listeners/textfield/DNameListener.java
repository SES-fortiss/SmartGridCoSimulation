package fortiss.gui.listeners.textfield;

import fortiss.components.Demand;

public class DNameListener extends NameListener{

	@Override
	void update(String text) {
		((Demand) component).setName(text);
	}

	@Override
	String getAttribute() {
		return ((Demand) component).getName();
	}
	
}