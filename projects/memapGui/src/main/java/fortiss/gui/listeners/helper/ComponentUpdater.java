package fortiss.gui.listeners.helper;

import java.util.EventObject;

import javax.swing.JLabel;

import fortiss.components.Building;
import fortiss.gui.DesignerPanel;

/**
 * Updates the components of the selected building show in
 * {@link fortiss.gui.AddedComponentPanel}
 */
public class ComponentUpdater {
	public void showComponents(EventObject e) {
		JLabel lb = (JLabel) e.getSource();
		String buildingName = lb.getText();
		
		Building building = DesignerPanel.buildings.get(buildingName);
		
		// Show component icons
		DesignerPanel.pl_comp.removeAll();
		for (int i = 0; i < DesignerPanel.demandIcons.get(building).size(); i++) {
			DesignerPanel.pl_comp.add(DesignerPanel.demandIcons.get(building).get(i));
		}
		for (int i = 0; i < DesignerPanel.storageIcons.get(building).size(); i++) {
			DesignerPanel.pl_comp.add(DesignerPanel.storageIcons.get(building).get(i));
		}
		for (int i = 0; i < DesignerPanel.volatileIcons.get(building).size(); i++) {
			DesignerPanel.pl_comp.add(DesignerPanel.volatileIcons.get(building).get(i));
		}
		for (int i = 0; i < DesignerPanel.controllableIcons.get(building).size(); i++) {
			DesignerPanel.pl_comp.add(DesignerPanel.controllableIcons.get(building).get(i));
		}
		for (int i = 0; i < DesignerPanel.couplerIcons.get(building).size(); i++) {
			DesignerPanel.pl_comp.add(DesignerPanel.couplerIcons.get(building).get(i));
		}
		DesignerPanel.pl_comp.doLayout();
	}
}
