package fortiss.gui.listeners.textfield;

import fortiss.gui.DesignerPanel;
import fortiss.gui.listeners.helper.NameVerifier;
import fortiss.simulation.helper.ConnectionManager;

public class BNameListener extends ComponentFieldListener {
	
	public BNameListener() {
		super("Invalid building name", new NameVerifier());
	}

	@Override
	public void update(String text) {
		DesignerPanel.buildings.remove(building.getName());
		DesignerPanel.buildings.put(text, building);
		String oldName = building.getName();
		building.setName(text);
		ConnectionManager.getInstance().updateBuildingsName(oldName);
	}

	@Override
	public String getAttribute() {
		return building.getName();
	}
}
