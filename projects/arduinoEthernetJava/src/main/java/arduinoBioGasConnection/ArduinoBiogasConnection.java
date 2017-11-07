/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution. 
 */

package arduinoBioGasConnection;

import java.io.IOException;

import com.google.gson.Gson;

import arduinoEthernet.ArduinoConnection;

public class ArduinoBiogasConnection implements Runnable{
	
	//static Logger logger = LoggerFactory.getLogger(ArduinoBiogasConnection.class);
	
	String address = "192.168.1.174";
	int port = 80;
	public ArduinoConnection arduinoConnection;
	
	private double sollWert = 1;

	@Override
	public void run() {
		Gson g = new Gson();

		while(true){ // soll auf jeden Fall versuchen eine Verbindung herzustellen, auch wenn Sie abbricht
					
			arduinoConnection = new ArduinoConnection();
			arduinoConnection.connect(address, port);
			
			while (arduinoConnection.isConnected()) {						
				BiogasRequest request = new BiogasRequest();
				request.sollWert = this.sollWert;				
				String message = g.toJson(request);			
	
				try {
					//System.out.println("senden:   " + message);				
					arduinoConnection.sender.send(message);
					Thread.sleep(1000);
				} catch (InterruptedException | IOException e) {
					arduinoConnection.connected = false;
					e.printStackTrace();
				}
			}			
		}
		
	}

	public void setPower(double setValue) {
		this.sollWert = setValue;
		
	}

	public String getMessage() {
		String result = null;
		
		if (arduinoConnection.listner != null){
			result = arduinoConnection.listner.lastMessage;
			Gson g = new Gson();
			BiogasAnswer answer = g.fromJson(result, BiogasAnswer.class);
			answer.type = "biogas";
			result = g.toJson(answer);
		}
		return result;
	}
}