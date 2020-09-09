package fortiss.gui.commands;

import java.io.File;

import fortiss.gui.DesignerPanel;
import fortiss.gui.listeners.helper.FileManager;

/**
 * Save a topology to an EXISTENT file. If the file does not exist, the a dialog
 * is open through {@link SaveAsCommand}
 */
public class SaveCommand implements Command {

	@Override
	public void execute() {
		String activeFilePath = DesignerPanel.parameterPanel.pars.getLastSavedFile();

		if (activeFilePath != null && !activeFilePath.isEmpty()) {
			FileManager fm = new FileManager();
			File file = new File(activeFilePath);
			fm.writeMemapModel(file);
			fm.writeParameterConfigFile();
			System.out.println(">> Save file: " + file.getAbsolutePath());
		} else {
			Command saveAs = new SaveAsCommand();
			saveAs.execute();
		}
	}

}
