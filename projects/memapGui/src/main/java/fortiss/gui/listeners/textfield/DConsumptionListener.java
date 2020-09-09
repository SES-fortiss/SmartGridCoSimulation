package fortiss.gui.listeners.textfield;

import fortiss.components.Demand;
import fortiss.gui.DesignerPanel;

public class DConsumptionListener extends PathListener {

	@Override
	void update(String text) {
		((Demand) component).setConsumptionProfile(text);
		DesignerPanel.demandPanel.setData(text);
	}

	@Override
	String getAttribute() {
		return ((Demand) component).getConsumptionProfile();
	}
	
}
