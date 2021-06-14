package fortiss.gui.listeners.textfield;

import fortiss.gui.DesignerPanel;
import fortiss.gui.listeners.helper.InsertionVerifier;
import fortiss.simulation.helper.Logger;

public class BPortListener extends TextFieldListener {

	public BPortListener() {
		super("Error. Invalid port number. Only numbers between 1024 and 49151, and 0 are valid.");
	}
	
	@Override
	boolean isValidField(String text) {
		boolean valid = false;
		if (!text.isEmpty()) {
			try {
				int num = Integer.parseUnsignedInt(text);	
				if (num == 0 || (num > 1024 && num < 49151))
					valid = true;
			} catch (NumberFormatException e) {
				Logger.getInstance().writeError("Number format exception. Expected an integer and received " + text);
			}
		}
		return valid;
	}
	
	@Override
	boolean isValidCharacter(char c, String text) {
		InsertionVerifier v = new InsertionVerifier();
		return v.isNumber(c, text);
	}
	
	@Override
	void update(String text) {
		try {
			building.setPort(Integer.parseUnsignedInt(text));
		} catch (NumberFormatException e) {
			Logger.getInstance().writeError("Number format exception. Expected an integer and received " + text);
			DesignerPanel.pl_ems_detail.update();
		}
	}

	@Override
	boolean isValidLength(String text) {
		return text.length() < 5;
	}

	@Override
	String getAttribute() {
		return String.valueOf(building.getPort());
	}
}
