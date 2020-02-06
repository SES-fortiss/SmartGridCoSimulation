/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution. 
 */

package piWebServer.collector;

import javax.servlet.http.HttpServletRequest;

import arduinoBatteryConnection.ArduinoBatteryConnection;

/**  
 * Diese Klasse stellt die Verbindung zum Arduino her. 
 * Sie stellt diese Daten als JSON-String anderen Klassen wieder zur Verfügung.
 * 
 * @author Denis Bytschkow
 */
public class DataCollectorBattery implements DataCollectorInterface {
	
	ArduinoBatteryConnection connection = new ArduinoBatteryConnection();
	
	public DataCollectorBattery(){
		new Thread(connection).start();
	}

	public String generateMessage(HttpServletRequest request){	
		String result = "";
		result = getAll();
		
		String path = request.getPathInfo();			
		String query = request.getQueryString();
		
		if (path.contains("status")){
			result = getStatus();
		}
		
		if (query != null && query.contains("battery")){
			
			String controlString = query.replace("battery=", "");			
			double setValue = 0.0;
			try {
				setValue = Double.parseDouble(controlString);
				if (setValue > 1.0) setValue = 1.0;
				if (setValue < -1.0) setValue = -1.0;
							
				connection.setPower(setValue);
				result = getStatus() + "\n\nneuer Sollwert Batterie = "+setValue;
				System.out.println("query: " + query + "  --> gefilterter Wert: " +setValue);
				
			} catch (Exception e) {
				result = getFehlerMeldung();
				System.err.println("\nAchtung kann input nicht in Wert konvertieren, setze Wert = 0.0\n");
			}
			
		} else {
			if (query != null) result = getFehlerMeldung();
		}
			
		return result;
	}
	
	public String getAll(){
		String result = getHeader();
		result += getStatus();
		return result;
	}
	
	public String getStatus(){
		return connection.getMessage();
	}

	private String getHeader() {		
		return "Willkommen, Sie rufen die REST API des RaspberryPI auf. \n\n"
				+ "Der RaspberryPI stellt die Verbindung zum entsprechenden Arduino her --> HIER die Batterie. \n\n"
				+ "Die Nutzung:\n"
				+ "192.168.1.163 --> liefert diese Nachricht\n"
				+ "192.168.1.163/status --> liefert den Status als reines JSON\n"
				+ "192.168.1.163/?battery=0.5 --> Query leitet Sollwert an Batterie weiter. Erlaubte Werte -1.0 ... 1.0\n\n"
				+ "STATUS:\n";
	}
}
