package fortiss.gui.listeners.action;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;

import fortiss.gui.listeners.helper.ModelInitHelper;

public class LoadListener extends MouseAdapter {
	/**
	 * Loads a topology from a JSON file.
	 */
	public void mouseClicked(MouseEvent e) {

		// Open dialog in current directory
		JFileChooser chooser = new JFileChooser();
		chooser.setCurrentDirectory(new File(System.getProperty("user.dir")));
		
		chooser.setFileFilter(new FileFilter() {

			   public String getDescription() {
			       return "JSON Files (*.json)";
			   }

			   public boolean accept(File f) {
			       if (f.isDirectory()) {
			           return true;
			       } else {
			           String filename = f.getName().toLowerCase();
			           return filename.endsWith(".json");
			       }
			   }
			});

		int rVal = chooser.showOpenDialog(chooser);
		if (rVal == JFileChooser.APPROVE_OPTION) {
			File file = chooser.getSelectedFile();
			ModelInitHelper.loadFromFile(file);
		}
	}
}