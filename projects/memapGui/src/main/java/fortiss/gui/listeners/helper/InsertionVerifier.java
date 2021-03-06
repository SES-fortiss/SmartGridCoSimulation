package fortiss.gui.listeners.helper;

import java.awt.event.KeyEvent;
import java.util.HashSet;

import org.apache.commons.lang3.SystemUtils;

/**
 * InsertionVerifier comprises verification methods for typed characters.
 */
public class InsertionVerifier {
	private boolean valid;
	public HashSet<Character> validKeys;

	public InsertionVerifier() {
		validKeys = new HashSet<>();
	}

	/**
	 * @return <code>true</code> if the input is an alphanumeric string without
	 *         spaces.
	 */
	public boolean isTextWithoutSpaces(char c) {
		validKeys.add((char) KeyEvent.VK_BACK_SPACE);
		validKeys.add((char) KeyEvent.VK_DELETE);

		if (!Character.isDigit(c) && !Character.isLetter(c) && !validKeys.contains(c)) {
			valid = false;
		} else {
			valid = true;
		}
		return valid;
	}

	/**
	 * @return <code>true</code> if the input is a valid character to form a path
	 *         according to the operating system.
	 */
	public boolean isPath(char c) {
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

		return Character.isDigit(c) || Character.isLetter(c) || validKeys.contains(c);
	}
	
	/**
	 * @return <code>true</code> if the input is a valid character to form a number.
	 * @param c character inserted
	 * @param text before character c was inserted
	 */
	public boolean isNumber(char c, String text) {
		validKeys.add((char) KeyEvent.VK_BACK_SPACE);
		validKeys.add((char) KeyEvent.VK_DELETE);
		
		return Character.isDigit(c) || validKeys.contains(c);
	}

}
