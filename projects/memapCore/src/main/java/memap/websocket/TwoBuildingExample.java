package memap.websocket;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class TwoBuildingExample {
	
	public static void main(String[] args) {
		
		System.out.println("Working Directory = " + System.getProperty("user.dir"));
		
		String file = "src/main/resources/examples/2HOUSES_COSES_wConn.json";
		String json = null;
		try {
			json = readFileAsString(file);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		OkHttpClient client = new OkHttpClient();
	
		MediaType mediaType = MediaType.parse("text/plain");
		RequestBody body = RequestBody.create(mediaType, json);
		Request request = new Request.Builder()
		  .url("http://localhost:8013/memap/message")
		  .post(body)
		  .addHeader("cache-control", "no-cache")
		  .build();
	
		String output = null;
		
		try {
			Response response = client.newCall(request).execute();
			output = response.toString();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		System.out.println(output);
	}
	
	public static String readFileAsString(String file)throws Exception
    {
        return new String(Files.readAllBytes(Paths.get(file)));
    }
}
