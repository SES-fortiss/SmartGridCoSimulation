package fortiss.gui.listeners.textfield;

import fortiss.components.Volatile;

public class VForecastFileListener extends PathListener {

	@Override
	void update(String text) {
		((Volatile) component).setForecastFile(text);
	}

	@Override
	String getAttribute() {
		return ((Volatile) component).getForecastFile();
	}
	
}