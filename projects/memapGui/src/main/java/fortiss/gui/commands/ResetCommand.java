package fortiss.gui.commands;

import fortiss.gui.DesignerPanel;
import fortiss.simulation.PlanningTool;
import fortiss.simulation.helper.PositionManager;

public class ResetCommand implements Command {

	@Override
	public void execute() {
		DesignerPanel.pl_ems.reset();
		DesignerPanel.pl_comp.reset();

		// Eliminate positions
		PositionManager pm = PositionManager.getInstance();
		pm.clearPositions();

		// Eliminate buildings
		DesignerPanel.buildings.clear();
		DesignerPanel.buildingCount = DesignerPanel.buildings.size();

		// Hide details
		DesignerPanel.showInformationPanel("initial");

		// Hide component box
		DesignerPanel.pl_object.hideComponentBox();
		PlanningTool planningTool = PlanningTool.getInstance();
		planningTool.getPlanningToolWindow().setTitle("");

		planningTool.setWorkingFile("");
	}

}
