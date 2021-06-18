package fortiss.gui.listeners.helper;

import java.awt.event.KeyEvent;

import org.apache.commons.validator.routines.EmailValidator;

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
		if (text.isEmpty())
			return false;

		EmailValidator emailValidator = EmailValidator.getInstance(true);
		return emailValidator.isValid(text);
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
