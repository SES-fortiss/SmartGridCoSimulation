/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution. 
 */

package arduinoEthernet;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ArduinoSender {
	
	//Logger logger = LoggerFactory.getLogger(ArduinoSender.class);
	
	Socket clientSocket;
	
    private OutputStream output;	
		
	public ArduinoSender(Socket clientSocket) {
		this.clientSocket = clientSocket;
		try {
			this.output = clientSocket.getOutputStream();				
		} catch (IOException e) {
			System.out.println("OutputStream not established.");
			e.printStackTrace();
		}
	}
	
	public boolean send(String str) throws IOException{
		byte[] byteStream = str.getBytes();		
		output.write(byteStream);
		return true;
	}
	
	public void close(){
		try {
			output.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
