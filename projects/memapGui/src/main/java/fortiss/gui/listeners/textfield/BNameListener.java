package fortiss.gui.listeners.textfield;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import fortiss.components.Building;
import fortiss.gui.DesignerPanel;
import fortiss.gui.listeners.helper.FocusManager;
import fortiss.gui.listeners.helper.InsertionVerifier;
import fortiss.simulation.PlanningTool;
import fortiss.simulation.helper.PositionManager;

public class BNameListener extends KeyAdapter implements FocusListener {

	private static Building building;
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
		building = DesignerPanel.selectedBuilding;
		check = false;
		valid = true;

		source = (JTextField) e.getSource();
		message = "An unidentified error has occurred.";
		FocusManager.focusBuilding(building);
	}

	/**
	 * Detects and corrects errors when the text field lose focus. Shows an error
	 * message if necessary.
	 */
	@Override
	public void focusLost(FocusEvent e) {
		if (!valid) {
			String currentVal = building.getName();
			JOptionPane.showMessageDialog(PlanningTool.getMainContentPane(), message);
			source.setText(currentVal);
		}
		FocusManager.focusLostBuilding(building);
	}

	/**
	 * Verifies if the input is a non-empty value. In that case, valid is set to
	 * <code>true</code>, and the value is saved to the corresponding object.
	 * Otherwise, valid is set to <code>false</code>.
	 */
	@Override
	public void keyReleased(KeyEvent e) {
		input = source.getText();
		
		System.out.println("KeyReleased input: "+ input);
		System.out.println("KeyReleased before: "+ building);

		if (check) {
			if (input.isEmpty()) {
				valid = false;
				message = "Error. This field can not be empty.";
			} else {
				valid = true;
				
				DesignerPanel.buildings.remove(building.getName());
				DesignerPanel.buildings.put(input, building);
				PositionManager.getInstance().updateBuildingsName(building.getName(), input);
				
				building.setName(input);
				
				//old code: 
				//LabelUpdater lu = new LabelUpdater();
				//lu.updateLabel(DesignerPanel.buildingIcons.get(building), input);				
				JLabel selectedLabel = DesignerPanel.buildingIcons.get(building);
				selectedLabel.setText(input);
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
		if (v.isTextWithoutSpaces(c)) {
			check = true;
		} else {
			check = false;
			DesignerPanel.pl_ems_detail.getToolkit().beep();
			e.consume();
		}
	}
}
