package fortiss.gui.listeners.helper;

import java.awt.event.KeyEvent;
import java.io.File;

import org.apache.commons.lang3.SystemUtils;

import memap.examples.ExampleFiles;

public class PathVerifier extends InputVerifier {

	public PathVerifier() {
		validKeys.add((char) KeyEvent.VK_BACK_SPACE);
		validKeys.add((char) KeyEvent.VK_DELETE);
		validKeys.add(':');
		validKeys.add('.');
		validKeys.add('_');
		validKeys.add('-');
		validKeys.add('!');
		validKeys.add('@');
		validKeys.add('#');
		validKeys.add('$');
		validKeys.add('+');
		validKeys.add('&');
		validKeys.add('%');
		validKeys.add('^');
		validKeys.add('(');
		validKeys.add(')');
		validKeys.add(',');
		validKeys.add('{');
		validKeys.add('}');
		
		if (SystemUtils.IS_OS_WINDOWS) {
			validKeys.add((char) KeyEvent.VK_BACK_SLASH);
		} else {
			validKeys.add((char) KeyEvent.VK_SLASH);
		}
	}

	@Override
	public boolean isValidField(String text) {
		ExampleFiles ef = new ExampleFiles();
		File f = new File(text);
		return f.exists() || text.isEmpty() || ef.isExample(text);
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
