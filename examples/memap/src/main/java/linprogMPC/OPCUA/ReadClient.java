package linprogMPC.OPCUA;

import java.util.concurrent.CompletableFuture;
import org.eclipse.milo.opcua.sdk.client.OpcUaClient;
import org.eclipse.milo.opcua.stack.core.types.builtin.DataValue;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.enumerated.TimestampsToReturn;


public class ReadClient implements MemapClient{

	public static DataValue value = null;
	public static Object NewValue = new Object();
	
	// Make this to be a List<NodID> for more reading
	public static NodeId nodeToRead;
	
	public static void startClient(NodeId nodeid) throws Exception {
		nodeToRead = nodeid;
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
    	
        NodeId node1 = nodeToRead;
        value = client.readValue(0,TimestampsToReturn.Both, node1)
        		.get();
        
        System.out.println("[OPC UA] Client getValue successful! (DataType = " + value.getValue().getValue().getClass() + ")");
//        System.out.println("Value: " + value.getValue().getValue());

        NewValue = value.getValue().getValue();
        
        future.complete(client);
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
        
