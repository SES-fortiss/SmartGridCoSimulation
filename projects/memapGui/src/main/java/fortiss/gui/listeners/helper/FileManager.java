package fortiss.gui.listeners.helper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import fortiss.simulation.helper.Logger;
import simulation.SimulationStarter;

/**
 * Manages all the files read and produced by the GUI interface. It is a helper
 * class meant to assist other classes that need to read or write files.
 */
public class FileManager {

	/**
	 * Reads a file from the resource container of the project
	 * 
	 * @param filename the name of the file in resources
	 * @return a buffer with the data in the input file
	 */
	public BufferedReader readFromResources(String filename) {
		BufferedReader br = null;
		String source = "/" + filename;
		try {
			InputStream is = this.getClass().getResourceAsStream(source);
			br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
		} catch (IOException e1) {
			Logger.getInstance().writeError("Error reading " + filename + " from resources");
			e1.printStackTrace();
			SimulationStarter.stopSimulationStatic();
		}
		return br;
	}

	/**
	 * Reads a file from location specified.
	 *
	 * @param location the absolute path to the file to be read
	 * @return a buffer with the data in the file read
	 * @throws FileNotFoundException
	 */
	public BufferedReader readFromSource(String location) throws FileNotFoundException {
		InputStream is = new FileInputStream(location);
		BufferedReader br = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8));
		return br;
	}

	/**
	 * Writes a file.
	 *
	 * @param str  text to be written in file
	 * @param file File to be written
	 */
	public void writeFile(String str, File file) {

		if (!file.exists()) {
			try {
				file.getParentFile().mkdirs();
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		// Save JSON string to selected file
		try {
			FileWriter writer = new FileWriter(file);
			writer.write(str);
			writer.flush();
			writer.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
