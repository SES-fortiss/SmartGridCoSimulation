package org.fortiss.strategy.demonstrator.external;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Connector {
	
	URL url;
	URLConnection urlconn;
	
	int timeout = 1000;
	
	public Connector() throws IOException{
		url = new URL("http://localhost:8080/");
		urlconn = url.openConnection();
		urlconn.setConnectTimeout(timeout);
	}
	
	public void readMessage() throws IOException{
		url = new URL("http://localhost:8080/");
		
		//url = new URL("http://www.december.com/html/tutor/hello.html");		
		
		urlconn = url.openConnection();
		urlconn.setConnectTimeout(timeout);
		
		InputStreamReader isr = new InputStreamReader(urlconn.getInputStream());
		
		String inputLine;
		String result = "";
		BufferedReader in = new BufferedReader(isr);
		while ((inputLine = in.readLine()) != null) {
			result += inputLine;
		}
		
		in.close();
		System.out.println(result);
	}

}
