package fortiss.gui.listeners.helper;

import java.util.EventObject;

import javax.swing.JLabel;

import fortiss.gui.DesignerPanel;

/**
 * Updates the components of the selected building show in
 * {@link fortiss.gui.AddedComponentPanel}
 */
public class ComponentUpdater {
	public void showComponents(EventObject e) {
		JLabel lb = (JLabel) e.getSource();
		String buildingName = lb.getText();

		// Show component icons
		DesignerPanel.pl_comp.removeAll();
		for (int i = 0; i < DesignerPanel.demandIcons.get(buildingName).size(); i++) {
			DesignerPanel.pl_comp.add(DesignerPanel.demandIcons.get(buildingName).get(i));
		}
		for (int i = 0; i < DesignerPanel.storageIcons.get(buildingName).size(); i++) {
			DesignerPanel.pl_comp.add(DesignerPanel.storageIcons.get(buildingName).get(i));
		}
		for (int i = 0; i < DesignerPanel.volatileIcons.get(buildingName).size(); i++) {
			DesignerPanel.pl_comp.add(DesignerPanel.volatileIcons.get(buildingName).get(i));
		}
		for (int i = 0; i < DesignerPanel.controllableIcons.get(buildingName).size(); i++) {
			DesignerPanel.pl_comp.add(DesignerPanel.controllableIcons.get(buildingName).get(i));
		}
		for (int i = 0; i < DesignerPanel.couplerIcons.get(buildingName).size(); i++) {
			DesignerPanel.pl_comp.add(DesignerPanel.couplerIcons.get(buildingName).get(i));
		}
		DesignerPanel.pl_comp.doLayout();
	}
}
