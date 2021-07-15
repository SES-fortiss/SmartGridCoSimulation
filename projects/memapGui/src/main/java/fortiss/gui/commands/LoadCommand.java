package fortiss.gui.commands;

import java.io.File;

import fortiss.gui.listeners.helper.Chooser;
import fortiss.gui.listeners.helper.FileType;
import fortiss.gui.listeners.helper.ModelInitHelper;

public class LoadCommand implements Command {

	@Override
	public void execute() {
		Chooser chooser = new Chooser(FileType.JSON);
		File file = chooser.showOpenDialog();
		if (file != null) {
			// Reset simulation
			new ResetCommand().execute();
			new ModelInitHelper().loadFromFile(file.getAbsolutePath());
		}
	}
}
