package fortiss.gui.commands;

import fortiss.gui.DesignerPanel;
import fortiss.simulation.PlanningTool;
import fortiss.simulation.helper.ConnectionManager;

public class ResetCommand implements Command {

	@Override
	public void execute() {
		DesignerPanel.pl_ems.reset();
		DesignerPanel.pl_comp.reset();

		// Eliminate connections
		ConnectionManager.getInstance().resetConnections();

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
