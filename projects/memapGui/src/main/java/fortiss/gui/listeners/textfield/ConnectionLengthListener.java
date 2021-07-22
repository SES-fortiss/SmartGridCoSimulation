package fortiss.gui.listeners.textfield;

import fortiss.gui.listeners.helper.NumberVerifier;

public class ConnectionLengthListener extends ComponentFieldListener {

	public ConnectionLengthListener() {
		super("Invalid number!", new NumberVerifier().withDecimalAllowed().withMaxLength(10));
	}

	@Override
	public void update(String text) {
		connection.setLength(Double.parseDouble(text));
	}

	@Override
	public String getAttribute() {
		return String.valueOf(connection.getLength());
	}

}