package fortiss.gui.listeners.textfield;

public class ConnectionMaxCapacityListener extends NumberListener {

	public ConnectionMaxCapacityListener() {
		super(false, true, 10);
	}

	@Override
	void update(String text) {
		connection.setMaxTransportCapacity(Double.parseDouble(text));
	}

	@Override
	String getAttribute() {
		return String.valueOf(connection.getMaxTransportCapacity());
	}

}