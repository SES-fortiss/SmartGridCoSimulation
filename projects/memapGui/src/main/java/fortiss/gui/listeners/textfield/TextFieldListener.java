package fortiss.gui.listeners.textfield;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import fortiss.components.Building;
import fortiss.components.Component;
import fortiss.gui.DesignerPanel;
import fortiss.simulation.PlanningTool;

public abstract class TextFieldListener extends KeyAdapter implements FocusListener {

	protected static Building building;
	protected static Component component;
	private String errorMessage;
	
	
	public TextFieldListener(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}
	
	/**
	 * Initialize variables when the text field gets the focus.
	 */
	@Override
	public void focusGained(FocusEvent e) {
		building = DesignerPanel.selectedBuilding;
		building.getIcon().highlight();
		
		if(DesignerPanel.selectedComponent != null) {
			// A component is selected
			component = DesignerPanel.selectedComponent;
			component.getIcon().highlight();
		}
	}

	/**
	 * Detects and corrects errors when the text field lose focus. Shows an error
	 * errorMessage if necessary.
	 */
	@Override
	public void focusLost(FocusEvent e) {
		JTextField source = (JTextField) e.getSource();
		String word = ((JTextField) e.getSource()).getText();
		
		if (!isValidField(word)) {
			JOptionPane.showMessageDialog(PlanningTool.getInstance().getMainContentPane(), errorMessage);
			source.setText(getAttribute());
		}
		
		building.getIcon().playDown();
		
		if(component != null) {
			component.getIcon().playDown();
		}
	}
	
	/**
	 * Verifies if the input is a valid string. In that case, valid is set to
	 * <code>true</code>, and the value is saved to the corresponding object.
	 * Otherwise, valid is set to <code>false</code>.
	 */
	@Override
	public void keyReleased(KeyEvent e) {
		String word = ((JTextField) e.getSource()).getText();
		
		if (isValidField(word)) {
			update(word);
		}
	}
	
	/**
	 * Verifies if the input is a valid character. If so, the check flag is set to
	 * <code>true</code>. Otherwise, the event is consumed.
	 */
	@Override
	public void keyTyped(KeyEvent e) {
		char c = e.getKeyChar();
		String word = ((JTextField) e.getSource()).getText();
		
		if (!isValidCharacter(c, word) || !isValidLength(word)) {
			DesignerPanel.pl_ems_detail.getToolkit().beep();
			e.consume();
		}
	}
	
	abstract String getAttribute();
	
	/** @return <code>true</code> if the text is a valid value for the field. Example: a path, a name, etc*/
	abstract boolean isValidField(String text);
	
	/** @return <code>true</code> if the character is valid for the field. Example: a character, a number, etc */
	abstract boolean isValidCharacter(char c, String text);
	
	/** 
	 * @return <code>true</code> if the text has a valid length after the char insertion.
	 * @param text	the text before the character insertion.
	 */
	abstract boolean isValidLength(String text);

	/** Update system values when an input text is valid */
	abstract void update(String text);

}
