package memap.websocket;

import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.JsonException;
import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;

/**
 * 
 * Parses a JsonArray in Form of a String to JsonArray type.
 * MethodStringToJsonArray has String of "JsonArray" form as input and outputs
 * data of JsonArray type.
 * 
 * @author freiesleben
 * 
 */

public abstract class StringToJsonArray extends JsonArray {

	private static final long serialVersionUID = 1L;

	public static JsonArray convertStringToJsonArray(String input) {

		JsonArray output = new JsonArray();
		// This part is not any elegant, different solution would be appreciated but
		// wasnt found.
		String[] messageArray = input.split("\\}!");
		for (int i = 0; i < messageArray.length - 1; i++) {
			messageArray[i] = messageArray[i] + "}";
		}

		// Transfer Strings in String Array to Jsons.
		// messageJsonArray is of JsonArray format
		for (int i = 0; i < messageArray.length; i++) {
			try {
				JsonObject messageJson = (JsonObject) Jsoner.deserialize(messageArray[i]);
				output.add(messageJson);
			} catch (JsonException e) {
				e.printStackTrace();
				System.out.println("Input could not be deserialized. Please input a String of form JsonArray.");
			}
		}
		return output;
	}
}

//Websocket can only surpass Strings. Hence, message is of type String.
//In our case the message consists of a String representing the surpassed JsonArray Therefore, we need to split it first.

/*
 * String[] messageArray=message.split("\\},"); for (int i=0; i <
 * messageArray.length -1;i++) { messageArray[i]=messageArray[i]+"}"; }
 * 
 * 
 * 
 * //Transfer Strings to Jsons. //messageJsonArray is of JsonArray format
 * JsonArray messageJsonArray = new JsonArray(); for (int i = 0; i <
 * messageArray.length; i++) { try { JsonObject messageJson = (JsonObject)
 * Jsoner.deserialize(messageArray[i]); messageJsonArray.add(messageJson); }
 * catch (JsonException e) { // TODO Auto-generated catch block
 * e.printStackTrace(); } }
 */