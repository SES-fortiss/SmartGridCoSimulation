package fortiss.gui.listeners.textfield;

import fortiss.components.Volatile;
import fortiss.gui.listeners.helper.NameVerifier;

public class VNameListener extends ComponentFieldListener {

	public VNameListener() {
		super("Invalid component name", new NameVerifier());
	}

	@Override
	public void update(String text) {
		((Volatile) component).setName(text);
	}

	@Override
	public String getAttribute() {
		return ((Volatile) component).getName();
	}
	
}