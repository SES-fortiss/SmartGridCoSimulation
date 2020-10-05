package fortiss.gui.commands;

import java.io.File;

import fortiss.gui.listeners.helper.FileManager;
import fortiss.simulation.Parameters;
import fortiss.simulation.PlanningTool;
import fortiss.simulation.helper.Logger;

/**
 * Save a topology to an EXISTENT file. If the file does not exist, the a dialog
 * is open through {@link SaveAsCommand}
 */
public class SaveCommand implements Command {

	@Override
	public void execute() {
		Parameters pars = PlanningTool.getInstance().getParameters();
		String activeFilePath = pars.getLastSavedFile();

		if (activeFilePath != null && !activeFilePath.isEmpty()) {
			FileManager fm = new FileManager();
			File file = new File(activeFilePath);
			fm.writeMemapModel(file);
			fm.writeParameterConfigFile();
			Logger.getInstance().writeInfo("File saved: " + file.getAbsolutePath());
		} else {
			Command saveAs = new SaveAsCommand();
			saveAs.execute();
		}
	}

}
