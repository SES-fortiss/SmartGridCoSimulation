package fortiss.gui.listeners.textfield;

import fortiss.gui.listeners.helper.NumberVerifier;

public class ConnectionMaxCapacityListener extends ComponentFieldListener {

	public ConnectionMaxCapacityListener() {
		super("Invalid number!", new NumberVerifier().withDecimalAllowed().withMaxLength(10));
	}

	@Override
	public void update(String text) {
		connection.setMaxTransportCapacity(Double.parseDouble(text));
	}

	@Override
	public String getAttribute() {
		return String.valueOf(connection.getMaxTransportCapacity());
	}

}