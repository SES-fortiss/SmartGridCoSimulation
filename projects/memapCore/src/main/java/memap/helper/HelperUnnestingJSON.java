package memap.helper;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.JsonObject;
import com.google.gson.Gson;

public class HelperUnnestingJSON {

	protected static Gson gson = new Gson();
	
	/**
	 * Reduce JSON generated from MEMAP data model
	 * @param int deviceNumber 
	 * @param JsonObject device
	 * 
	 * @author Jan.Mayer
	 *
	 */
	
	public static JsonObject unnestJsonObj(int deviceNumber, JsonObject device) {
		
		Map<String, Object> allnodes = new HashMap<String, Object>(); // to collect all buried NodeIDs
		
		String devKey = Integer.toString(deviceNumber+1);
		JsonArray readDevice = (JsonArray) device.get(devKey);
		goThroughArray(allnodes, readDevice);

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
    
}