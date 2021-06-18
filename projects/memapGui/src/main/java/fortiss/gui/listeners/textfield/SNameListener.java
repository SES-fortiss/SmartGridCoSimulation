package fortiss.gui.listeners.textfield;

import fortiss.components.Storage;
import fortiss.gui.listeners.helper.NameVerifier;

public class SNameListener extends ComponentFieldListener {

	public SNameListener() {
		super("Invalid component name", new NameVerifier());
	}

	@Override
	public void update(String text) {
		((Storage) component).setName(text);
	}

	@Override
	public String getAttribute() {
		return ((Storage) component).getName();
	}

}