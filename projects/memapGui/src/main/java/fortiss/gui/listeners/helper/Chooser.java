package fortiss.gui.listeners.helper;

import java.io.File;
import javax.swing.JFileChooser;

/**
 * Allows file selection from directory
 */
public class Chooser {
	private String path;

	public String choosePath() {

		// Open dialog in current directory
		JFileChooser chooser = new JFileChooser();
		chooser.setCurrentDirectory(new File(System.getProperty("user.dir")));

		int rVal = chooser.showOpenDialog(chooser);
		if (rVal == JFileChooser.APPROVE_OPTION) {
			File file = chooser.getSelectedFile();
			path = file.getPath();
		}
		return path;
	}
}
