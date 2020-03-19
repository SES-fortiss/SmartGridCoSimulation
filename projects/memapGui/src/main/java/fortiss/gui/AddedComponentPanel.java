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
		
		for (int i = 0; i < DesignerPanel.buildingCount; i++) {
			for (int j = 0; j < DesignerPanel.demandIcons.get(i).size(); j++) {
				DesignerPanel.demandIcons.get(i).get(j).setForeground(Colors.defaultCol);
			}
			for (int j = 0; j < DesignerPanel.storageIcons.get(i).size(); j++) {
				DesignerPanel.storageIcons.get(i).get(j).setForeground(Colors.defaultCol);
			}
			for (int j = 0; j < DesignerPanel.volatileIcons.get(i).size(); j++) {
				DesignerPanel.volatileIcons.get(i).get(j).setForeground(Colors.defaultCol);
			}
			for (int j = 0; j < DesignerPanel.controllableIcons.get(i).size(); j++) {
				DesignerPanel.controllableIcons.get(i).get(j).setForeground(Colors.defaultCol);
			}
			for (int j = 0; j < DesignerPanel.couplerIcons.get(i).size(); j++) {
				DesignerPanel.couplerIcons.get(i).get(j).setForeground(Colors.defaultCol);
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
