package fortiss.gui.listeners.textfield;

import fortiss.components.Controllable;
import fortiss.gui.listeners.helper.NameVerifier;

public class CPNameListener extends ComponentFieldListener {

	public CPNameListener() {
		super("Invalid component name", new NameVerifier());
	}

	@Override
	public void update(String text) {
		((Controllable) component).setName(text);
		
	}

	@Override
	public String getAttribute() {
		return ((Controllable) component).getName();
	}
	
}