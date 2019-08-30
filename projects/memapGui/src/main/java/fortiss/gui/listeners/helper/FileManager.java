package fortiss.gui.listeners.helper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

import fortiss.components.Building;
import fortiss.gui.Designer;
import memap.helper.DirectoryConfiguration;

/**
 * Manages all the files produced by the GUI interface
 */
abstract public class FileManager {

	/** Main output directory path */
	private static String mainDir = DirectoryConfiguration.mainDir;
	/** Configuration directory path */
	private static String configDir = DirectoryConfiguration.configDir;

	/**
	 * Writes a file.
	 * 
	 * @param str  text to be written in file
	 * @param file File to be written
	 */
	public static void writeFile(String str, File file) {

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

	/**
	 * Writes one parameter configuration file that includes the parameters
	 * registered in {@link fortiss.controller.Parameters}.
	 */
	public static void writeParameterConfigFile() {
		String source = "/" + mainDir + "/" + configDir + "/parameterConfig.json";
		String location = System.getProperty("user.dir");
		location = location + source;

		System.out.println(">> Writing parameter configuration file in " + location);

		File file = new File(location);

		// Create JSON string
		Gson gson = new Gson();
		String str = gson.toJson(Designer.control.pars);
		writeFile(str, file);
	}

	/**
	 * Writes one descriptor file that includes the configuration of all the
	 * buildings created.
	 * 
	 * @param file path to file
	 */
	public static void writeDescriptorFile(File file) {

		// Create JSON string
		Gson gson = new Gson();
		String str = gson.toJson(Designer.buildings);
		writeFile(str, file);
	}

	/**
	 * Writes one descriptor file per building with its configuration.
	 */
	public static void writeDescriptorFiles() {

		String location = System.getProperty("user.dir");
		/*
		 * Note: location is the project directory from which the simulation was started
		 * or or the directory from which the .jar was executed.
		 */
		String source = "/" + mainDir + "/" + configDir + "/";

		for (Building building : Designer.buildings) {
			String filename = location + source + building.getName() + ".json";

			System.out.println(">> Writing descriptor " + building.getName() + " in " + location);

			File file = new File(filename);

			// Create JSON string
			Gson gson = new Gson();
			String str = gson.toJson(building);
			Designer.control.pars.addDescriptorFile(file);
			writeFile(str, file);
		}
	}
}
