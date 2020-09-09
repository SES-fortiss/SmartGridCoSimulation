package fortiss.gui.commands;

import fortiss.simulation.PlanningTool;

public class CloseCommand implements Command {

	@Override
	public void execute() {
		PlanningTool.getPlanningToolWindow().dispose();
		new SaveCommand().execute();
	}

}
