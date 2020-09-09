package fortiss.gui.listeners.textfield;

import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

import fortiss.gui.listeners.helper.InsertionVerifier;

public abstract class NumberListener extends TextFieldListener {

	private boolean negativeAllowed;
	private boolean decimalAllowed;
	private boolean hasBounds;
	private int maxLength;
	private double min;
	private double max;
	
	public NumberListener(boolean negativeAllowed, boolean decimalAllowed, int maxLength) {
		super("Error. Invalid value!");
		this.negativeAllowed = negativeAllowed;
		this.decimalAllowed = decimalAllowed;
		this.hasBounds = false;
		this.maxLength = maxLength;
	}

	public NumberListener(boolean negativeAllowed, boolean decimalAllowed, double min, double max, int maxLength) {
		super("Error. Invalid value! Only values between " + min + " and " + max + " are valid.");
		this.negativeAllowed = negativeAllowed;
		this.decimalAllowed = decimalAllowed;
		this.hasBounds = true;
		this.min = min;
		this.max = max;
		this.maxLength = maxLength;
	}

	@Override
	boolean isValidField(String text) {
		boolean valid = true;
		
		if(text.isEmpty())
			return false;
			
		if(!Pattern.compile("[0-9]").matcher(text).find())
			return false;
		
		if(decimalAllowed)
			if(StringUtils.countMatches(text, ".") > 1)
				return false;
		
		if(negativeAllowed)
			if(!(StringUtils.countMatches(text, "-") == 1 && StringUtils.startsWith(text, "-") || StringUtils.countMatches(text, "-") == 0))
				return false;
		
		if(hasBounds) {
			double num = Double.parseDouble(text);
			if (num > max || num < min)
				return false;
		}
		
		return valid;
	}

	@Override
	boolean isValidCharacter(char c, String text) {
		InsertionVerifier v = new InsertionVerifier();
		
		if(negativeAllowed)
			v.validKeys.add('-');
		if(decimalAllowed)
			v.validKeys.add('.');
		
		return v.isNumber(c, text);
	}

	@Override
	boolean isValidLength(String text) {
		return text.length() < maxLength;
	}

	@Override
	abstract void update(String text);

	@Override
	abstract String getAttribute();

}
