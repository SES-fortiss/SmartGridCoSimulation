package linprogMPC.helperOPCua;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.eclipse.milo.opcua.sdk.client.OpcUaClient;
import org.eclipse.milo.opcua.sdk.client.api.nodes.Node;
import org.eclipse.milo.opcua.stack.core.types.builtin.DataValue;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;


public class ReadClient implements MemapClient{

	public static DataValue value = null;
	public static Object NewValue = new Object();
	
	// Make this to be a List<NodID> for more reading
	public static NodeId nodeToBrowse;
	
	
	public static void startClient(NodeId BuildingNode) throws Exception {
        
		nodeToBrowse = BuildingNode;
		ReadClient readClient = new ReadClient();

		//  configure and launch OPC UA Client
        new OpcuaClient(readClient).run();
    		
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
    	System.out.println("Browse " + nodeToBrowse.toString());
    	
        browseNode("", client, nodeToBrowse);
    	
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
        
