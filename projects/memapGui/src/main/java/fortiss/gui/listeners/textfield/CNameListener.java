package fortiss.gui.listeners.textfield;

import fortiss.components.Coupler;
import fortiss.gui.listeners.helper.NameVerifier;

public class CNameListener extends ComponentFieldListener {

	public CNameListener() {
		super("Invalid component name", new NameVerifier());
	}

	@Override
	public void update(String text) {
		((Coupler) component).setName(text);
	}

	@Override
	public String getAttribute() {
		return ((Coupler) component).getName();
	}
	
} 