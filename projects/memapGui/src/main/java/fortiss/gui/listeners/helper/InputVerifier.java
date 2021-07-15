package fortiss.gui.listeners.helper;

import java.util.HashSet;

public abstract class InputVerifier {

	protected HashSet<Character> validKeys = new HashSet<>();

	/**
	 * @return <code>true</code> if the text is a valid value for the field.
	 *         Example: a path, a name, etc
	 */
	abstract public boolean isValidField(String text);

	/**
	 * @return <code>true</code> if the character is valid for the field. Example: a
	 *         character, a number, etc
	 */
	abstract public boolean isValidCharacter(char c, String text);

	/**
	 * @return <code>true</code> if the text has a valid length after the char
	 *         insertion.
	 * @param text the text before the character insertion.
	 */
	abstract public boolean isValidLength(String text);
}
