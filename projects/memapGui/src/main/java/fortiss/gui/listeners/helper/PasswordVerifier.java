package fortiss.gui.listeners.helper;

import java.awt.event.KeyEvent;

public class PasswordVerifier extends InputVerifier {

	@Override
	public boolean isValidField(String text) {
		validKeys.add((char) KeyEvent.VK_BACK_SPACE);
		validKeys.add((char) KeyEvent.VK_DELETE);
		validKeys.add('.');
		validKeys.add('_');
		validKeys.add('-');
		validKeys.add('@');

		return false;
	}

	@Override
	public boolean isValidCharacter(char c, String text) {
		// TODO: Verify pattern:
		// ^(?=.*\d)(?=.*[A-Z])(?=.*[a-z])(?=.*[^\w\d\s:])([^\s]){8,16}$
		return !text.isEmpty();
	}

	@Override
	public boolean isValidLength(String text) {
		return true;
	}

}
