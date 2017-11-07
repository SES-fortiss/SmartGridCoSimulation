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

import arduinoPVConnection.ArduinoPVConnection;

/**  
 * Diese Klasse stellt die Verbindung zum Arduino her. 
 * Sie stellt diese Daten als JSON-String anderen Klassen wieder zur Verfügung.
 * 
 * @author Denis Bytschkow
 */
public class DataCollectorSolar implements DataCollectorInterface {
	
	ArduinoPVConnection connection = new ArduinoPVConnection();
	
	public DataCollectorSolar(){
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
		
		if (query != null && query.contains("solar")){
			
			String controlString = query.replace("solar=", "");			
			double setValue = 0.0;
			try {
				setValue = Double.parseDouble(controlString);
				if (setValue >= 1.0) setValue = 1.0;
				if (setValue <= 0.0) setValue = 0.0;
							
				connection.setPower(setValue);
				result = getStatus() + "\n\nneuer Sollwert Solar = "+setValue;
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
		String result = connection.getMessage(); 
		result = result.replace("brightness", "targetValue");
		result = result.replace("strom", "currentValue");
		return result;
	}

	private String getHeader() {		
		return "Willkommen, Sie rufen die REST API des RaspberryPI auf. \n\n"
				+ "Der RaspberryPI stellt die Verbindung zum entsprechenden Arduino her --> HIER die Solaranlage. \n\n"
				+ "Die Nutzung:\n"
				+ "192.168.1.161 --> liefert diese Nachricht\n"
				+ "192.168.1.161/status --> liefert den Status als reines JSON\n"
				+ "192.168.1.161/?solar=0.5 --> Query leitet Sollwert an PV weiter. Erlaubte Werte 0.0 ... 1.0\n\n"
				+ "STATUS:\n";
	}
}
