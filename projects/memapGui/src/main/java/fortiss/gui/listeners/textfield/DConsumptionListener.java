package fortiss.gui.listeners.textfield;

import fortiss.components.Demand;
import fortiss.gui.DesignerPanel;
import fortiss.gui.listeners.helper.PathVerifier;

public class DConsumptionListener extends ComponentFieldListener {

	public DConsumptionListener() {
		super("Invalid path!", new PathVerifier());
	}

	@Override
	public void update(String text) {
		((Demand) component).setConsumptionProfile(text);
		DesignerPanel.demandPanel.update();
	}

	@Override
	public String getAttribute() {
		return ((Demand) component).getConsumptionProfile();
	}
	
}
