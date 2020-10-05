package fortiss.gui.commands;

import java.io.File;

import fortiss.gui.listeners.helper.Chooser;
import fortiss.gui.listeners.helper.FileManager;
import fortiss.gui.listeners.helper.FileType;
import fortiss.simulation.Parameters;
import fortiss.simulation.PlanningTool;
import fortiss.simulation.helper.Logger;

/**
 * Open dialog in current directory, so that the user can choose a location.
 * Save a configuration in a JsON file
 */
public class SaveAsCommand implements Command {

	@Override
	public void execute() {
		Chooser chooser = new Chooser(FileType.JSON);
		File file = chooser.showSaveDialog();

		if (file != null) {
			PlanningTool planningTool = PlanningTool.getInstance();
			Parameters pars = PlanningTool.getInstance().getParameters();
			pars.setLastSavedFile(file.getAbsolutePath());

			FileManager fm = new FileManager();
			fm.writeMemapModel(file);
			Logger.getInstance().writeInfo("File saved: " + file.getAbsolutePath());

			planningTool.getPlanningToolWindow().setTitle("MEMAP - " + file.getAbsolutePath() + " - PlanningTool");
		}
	}

}
