package fortiss.gui.listeners.textfield;

import java.io.File;

import fortiss.gui.listeners.helper.InsertionVerifier;

public abstract class PathListener extends TextFieldListener {
	
	public PathListener() {
		super("Error. Invalid path to file!");
	}

	@Override
	boolean isValidField(String text) {
		File f = new File(text);
		return f.exists() || text.isEmpty();
	}

	@Override
	boolean isValidCharacter(char c, String text) {
		InsertionVerifier v = new InsertionVerifier();
		return v.isPath(c);
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