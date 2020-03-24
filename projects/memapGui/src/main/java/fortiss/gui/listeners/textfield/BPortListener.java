package fortiss.gui.listeners.textfield;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import fortiss.gui.DesignerPanel;
import fortiss.gui.listeners.helper.FocusManager;
import fortiss.gui.listeners.helper.InsertionVerifier;
import fortiss.simulation.PlanningTool;

public class BPortListener extends KeyAdapter implements FocusListener {

	private static String buildingName;
	private static boolean check;
	private static boolean valid;
	private static JTextField source;
	private static String input;
	private static String message;

	/**
	 * Initialize variables when the text field gets the focus.
	 */
	@Override
	public void focusGained(FocusEvent e) {
		buildingName = DesignerPanel.selectedBuilding;
		check = false;
		valid = true;

		source = (JTextField) e.getSource();
		message = "An unidentified error has occurred.";
		FocusManager.focusBuilding(buildingName);
	}

	/**
	 * Detects and corrects errors when the text field lose focus. Shows an error
	 * message if necessary.
	 */
	@Override
	public void focusLost(FocusEvent e) {
		if (!valid) {
			String currentVal = Integer.toString(DesignerPanel.buildings.get(buildingName).getPort());
			JOptionPane.showMessageDialog(PlanningTool.getMainContentPane(), message);
			source.setText(currentVal);
		}
		FocusManager.focusLostBuilding(buildingName);
	}

	/**
	 * Verifies if the input is a non-empty valid port value. In that case, valid is
	 * set to <code>true</code>, and the value is saved to the corresponding object.
	 * Otherwise, valid is set to <code>false</code>.
	 */
	@Override
	public void keyReleased(KeyEvent e) {
		input = source.getText();

		if (check) {
			if (input.isEmpty()) {
				valid = false;
				message = "Error. This field can not be empty.";
			} else {
				int num = Integer.parseUnsignedInt(input);
				if (num != 0 && (num < 1024 || num > 49151)) {
					valid = false;
					message = "Error. Invalid port number. Only numbers between 1024 and 49151, and 0 are valid.";
				} else {
					valid = true;
					DesignerPanel.buildings.get(buildingName).setPort(Integer.parseUnsignedInt(input));
				}
			}
		}
	}

	/**
	 * Verifies if the input is a valid character. If so, the check flag is set to
	 * <code>true</code>. Otherwise, the event is consumed.
	 */
	@Override
	public void keyTyped(KeyEvent e) {
		char c = e.getKeyChar();
		InsertionVerifier v = new InsertionVerifier();
		if (v.isNumber(c, source.getText().length())) {
			check = true;
		} else {
			check = false;
			DesignerPanel.pl_ems_detail.getToolkit().beep();
			e.consume();
		}
	}
}
