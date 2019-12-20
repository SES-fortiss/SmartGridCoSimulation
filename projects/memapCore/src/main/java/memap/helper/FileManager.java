package memap.helper;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import simulation.SimulationStarter;

public class FileManager {

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
	 * @return a buffer with the data in the input file
	 */
	public BufferedReader readFromSource(String location) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(location));
		} catch (FileNotFoundException e) {
			System.err.println("Error reading " + location);
			e.printStackTrace();
		}
		return br;
	}

}
