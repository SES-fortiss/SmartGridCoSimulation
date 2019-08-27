package fortiss.gui;

import java.awt.Graphics;

import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

import fortiss.gui.style.Colors;

/** 
 * Panel to show components added to a building
 */
public class AddedComponentPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	/** Necessary for dark mode on/off implementation */
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		setBackground(Colors.background);
		setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Added components", TitledBorder.LEFT,
				TitledBorder.TOP, null, Colors.accent2));
		
		for (int i = 0; i < Designer.buildingCount; i++) {
			for (int j = 0; j < Designer.demandIcons.get(i).size(); j++) {
				Designer.demandIcons.get(i).get(j).setForeground(Colors.defaultCol);
			}
			for (int j = 0; j < Designer.storageIcons.get(i).size(); j++) {
				Designer.storageIcons.get(i).get(j).setForeground(Colors.defaultCol);
			}
			for (int j = 0; j < Designer.volatileIcons.get(i).size(); j++) {
				Designer.volatileIcons.get(i).get(j).setForeground(Colors.defaultCol);
			}
			for (int j = 0; j < Designer.controllableIcons.get(i).size(); j++) {
				Designer.controllableIcons.get(i).get(j).setForeground(Colors.defaultCol);
			}
			for (int j = 0; j < Designer.couplerIcons.get(i).size(); j++) {
				Designer.couplerIcons.get(i).get(j).setForeground(Colors.defaultCol);
			}
		}
	}

}
