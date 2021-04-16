package fortiss.gui.commands;

import java.io.File;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import fortiss.gui.listeners.helper.Chooser;
import fortiss.gui.listeners.helper.FileType;
import fortiss.gui.listeners.helper.ModelInitHelper;
import fortiss.media.IconStore;
import fortiss.simulation.PlanningTool;

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
			planningTool.setWorkingFile(file.getAbsolutePath());
			new ModelInitHelper().writeMemapModel(file.getAbsolutePath());

			planningTool.getPlanningToolWindow().setTitle("MEMAP - " + file.getAbsolutePath() + " - PlanningTool");
			PlanningTool.getInstance().setSaved(true);
			JOptionPane.showMessageDialog(PlanningTool.getInstance().getMainContentPane(), new JLabel("The model has been saved!", SwingConstants.CENTER),
					"MEMAP notification", JOptionPane.INFORMATION_MESSAGE, IconStore.save);
		}
	}

}
