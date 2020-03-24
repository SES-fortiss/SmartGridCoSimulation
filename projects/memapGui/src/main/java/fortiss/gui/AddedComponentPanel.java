package fortiss.gui;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JLabel;
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

		for (ArrayList<JLabel> iconList : DesignerPanel.demandIcons.values()) {
			for (JLabel icon : iconList) {
				icon.setForeground(Colors.defaultCol);
			}
		}
		
		for (ArrayList<JLabel> iconList : DesignerPanel.storageIcons.values()) {
			for (JLabel icon : iconList) {
				icon.setForeground(Colors.defaultCol);
			}
		}
		
		for (ArrayList<JLabel> iconList : DesignerPanel.volatileIcons.values()) {
			for (JLabel icon : iconList) {
				icon.setForeground(Colors.defaultCol);
			}
		}
		
		for (ArrayList<JLabel> iconList : DesignerPanel.controllableIcons.values()) {
			for (JLabel icon : iconList) {
				icon.setForeground(Colors.defaultCol);
			}
		}
		
		for (ArrayList<JLabel> iconList : DesignerPanel.couplerIcons.values()) {
			for (JLabel icon : iconList) {
				icon.setForeground(Colors.defaultCol);
			}
		}

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

}
