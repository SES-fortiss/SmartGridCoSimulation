package memap.helperOPCua;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import com.google.gson.Gson;

import helper.IoHelper;
import memap.helper.DirectoryConfiguration;
import memap.messages.BuildingMessage;
import memap.messages.OptimizationResultMessage;

public class OpcServerContextGenerator {

	public static Gson gson = new Gson();

	public static void generateJson(String actorName, ArrayList<Object> list) {
		String result = gson.toJson(list);
		writeFile(actorName, result);
	}
	
	public static void generateJson(String actorName, BuildingMessage bmsg) {
		String result = gson.toJson(bmsg);
		writeFile(actorName, result);
	}
	
	public static void generateJson2(String actorName, OptimizationResultMessage optResult) {
		String result = gson.toJson(optResult);
		writeFile(actorName, result);
	}

	
	// TODO adapt the output folder
	private static void writeFile(String filename, String result) {
		String source = "/" + DirectoryConfiguration.mainDir + "/" + DirectoryConfiguration.configDir + "/" + filename
				+ ".json";
		String location = System.getProperty("user.dir");
		location = location + source;

		System.out.println("Try file location: " + location);
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