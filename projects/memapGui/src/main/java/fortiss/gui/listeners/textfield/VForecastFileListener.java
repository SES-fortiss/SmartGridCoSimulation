package fortiss.gui.listeners.textfield;

import fortiss.components.Volatile;
import fortiss.gui.DesignerPanel;
import fortiss.gui.listeners.helper.PathVerifier;

public class VForecastFileListener extends ComponentFieldListener {

	public VForecastFileListener() {
		super("Invalid path!", new PathVerifier());
	}

	@Override
	public void update(String text) {
		((Volatile) component).setForecastFile(text);
		DesignerPanel.volatilePanel.update();
	}

	@Override
	public String getAttribute() {
		return ((Volatile) component).getForecastFile();
	}
	
}