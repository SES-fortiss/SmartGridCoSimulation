package fortiss.gui.listeners.helper;

import java.util.EventObject;

import fortiss.gui.Designer;

/**
 * Updates the components show in {@link fortiss.gui.AddedComponentPanel}
 */
public class ComponentUpdater {
	public void showComponents(EventObject e) {
		int current_building = Designer.currentBuilding;

		current_building = Designer.buildingIcons.indexOf(e.getSource());

		// Show component icons
		Designer.pl_comp.removeAll();
		for (int i = 0; i < Designer.demandIcons.get(current_building).size(); i++) {
			Designer.pl_comp.add(Designer.demandIcons.get(current_building).get(i));
		}
		for (int i = 0; i < Designer.storageIcons.get(current_building).size(); i++) {
			Designer.pl_comp.add(Designer.storageIcons.get(current_building).get(i));
		}
		for (int i = 0; i < Designer.volatileIcons.get(current_building).size(); i++) {
			Designer.pl_comp.add(Designer.volatileIcons.get(current_building).get(i));
		}
		for (int i = 0; i < Designer.controllableIcons.get(current_building).size(); i++) {
			Designer.pl_comp.add(Designer.controllableIcons.get(current_building).get(i));
		}
		for (int i = 0; i < Designer.couplerIcons.get(current_building).size(); i++) {
			Designer.pl_comp.add(Designer.couplerIcons.get(current_building).get(i));
		}
		Designer.pl_comp.doLayout();
		// repaint of component panel is triggered by the FocusManager
	}

}
