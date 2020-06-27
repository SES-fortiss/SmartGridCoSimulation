package fortiss.gui.listeners.action;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import fortiss.gui.DesignerPanel;
import fortiss.simulation.PlanningTool;
import fortiss.simulation.helper.PositionManager;

public class ResetListener extends MouseAdapter {

	/**
	 * Deletes all created objects and icons.
	 */
	@Override
	public void mouseClicked(MouseEvent e) {
		DesignerPanel.pl_ems.removeAll();
		DesignerPanel.pl_ems.repaint();
		DesignerPanel.pl_comp.removeAll();
		DesignerPanel.pl_comp.repaint();

		// Eliminate positions
		PositionManager pm = PositionManager.getInstance();
		pm.clearPositions();

		// Eliminate building icons
		DesignerPanel.buildingIcons.clear();

		// Eliminate buildings
		DesignerPanel.buildings.clear();
		DesignerPanel.buildingCount = DesignerPanel.buildings.size();

		// Hide details
		DesignerPanel.cl.show(DesignerPanel.pl_comp_detail, "initial");

		// Hide component box
		DesignerPanel.pl_object.hideComponentBox();
		PlanningTool.getPlanningToolWindow().setTitle("");

		// Clean lastSavedFile and descriptorFile paths
		DesignerPanel.parameterPanel.pars.setLastSavedFile("");
		DesignerPanel.parameterPanel.pars.clearDescriptorFile();

	}
}
