package fortiss.gui.listeners.helper;

import java.util.EventObject;

import fortiss.gui.DesignerPanel;

/**
 * Updates the components show in {@link fortiss.gui.AddedComponentPanel}
 */
public class ComponentUpdater {
	public void showComponents(EventObject e) {
		int current_building = DesignerPanel.currentBuilding;

		current_building = DesignerPanel.buildingIcons.indexOf(e.getSource());

		// Show component icons
		DesignerPanel.pl_comp.removeAll();
		for (int i = 0; i < DesignerPanel.demandIcons.get(current_building).size(); i++) {
			DesignerPanel.pl_comp.add(DesignerPanel.demandIcons.get(current_building).get(i));
		}
		for (int i = 0; i < DesignerPanel.storageIcons.get(current_building).size(); i++) {
			DesignerPanel.pl_comp.add(DesignerPanel.storageIcons.get(current_building).get(i));
		}
		for (int i = 0; i < DesignerPanel.volatileIcons.get(current_building).size(); i++) {
			DesignerPanel.pl_comp.add(DesignerPanel.volatileIcons.get(current_building).get(i));
		}
		for (int i = 0; i < DesignerPanel.controllableIcons.get(current_building).size(); i++) {
			DesignerPanel.pl_comp.add(DesignerPanel.controllableIcons.get(current_building).get(i));
		}
		for (int i = 0; i < DesignerPanel.couplerIcons.get(current_building).size(); i++) {
			DesignerPanel.pl_comp.add(DesignerPanel.couplerIcons.get(current_building).get(i));
		}
		DesignerPanel.pl_comp.doLayout();
		// repaint of component panel is triggered by the FocusManager
	}

}
