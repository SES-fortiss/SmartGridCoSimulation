package fortiss.gui.listeners.textfield;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JTextField;

import fortiss.components.Connection;
import fortiss.gui.DesignerPanel;
import fortiss.gui.listeners.helper.InsertionVerifier;
import fortiss.simulation.helper.ConnectionManager;

public class ConnectionLengthListener extends KeyAdapter implements FocusListener {

	private static boolean check;
	private static boolean valid;
	private static JTextField source;
	private static String input;
	private static Connection connection;
	
	/**
	 * Initialize variables when the text field gets the focus.
	 */
	@Override
	public void focusGained(FocusEvent e) {
		check = false;
		valid = true;

		source = (JTextField) e.getSource();
		
		ConnectionManager cm = ConnectionManager.getInstance();
		int connectionHashCode = Integer.parseInt(source.getName());
		connection = cm.getConnection(connectionHashCode);
	}

	@Override
	public void focusLost(FocusEvent e) {
		if (!valid) {
			String currentVal = Double.toString(connection.getLength());
			source.setText(currentVal);
		}
	}

	/**
	 * Verifies if the input is a non-empty value. In that case, @param valid is set
	 * to <code>true</code>, and the value is saved to the corresponding object.
	 * Otherwise, @param valid is set to <code>false</code>.
	 */
	@Override
	public void keyReleased(KeyEvent e) {
		input = source.getText();

		if (check) {
			if (input.isEmpty()) {
				valid = false;
			} else {
				valid = true;
				connection.setLength(Double.valueOf(input));
			}
		}
	}

	/**
	 * Verifies if the input is a valid character. If so, the @param check flag is
	 * set to <code>true</code>. Otherwise, the event is consumed.
	 */
	@Override
	public void keyTyped(KeyEvent e) {
		char c = e.getKeyChar();
		InsertionVerifier v = new InsertionVerifier();
		if (v.isNumber(c, source.getText().length())) {
			check = true;
		} else {
			check = false;
			DesignerPanel.pl_ems.getToolkit().beep();
			e.consume();
		}
	}
}
