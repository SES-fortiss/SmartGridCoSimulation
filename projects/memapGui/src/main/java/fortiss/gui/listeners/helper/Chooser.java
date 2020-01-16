package fortiss.gui.listeners.helper;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;

/**
 * Allows file selection from directory
 */
public class Chooser {
	private String path;

	public String choosePath() {

		// Open dialog in current directory
		JFileChooser chooser = new JFileChooser();
		chooser.setFileFilter(new FileFilter() {

			public String getDescription() {
				return "CSV Files (*.csv)";
			}

			public boolean accept(File f) {
				if (f.isDirectory()) {
					return true;
				} else {
					String filename = f.getName().toLowerCase();
					return filename.endsWith(".csv");
				}
			}
		});

		chooser.setCurrentDirectory(new File(System.getProperty("user.dir")));

		int rVal = chooser.showOpenDialog(chooser);
		if (rVal == JFileChooser.APPROVE_OPTION) {
			File file = chooser.getSelectedFile();
			path = file.getPath();
		}
		return path;
	}
}
