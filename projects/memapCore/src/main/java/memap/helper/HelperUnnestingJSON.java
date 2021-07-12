package memap.helper;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.JsonException;
import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;
import com.google.gson.Gson;

import memap.helper.JsonExportHelper.EndpointJsonHelper;

public class HelperUnnestingJSON {

	protected static Gson gson = new Gson();
	
	/**
	 * Reduce JSON generated from MEMAP data model
	 * @param int deviceNumber 
	 * @param JsonObject device
	 * 
	 * @author JanAxelMayer
	 *
	 */
	
	public static JsonObject unnestJsonObj(int deviceNumber, JsonObject device) {
		
		Map<String, Object> allnodes = new HashMap<String, Object>(); // to collect all buried NodeIDs
		
		String devKey = Integer.toString(deviceNumber+1);
		if (device.get(devKey) instanceof JsonArray) {
			JsonArray readDevice = (JsonArray) device.get(devKey);
			goThroughArray(allnodes, readDevice);
		} else if (device.get(devKey) instanceof JsonObject) {
			JsonObject readDevice = (JsonObject) device.get(devKey);
			addSubEntriesToMap(allnodes, readDevice);
		}
		

		return new JsonObject(allnodes);
	}
	
	public static JsonObject unnestJsonAry(JsonArray readDevice) {
		
		Map<String, Object> allnodes = new HashMap<String, Object>(); // to collect all buried NodeIDs
		goThroughArray(allnodes, readDevice);
		
		return new JsonObject(allnodes);
	}
	
	
    public static void addSubEntriesToMap(Map<String, Object> map, JsonObject jsonobj) {
        
        Iterator<Entry<String, Object>> keys = jsonobj.entrySet().iterator();
        
        while(keys.hasNext()) {
        	Map.Entry<String,Object> key = (Map.Entry<String,Object>) keys.next();
            Object value = key.getValue();
            
            if (value instanceof JsonArray) {
                goThroughArray(map, (JsonArray) value);
            } else if (value instanceof JsonObject) {
                addSubEntriesToMap(map, (JsonObject) value);
            } else if (value instanceof String) {
            	map.put((String) key.getKey(), value);
            }
        }   
        return;
    }
    
    
    public static void goThroughArray(Map<String, Object> map, JsonArray array) {
    	
    	for (int i = 0; i < array.size(); i++ ) { 
			JsonObject subInfo = (JsonObject) array.get(i);
			addSubEntriesToMap(map, subInfo);
    	}
    	return;
    }
    
    public static JsonArray checkForMultipleBuildingEndpoints(JsonArray endpoints) {
    	
		for (int i = 0; i < endpoints.size(); i++) {
			JsonObject oldEndpoint = (JsonObject) endpoints.get(i);
			JsonObject configTest = (JsonObject) oldEndpoint.get("config");
			if (configTest.size() > 1) {
				System.out.println(">> " + configTest.size() + " EMS found under endpoint " + oldEndpoint.get("url"));
				int k = 0;
				for ( String EMSkey : configTest.keySet()) {
					EndpointJsonHelper ejh = new EndpointJsonHelper(k++, oldEndpoint, EMSkey, (JsonObject) configTest.get(EMSkey));
					try {
						JsonObject newEndpoint = (JsonObject) Jsoner.deserialize(gson.toJson(ejh));
						endpoints.add(newEndpoint);
					} catch (JsonException e) {
						e.printStackTrace();
					}
					
				}
				endpoints.remove(i);
			}	
		}
    	
    	return endpoints;
    }
    
    
}