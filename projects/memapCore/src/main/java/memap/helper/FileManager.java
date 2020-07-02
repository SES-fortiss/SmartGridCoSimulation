package memap.helper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import memap.examples.ExampleFiles;
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
	
	
	/**
	 * @return a buffer with the data from CSV filename
	 * @param filename CSV file
	 */
	public BufferedReader getBuffer(String csvFile) {
		ExampleFiles examples = new ExampleFiles();
		if (examples.isExample(csvFile)) {
			System.out.println(">> Reading from resources: " + csvFile);
			return readFromResources(examples.getFile(csvFile));
		} else {
			System.out.println(">> Reading from source: " + csvFile);
			return readFromSource(csvFile);
		}
	}
	
	

	/**
	 * Ensures the necessary directory hierarchy of file exists
	 * 
	 * @param file an object of class {@linkplain File}
	 */
	public static synchronized void setUpDirectoryHierarchy(File file) {

		File parent = file.getParentFile();

		if (!parent.exists()) {
			if (!parent.mkdirs()) {
				throw new IllegalStateException("Set up of " + file + " directory hierarchy failed");
			} else {
				file.setWritable(true);
				file.setReadable(true);
			}
		}

	}

	/**
	 * Ensures the necessary directory hierarchy of the file that represents
	 * filename exists
	 * 
	 * @param filename the absolute path to a file
	 */
	public static synchronized void setUpDirectoryHierarchy(String filename) {
		File file = new File(filename);
		setUpDirectoryHierarchy(file);
	}
}
