package fortiss.gui.listeners.textfield;

import fortiss.gui.listeners.helper.NumberVerifier;

public class ConnectionLossesListener extends ComponentFieldListener {

	public ConnectionLossesListener() {
		super("Invalid number!", new NumberVerifier().withDecimalAllowed().withMin(0).withMax(100).withMaxLength(10));
	}

	@Override
	public void update(String text) {
		connection.setLosses(Double.parseDouble(text));
	}

	@Override
	public String getAttribute() {
		return String.valueOf(connection.getLosses());
	}

}