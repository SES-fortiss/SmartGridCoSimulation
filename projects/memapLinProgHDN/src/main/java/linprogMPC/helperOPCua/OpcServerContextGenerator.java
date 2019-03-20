package linprogMPC.helperOPCua;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

import akka.basicMessages.AnswerContent;
import helper.IoHelper;

public class OpcServerContextGenerator {
	
	public static Gson gson = new Gson();
	
	public static void generateJson(String actorName, AnswerContent content) {
				
		String result = gson.toJson(content);		
		writeFile(actorName, result);
		
	}

	private static void writeFile(String filename, String result) {		
		String source = "res/opcconfig/" + filename;
		String location = OpcServerContextGenerator.class.getProtectionDomain().getCodeSource().getLocation().getPath();
		location = location.replace("%20", " ");
		location = location.substring(0, location.length() - 15);
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

class Test {
	String name;
	AnswerContent content;
	
	Test(String str, AnswerContent con){
		name = str;
		content = con;
	}
}