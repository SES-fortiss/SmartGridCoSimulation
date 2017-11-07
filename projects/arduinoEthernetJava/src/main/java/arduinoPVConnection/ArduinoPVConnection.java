/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution. 
 */

package arduinoPVConnection;

import java.io.IOException;

import com.google.gson.Gson;

import arduinoEthernet.ArduinoConnection;

public class ArduinoPVConnection implements Runnable{
	
	//static Logger logger = LoggerFactory.getLogger(ArduinoPVConnection.class);
	
	String address = "192.168.1.171";
	int port = 80;
	public ArduinoConnection arduinoConnection;	
	
	double solarIntensity = 0.0; 

	@Override
	public void run() {
		Gson g = new Gson();

		while(true){ // soll auf jeden Fall versuchen eine Verbindung herzustellen, auch wenn Sie abbricht
					
			arduinoConnection = new ArduinoConnection();
			arduinoConnection.connect(address, port);
			
			while (arduinoConnection.isConnected()) {						
				PVRequest pv = new PVRequest();
				pv.solarIntensity = this.solarIntensity;				
				String message = g.toJson(pv);			
	
				try {
					//System.out.println("Send PVRequest: " + message);				
					arduinoConnection.sender.send(message);
					Thread.sleep(1000);
				} catch (InterruptedException | IOException e) {
					arduinoConnection.connected = false;
					e.printStackTrace();
				}
			}			
		}
		
	}
	
	/*
	 * Liefert das JSON zurück, welches nur den Status der PV Anlage betrifft
	 */
	public String getMessage(){
		String result = null;
		
		if (arduinoConnection.listner != null){
			result = arduinoConnection.listner.lastMessage;						
			Gson g = new Gson();
			PVAnswer answer = g.fromJson(result, PVAnswer.class);
			answer.type = "solar";
			result = g.toJson(answer);
		};
		
		return result;
	}
	
	public void setPower(double power){
		this.solarIntensity = power;
	}
}