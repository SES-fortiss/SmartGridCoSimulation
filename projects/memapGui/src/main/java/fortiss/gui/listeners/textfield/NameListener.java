package fortiss.gui.listeners.textfield;

import fortiss.components.Building;
import fortiss.components.Component;
import fortiss.gui.DesignerPanel;
import fortiss.gui.listeners.helper.InsertionVerifier;

public abstract class NameListener extends TextFieldListener {
	
	public NameListener() {
		super("Error. This field can not be empty nor duplicated");
	}

	@Override
	boolean isValidField(String text) {
		
		return !text.isEmpty() && isUnique(text);
	}

	private boolean isUnique(String text) {
		for(Building building: DesignerPanel.buildings.values()) {
			if(building.getName().equals(text)) {
				return false;
			}
			for(Component component : building.getComponents()) {
				if(component.getName().equals(text)) {
					return false;
				}
			}
		}
		return true;
	}

	@Override
	boolean isValidCharacter(char c, String text) {
		InsertionVerifier v = new InsertionVerifier();
		return v.isTextWithoutSpaces(c);
	}

	@Override
	abstract void update(String text);

	@Override
	boolean isValidLength(String text) {
		return true;
	}

	@Override
	abstract String getAttribute();
}
