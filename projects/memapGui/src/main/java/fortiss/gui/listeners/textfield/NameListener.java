package fortiss.gui.listeners.textfield;

import fortiss.gui.listeners.helper.InsertionVerifier;

public abstract class NameListener extends TextFieldListener {
	
	public NameListener() {
		super("Error. This field can not be empty nor contain '*'");
	}

	@Override
	boolean isValidField(String text) {
		return !text.isEmpty() && !text.contains("*");
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
