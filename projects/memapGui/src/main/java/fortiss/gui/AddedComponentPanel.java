package fortiss.gui;

import java.awt.Graphics;

import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

import fortiss.gui.style.Colors;
import fortiss.gui.style.StyleGenerator;

/**
 * Panel to show components added to a building
 */
public class AddedComponentPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	/** Necessary for dark mode on/off implementation */
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setBackground(Colors.background);
	}

	public AddedComponentPanel() {
		StyleGenerator.setupStyle();
		initialize();
	}

	/**
	 * Initializes the contents of the panel.
	 */
	private void initialize() {
		setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Added components", TitledBorder.LEFT,
				TitledBorder.TOP, null, Colors.accent2));
	}
	
	public void reset() {
		removeAll();
		revalidate();
		repaint();
	}

}
