package fortiss.gui.listeners.textfield;

import fortiss.gui.DesignerPanel;
import fortiss.simulation.helper.PositionManager;

public class BNameListener extends NameListener {
	
	@Override
	void update(String text) {
		DesignerPanel.buildings.remove(building.getName());
		DesignerPanel.buildings.put(text, building);
		PositionManager.getInstance().updateBuildingsName(building.getName(), text);
		
		building.setName(text);
	}

	@Override
	String getAttribute() {
		return building.getName();
	}
}
