package fortiss.gui.listeners.textfield;

import fortiss.components.Demand;
import fortiss.gui.listeners.helper.NameVerifier;

public class DNameListener extends ComponentFieldListener{

	public DNameListener() {
		super("Invalid component name", new NameVerifier());
	}

	@Override
	public void update(String text) {
		((Demand) component).setName(text);
	}

	@Override
	public String getAttribute() {
		return ((Demand) component).getName();
	}
	
}