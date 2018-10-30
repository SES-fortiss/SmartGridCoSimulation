package linprogMPC.OPCUA;

import java.util.concurrent.CompletableFuture;
import org.eclipse.milo.opcua.sdk.client.OpcUaClient;
import org.eclipse.milo.opcua.stack.core.types.builtin.DataValue;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.enumerated.TimestampsToReturn;


public class ReadClient implements MemapClient{

	public static DataValue value = null;
	
	// Make this to be a List<NodID>
	public static NodeId nodeToRead;
	
	public static void startClient(String clientName, String clientURI, NodeId nodeid) throws Exception {
		nodeToRead = nodeid;
		ReadClient example = new ReadClient();

		//  configure and launch OPC UA Client
        new opcuaClient(example, clientName, clientURI).run();
    		
    }


    @Override
    public void run(OpcUaClient client, CompletableFuture<OpcUaClient> future) throws Exception {
        
    	// synchronous connect
        client.connect().get();
        
        NodeId node1 = nodeToRead;
        value = client.readValue(0, TimestampsToReturn.Both, node1)
                .get();
        System.out.println("Current heat demand: " + value.getValue().getValue());
     
        future.complete(client);
    }
    
	public static String getData() {
		return (String) value.getValue().getValue().toString();
	}
 
}    
        
