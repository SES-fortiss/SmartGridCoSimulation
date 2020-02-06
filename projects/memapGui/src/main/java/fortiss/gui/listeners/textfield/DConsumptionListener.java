package fortiss.gui.listeners.textfield;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import fortiss.components.Demand;
import fortiss.gui.Designer;
import fortiss.gui.listeners.helper.FocusManager;
import fortiss.gui.listeners.helper.InsertionVerifier;

public class DConsumptionListener extends KeyAdapter implements FocusListener {

	private static int building;
	private static int component;
	private static boolean check;
	private static boolean valid;
	private static JTextField source;
	private static String input;
	private static String message;
	private static Demand o;

	/**
	 * Initialize variables when the text field gets the focus.
	 */
	@Override
	public void focusGained(FocusEvent e) {
		building = Designer.currentBuilding;
		component = Designer.currentComponent;
		o = Designer.buildings.get(building).getDemand().get(component);
		check = false;
		valid = true;

		source = (JTextField) e.getSource();
		message = "An unidentified error has occurred.";
		FocusManager.focusDemand(building, component);
	}

	/**
	 * Detects and corrects errors when the text field lose focus. Shows an error
	 * message if necessary.
	 */
	@Override
	public void focusLost(FocusEvent e) {
		if (!valid) {
			String currentVal = o.getConsumptionProfile();
			JOptionPane.showMessageDialog(Designer.contentPane, message);
			source.setText(currentVal);
		}
		FocusManager.focusLostDemand(building, component);
	}

	/**
	 * Verifies if the input is an empty field or a non-empty valid path value. In
	 * that case, @param valid is set to <code>true</code>, and the value is saved
	 * to the corresponding object. Otherwise, @param valid is set to
	 * <code>false</code>.
	 */
	@Override
	public void keyReleased(KeyEvent e) {
		input = source.getText();

		if (check) {
			File f = new File(input);
			if (f.exists() || input.isEmpty()) {
				valid = true;
				o.setConsumptionProfile(input);
				Designer.demandPanel.setData(input);
			} else {
				valid = false;
				message = "Error. Invalid path to file";
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
		if (v.isPath(c)) {
			check = true;
		} else {
			check = false;
			Designer.pl_ems_detail.getToolkit().beep();
			e.consume();
		}
	}
}
