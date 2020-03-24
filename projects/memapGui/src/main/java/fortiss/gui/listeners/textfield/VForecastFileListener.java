package fortiss.gui.listeners.textfield;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import fortiss.components.Volatile;
import fortiss.gui.DesignerPanel;
import fortiss.gui.listeners.helper.FocusManager;
import fortiss.gui.listeners.helper.InsertionVerifier;
import fortiss.simulation.PlanningTool;

public class VForecastFileListener extends KeyAdapter implements FocusListener {

	private static String buildingName;
	private static int component;
	private static boolean check;
	private static boolean valid;
	private static JTextField source;
	private static String input;
	private static String message;
	private static Volatile o;

	/**
	 * Initialize variables when the text field gets the focus.
	 */
	@Override
	public void focusGained(FocusEvent e) {
		buildingName = DesignerPanel.selectedBuilding;
		component = DesignerPanel.currentComponent;
		o = DesignerPanel.buildings.get(buildingName).getVolatile().get(component);
		check = false;
		valid = true;

		source = (JTextField) e.getSource();
		message = "An unidentified error has occurred.";
		FocusManager.focusVolatile(buildingName, component);
	}

	/**
	 * Detects and corrects errors when the text field lose focus. Shows an error
	 * message if necessary.
	 */
	@Override
	public void focusLost(FocusEvent e) {
		if (!valid) {
			String currentVal = o.getForecastFile();
			JOptionPane.showMessageDialog(PlanningTool.getMainContentPane(), message);
			source.setText(currentVal);
		}
		FocusManager.focusLostVolatile(buildingName, component);
	}

	/**
	 * Verifies if the input is an empty field or a non-empty valid path value. In
	 * that case, valid is set to <code>true</code>, and the value is saved to the
	 * corresponding object. Otherwise, valid is set to <code>false</code>.
	 */
	@Override
	public void keyReleased(KeyEvent e) {
		input = source.getText();

		if (check) {
			File f = new File(input);
			if (f.exists() || input.isEmpty()) {
				valid = true;
				o.setForecastFile(input);
			} else {
				valid = false;
				message = "Error. Invalid path to file";
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
		if (v.isPath(c)) {
			check = true;
		} else {
			check = false;
			DesignerPanel.pl_ems_detail.getToolkit().beep();
			e.consume();
		}
	}
}
