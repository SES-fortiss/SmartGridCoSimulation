package fortiss.gui.listeners.action;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import javax.swing.JFileChooser;

import org.apache.commons.io.FilenameUtils;

import fortiss.gui.listeners.helper.FileManager;

public class SaveListener extends MouseAdapter {

	/**
	 * Saves a configuration in a JSON file.
	 */
	public void mouseClicked(MouseEvent e) {
		JFileChooser chooser = new JFileChooser();
		int rVal = chooser.showSaveDialog(chooser);
		if (rVal == JFileChooser.APPROVE_OPTION) {
			File file = chooser.getSelectedFile();
			if (FilenameUtils.getExtension(file.getName()).equalsIgnoreCase("json")) {
			} else {
				// append .json to file name
				file = new File(file.toString() + ".json");
			}
			FileManager.writeDescriptorFile(file);
		}
	}
}