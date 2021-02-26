package fortiss.gui.listeners.textfield;

public class ConnectionLossesListener extends NumberListener {

	public ConnectionLossesListener() {
		super(false, true, 0, 100, 10);
	}

	@Override
	void update(String text) {
		connection.setLosses(Double.parseDouble(text));
	}

	@Override
	String getAttribute() {
		return String.valueOf(connection.getLosses());
	}

}