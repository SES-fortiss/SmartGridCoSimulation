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

import com.google.gson.Gson;

import fortiss.components.Building;
import fortiss.gui.Designer;
import memap.helper.DirectoryConfiguration;

/**
 * Manages all the files read and produced by the GUI interface
 */
abstract public class FileManager {

	/** Main output directory path */
	private static String mainDir = DirectoryConfiguration.mainDir;
	/** Configuration directory path */
	private static String configDir = DirectoryConfiguration.configDir;

	/**
	 * Reads a file from the resource container of the project
	 * 
	 * @param filename the name of the file to be read
	 * @return a buffer with the data in the input file
	 */
	public static BufferedReader readFromResources(String filename) {
		BufferedReader br = null;
		String source = "resources/" + filename;
		File file = new File(source);
		if(file.exists()) {
			InputStream is = FileManager.class.getClassLoader().getResourceAsStream(source);
			br = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8));
		}
		return br;
	}
	
	/**
	 * Reads a file from location specified.
	 * 
	 * @param location the absolute path to the file to be read
	 * @return a buffer with the data in the file read
	 */
	public static BufferedReader readFromSource(String location) {
		BufferedReader br = null;
		try {
			InputStream is = new FileInputStream(location);
			br = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8));
		} catch (FileNotFoundException e) {
			System.err.println("File not found. " + location);
			e.printStackTrace();
		}
		return br;
	}
	
	
	/**
	 * Reads a file from location specified.
	 * 
	 * @param location the absolute path to the file to be read
	 * @return a buffer with the data in the file read
	 */
	public static BufferedReader readConfig() {
		BufferedReader br = null;
		
		String source = System.getProperty("user.dir") + "/" + mainDir + "/" + configDir + "/parameterConfig.json";
		
		try {			
			InputStream is = new FileInputStream(source);
			br = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8));
			
		} catch (FileNotFoundException e) {
			System.err.println("FileManager file not found. " + source);
			e.printStackTrace();
		}
		return br;
	}
	
	
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
	 * registered in {@link fortiss.simulation.Parameters}.
	 */
	public static void writeParameterConfigFile() {
		String source = "\\" + mainDir + "\\" + configDir + "\\parameterConfig.json";
		String location = System.getProperty("user.dir");
		location = location + source;

		System.out.println(">> Writing parameter configuration file in " + location);

		File file = new File(location);

		// Create JSON string
		Gson gson = new Gson();
		String str = gson.toJson(Designer.parameterPanel.pars);
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
			Designer.parameterPanel.pars.addDescriptorFile(file);
			writeFile(str, file);
		}
	}
}
