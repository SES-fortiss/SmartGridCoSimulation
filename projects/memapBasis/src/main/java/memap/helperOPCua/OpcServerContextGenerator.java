package memap.helperOPCua;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

import memap.helper.DirectoryConfiguration;

import akka.basicMessages.AnswerContent;
import helper.IoHelper;

/**
 * Writes a descriptor file for every building. 
 */
public class OpcServerContextGenerator {

	/** Main output directory path */
	private static String mainDir = DirectoryConfiguration.mainDir;
	/** Configuration directory path */
	private static String configDir = DirectoryConfiguration.configDir;

	public static void generateJson(String actorName, AnswerContent content) {
		Gson gson = new Gson();
		String result = gson.toJson(content);
		writeFile(actorName, result);
	}

	private static void writeFile(String filename, String result) {
		String source = "/" + mainDir + "/" + configDir + "/" + filename;
		String location = System.getProperty("user.dir");
		/*
		 * Note: location is the project directory from which the simulation was started
		 * or or the directory from which the .jar was executed.
		 */
		location = location + source + ".json";

		System.out.println("Try Filelocation: " + location);
		IoHelper.createParentFolders(location);
		File file = new File(location);

		BufferedWriter writer;
		try {
			if (!file.exists()) {
				file.createNewFile();
			}
			writer = new BufferedWriter(new FileWriter(file));
			writer.write(result);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}