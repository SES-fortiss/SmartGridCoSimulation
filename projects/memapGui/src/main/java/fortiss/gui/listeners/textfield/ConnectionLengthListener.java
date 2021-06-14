package fortiss.gui.listeners.textfield;

public class ConnectionLengthListener extends NumberListener {

	public ConnectionLengthListener() {
		super(false, true, 10);
	}

	@Override
	void update(String text) {
		connection.setLength(Double.parseDouble(text));
	}

	@Override
	String getAttribute() {
		return String.valueOf(connection.getLength());
	}

}