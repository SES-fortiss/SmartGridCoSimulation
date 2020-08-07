package fortiss.gui.listeners.textfield;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import fortiss.components.Connection;
import fortiss.gui.DesignerPanel;
import fortiss.gui.listeners.helper.InsertionVerifier;
import fortiss.simulation.PlanningTool;
import fortiss.simulation.helper.ConnectionManager;

public class ConnectionLossesListener extends KeyAdapter implements FocusListener {

	private static boolean check;
	private static boolean valid;
	private static JTextField source;
	private static String input;
	private static String message;
	private static Connection connection;
	private static InsertionVerifier v;
	
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
		
		message = "An unidentified error has occurred.";
		v = new InsertionVerifier();
	}

	@Override
	public void focusLost(FocusEvent e) {
		if (!valid) {
			String currentVal = Double.toString(connection.getLosses());
			JOptionPane.showMessageDialog(PlanningTool.getMainContentPane(), message);
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

		if (!input.contains(".")) {
			v.validKeys.add('.');
		}

		if (check) {
			boolean containsNumber = Pattern.compile("[0-9]").matcher(input).find();
			if (!containsNumber) {
				valid = false;
				message = "Error. Invalid input or empty field.";
			} else {
				double num = Double.parseDouble(input);
				if (num > 100 && num < 0) {
					valid = false;
					message = "Error. Invalid efficiency. Only values between 0 and 100 % are valid.";
				} else {
					valid = true;
					connection.setLosses(Double.valueOf(input) / 100.0);
				}
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
		if (v.isNumber(c, source.getText().length())) {
			check = true;
		} else {
			check = false;
			DesignerPanel.pl_ems.getToolkit().beep();
			e.consume();
		}
	}
}
