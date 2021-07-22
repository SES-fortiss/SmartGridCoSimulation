package fortiss.gui.listeners.helper;

import java.awt.event.KeyEvent;

import fortiss.components.Building;
import fortiss.components.Component;
import fortiss.gui.DesignerPanel;
import fortiss.gui.listeners.textfield.ComponentFieldListener;

public class NameVerifier extends InputVerifier {
	
	public NameVerifier() {
		validKeys.add((char) KeyEvent.VK_BACK_SPACE);
		validKeys.add((char) KeyEvent.VK_DELETE);
	}

	private boolean isUnique(String text) {
		boolean compareBuilding = ComponentFieldListener.component == null;
		if(compareBuilding) {
			for (Building building : DesignerPanel.buildings.values()) {
				if(building.getName().equals(text) && !ComponentFieldListener.building.equals(building)) {
					return false;
				}
				for (Component component : building.getComponents()) {
					if(component.getName().equals(text)) {
						return false;
					}
				}
			}
		} else {
			for (Building building : DesignerPanel.buildings.values()) {
				if(building.getName().equals(text)) {
					return false;
				}
				for (Component component : building.getComponents()) {
					if(component.getName().equals(text) && !ComponentFieldListener.component.equals(component)) {
						return false;
					}
				}
			}
		}
		return true;
	}

	@Override
	public boolean isValidField(String text) {
		return !text.isEmpty() && isUnique(text);
	}

	@Override
	public boolean isValidCharacter(char c, String text) {
		return Character.isDigit(c) || Character.isLetter(c) || validKeys.contains(c);
	}

	@Override
	public boolean isValidLength(String text) {
		return true;
	}

}
