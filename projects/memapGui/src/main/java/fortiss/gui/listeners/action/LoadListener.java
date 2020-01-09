package fortiss.gui.listeners.action;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import javax.swing.JFileChooser;

import fortiss.gui.Designer;
import fortiss.gui.listeners.helper.ModelInitHelper;

public class LoadListener extends MouseAdapter {
	/**
	 * Loads a topology from a JSON file.
	 */
	public void mouseClicked(MouseEvent e) {

		// Open dialog in current directory
		JFileChooser chooser = new JFileChooser();
		chooser.setCurrentDirectory(new File(System.getProperty("user.dir")));
		
		int rVal = chooser.showOpenDialog(chooser);
		if (rVal == JFileChooser.APPROVE_OPTION) {
			File file = chooser.getSelectedFile();
			Designer.setWorkingFile(file.getAbsolutePath());
			ModelInitHelper.loadFromFile(file);		}
	}
}