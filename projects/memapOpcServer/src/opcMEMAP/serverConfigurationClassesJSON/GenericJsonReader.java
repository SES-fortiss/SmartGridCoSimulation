package opcMEMAP.serverConfigurationClassesJSON;

import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.Stack;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;

import opcMEMAP.ConfigInterface;

/**
 * 
 * Zuständing für die Konvertierung von einem Objekt in einer JSON Repräsentation.
 * Aktuell ist die Idee, dass beliebige Objekte auf Ordner (Folder) gemappt werden,
 * während die Datenpunkte (String, Double, Boolean) auf "WerteNodes" des OPCUA.
 * 
 * @author bytschkow
 */

public class GenericJsonReader {
	
	public static ConfigInterface createConfigFromString(String in) throws IOException {
		JsonReader reader = new JsonReader(new StringReader(in));		
		return createConfig(reader);
	}
	
	public static ConfigInterface createConfigFromFile(String filePath) throws IOException {
		JsonReader reader = new JsonReader(new FileReader(filePath));		
		return createConfig(reader);
	}
	
	public static ConfigInterface createConfig(JsonReader reader) throws IOException {						
		ConfigInterface result = new ConfigInterface();

		// getReferences to the lists, there are two: folders and variables
		List<MyFolderNode> folderNodeList = result.getFolderNodeList();
		List<MyVariableNode> variableNodeList = result.getVariableNodeList();
		
		MyFolderNode lastFolderNode = null;
		MyVariableNode variableNode = null;
		
		Stack<String> nameStack = new Stack<String>();
		Stack<String> parentStack = new Stack<String>();
		Stack<Boolean> arrayStack = new Stack<Boolean>();
		Stack<Integer> arrayIndexStack = new Stack<Integer>();
		
		nameStack.push("MEMAP-Interface");
		parentStack.push("");
		arrayStack.push(false);
		arrayIndexStack.push(0);
		
        while (true) {
            JsonToken token = reader.peek();
            
            /*
            if (!token.equals(JsonToken.END_DOCUMENT)) {			
                System.out.println();
                System.out.println(token);
            	System.out.println("arrayIndexStack.peek(): " + arrayIndexStack.peek() + " size: " + arrayIndexStack.size());
            	System.out.println("arrayStack.peek(): " + arrayStack.peek() + " size: " + arrayStack.size());  
                System.out.println("nameStack.peek(): " + nameStack.peek() + " size: " + nameStack.size());
                System.out.println("parentStack.peek(): " + parentStack.peek() + " size: " + parentStack.size());            	
			} 
			*/
            
            switch (token) {           
            
            case BEGIN_OBJECT:
                reader.beginObject();
                Boolean objectIsPartOfArray = arrayStack.peek();                
                
                String buffer = null;
            	buffer = nameStack.peek();
                
                if (objectIsPartOfArray) {
        			//buffer = parentStack.peek() + arrayIndex;
                	int value = arrayIndexStack.peek();	
                	
                	buffer = parentStack.peek() + value;
                	nameStack.push(buffer);

	            	value++;
	            	arrayIndexStack.pop();
	            	arrayIndexStack.push(value);
                	
                	
				} else {
					buffer = parentStack.peek() + buffer;
				}
                
                parentStack.push(buffer+"/");
                
                lastFolderNode = new MyFolderNode();
                lastFolderNode.description = buffer;
                lastFolderNode.displayName = buffer;
                lastFolderNode.namespace = result.getNamespace();
                lastFolderNode.nodeID = buffer;                
                
                folderNodeList.add(lastFolderNode);                
                //System.out.println("new Folder: " + buffer + "/");                
                
                arrayStack.push(false);
                break;
                
            case END_OBJECT:
            	reader.endObject();
                nameStack.pop();
                parentStack.pop();
                arrayStack.pop();
                //System.out.println("END OBJECT");
                break;
            
            case BEGIN_ARRAY:
                reader.beginArray(); // "["            	
            	arrayStack.push(true);
            	
            	arrayIndexStack.push(0);

                String bufferArray = nameStack.peek();
               
                if (!parentStack.empty()) {
            	   bufferArray = parentStack.peek() + bufferArray;
				}
                
                parentStack.push(bufferArray+"/");
               
				lastFolderNode = new MyFolderNode();
				lastFolderNode.description = bufferArray;
				lastFolderNode.displayName = bufferArray;
				lastFolderNode.namespace = result.getNamespace();
				lastFolderNode.nodeID = bufferArray;
				               
				folderNodeList.add(lastFolderNode);
				//System.out.println("new Folder: " + bufferArray + "/");
				
                break;
                
            case END_ARRAY:          
                reader.endArray();  // "]"
                nameStack.pop();
                parentStack.pop();
                arrayStack.pop();                
                arrayIndexStack.pop();
                break;
                
            case NAME:
            	String nextName = reader.nextName();
                nameStack.push(nextName);
                //System.out.println("new name: " + nextName);
                break;
                
            case STRING:
                String stringValue = reader.nextString();
                Boolean arrayString = arrayStack.peek();

                {
		            String nameString = null;
		            
		            if (arrayString) {		            	
		            	int value = arrayIndexStack.peek();		            	
		            	nameString = nameStack.peek() + value;
		            	value++;
		            	arrayIndexStack.pop();
		            	arrayIndexStack.push(value);
		            	
		    		} else {
		    			nameString = nameStack.pop();
		    		}
		
		            variableNode = new MyVariableNode();
		            
		            variableNode.value = stringValue;
		            variableNode.datatype = "String";
		            variableNode = configRemainingOfNode(result, variableNode, nameString, parentStack.peek());
		            	
		            variableNodeList.add(variableNode);
		            //System.out.println("new Variable: " + nameString + " = " + stringValue);
                }
                
                break;
                
            case NUMBER:
                String number = reader.nextString();   
                Boolean arrayNumber = arrayStack.peek();
                
                {
		            String name = null;
		            
		            if (arrayNumber) {
		            	int value = arrayIndexStack.peek();		            	
		            	name = nameStack.peek() + value;
		            	value++;
		            	arrayIndexStack.pop();
		            	arrayIndexStack.push(value);
		    		} else {
		    			name = nameStack.pop();
		    		}
		
		            variableNode = new MyVariableNode(); 
		            	
		            variableNode.value = number;
		            variableNode.datatype = "Double";
		            	
		            variableNode = configRemainingOfNode(result, variableNode, name, parentStack.peek());
		            	
		            variableNodeList.add(variableNode);
		            //System.out.println("new Variable: " + name + " = " + number);
                }
                break;
                
            case BOOLEAN:
                boolean b = reader.nextBoolean();
                Boolean arrayBoolean = arrayStack.peek();
            	
                {                
                	String name = null;
		            
		            if (arrayBoolean) {
		            	int value = arrayIndexStack.peek();		            	
		            	name = nameStack.peek() + value;
		            	value++;
		            	arrayIndexStack.pop();
		            	arrayIndexStack.push(value);
		            	
		    		} else {
		    			name = nameStack.pop();
		    		}
		
		            variableNode = new MyVariableNode(); 	
		        	
		        	variableNode.value = ""+b;
		        	variableNode.datatype = "Boolean";
		        	
		        	variableNode = configRemainingOfNode(result, variableNode, name, parentStack.peek());
		        	
		        	variableNodeList.add(variableNode);
                }
                break;
                
            case NULL:
                reader.nextNull();
                nameStack.pop();                
                break;
                
            case END_DOCUMENT:
            	reader.close();
                return result;
            }
        }		
	}

	private static MyVariableNode configRemainingOfNode(ConfigInterface result, MyVariableNode variableNode, String name, String parent) {		
		variableNode.accesslevel = "READ_WRITE";		
		variableNode.description = name;
		variableNode.displayName = name;
		variableNode.historizing = true;
		variableNode.nameSpace = result.getNamespace();
		variableNode.nodeID = parent+name;
		variableNode.parentFolder = parent;
		variableNode.samplingInterval = result.getMinSamplingInterval();
		variableNode.userAccessLevel = "READ_WRITE";
		
		//System.out.println(variableNode.samplingInterval);
		
		String test = name.replace(parent, "");
		variableNode.description = test;
		variableNode.displayName = test;
		
		return variableNode;
	}
}
