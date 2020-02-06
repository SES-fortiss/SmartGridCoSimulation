/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution. 
 */

package arduinoBatteryConnection;

import java.io.IOException;

import com.google.gson.Gson;

import arduinoEthernet.ArduinoConnection;

public class ArduinoBatteryConnection implements Runnable {
	
	//static Logger logger = LoggerFactory.getLogger(ArduinoBatteryConnection.class);
	
	public String address = "192.168.1.173";
	public int port = 80;
	public ArduinoConnection arduinoConnection;
	
	double chargeRate = 0;

	@Override
	public void run() {
		Gson g = new Gson();

		while(true){ // soll auf jeden Fall versuchen eine Verbindung herzustellen, auch wenn Sie abbricht
					
			arduinoConnection = new ArduinoConnection();			
			arduinoConnection.connect(address, port);
			
			while (arduinoConnection.isConnected()) {
				BatteryRequestArduino bm = new BatteryRequestArduino();				
				
				bm.socFlag = 0; // zum testen
				bm.soc = 0.0;
				bm.chargeFlag = 0;
				bm.dischargeRate = 0.0;
				bm.chargeRate = 0.0;
				
				if (this.chargeRate != 0.0){
					
					if(this.chargeRate > 0) {
						bm.chargeRate = this.chargeRate;
						bm.chargeFlag = 1;
					}
					if(this.chargeRate < 0) {
						bm.chargeFlag = -1;
						bm.dischargeRate = -1.0*this.chargeRate;
					}
				}
				
				String message = g.toJson(bm);
				//System.out.println(message);
				
				try {
					arduinoConnection.connected = arduinoConnection.sender.send(message);
					Thread.sleep(1000);
				} catch (InterruptedException | IOException e) {
					arduinoConnection.connected = false;
					e.printStackTrace();
				}
			}			
		}		
		
	}
	
	/*
	 * Liefert das JSON zurück, welches nur den Status der Batterie Anlage betrifft
	 */
	public String getMessage(){		
		String result = null;
		
		if (arduinoConnection.listner != null){
			result = arduinoConnection.listner.lastMessage;
			Gson g = new Gson();
			BatteryAnswerArduino answer = g.fromJson(result, BatteryAnswerArduino.class);
			answer.type = "battery";
			result = g.toJson(answer);
		};
		
		return result;
	}
	
	public void setPower(double power){	
		this.chargeRate = power;
	}
}
