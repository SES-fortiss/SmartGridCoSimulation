package linprogMPC.websocket;

import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.JsonException;
import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;

public class StringToJsonArray extends JsonArray {
	//Transfer String to JsonArray
public JsonArray StringToJsonArray(String input) {
	JsonArray output=new JsonArray();
	
	String[] messageArray=input.split("\\},"); 	
    for (int i=0; i < messageArray.length -1;i++) {
    	messageArray[i]=messageArray[i]+"}";	
    }
	

	
	//Transfer Strings to Jsons. 
    //messageJsonArray is of JsonArray format
    for (int i = 0; i < messageArray.length; i++) {
		try {
			JsonObject messageJson = (JsonObject) Jsoner.deserialize(messageArray[i]);
			output.add(messageJson);
		} catch (JsonException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    return output;
}
}






















//Websocket can only surpass Strings. Hence, message is of type String.
//In our case the message consists of a String representing the surpassed JsonArray Therefore, we need to split it first.

	/*
String[] messageArray=message.split("\\},"); 	
for (int i=0; i < messageArray.length -1;i++) {
	messageArray[i]=messageArray[i]+"}";	
}



//Transfer Strings to Jsons. 
//messageJsonArray is of JsonArray format
JsonArray messageJsonArray = new JsonArray();
for (int i = 0; i < messageArray.length; i++) {
	try {
		JsonObject messageJson = (JsonObject) Jsoner.deserialize(messageArray[i]);
		messageJsonArray.add(messageJson);
	} catch (JsonException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
*/