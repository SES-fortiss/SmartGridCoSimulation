package fortiss.gui.commands;

import fortiss.simulation.PlanningTool;

public class CloseCommand implements Command {

	@Override
	public void execute() {
		PlanningTool planningTool = PlanningTool.getInstance();
		planningTool.getPlanningToolWindow().dispose();
		new SaveCommand().execute();
	}

}
