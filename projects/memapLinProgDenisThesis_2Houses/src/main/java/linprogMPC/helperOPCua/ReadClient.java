package linprogMPC.helperOPCua;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import org.eclipse.milo.opcua.sdk.client.OpcUaClient;
import org.eclipse.milo.opcua.sdk.client.api.nodes.Node;
import org.eclipse.milo.opcua.stack.core.Identifiers;
import org.eclipse.milo.opcua.stack.core.types.builtin.DataValue;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.enumerated.TimestampsToReturn;


public class ReadClient implements MemapClient{

	public static DataValue value = null;
	public static Object NewValue = new Object();
	
	// Make this to be a List<NodID> for more reading
	public static List<NodeId> rootNodeToBrowse;
	
	
	public static void startClient(List<NodeId> inputNodes) throws Exception {
        
		// Main Node or Object to browse in
		rootNodeToBrowse = inputNodes;
		ReadClient readClient = new ReadClient();

		//  configure and launch OPC UA Client
        new opcuaClient(readClient).run();
    		
    }


    @Override
    public void run(OpcUaClient client, CompletableFuture<OpcUaClient> future) throws Exception {
  
    	
    	// synchronous connect
    	try {
    		client.connect().get();
    		System.out.println("[OPC UA] Client connection successful!");
    	} catch (Exception e) {
			System.out.println("[OPC UA] Client connection failed!");
			e.printStackTrace();
		}
    	
    	// start browsing at root folder
    	
    	if (rootNodeToBrowse != null) {
	        for (NodeId rootNode : rootNodeToBrowse) {
	//        	System.out.println("Browse (" + rootNode.getNamespaceIndex().toString() + "," + rootNode.getIdentifier().toString());
	        	browseNode("", client, rootNode);
	        }
    	}
//        value = client.readValue(0,TimestampsToReturn.Both, nodeToBrowse)
//        		.get();
//    	NewValue = value.getValue().getValue();
        
        future.complete(client);
    }
    
    private void browseNode(String indent, OpcUaClient client, NodeId browseNodesOnServer) {
        try {
            List<Node> nodes = client.getAddressSpace().browse(browseNodesOnServer).get();

            for (Node node : nodes) {
            	System.out.println("Node= " +  node.getBrowseName().get().getName() );
            	System.out.println("Description= " +  node.getDescription().get().getText() );
//                logger.info("{} Node={}", indent,);

                // recursively browse to children
                browseNode(indent + "  ", client, node.getNodeId().get());
            }
        } catch (Exception e) {
//            logger.error("Browsing nodeId={} failed: {}", browseRoot, e.getMessage(), e);
        }
    }
    
    
    
	public static Object getData() {
		try {
			return NewValue;
		} catch (Exception e) {
			System.out.println("[OPC UA] Client getValue failed");
			return null;
		}
	}
 
}    
        
