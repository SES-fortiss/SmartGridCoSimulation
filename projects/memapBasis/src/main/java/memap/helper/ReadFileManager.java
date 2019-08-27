package memap.helper;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import simulation.SimulationStarter;

abstract public class ReadFileManager {
	
	/**
	 * Reads a file from the resource container of the project
	 * 
	 * @param filename the name of the file to be read
	 * @return a buffer with the data in the input file
	 */
	public static BufferedReader readFromResources(String filename) {
		BufferedReader br = null;
		try {
			String source = "resources/" + filename;
			InputStream is = ReadFileManager.class.getClassLoader().getResourceAsStream(source);
			br = new BufferedReader(new InputStreamReader(is, "UTF-8"));

		} catch (IOException e1) {
			System.err.println("Error reading " + filename + " thrown at class ReadFileManager");
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
	 */
	public static BufferedReader readFromSource(String location) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(location));
		} catch (FileNotFoundException e) {
			System.err.println("Error reading " + location + " thrown at class ReadFileManager");
			e.printStackTrace();
		}
		return br;
	}

}
