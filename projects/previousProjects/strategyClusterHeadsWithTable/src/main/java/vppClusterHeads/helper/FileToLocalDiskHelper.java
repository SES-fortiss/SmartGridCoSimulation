/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package vppClusterHeads.helper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import vppClusterHeads.Topology;

public class FileToLocalDiskHelper {
	
	/**
	 * This method prints the Results as a JSON file
	 */
	public static void printJsonFile(String input, String fileName) {
		
		String fs = System.getProperty("file.separator");				
		File homedir = new File(System.getProperty("user.home"));
		File filedir = new File(homedir, "sessim" + fs + Topology.simulationName + fs);
		File file = new File(filedir, fileName);
		
		try {
			
			filedir.mkdirs();
			FileWriter writer = new FileWriter(file);
			writer.write(input);
			writer.close();
			
			//System.out.println("File created: " + file);
	 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void printFileToWWW(String input) {
		
		String fs = System.getProperty("file.separator");				
		File homedir = new File(System.getProperty("user.home"));
		File filedir = new File(homedir, "/Documents/www" + fs);
		File file = new File(filedir, "data.txt");
		
		try {
			
			filedir.mkdirs();
			FileWriter writer = new FileWriter(file);
			writer.write(input);
			writer.close();
			
			//System.out.println("File created: " + file);
	 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
