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
import java.net.InetSocketAddress;
import java.net.Socket;

public class ArduinoConnection {
	
	public Socket socket = new Socket();
	public ArduinoListner listner;
	public ArduinoSender sender;
	public boolean connected = false;
	
	String address = "";
	int port = 0;
	
	public boolean isConnected(){
		return connected;
	}

	public void connect(String address, int port){
		/*
		 * Einmalige Aktion 
		 */		
		
		if (!socket.isConnected()) {
			System.out.println("Arduino not connected - try to connect");
			socket = new Socket();
		}
		
		this.address = address;
		this.port = port; 
		
		try {
			socket.connect(new InetSocketAddress(address, port), 1000);
			sender = new ArduinoSender(socket);
			listner = new ArduinoListner(socket);
			new Thread(listner).start();			
			connected = true;
		} catch (IOException e) {
			connected = false;
			//e.printStackTrace();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			return;
		}
		System.out.println("Connected to " + address);
	}
}
