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
import java.io.InputStream;
import java.net.Socket;

public class ArduinoListner implements Runnable {
	
	//Logger logger = LoggerFactory.getLogger(ArduinoListner.class);
	
	Socket clientSocket;	
    private InputStream input;
    public String lastMessage = "";
    public String actualMessage = "";
	
	boolean running = false;	

	public ArduinoListner(Socket clientSocket) {
		this.clientSocket = clientSocket;
	}

	public void run() {
		running = true;		
		try {
			this.input = clientSocket.getInputStream();
		} catch (IOException e) {
			System.out.println("InputStream not established.");
			e.printStackTrace();
		}
		
		byte b = 0;
		while (running) {
			try {
				b = (byte) input.read();
			} catch (IOException e) {
				e.printStackTrace();
				close();
			}
			
			if (b == 10) { // 10 ist ein linebreak?
				lastMessage = actualMessage;
				//System.out.println(lastMessage);
				actualMessage = "";
			} else {
				actualMessage += (char)b;
			}
		}
	}
	
    public void close() {
        running = false;
        if (clientSocket != null) {
            try {
				input.close();
	            clientSocket.close();
	            //logger.info("Ethernet communication closed");
			} catch (IOException e) {
				//logger.error("Failed to close the ethernet connection");
				e.printStackTrace();
			}
        }
    }
}
