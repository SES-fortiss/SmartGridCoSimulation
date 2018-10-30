package opcMEMAP.serverConfigurationClassesJSON;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Stack;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;

public class GenericJsonReader {
	
	public static ServerJsonConfig readFileAndCreateConfig(String filePath) throws IOException {

		JsonReader reader = new JsonReader(new FileReader(filePath));
		
		ServerJsonConfig result = new ServerJsonConfig();

		// getReferences to the lists, there are two: folders and variables
		List<MyFolderNode> folderNodeList = result.getFolderNodeList();
		List<MyVariableNode> variableNodeList = result.getVariableNodeList();
		
		MyFolderNode lastFolderNode = null;
		MyVariableNode variableNode = null;
		
		Stack<String> nameStack = new Stack<String>();
		Stack<String> parentStack = new Stack<String>();
		Stack<Boolean> arrayStack = new Stack<Boolean>();
		
		nameStack.push("MEMAP-Interface");
		parentStack.push("");
		arrayStack.push(false);

		int arrayIndex = 0;
		
        while (true) {
            JsonToken token = reader.peek();
            
            if (!token.equals(JsonToken.END_DOCUMENT)) {			
                System.out.println();
                System.out.println("nameStack.peek(): " + nameStack.peek() + " size: " + nameStack.size());
                System.out.println("parentStack.peek(): " + parentStack.peek() + " size: " + parentStack.size());
                System.out.println("arrayStack.peek(): " + arrayStack.peek() + " size: " + arrayStack.size());
            	
			}           
            
            switch (token) {
            
            case BEGIN_OBJECT:
                reader.beginObject();
                Boolean objectIsPartOfArray = arrayStack.peek();                
                
                String buffer = null;
            	buffer = nameStack.peek();
                
                if (objectIsPartOfArray) {
        			buffer = parentStack.peek() + arrayIndex;
                	nameStack.push(buffer);
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
                System.out.println("new Folder: " + buffer + "/");                
                
                arrayStack.push(false);
                break;
                
            case END_OBJECT:
            	reader.endObject();
                nameStack.pop();
                parentStack.pop();
                arrayStack.pop();
                System.out.println("END OBJECT");
                break;
            
            case BEGIN_ARRAY:
                reader.beginArray(); // "["            	
            	arrayStack.push(true);

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
				System.out.println("new Folder: " + bufferArray + "/");
				
                break;
                
            case END_ARRAY:            	
                reader.endArray();  // "]"
                nameStack.pop();
                parentStack.pop();
                arrayStack.pop();
                arrayIndex = 0;
                System.out.println("END ARRAY");
                break;
                
            case NAME:
            	String nextName = reader.nextName();
                nameStack.push(nextName);
                System.out.println("new name: " + nextName);
                break;
                
            case STRING:
                String stringValue = reader.nextString();
                Boolean arrayString = arrayStack.peek();

                {
		            String nameString = null;
		            
		            if (arrayString) {
		            	nameString = nameStack.peek() + arrayIndex;
		            	arrayIndex++;
		    		} else {
		    			nameString = nameStack.pop();
		    		}
		
		            variableNode = new MyVariableNode();
		            
		            variableNode.value = stringValue;
		            variableNode.datatype = "String";
		            variableNode = configRemainingOfNode(result, variableNode, nameString, parentStack.peek());
		            	
		            variableNodeList.add(variableNode);
		            System.out.println("new Variable: " + nameString + " = " + stringValue);
                }
                
                break;
                
            case NUMBER:
                String number = reader.nextString();   
                Boolean arrayNumber = arrayStack.peek();
                
                {
		            String name = null;
		            
		            if (arrayNumber) {
		            	name = nameStack.peek() + arrayIndex;
		            	arrayIndex++;
		    		} else {
		    			name = nameStack.pop();
		    		}
		
		            variableNode = new MyVariableNode(); 
		            	
		            variableNode.value = number;
		            variableNode.datatype = "Double";
		            	
		            variableNode = configRemainingOfNode(result, variableNode, name, parentStack.peek());
		            	
		            variableNodeList.add(variableNode);
		            System.out.println("new Variable: " + name + " = " + number);
                }
                break;
                
            case BOOLEAN:
                boolean b = reader.nextBoolean();
                Boolean arrayBoolean = arrayStack.peek();
            	
                {                
                	String name = null;
		            
		            if (arrayBoolean) {
		            	name = nameStack.peek() + arrayIndex;
		            	arrayIndex++;
		    		} else {
		    			name = nameStack.pop();
		    		}
		
		            variableNode = new MyVariableNode(); 	
		        	
		        	variableNode.value = ""+b;
		        	variableNode.datatype = "Boolean";
		        	
		        	variableNode = configRemainingOfNode(result, variableNode, name, parentStack.peek());
		        	
		        	variableNodeList.add(variableNode);
		        	System.out.println("new Variable: " + name + " = " + b);
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

	private static MyVariableNode configRemainingOfNode(ServerJsonConfig result, MyVariableNode variableNode, String name, String parent) {		
		variableNode.accesslevel = "READ_WRITE";		
		variableNode.description = name;
		variableNode.displayName = name;
		variableNode.historizing = true;
		variableNode.nameSpace = result.getNamespace();
		variableNode.nodeID = parent+name;
		variableNode.parentFolder = parent;
		variableNode.samplingInterval = result.getMinSamplingInterval();
		variableNode.userAccessLevel = "READ_WRITE";
		
		
		String test = name.replace(parent, "");
		variableNode.description = test;
		variableNode.displayName = test;
		
		return variableNode;
	}
}
