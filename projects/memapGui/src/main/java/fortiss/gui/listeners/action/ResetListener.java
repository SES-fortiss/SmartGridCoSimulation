package fortiss.gui.listeners.action;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import fortiss.gui.Designer;
import fortiss.gui.listeners.helper.PositionManager;

public class ResetListener extends MouseAdapter {

	/**
	 * Deletes all created objects and icons.
	 */
	@Override
	public void mouseClicked(MouseEvent e) {
		Designer.pl_ems.removeAll();
		Designer.pl_ems.repaint();
		Designer.pl_comp.removeAll();
		Designer.pl_comp.repaint();

		// Eliminate positions
		PositionManager.clearPositions();

		// Eliminate building icons
		Designer.buildingIcons.clear();

		// Eliminate buildings
		Designer.buildings.clear();
		Designer.buildingCount = Designer.buildings.size();

		// Hide details
		Designer.cl.show(Designer.pl_comp_detail, "initial");

		// Hide component box
		Designer.pl_object.hideComponentBox();
		Designer.frame.setTitle("");
		
		// Clean lastSavedFile and descriptorFile paths
		Designer.parameterPanel.pars.setLastSavedFile("");
		Designer.parameterPanel.pars.clearDescriptorFile();

	}
}
