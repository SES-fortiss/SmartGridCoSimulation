package fortiss.gui.listeners.textfield;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import fortiss.gui.DesignerPanel;
import fortiss.gui.listeners.helper.InputVerifier;
import fortiss.simulation.PlanningTool;

public abstract class TextFieldListener extends KeyAdapter implements FocusListener {

	protected JTextField source;
	protected String errorMessage;
	protected InputVerifier inputVerifier;

	/**
	 * The word currently in the text field. It might be an invalid value for the
	 * class. Store it is important to be able to verify the value when focus is
	 * lost to a component of the same kind.
	 */
	protected String word = "";

	public TextFieldListener(String errorMessage, InputVerifier inputVerifier) {
		this.errorMessage = errorMessage;
		this.inputVerifier = inputVerifier;
	}

	@Override
	public void focusGained(FocusEvent e) {
		source = (JTextField) e.getSource();
		setWord(source.getText());
	}

	/**
	 * Detects and corrects errors when the text field lose focus. Shows an error
	 * errorMessage if necessary.
	 */
	@Override
	public void focusLost(FocusEvent e) {
		if (!inputVerifier.isValidField(getWord())) {
			JOptionPane.showMessageDialog(PlanningTool.getInstance().getMainContentPane(), errorMessage + ": " + getWord());
			source.setText(getAttribute());

		}
	}

	/**
	 * Verifies if the input is a valid string. In that case, the valid string is
	 * saved to the corresponding object
	 */
	@Override
	public void keyReleased(KeyEvent e) {
		setWord(source.getText());

		if (inputVerifier.isValidField(word)) {
			// the object attribute is only updated if word is a valid field
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

		if (!inputVerifier.isValidCharacter(c, word) || !inputVerifier.isValidLength(word)) {
			DesignerPanel.pl_ems_detail.getToolkit().beep();
			e.consume();
		}
	}

	public abstract String getAttribute();

	/** Update system values when an input text is valid */
	public abstract void update(String text);

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

}
