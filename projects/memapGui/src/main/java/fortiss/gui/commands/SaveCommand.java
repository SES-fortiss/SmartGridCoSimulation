package fortiss.gui.commands;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import fortiss.gui.listeners.helper.ModelInitHelper;
import fortiss.media.IconStore;
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
			PlanningTool.getInstance().setSaved(true);
			JOptionPane.showMessageDialog(PlanningTool.getInstance().getMainContentPane(), new JLabel("The model has been saved!", SwingConstants.CENTER),
					"MEMAP notification", JOptionPane.INFORMATION_MESSAGE, IconStore.save);
		} else {
			Command saveAs = new SaveAsCommand();
			saveAs.execute();
		}
	}

}
