package fortiss.gui.listeners.textfield;

import fortiss.components.Volatile;
import fortiss.gui.DesignerPanel;

public class VForecastFileListener extends PathListener {

	@Override
	void update(String text) {
		((Volatile) component).setForecastFile(text);
		DesignerPanel.volatilePanel.update();
	}

	@Override
	String getAttribute() {
		return ((Volatile) component).getForecastFile();
	}
	
}