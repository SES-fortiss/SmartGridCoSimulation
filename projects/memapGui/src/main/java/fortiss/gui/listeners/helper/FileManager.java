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
import java.util.HashSet;
import java.util.Set;

import com.google.gson.Gson;

import fortiss.components.Building;
import fortiss.gui.DesignerPanel;
import memap.helper.DirectoryConfiguration;
import simulation.SimulationStarter;

/**
 * Manages all the files read and produced by the GUI interface
 */
public class FileManager {

	/** Main output directory path */
	private String mainDir = DirectoryConfiguration.mainDir;

	/** Configuration directory path */
	private String configDir = DirectoryConfiguration.configDir;

	/**
	 * Reads a file from the resource container of the project
	 * 
	 * @param filename the name of the file in resources
	 * @return a buffer with the data in the input file
	 */
	public BufferedReader readFromResources(String filename) {
		BufferedReader br = null;
		String source = "/resources/" + filename;
		try {
			InputStream is = this.getClass().getResourceAsStream(source);
			br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
		} catch (IOException e1) {
			System.err.println("Error reading " + filename + " from resources");
			e1.printStackTrace();
			SimulationStarter.stopSimulation();
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
	 * Reads a file from location specified.
	 *
	 * @param location the absolute path to the file to be read
	 * @return a buffer with the data in the file read
	 */
	public BufferedReader readParameterConfigFile() {
		BufferedReader br = null;

		String source = System.getProperty("user.dir") + File.separator + mainDir + File.separator + configDir
				+ File.separator + "parameterConfig.json";

		try {
			InputStream is = new FileInputStream(source);
			br = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8));

		} catch (FileNotFoundException e) {
			System.out.println("<INFO> - FileManager file not found: " + source);
			return null;
		}
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

	/**
	 * Writes one parameter configuration file that includes the parameters
	 * registered in {@link fortiss.simulation.Parameters}.
	 */
	public void writeParameterConfigFile() {
		String location = System.getProperty("user.dir") + File.separator + mainDir + File.separator + configDir
				+ File.separator + "parameterConfig.json";
		System.out.println(">> Writing parameter configuration file in " + location);

		File file = new File(location);

		// Create JSON string
		Gson gson = new Gson();
		String str = gson.toJson(DesignerPanel.parameterPanel.pars);
		writeFile(str, file);
	}

	/**
	 * Writes the model that includes the configuration of all the buildings
	 * created.
	 *
	 * @param file path to file
	 */
	public void writeMemapModel(File file) {

		// Create JSON string
		Gson gson = new Gson();

		Set<Building> mySet = new HashSet<Building>();

		for (Building building : DesignerPanel.buildings) {
			mySet.add(building);
		}

		String str = gson.toJson(mySet);
		writeFile(str, file);
		System.out.println(">> Writing memap model file in " + str);
	}

	/** Writes one descriptor file per building with its configuration. */
	public void writeBuildingDescriptorFiles() {

		/**
		 * Note: location is the project directory from which the simulation was
		 * started.
		 */
		String location = System.getProperty("user.dir") + File.separator + 
				mainDir + File.separator + configDir + File.separator;

		for (Building building : DesignerPanel.buildings) {
			System.out.println(">> Writing descriptor " + building.getName() + " in " + location);

			String filename = location + building.getName() + ".json";
			File file = new File(filename);

			Gson gson = new Gson();
			String str = gson.toJson(building);
			DesignerPanel.parameterPanel.pars.addDescriptorFile(file);
			writeFile(str, file);
		}
	}

	public void writeMemapModel() {
		File file = new File(DesignerPanel.parameterPanel.pars.getLastSavedFile());
		writeMemapModel(file);
	}
}
