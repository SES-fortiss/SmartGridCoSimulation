package opcMEMAP;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.milo.opcua.sdk.server.OpcUaServer;
import org.eclipse.milo.opcua.sdk.server.model.nodes.variables.AnalogItemNode;
import org.eclipse.milo.opcua.stack.core.types.builtin.DataValue;
import org.eclipse.milo.opcua.stack.core.types.builtin.Variant;

import opcMEMAP.serverConfigurationClassesJSON.GenericJsonReader;
import opcMEMAP.serverConfigurationClassesJSON.MyVariableNode;

public class ServerUpdater {
	
	String string = "Building";
	
	List<AnalogItemNode> listOfNodes = null;
	ServerConfigurationImpl myServerImpl = null;
	OpcUaServer server = null;

	Map<AnalogItemNode, String> valueMapping = new HashMap<AnalogItemNode, String>();
	
	public ServerUpdater(OpcUaServer server, ServerConfigurationImpl serverImpl) {
		this.server = server; 
		this.myServerImpl = serverImpl;
	}
	
	public void update(String json) throws IOException {				
		ConfigInterface opcIterface = GenericJsonReader.createConfigFromString(json);
		
		List<MyVariableNode> myVarNodeList = opcIterface.getVariableNodeList(); // neue Werte
		listOfNodes = myServerImpl.getAnalogNodeList(); // vorhandene Nodes
		
		for (MyVariableNode myVariableNode : myVarNodeList) {			
			//System.out.println("myVariableNode.nodeID: " + myVariableNode.nodeID);

			for (AnalogItemNode analogItemNode : listOfNodes) {				
				if(analogItemNode.getNodeId().toString().contains(myVariableNode.nodeID)) {
					analogItemNode.setValue(new DataValue(new Variant(myVariableNode.getValueWithDataType())));					
					//System.out.println("setting done");
				}			
			}
		}
	}
}