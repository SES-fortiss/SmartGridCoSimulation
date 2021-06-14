package fortiss.gui.listeners.helper;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;

import org.apache.commons.io.FilenameUtils;

/**
 * Allow the selection of a file from the file system, through save and open
 * dialogs
 */
public class Chooser extends JFileChooser {

	private static final long serialVersionUID = 1L;

	public Chooser(FileType fileType) {
		super(new File(System.getProperty("user.dir")));
		String descriptor;
		String extension;

		if (fileType.equals(FileType.CSV)) {
			extension = ".csv";
			descriptor = "CSV Files (*.csv)";
		} else {
			extension = ".json";
			descriptor = "JSON Files (*.json)";
		}

		setFileFilter(new FileFilter() {

			public String getDescription() {
				return descriptor;
			}

			public boolean accept(File f) {
				if (f.isDirectory()) {
					return true;
				} else {
					String filename = f.getName().toLowerCase();
					return filename.endsWith(extension);
				}
			}
		});
	}

	public File showOpenDialog() {
		int rVal = showOpenDialog(this);
		File file = null;
		if (rVal == JFileChooser.APPROVE_OPTION) {
			file = getSelectedFile();
		}
		return file;
	}

	public File showSaveDialog() {
		int rVal = showSaveDialog(this);
		File file = null;
		if (rVal == JFileChooser.APPROVE_OPTION) {
			file = getSelectedFile();
			if (!FilenameUtils.getExtension(file.getName()).equalsIgnoreCase("json")) {
				file = new File(file.toString() + ".json");
			}
		}
		return file;
	}
}
