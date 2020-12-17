package fortiss.gui.commands;

import fortiss.gui.listeners.helper.ModelInitHelper;
import fortiss.simulation.PlanningTool;

/**
 * Save a topology to an EXISTENT file. If the file does not exist, the a dialog
 * is open through {@link SaveAsCommand}
 */
public class SaveCommand implements Command {

	@Override
	public void execute() {
		String workingFilePath = PlanningTool.getInstance().getWorkingFile();
		
		if (workingFilePath != null && !workingFilePath.isEmpty()) {
			new ModelInitHelper().writeMemapModel(workingFilePath);
		} else {
			Command saveAs = new SaveAsCommand();
			saveAs.execute();
		}
	}

}
