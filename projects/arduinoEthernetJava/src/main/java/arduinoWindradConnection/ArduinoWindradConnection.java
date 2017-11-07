/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution. 
 */

package arduinoWindradConnection;

import java.io.IOException;

import com.google.gson.Gson;

import arduinoEthernet.ArduinoConnection;

public class ArduinoWindradConnection implements Runnable{
	
	//static Logger logger = LoggerFactory.getLogger(ArduinoWindradConnection.class);
	
	String address = "192.168.1.172";
	int port = 80;

	public ArduinoConnection arduinoConnection;
	public double windPower = 0.0;

	@Override
	public void run() {
		Gson g = new Gson();
		while(true){ // soll auf jeden Fall versuchen eine Verbindung herzustellen, auch wenn Sie abbricht
					
			arduinoConnection = new ArduinoConnection();			
			arduinoConnection.connect(address, port);
			
			while (arduinoConnection.isConnected()) {						
				WindradRequestArduino wm = new WindradRequestArduino();
				wm.windPower = windPower;
				String message = g.toJson(wm);
				try {
					//System.out.println("Send WindradRequest: " + message);
					arduinoConnection.connected = arduinoConnection.sender.send(message);
					Thread.sleep(1000);
				} catch (InterruptedException | IOException e) {
					arduinoConnection.connected = false;
				}
			}
		}		
	}
	
	/*
	 * Liefert das JSON zurück, welches nur den Status der Windanlage betrifft
	 */
	public String getMessage(){
		
		String result = null;
		
		if (arduinoConnection.listner != null){
			result = arduinoConnection.listner.lastMessage;
			Gson g = new Gson();
			WindradAnswerPi waa = g.fromJson(result, WindradAnswerPi.class);
			waa.type = "wind";			
			result = g.toJson(waa);
		}
		
		return result;
	}
	
	public void setPower(double power){
		this.windPower = power;
	}
}
