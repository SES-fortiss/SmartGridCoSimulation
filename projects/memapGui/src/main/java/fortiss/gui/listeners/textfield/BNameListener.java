package fortiss.gui.listeners.textfield;

import fortiss.gui.DesignerPanel;
import fortiss.simulation.helper.ConnectionManager;

public class BNameListener extends NameListener {
	
	@Override
	void update(String text) {
		DesignerPanel.buildings.remove(building.getName());
		DesignerPanel.buildings.put(text, building);
		String oldName = building.getName();
		building.setName(text);
		ConnectionManager.getInstance().updateBuildingsName(oldName);
	}

	@Override
	String getAttribute() {
		return building.getName();
	}
}
