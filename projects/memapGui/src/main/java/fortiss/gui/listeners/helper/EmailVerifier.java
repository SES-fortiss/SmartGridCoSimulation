package fortiss.gui.listeners.helper;

import java.awt.event.KeyEvent;
import java.util.regex.Pattern;

public class EmailVerifier extends InputVerifier {

	public EmailVerifier() {
		validKeys.add((char) KeyEvent.VK_BACK_SPACE);
		validKeys.add((char) KeyEvent.VK_DELETE);
		validKeys.add('.');
		validKeys.add('_');
		validKeys.add('-');
		validKeys.add('@');
	}
	@Override
	public boolean isValidField(String text) {
		if(text.isEmpty())
			return false;
		
		String regex = "/^[A-Za-z0-9_-]+(?:\\.[a-zA-Z0-9_-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
		Pattern pattern = Pattern.compile(regex);
		if(pattern.matcher(text).matches())
			return true;
		return false;
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
