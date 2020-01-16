package fortiss.gui.listeners.action;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import javax.swing.JFileChooser;

import org.apache.commons.io.FilenameUtils;

import fortiss.gui.Designer;
import fortiss.gui.listeners.helper.FileManager;

public class SaveListener extends MouseAdapter {

	/**
	 * Saves a configuration in a JSON file.
	 */
	public void mouseClicked(MouseEvent e) {
		// Open dialog in current directory
		JFileChooser chooser = new JFileChooser();
		chooser.setCurrentDirectory(new File(System.getProperty("user.dir")));

		int rVal = chooser.showSaveDialog(chooser);
		if (rVal == JFileChooser.APPROVE_OPTION) {
			File file = chooser.getSelectedFile();
			if (FilenameUtils.getExtension(file.getName()).equalsIgnoreCase("json")) {
			} else {
				// append .json to file name
				file = new File(file.toString() + ".json");
			}

			Designer.parameterPanel.pars.setLastSavedFile(file.getAbsolutePath());
			FileManager fm = new FileManager();
			fm.writeMemapModel(file);
			System.out.println(">> Save file: " + file.getAbsolutePath());
			Designer.frame.setTitle("MEMAP - " + file.getAbsolutePath() + " - PlanningTool");			
		}
	}

	public void saveFile() {
		
	}
}