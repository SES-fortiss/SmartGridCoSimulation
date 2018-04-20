/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package vppClusterHeads.helper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class SenderToLivingLabWebsite {
	
	static URL connection;
	static String basicURL = "http://livinglab.fortiss.org/projects/wissenschaftstage/save.php?save=";
	
	public static void send(String string){
		try {
			
			connection = new URL(basicURL + string);
			connection.openConnection();
			
			System.out.println(basicURL + string);
			System.out.println(string);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String writeValues(String string) throws IOException {
		connection = new URL(basicURL + string);		
        InputStreamReader isr = new InputStreamReader(connection.openStream());            
        String inputLine;
        String result = null;          
        BufferedReader in = new BufferedReader(isr);
        	
        while ((inputLine = in.readLine()) != null) {
        		result = inputLine;
        }        	
        in.close();  
        
		return result;
    }
	

}
