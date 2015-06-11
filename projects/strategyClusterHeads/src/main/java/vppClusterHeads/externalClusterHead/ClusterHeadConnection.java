/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package vppClusterHeads.externalClusterHead;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class ClusterHeadConnection {
	
    URL url;
    URLConnection urlconn;
    int timeout = 1000; // in ms
    
    public ClusterHeadConnection() throws IOException{
    	//url = new URL("http://localhost:8080/");
    	url = new URL("http://192.168.1.22:8080/");
    	urlconn = url.openConnection();
    	urlconn.setConnectTimeout(timeout);
    }
	
	public String readValues() throws IOException {
		
		url = new URL("http://192.168.1.22:8080/");
    	urlconn = url.openConnection();
    	urlconn.setConnectTimeout(timeout);
		
		InputStreamReader isr = new InputStreamReader(urlconn.getInputStream());		
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
