package linprogMPC.helperOPCua;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

import akka.basicMessages.AnswerContent;
import akka.basicMessages.RequestContent;
import helper.IoHelper;
import linprogMPC.helper.DirectoryConfiguration;

public class OpcServerContextGenerator {
	
	public static Gson gson = new Gson();
	
	public static void generateJson(String actorName, AnswerContent content) {
				
		String result = gson.toJson(content);		
		writeFile(actorName, result);
		
	}
	
	public static void generateJson2(String actorName, RequestContent content) {
		
		String result = gson.toJson(content);		
		writeFile(actorName, result);
		
	}

	private static void writeFile(String filename, String result) {		
		String source = "/" + DirectoryConfiguration.mainDir + "/" + DirectoryConfiguration.configDir + "/" + filename + ".json";
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

class Test {
	String name;
	AnswerContent content;
	
	Test(String str, AnswerContent con){
		name = str;
		content = con;
	}
}