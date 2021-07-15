package fortiss.gui.listeners.helper;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

import fortiss.simulation.helper.Logger;

public class NumberVerifier extends InputVerifier {

	private boolean negativeAllowed;
	private boolean decimalAllowed;
	private boolean hasBounds;
	private boolean hasMaxLength;
	private int maxLength;
	private double min;
	private double max;
	private ArrayList<Double> alwaysValid;

	public NumberVerifier() {
		negativeAllowed = false;
		decimalAllowed = false;
		hasBounds = false;
		hasMaxLength = false;
		maxLength = 10;
		min = 0;
		max = 0;
		alwaysValid = new ArrayList<Double>();

		validKeys.add((char) KeyEvent.VK_BACK_SPACE);
		validKeys.add((char) KeyEvent.VK_DELETE);
	}

	public NumberVerifier withNegativeAllowed() {
		negativeAllowed = true;
		validKeys.add('-');
		return this;
	}

	public NumberVerifier withDecimalAllowed() {
		decimalAllowed = true;
		validKeys.add('.');
		return this;
	}

	public NumberVerifier withMaxLength(int maxLength) {
		this.hasMaxLength = true;
		this.maxLength = maxLength;
		return this;
	}

	public NumberVerifier withMax(double max) {
		this.hasBounds = true;
		this.max = max;
		return this;
	}

	public NumberVerifier withMin(double min) {
		this.hasBounds = true;
		this.min = min;
		return this;
	}

	/** Add a exception to a range of numbers [min, max] */
	public NumberVerifier withAwaysValid(double valid) {
		alwaysValid.add(valid);
		return this;
	}

	@Override
	public boolean isValidField(String text) {
		if (text.isEmpty())
			return false;

		if (!Pattern.compile("[0-9]").matcher(text).find())
			return false;

		if (decimalAllowed) {
			if (StringUtils.countMatches(text, ".") > 1)
				return false;

			// Is the number really a double?: check necessary in case of copy-paste values
			try {
				Double.parseDouble(text);
			} catch (NumberFormatException e) {
				Logger.getInstance().writeError("Number format exception. Expected a double and received " + text);
				return false;
			}
		} else {
			// Is the number really an integer?: check necessary in case of copy-paste
			// values
			try {
				Integer.parseUnsignedInt(text);
			} catch (NumberFormatException e) {
				Logger.getInstance().writeError("Number format exception. Expected an integer and received " + text);
				return false;
			}
		}

		if (negativeAllowed)
			if (!(StringUtils.countMatches(text, "-") == 1 && StringUtils.startsWith(text, "-")
					|| StringUtils.countMatches(text, "-") == 0))
				return false;

		if (hasBounds) {
			double num = Double.parseDouble(text);
			if ((num > max || num < min) && !alwaysValid.contains(num))
				return false;
		}
		return true;
	}

	@Override
	public boolean isValidCharacter(char c, String text) {
		return Character.isDigit(c) || validKeys.contains(c);
	}

	@Override
	public boolean isValidLength(String text) {
		if (hasMaxLength)
			return text.length() < maxLength;
		else
			return true;
	}

}
